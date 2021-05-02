package com.dbtechprojects.gamedeals.util

import android.util.Log
import com.dbtechprojects.gamedeals.data.Resource
import kotlinx.coroutines.flow.*



inline fun <ResultType, RequestType> networkBoundResource(
    crossinline query: () -> Flow<ResultType>,
    crossinline fetch: suspend (data: ResultType) -> RequestType,
    crossinline saveFetchResult: suspend (RequestType) -> Unit,
    crossinline shouldFetch: (ResultType) -> Boolean = { true }
) = flow {
    val data = query().first()

    val flow = if (shouldFetch(data)) {
        emit(Resource.Loading(data))

        try {
            saveFetchResult(fetch(data))
            query().map {
                println(it.toString())
                Resource.Success(it)
            }
        } catch (throwable: Throwable) {
            query().map { Resource.Error(throwable, it)
            }
        }
    } else {
        query().map { Resource.Success(it) }
    }

    emitAll(flow)
}
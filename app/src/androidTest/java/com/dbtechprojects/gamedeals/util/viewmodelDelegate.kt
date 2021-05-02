package com.dbtechprojects.gamedeals.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import kotlin.reflect.KProperty1
import kotlin.reflect.jvm.isAccessible

inline fun <reified VM : ViewModel> Fragment.provideViewModel(
    noinline ownerProducer: () -> ViewModelStoreOwner = { this },
    noinline factoryProducer: (() -> ViewModelProvider.Factory)? = null
): Lazy<VM> =
    OverridableLazy(viewModels(ownerProducer, factoryProducer))

// wrapper
class OverridableLazy<T>(var implementation: Lazy<T>): Lazy<T> {
    override val value
        get() = implementation.value
    override fun isInitialized() = implementation.isInitialized()
}

// fragment extended function
fun <VM: ViewModel, T> T.replace(
    viewModelDelegate: KProperty1<T, VM>, viewModel: VM) {
    viewModelDelegate.isAccessible = true
    (viewModelDelegate.getDelegate(this) as
            OverridableLazy<VM>).implementation = lazy { viewModel }
}
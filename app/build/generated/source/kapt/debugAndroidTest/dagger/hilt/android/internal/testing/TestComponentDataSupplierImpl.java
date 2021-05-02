package dagger.hilt.android.internal.testing;

import com.dbtechprojects.gamedeals.database.RoomDataBaseIsolationTests;
import com.dbtechprojects.gamedeals.database.RoomDataBaseIsolationTests_ComponentDataHolder;
import com.dbtechprojects.gamedeals.ui.activities.GameDealActivityTest;
import com.dbtechprojects.gamedeals.ui.activities.GameDealActivityTest_ComponentDataHolder;
import com.dbtechprojects.gamedeals.ui.activities.MainActivityTest;
import com.dbtechprojects.gamedeals.ui.activities.MainActivityTest_ComponentDataHolder;
import com.dbtechprojects.gamedeals.ui.activities.SettingsActivityTest;
import com.dbtechprojects.gamedeals.ui.activities.SettingsActivityTest_ComponentDataHolder;
import com.dbtechprojects.gamedeals.ui.fragments.GameFragmentTest;
import com.dbtechprojects.gamedeals.ui.fragments.GameFragmentTest_ComponentDataHolder;
import java.lang.Class;
import java.lang.Override;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("dagger.hilt.processor.internal.root.RootProcessor")
public final class TestComponentDataSupplierImpl extends TestComponentDataSupplier {
  private final Map<Class<?>, TestComponentData> testComponentDataMap = new HashMap<>(5);

  TestComponentDataSupplierImpl() {
    testComponentDataMap.put(RoomDataBaseIsolationTests.class, RoomDataBaseIsolationTests_ComponentDataHolder.get());
    testComponentDataMap.put(GameDealActivityTest.class, GameDealActivityTest_ComponentDataHolder.get());
    testComponentDataMap.put(MainActivityTest.class, MainActivityTest_ComponentDataHolder.get());
    testComponentDataMap.put(SettingsActivityTest.class, SettingsActivityTest_ComponentDataHolder.get());
    testComponentDataMap.put(GameFragmentTest.class, GameFragmentTest_ComponentDataHolder.get());
  }

  @Override
  protected Map<Class<?>, TestComponentData> get() {
    return testComponentDataMap;
  }
}

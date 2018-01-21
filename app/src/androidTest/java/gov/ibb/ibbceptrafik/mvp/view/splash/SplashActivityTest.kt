package tr.gov.ibb.ibbceptrafik.mvp.view.splash

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import tr.gov.ibb.ibbceptrafik.AcceptanceTest
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class SplashActivityTest : AcceptanceTest<SplashActivity>(SplashActivity::class.java) {

  @Test
  @Throws(Exception::class)
  fun testTopPadding() {
    val appContext = InstrumentationRegistry.getTargetContext()
    Assert.assertEquals("com.abc", appContext.packageName)
  }

}
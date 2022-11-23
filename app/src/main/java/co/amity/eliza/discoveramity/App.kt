package co.amity.eliza.discoveramity

import android.app.Application
import com.amity.socialcloud.sdk.social.AmitySocialClient
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

class App : Application() {

    val koinModules = module {
        factory { AmitySocialClient.newCommunityRepository() }
    }

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(koinModules)
        }
    }
}
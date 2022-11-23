package co.amity.eliza.discoveramity

import android.app.Application
import com.amity.socialcloud.sdk.AmityCoreClient
import com.amity.socialcloud.sdk.AmityEndpoint
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

        AmityCoreClient.setup(BuildConfig.API_KEY, AmityEndpoint.EU)

        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(koinModules)
        }
    }
}
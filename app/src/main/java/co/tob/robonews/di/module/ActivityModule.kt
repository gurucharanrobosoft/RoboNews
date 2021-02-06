package co.tob.robonews.di.module

import android.app.Activity
import android.content.Context
import co.tob.robonews.network.NewsRepository
import co.tob.robonews.di.ActivityContext
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable

@Module
class ActivityModule(private val activity: Activity) {

    @ActivityContext
    @Provides
    fun provideContext(): Context = activity

    @Provides
    fun provideNewsRepository(): NewsRepository = NewsRepository()

    @Provides
    fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()


}

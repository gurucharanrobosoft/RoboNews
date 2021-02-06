package co.tob.robonews.di

import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.SOURCE)
annotation class ActivityScope

@Scope
@Retention(AnnotationRetention.SOURCE)
annotation class FragmentScope

@Scope
@Retention(AnnotationRetention.SOURCE)
annotation class ViewHolderScope

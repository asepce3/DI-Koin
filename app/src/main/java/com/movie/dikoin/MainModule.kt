package com.movie.dikoin

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object MainModule {

    fun getKoinModule() = module {
        single<MainRepository> {
            MainRepositoryImpl()
        }

        viewModel { MainViewModel(get()) }
    }
}
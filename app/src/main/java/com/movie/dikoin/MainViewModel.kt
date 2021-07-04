package com.movie.dikoin

import androidx.lifecycle.ViewModel

class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {

    fun getEmail() = mainRepository.getEmail()
}
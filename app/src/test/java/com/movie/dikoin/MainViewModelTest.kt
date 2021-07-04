package com.movie.dikoin

import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.koin.java.KoinJavaComponent.inject
import org.koin.test.KoinTestRule

class MainViewModelTest {

    private val viewModel: MainViewModel by inject(MainViewModel::class.java)

    @get:Rule
    val koinTestRule = KoinTestRule.create {
        printLogger()
        modules(MainModule.getKoinModule())
    }

    @Test
    fun getEmail() {
        val email = viewModel.getEmail()
        assertNotNull(email)
        assertEquals("asepce@gmail.com", email)
    }
}
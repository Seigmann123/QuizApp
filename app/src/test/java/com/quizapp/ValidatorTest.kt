package com.quizapp

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4



@RunWith(JUnit4::class)
class ValidatorTest

    @Test

    fun WhenInputIsValid() {
        val ammount = 100
        val desc = "some desc"
        val result = Validator.validatorInput(ammount, desc)
        assertThat(result)
    }

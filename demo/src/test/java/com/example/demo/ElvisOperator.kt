package com.example.demo

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ElvisOperator {

    @Test
    @DisplayName("elvis 연산자")
    fun nullSafety() {

        println(isNull(true))
        println(isNull(false))
        println(isNull(null))

        val elvisOperator = null
        println(isNull(elvisOperator ?: true))
//        isNotAllowanceNull(elvisOperator)

    }

    fun isNull(x: Boolean?): String {

//        if (x == null)
//            return "Null"
//
//        return x.toString()

        return x?.toString() ?: "Null"
    }

    fun isNotAllowanceNull(x: Boolean): String {
        return x.toString()
    }
}
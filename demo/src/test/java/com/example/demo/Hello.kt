package com.example.demo

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Hello {

  @Test
  @DisplayName("hello world")
  fun helloWorld() {

      val hello = "hello"
      var word = " world"
      println(hello + word)

      word = " kotlin"
      println(hello + word)
  }
}
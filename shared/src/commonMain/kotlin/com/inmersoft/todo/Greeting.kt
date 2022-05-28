package com.inmersoft.todo

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
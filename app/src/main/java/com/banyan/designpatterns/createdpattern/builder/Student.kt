package com.banyan.designpatterns.createdpattern.builder

import com.banyan.designpatterns.utils.LogUtil

class Student(
    var name: String,

    var age: Int
) {
    private val TAG = "Student"

    private constructor(builder: Builder) : this(builder.nameBuilder, builder.ageBuilder)


    fun introduce() {
        LogUtil.i(TAG, "My name is $name,$age years old")
    }

    class Builder {
        constructor()

        var nameBuilder: String = ""

        var ageBuilder: Int = 0

        fun build() = Student(this)
    }

    companion object {
        fun build(block: Builder.() -> Unit) = Builder().apply(block).build()
    }

}
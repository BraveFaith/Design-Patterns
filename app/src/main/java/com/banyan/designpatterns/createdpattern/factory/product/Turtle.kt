package com.banyan.designpatterns.createdpattern.factory.product

import com.banyan.designpatterns.utils.LogUtil

class Turtle(override val name: String) : Animal {
    private val TAG = "turtle"
    override fun eat() {
        LogUtil.i(TAG, "$name eat seaweed!!!")
    }
}
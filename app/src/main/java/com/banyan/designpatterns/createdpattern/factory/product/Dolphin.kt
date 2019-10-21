package com.banyan.designpatterns.createdpattern.factory.product

import com.banyan.designpatterns.utils.LogUtil

class Dolphin(override val name: String) :Animal {
    private val TAG = "dolphin"
    override fun eat() {
        LogUtil.i(TAG,"$name eat fish!!!")
    }
}
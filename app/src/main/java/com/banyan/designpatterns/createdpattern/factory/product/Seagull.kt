package com.banyan.designpatterns.createdpattern.factory.product

import com.banyan.designpatterns.utils.LogUtil

class Seagull(override val name: String) : Animal {
    private val TAG = "seagull"
    override fun eat() {
        LogUtil.i(TAG, "$name eat fish!!!")
    }
}
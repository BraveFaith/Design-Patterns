package com.banyan.designpatterns.createdpattern.factory.product

import com.banyan.designpatterns.utils.LogUtil

class Eagle(override val name: String) : Animal {
    private val TAG = "eagle"
    override fun eat() {
        LogUtil.i(TAG, "$name eat rabbit!!!")
    }

}
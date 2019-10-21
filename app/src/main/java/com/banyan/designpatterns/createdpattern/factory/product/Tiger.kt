package com.banyan.designpatterns.createdpattern.factory.product

import com.banyan.designpatterns.utils.LogUtil

class Tiger(override val name: String) :
    Animal {
    private val TAG = "tiger"
    override fun eat() {
        LogUtil.i(TAG,"$name eat meat!!!")
    }
}
package com.banyan.designpatterns.createdpattern.factory.product

import com.banyan.designpatterns.utils.LogUtil

class Panda(override val name: String) :
    Animal {
    private val TAG = "panda"
    override fun eat() {
        LogUtil.i(TAG,"$name eat bamboo!!!")
    }

}
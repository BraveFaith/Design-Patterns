package com.banyan.designpatterns.createdpattern.singleton

import com.banyan.designpatterns.utils.LogUtil

object HungrySingleton {
    private val TAG = "HungrySingleton"
    fun print(){
        LogUtil.i(TAG,"I'm hungry singleton")
    }
}
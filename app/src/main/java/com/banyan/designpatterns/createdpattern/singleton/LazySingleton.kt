package com.banyan.designpatterns.createdpattern.singleton

import com.banyan.designpatterns.utils.LogUtil


class LazySingleton private constructor() {
    private val TAG = "LazySingleton"
    companion object {
        val instance: LazySingleton by lazy { LazySingleton() }
    }

    fun print(){
        LogUtil.i(TAG,"I'm lazy singleton")
    }
}
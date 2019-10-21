package com.banyan.designpatterns.createdpattern.factory.normal

import com.banyan.designpatterns.createdpattern.factory.product.Animal

interface Factory {
    fun produce(): Animal
}
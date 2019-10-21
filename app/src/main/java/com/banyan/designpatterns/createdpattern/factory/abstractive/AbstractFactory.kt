package com.banyan.designpatterns.createdpattern.factory.abstractive

import com.banyan.designpatterns.createdpattern.factory.product.Animal

interface AbstractFactory {
    fun flyAnimal(): Animal

    fun swimAnimal(): Animal
}
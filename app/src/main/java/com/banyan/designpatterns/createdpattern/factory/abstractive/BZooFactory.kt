package com.banyan.designpatterns.createdpattern.factory.abstractive

import com.banyan.designpatterns.createdpattern.factory.product.Animal
import com.banyan.designpatterns.createdpattern.factory.product.Dolphin
import com.banyan.designpatterns.createdpattern.factory.product.Seagull

class BZooFactory :AbstractFactory{
    override fun flyAnimal(): Animal {
        return Seagull("seagull")
    }

    override fun swimAnimal(): Animal {
        return Dolphin("dolphin")
    }

}
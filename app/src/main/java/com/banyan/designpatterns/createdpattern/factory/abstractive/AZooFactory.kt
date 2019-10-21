package com.banyan.designpatterns.createdpattern.factory.abstractive

import com.banyan.designpatterns.createdpattern.factory.product.Animal
import com.banyan.designpatterns.createdpattern.factory.product.Eagle
import com.banyan.designpatterns.createdpattern.factory.product.Turtle

class AZooFactory :AbstractFactory{
    override fun flyAnimal(): Animal {
        return Eagle("eagle")
    }

    override fun swimAnimal(): Animal {
        return Turtle("turtle")
    }

}
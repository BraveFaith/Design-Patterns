package com.banyan.designpatterns.createdpattern.factory.normal

import com.banyan.designpatterns.createdpattern.factory.product.Animal
import com.banyan.designpatterns.createdpattern.factory.product.Panda

class PandaFactory : Factory {
    override fun produce(): Animal {
        return Panda("pande")
    }

}
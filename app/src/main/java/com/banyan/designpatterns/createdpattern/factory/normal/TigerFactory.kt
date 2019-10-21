package com.banyan.designpatterns.createdpattern.factory.normal

import com.banyan.designpatterns.createdpattern.factory.product.Animal
import com.banyan.designpatterns.createdpattern.factory.product.Tiger

class TigerFactory : Factory {
    override fun produce(): Animal {
        return Tiger("tiger")
    }

}
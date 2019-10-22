package com.banyan.designpatterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.banyan.designpatterns.createdpattern.builder.Student
import com.banyan.designpatterns.createdpattern.factory.abstractive.AZooFactory
import com.banyan.designpatterns.createdpattern.factory.abstractive.BZooFactory
import com.banyan.designpatterns.createdpattern.factory.normal.PandaFactory
import com.banyan.designpatterns.createdpattern.factory.normal.TigerFactory
import com.banyan.designpatterns.createdpattern.singleton.HungrySingleton
import com.banyan.designpatterns.createdpattern.singleton.LazySingleton

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val panda = PandaFactory().produce()
        panda.eat()
        val tiger = TigerFactory().produce()
        tiger.eat()

        val aZooFactory = AZooFactory()
        val eagle = aZooFactory.flyAnimal()
        eagle.eat()
        val turtle = aZooFactory.swimAnimal()
        turtle.eat()
        val bZooFactory = BZooFactory()
        val seagull = bZooFactory.flyAnimal()
        seagull.eat()
        val dolphin = bZooFactory.swimAnimal()
        dolphin.eat()

        HungrySingleton.print()
        LazySingleton.instance.print()

        val student = Student.build {
            nameBuild = "lily"
            ageBuild = 10
        }
        student.introduce()
    }
}

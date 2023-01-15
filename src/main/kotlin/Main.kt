fun main() {
    val dog = Dog()
    val cat = Cat()
    val horse = Horse()
    val vet = Vet()
    val animals:Array<Animal> = arrayOf(dog,cat,horse)
    for(animal in animals){
        vet.treatAnimal(animal)
    }
}

open class Animal(){
    open val food:String = ""
    open val location:String = ""

    open fun makeNoise(){}
    open fun eat(){}
    open fun sleep(){}
}

class Dog:Animal(){
    override val food:String = "кость"
    override val location:String = "конура"
    override fun eat() {
        super.eat()
        println("Собака ест косточку")
    }

    override fun makeNoise() {
        super.sleep()
        println("Собака спит")
    }
}

class Cat:Animal(){
    override val food:String = "рыба"
    override val location:String = "дом"
    val timeSleep:String = ""
    override fun eat() {
        super.eat()
        println("Кот ест рыбку")
    }

    override fun sleep() {
        super.makeNoise()
        println("Кот спит")
    }
}

class Horse:Animal(){
    val speed:String = ""
    override val food:String = "сено"
    override val location:String = "ферма"
    override fun eat() {
        super.eat()
        println("Лошадь кушает сено")
    }

    override fun sleep() {
        super.makeNoise()
        println("Лошадь спит")
    }
}

class Vet(){
    fun treatAnimal(animal:Animal){
        println("${animal.food} ${animal.location}")
    }
}

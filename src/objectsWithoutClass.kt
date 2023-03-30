// we can create only 1 object using singleton pattern
object myobject{
    val item="someitem"
    fun say(){
        println("hello")
    }
}

fun main(args: Array<String>) {
    println(myobject.item)
    myobject.say()
}
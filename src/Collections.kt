

fun main(args: Array<String>) {
    val numbers= arrayOf(10,5,"mayank")
    val num1= arrayOf<Int>(10,5)
    num1.set(1,42)
    num1[1]=546
    val num2= arrayOfNulls<Int>(15)
    println(num1[1])
    println(num2[1])
    val list1= listOf<Int>(10,20) // immutable
    println(list1[1])
    val list2= mutableListOf<Int>(10,20) //mutable
    list2.add(30)
    println(list2[2])
    val map: Map<Int, Any> = mapOf<Int,String>(1 to "hi", 2 to "hello")//immutable
    println(map[1])

    val mutable_map = hashMapOf<Int,String>(1 to "hi", 2 to "hello")//mutable
    mutable_map[1]="mayank"
    println(mutable_map[1])
}


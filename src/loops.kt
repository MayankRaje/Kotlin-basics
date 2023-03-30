

fun main(args: Array<String>) {
    val mutable_map = hashMapOf<Int, String>(1 to "hi", 2 to "hello")//mutable
    mutable_map[1] = "mayank"
    mutable_map.forEach { t, u ->
        println(u)
        println("*"+t)
    }
    for(i in mutable_map){
        println(i)
    }
    val list2= mutableListOf<Int>(10,20) //mutable
    list2.add(30)
    list2.forEach {
        println(it)
    }

    // for each general loop BIGGER FORM
    for(num in list2){
        print(num)
    }
    println()
    //general for loop
    for(x in 0..10){
        // 10 is inclusive ==> included
        print(x)
    }
    println()
    //IMPortanT
    for(x in 0 until 10){
        // 10 is EXclusive ==> not included
        print(x)
    }
    println()
    //+2
    for(x in 0 until 10 step 2){
      print(x);
    }
     println()
    //-2
    for(x in 10 downTo 0 step 2){
        print(x);
    }
}
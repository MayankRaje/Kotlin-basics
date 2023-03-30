import com.sun.jdi.IntegerType

lateinit var x:Integer
var z:String?=null
val y=10
fun main(args: Array<String>) {
    for(x in 1..10){
        println(x )
    }
    x=Integer(5948484)
    println(x)
    var m:String?=null
 //x="hello"
//    val size:Int?=x?.length
//    print(x)
   // print(size)
  var a="hello"
    a="jjjj"
    println(m?.length)
   // println(x)
   // println(message = "**")
    println(z?.length)

  val arr= listOf<String>("hello","world")
    print(arr.get(0))
}
import javax.xml.stream.events.Characters

fun main(args: Array<String>) {
    var str:String="ancdef"
    val str3:Char='z'
    var str1=str as? Integer
    println(str.toCharArray().get(0).toInt())
    println("**"+str3.toInt())
    println("${str3.toInt()}**")
    print(str1)
    val str4: CharArray =str.toCharArray()
    println(str4[0])
    val str5= charArrayOf('d','r')
    for(i in str4){
        print("**"+i)
    }
}
val numList=ArrayList<Int>()

fun main(args: Array<String>) {
    for(i in 0 until 1000){
        numList.add(i)
    }
//    Thread{dropMultiples(3)}
//    Thread{dropMultiples(5)}
//    Thread{dropMultiples(11)}

    Thread{dropMultiples(3)}.start()
    Thread{dropMultiples(5)}.start()
    Thread{dropMultiples(11)}.start()

    for(i in numList){
        println(i)
    }
}

   fun dropMultiples(n: Int) {
        val itr=numList.iterator()
       while(itr.hasNext()){
           val i=itr.next()
           if(i%n==0){
               itr.remove()
           }
       }
   }

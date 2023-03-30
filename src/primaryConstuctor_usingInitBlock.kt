fun main(args: Array<String>) {
    //using object to call functions
    val account=Account2(123456789,"mayank",50f) //object creation
    // account.insert(123456789,"mayank",50f)
    account.deposit(50F)
    account.withDraw(20f)
    account.withDraw(200f)
}
class Account2(accNo:Int,name:String,amount:Float) {
    //properties
    var accNo:Int
    var name:String
    var amount:Float
    init {
        this.accNo=accNo
        this.amount=amount
        this.name=name.capitalize()
    }

    /* constructor(same names as class name)
     ==> used to initialize class
     2 types==>
     primary == only 1
     secondary== multiple
      */

    //member functions
//    fun insert(ac:Int,name:String,amount:Float){
//        accNo=ac;
//        this.name=name
//        this.amount=amount
//    }
    fun deposit(money:Float){
        amount+=money
        println(amount)
        println("**"+name)
    }
    fun withDraw(money: Float){
        if(amount<money){
            println("not suficient")
        }
        else{
            amount-=money
            println(amount);
        }
    }
}
import java.time.temporal.TemporalAmount

fun main(args: Array<String>) {
    //using object to call functions
    val account=Account3(2345,"mayank",1000f) //object creation
    val account2=Account3(12345)
    val account3=Account3(12345,"mayank")
    //account.insert(123456789,"mayank",50f)
    println("Account no ${account.accNo},Account Holder Name ${account.name},Amount ${account.amount}")
    account.deposit(50F)
    account.withDraw(20f)
    account.withDraw(200f)
}
class Account3{
    //properties
    var accNo:Int=1
    var name:String?=null
    var amount:Float=0f

    constructor(accNo: Int){
        this.accNo=accNo
        name="mayank"
        amount=0f
    }

    constructor(accNo:Int,name:String){
        this.accNo=accNo
        this.name=name
        amount=0f
    }
    constructor(accNo:Int,name:String,amount: Float){
        this.accNo=accNo
        this.name=name
        this.amount=amount
    }

    //member functions
//    fun insert(ac:Int,name:String,amount:Float){
//        accNo=ac;
//        this.name=name
//        this.amount=amount
//    }
    fun deposit(money:Float){
        amount+=money
        println(amount)
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
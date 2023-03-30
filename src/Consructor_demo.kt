fun main(args: Array<String>) {
    //using object to call functions
    val account=Account() //object creation
    account.insert(123456789,"mayank",50f)
    account.deposit(50F)
    account.withDraw(20f)
    account.withDraw(200f)
}
class Account{
    //properties
    var accNo:Int=0
    var name:String?=null
    var amount:Float=0f

    //member functions
    fun insert(ac:Int,name:String,amount:Float){
        accNo=ac;
        this.name=name
        this.amount=amount
    }
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
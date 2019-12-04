class User(Name: String, Address: String, Balance : Double, MoneySpent: Double){
    var name = ""
    var address = ""
    var balance = 0.0
    var spent = 0.0

    init {
        name = Name
        address = Address
        balance = Balance
        spent = MoneySpent
    }

    fun reduceBalance(price:Double){
        this.balance -= price
        this.spent += price
    }
}
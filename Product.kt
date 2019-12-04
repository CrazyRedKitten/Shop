open class Product(Name: String, Price: Double, Manufacturer: String){
    var name = ""
    var price = 0.0
    var manufacturer = ""
    init {
        name = Name
        price = Price
        manufacturer = Manufacturer
    }

    open fun getDiscountPrice(user: User): Double{
        return when{
            user.spent < 300 -> price
            user.spent < 1000 -> price * 0.9
            else -> price * 0.8
        }
    }
}
class Comicbook(Name: String, Price: Double, Manufacturer: String, NumberOfPages: Int) : Product(Name, Price, Manufacturer) {
    var numberOfPages = 0

    init {
        numberOfPages = NumberOfPages
    }
}
class TradePaperBack(Name: String, Price: Double, Manufacturer: String,IssuesIncluded: Int) : Product(Name, Price, Manufacturer) {
    var issuesIncluded = 0
    init {
        issuesIncluded = IssuesIncluded
    }
}
class Hardcover(Name: String, Price: Double, Manufacturer: String, IsOmnibus: Boolean) : Product(Name, Price, Manufacturer){
    var isOmnibus : Boolean = false
    init {
        isOmnibus = IsOmnibus
    }
}
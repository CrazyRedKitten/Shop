import java.lang.NumberFormatException

fun main(){
    var numeric = true
    var user = User("Username", "in the middle of nowhere", 20000.0, 0.0)
    val watchmenHardcover = Hardcover("Watchmen", 99.99, "DC", false)
    val yotvOmnibus = Hardcover("Year of the Villain Omnibus",89.89,"DC", true)
    val DX_VOL_1 = TradePaperBack("Dawn of X vol 1", 16.99, "Marvel", 6)
    val DetectiveComics_1019 = Comicbook("Detective Comics #1019", 3.99, "DC", 32)
    val products:Array<Product> = arrayOf(watchmenHardcover,
        yotvOmnibus,
        DX_VOL_1,
        DetectiveComics_1019)
    val informer = Informer()

     while(true){
         println("Hello ${user.name}, your balance is ${user.balance} \n")
         for ((index,product) in products.withIndex()){
             println("product №${index+1} ${product.name}, price: ${product.price} EUR")
         }
         println()
         var productNumber = 999
         val userInput = readLine().toString()
         try {
             var number = userInput.toInt()
         }catch (e: NumberFormatException) {
             numeric = false
         }finally {
             if (numeric){
                 productNumber = (userInput.toInt() - 1)
             }
             else{
                 println("Please enter the number")
             }
         }
         if (productNumber >= 0 && productNumber < products.size){
             if(products[productNumber].price < user.balance){
                 informer.buy(user,products[productNumber])
             }else{
                 println("You have not enough funds to make a purchase")
             }
         }else{
             println("Product not found")
         }
     }
}


class Informer{
    fun buy(user: User, product: Product){
        var price = product.getDiscountPrice(user)
        user.reduceBalance(price)
        println("${user.name} bought ${product.name}. Total price is $price. Order is processing")
    }
}
const val minCommission = 35
fun main(){
    val amount1 = 100
    val amount2 = 1
    val amount3 = 10000
    println(getCommission(amount1))
    println(getCommission(amount2))
    println(getCommission(amount3))
}

fun getCommission(amount:Int):Int{
    return if((amount/10000*75) < minCommission) 35 else (amount/10000*75)
}
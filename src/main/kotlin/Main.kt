fun main() {
    name()
    var x = add(23, 24, 25, 26)
    println(x)
    anInterestingFactAboutMe()
    var y = modulus(9,2)
    println(y)

}
fun name(){
    var name= "Hello Teresia"
    println(name)
}
fun modulus(num3: Int, num4: Int): Int{
    var remainder = num3 % num4
    return remainder

}

fun add(num1: Int, num2: Int, num3: Int, num4: Int): Int{
    var result= num1+num2+num3+num4
    return result

}
fun anInterestingFactAboutMe(){
    var sentence= "I am perservearant."
    println(sentence)

}

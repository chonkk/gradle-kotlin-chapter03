

fun main(){
//    sayHello()
//    println(greet())
//    var arr = intArrayOf(1, 2, 3, 4, 5)
//    var arr = IntArray(6, { it * 2 } )
//    println(max(arr))
//    println(greet("Scott", "Howdy"))
//    println(greet("Scott"))
//    createPerson("Jake", 12, 152, 43)  // IDE 도움이 없다면 파라미터가 의미하는 바를 알 수 없다.
//    createPerson(name = "Jake", age = 12, height = 152, weight = 43) // Good!!
//    createPerson(name = "Jake", 12, weight = 43, height = 152) // Good!!
//    println(varargMax(1, 5, 2, 5, 12))  // use
//    greetMany(msg = "Hello", "James", "John", "Tom")  // use
//    val values = intArrayOf(1, 52, 11)
//    println(varargMax(*values))  // 스프레드 연산자
    // bad!!
//    val result = getFullName()
//
//    val first = result.first
//    val second = result.second
//    val third = result.third
//
//    println("$first $second $third")
    // Good!!
//    val (s1, s2, s3) = getFullName()
//    println("$s1 $s2 $s3")
    // skip!!
    val (_, _, s4) = getFullName()
    println("$s4")
}
fun getFullName() = Triple("John", "Quncy", "Adams")
fun greetMany(msg: String, vararg names: String) {
    println("$msg ${names.joinToString(", ")}")
}
fun varargMax(vararg numbers: Int): Int {
    var large = Int.MIN_VALUE
    for (number in numbers) {
        large = if (number > large) number else large
    }
    return large
}

// 명시적 아규먼트를 이용하자!
fun createPerson(name: String, age: Int, height: Int, weight: Int) {
    println("$name $age $height $weight")
}
fun greet(name: String, msg: String = "Hi ${name.length}") = "$msg $name"
fun max(numbers: IntArray): Int {
    var large = Int.MIN_VALUE
    for ( number in numbers ) {
        large = if (number > large) number else large
    }
    return large
}
fun sayHello() = println("hello")
fun greet() = "hello"  // 가장 심플한 메소드
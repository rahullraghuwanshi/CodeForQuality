package learner.rahulraghuwanshi.android.scope_functions

fun main(){

    withExample()
}

fun letExample(){
    val result = "Hello".let {
        it.toUpperCase()
        // 'it' refers to the receiver object, in this case "Hello"
        "something else"
    }
    println(result) // Outputs: something else

}
fun runExample(){
    val result = "Hello".run {
        this.toUpperCase()
        // 'this' refers to the receiver object, in this case "Hello"
        "something else"
    }
    println(result) // Outputs: something else

}

fun withExample(){
    val result = with("Hello") {
        this.toUpperCase()
        // 'this' refers to the receiver object, in this case "Hello"
        "0"
    }
    println(result) // Outputs: HELLO
}


fun applyExample(){
    val result = StringBuilder().apply {
        append("Hello, ")
        append("World!")
    }
    println(result.toString()) // Outputs: Hello, World!
}

fun alsoExample(){
    val result = StringBuilder().also {
        println("The original string is: $it")
        it.append("Hello, ")
        it.append("World!")
        // 'it' refers to the receiver object, in this case "Hello"
    }
    println(result) // Outputs: Hello
}

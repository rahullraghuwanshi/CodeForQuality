package learner.rahulraghuwanshi.code.first_java

//Write a program to print whether a number is even or odd, also take input from the user.
fun main(){
    println("Enter a number: ")
    val year = readln().toInt()

    if (year % 2 == 0){
        println("Number is even")
    }else {
        println("Number is odd")
    }
}
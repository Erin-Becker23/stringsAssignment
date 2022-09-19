fun main() {
    //answers
    var a1 = "Chicago"
    var a2 = "Gator"
    var a3 = "Eren Jaeger"
    var a4 = "Blue"
    var a5 = "Green"

    var rightAnswers = 0

    //start of the quiz
    println("Please fill in the blanks")
    println("---------------------------")

    //question 1
    println("Question 1: \n What is the capital of Illinois?")
    var input1 = readln()!!.toString()
    var result = a1.compareTo(input1, true)

    if (result == 0) {
        println("Correct")
        rightAnswers++
    } else {
        println("Incorrect, the answer is: $a1")
    }

    //question 2
    println("~~~\nQuestion 2: \nWhat is our school's mascot?")
    var input2 = readln()!!.toString()
    var result2 = a2.compareTo(input2, true)

    if (result2 == 0) {
        println("Correct")
        rightAnswers++
    } else {
        println("Incorrect, the answer is: $a2")
    }

    //question 3
    println("~~~\nQuestion 3: \nWho is the main character in Attack On Titan?")
    var input3 = readln()!!.toString()
    var result3 = a3.compareTo(input3,true)

    if(result3==0){
        println("Correct")
        rightAnswers++
    }
    else {
        println("Incorrect, the answer is: $a3")
    }

    //question 4
    println("~~~\nQuestion 4: \nWhat color is the sky?")
    var input4 = readln()!!.toString()
    var result4 = a4.compareTo(input4,true)

    if(result4==0){
        println("Correct")
        rightAnswers++
    }
    else {
        println("Incorrect, the answer is: $a4")
    }

    //question 5
    println("~~~\nQuestion 5: \nWhat color is the grass outside?")
    var input5 = readln()!!.toString()
    var result5 = a5.compareTo(input5,true)

    if(result5==0){
        println("Correct")
        rightAnswers++
    }
    else {
        println("Incorrect, the answer is: $a5")
    }

    if (rightAnswers > 1) {
        println("\n You got $rightAnswers answers correct!")
    }
    else{
        println("\n You got $rightAnswers answer correct!")
    }

}
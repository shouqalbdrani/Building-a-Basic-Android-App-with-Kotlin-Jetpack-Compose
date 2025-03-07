package com.example.buildingbasicandroidapp
import com.example.buildingbasicandroidapp.GreetingProvider

fun main() {

    val user1 = User("Reem", 26, "Ra@gmail.com")
    val user2 = User("Shouq", 24, "shou@gmail.com")
    val user3 = User("Taleen", 10, "tal@gmail.com")

    val person = Person("Sara", 16, "sar@gmail.com")
    println("The info of inherted class ${person.toString()}")

    val userList = mutableListOf(user1 , user2 , user3)

    userList.add(User("Mohammed", 40, "mo@gmail.com"))

    val userToEmail = mapOf("Reem" to "Ra@gmail.com", "Shouq" to "shou@gmail.com")
    println("Map Elements: $userToEmail")

    val filterUserAboveAge: (List<User>, Int) -> List<User> = { userList, ageThresh ->
        userList.filter { it.age >= ageThresh }
    }

    val adults = filterUserAboveAge(userList, 18)

    println("Users Above 18")
    println(adults.toString())

    val greet: GreetingProvider = FriendlyGreeting()
    println(greet.provideGreeting())


}

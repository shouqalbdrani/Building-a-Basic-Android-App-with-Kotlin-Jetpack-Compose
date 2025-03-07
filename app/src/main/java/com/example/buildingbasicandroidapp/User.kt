package com.example.buildingbasicandroidapp

open class User {
    val name: String
    val age: Int
    val email: String


    constructor(name: String, age: Int, email: String) {
        this.name = name
        this.age = age
        this.email = email
    }



    data class UserDetails(val name : String, val age : Int , val email :String) {
    }

    override fun toString(): String {
        return "name='$name', age=$age, email='$email')"
    }
}



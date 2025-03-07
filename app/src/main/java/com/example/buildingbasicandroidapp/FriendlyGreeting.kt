package com.example.buildingbasicandroidapp

class FriendlyGreeting : GreetingProvider{
    override fun provideGreeting() : String {
        return "Hello , Have a good day !"
    }
}
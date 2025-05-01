package com.example.recyclerview

class SuperHeroProvider {
    companion object{
        val superheroList = listOf<SuperHero>(
            SuperHero(
                superhero = "Spider-Man",
                publisher = "Marvel",
                realName = "Peter Parker",
                photo = "https://example.com/spiderman.jpg"
            ),
            SuperHero(
                superhero = "Batman",
                publisher = "DC",
                realName = "Bruce Wayne",
                photo = "https://example.com/batman.jpg"
            ),
            SuperHero(
                superhero = "Superman",
                publisher = "DC",
                realName = "Clark Kent",
                photo = "https://example.com/superman.jpg"
            ),
            SuperHero(
                superhero = "Iron Man",
                publisher = "Marvel",
                realName = "Tony Stark",
                photo = "https://example.com/ironman.jpg"
            ),
            SuperHero(
                superhero = "Wonder Woman",
                publisher = "DC",
                realName = "Diana Prince",
                photo = "https://example.com/wonderwoman.jpg"
            ),
            SuperHero(
                superhero = "Captain America",
                publisher = "Marvel",
                realName = "Steve Rogers",
                photo = "https://example.com/captainamerica.jpg"
            ),
            SuperHero(
                superhero = "Hulk",
                publisher = "Marvel",
                realName = "Bruce Banner",
                photo = "https://example.com/hulk.jpg"
            ),
            SuperHero(
                superhero = "Flash",
                publisher = "DC",
                realName = "Barry Allen",
                photo = "https://example.com/flash.jpg"
            ),
            SuperHero(
                superhero = "Thor",
                publisher = "Marvel",
                realName = "Thor Odinson",
                photo = "https://example.com/thor.jpg"
            ),
            SuperHero(
                superhero = "Green Lantern",
                publisher = "DC",
                realName = "Hal Jordan",
                photo = "https://example.com/greenlantern.jpg"
            )
        )
    }
}
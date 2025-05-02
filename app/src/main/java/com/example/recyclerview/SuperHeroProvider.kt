package com.example.recyclerview

class SuperHeroProvider {
    companion object{
        val superheroList = listOf<SuperHero>(
            SuperHero(
                superhero = "Spider-Man",
                publisher = "Marvel",
                realName = "Peter Parker",
                photo = "https://static.wikia.nocookie.net/disney/images/6/64/Profile_-_Spider-Man.png/revision/latest?cb=20211223014352&path-prefix=es"
            ),
            SuperHero(
                superhero = "Batman",
                publisher = "DC",
                realName = "Bruce Wayne",
                photo = "https://bandai.com.mx/blog/wp-content/uploads/2019/09/Historia-de-Batman-el-superhe%CC%81roe-ma%CC%81s-popular-en-la-era-digital-copia-1.jpg"
            ),
            SuperHero(
                superhero = "Superman",
                publisher = "DC",
                realName = "Clark Kent",
                photo = "https://content.imageresizer.com/images/memes/Superman-thumbnail-url-8l2vny.jpg"
            ),
            SuperHero(
                superhero = "Iron Man",
                publisher = "Marvel",
                realName = "Tony Stark",
                photo = "https://playcontestofchampions.com/wp-content/uploads/2023/04/champion-iron-man.webp"
            ),
            SuperHero(
                superhero = "Wonder Woman",
                publisher = "DC",
                realName = "Diana Prince",
                photo = "https://i0.wp.com/leonardmaltin.com/wp-content/uploads/2020/12/Gal-Gadot-Wonder-Woman.jpg?fit=1100%2C825&ssl=1"
            ),
            SuperHero(
                superhero = "Captain America",
                publisher = "Marvel",
                realName = "Steve Rogers",
                photo = "https://wallpapers.com/images/featured/marvel-captain-america-pictures-w9n6ryri2sljuwzl.jpg"
            ),
            SuperHero(
                superhero = "Hulk",
                publisher = "Marvel",
                realName = "Bruce Banner",
                photo = "https://hips.hearstapps.com/hmg-prod/images/hulk-thor-ragnarok-infinity-war-1536683805.jpg?crop=0.564xw:1.00xh;0.204xw,0&resize=1200:*"
            ),
            SuperHero(
                superhero = "Flash",
                publisher = "DC",
                realName = "Barry Allen",
                photo = "https://images.bauerhosting.com/empire/2023/06/flash-3.jpg?ar=16%3A9&fit=crop&crop=top&auto=format&w=undefined&q=80"
            ),
            SuperHero(
                superhero = "Thor",
                publisher = "Marvel",
                realName = "Thor Odinson",
                photo = "https://wallpapers.com/images/featured/thor-qzytdg8xliuaelun.jpg"
            ),
            SuperHero(
                superhero = "Green Lantern",
                publisher = "DC",
                realName = "Hal Jordan",
                photo = "https://myhero.com/content/images/thumbs/0156863_green-lantern.jpeg"
            )
        )
    }
}
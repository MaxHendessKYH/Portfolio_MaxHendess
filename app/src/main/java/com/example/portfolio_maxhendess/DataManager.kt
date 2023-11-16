package com.example.portfolio_maxhendess

class DataManager{
    private var projects = mutableListOf<Project>()
    public fun getProjects(input: String): List<Project> {
        projects.clear()
        // TODO: this is where i would get data from database if i had a database
        // also add more projects when I have the time
        when (input) {
            "Java / Kotlin" -> {
                projects.add(
                    Project(
                        "Notepad",
                        "A Notepad app for your Andriod device written in Java.",
                        R.drawable.notepad_mainactivity,
                        R.drawable.notepad_noteactivity,
                        "Built after MVC structure this app uses shared prefrences to save / load" +
                                "file between sesions. It consists of 2 views, mainActivity, where you" +
                                "can see your notes and chose to edit / delete notes , and NoteActivity" +
                                "where you can write a note and then save it or discard it"))
                projects.add(
                    Project(
                        "Restaurant Menu",
                        "A Menu for a hallowenish themed restaurant.",
                        R.drawable.menuapp_main,
                        R.drawable.menuapp_dessert,
                        "This was one of my first Android Projects, where I learned about buttons." +
                                " It showcases the use of buttons with onclicklisteners. Their function is" +
                                " simply to change what menu is being displayed. The app uses one view."))
                projects.add(Project("Login ",
                    "A simple program that lets you register a user and do a login",
                    R.drawable.loginapp_main,
                    R.drawable.loginapp_meber,
                    "This was one of my earlier Android Projects, where I started to learn about views" +
                            "and how to navigate between views." +
                            "The program checks inputs from the edittext fields and if the inputs match an existing user" +
                            "you will be taken to the MembersActivity View. Otherwise you will get an error message." +
                            "The app is built after a MVC structure. The app dosn't save data between sesions."))
                projects.add(Project("Employees List View ",
                    "A program that lets you register employees and shows a list of your employees",
                    R.drawable.employeelistview_main,
                    R.drawable.employees_employee,
                    "This was one of my earlier Android Projects, where I started to learn about shared preferences" +
                            "JSON, objects, adapters, listviews and validation." +
                            "You can add a new employee, your input goes through validation checks, where regex is used" +
                            "to check that int input fields only have numbers.I also do empty checks on string input fields." +
                            "Employees are then registered in shared preferences as a json String, making use of the GSON library to" +
                            "convert objects into strings and strings into objects."+
                            "In the EmployeesActivity view you can see all employees and information about them." +
                            "This data is displayed in a list view with the help of an adapter." +
                            "IN employee view you also have a button to delete all employees, removing them from Shared preferences"))
            }
            "Javascript"-> {
                projects.add(Project("Web Shop",
                    "Its a webshop done in JS, using local storage to save data between pages.",
                    R.drawable.hyruleblackmarket,
                    R.drawable.webshop_cart,
                    "This was one of my earlier JS Projects where I learned about Local Storage and objects." +
                            "On the first page, You can add items to your shopping cart, selecting a color and how many of that item you want." +
                            " That item is then stored in local storage as an object." +
                            "The Second page represents you shopping cart, fetching items from local storage and displaying them." +
                            "the user can manipulate the items, adding or removing amount of items or deleting an item." +
                            "You can also see what the items total cost is, including shipment and moms. This information is updated on " +
                            "every button click." +
                            "Third page is the checkout, when you confirm purchase the local storage is cleared and the program is ready" +
                            "for your next purchase"))

                projects.add(Project("Hangman",
                    "Its hangman coded in JS!",
                    R.drawable.hangman,
                    R.drawable.shangman_win,
                    "Game is in swedish btw. When you start game, a random word is selected from an array. Then white squares are displayed " +
                            "on screen equal to the amount of letters in the randomly selected word.  " +
                            "The white squares is where the correct guesses go if the player makes a correct guess." +
                            "To play, the user has to press buttons to guess what letters are in the randomly selected word." +
                            " If he gets all the letters right he wins but if he fails 6 times he loses." +
                            "When the user presses a button that button gets disabled ( can't guess same letter twice), and code is executed" +
                            " to determine if that letter is in the word or not. If player guesses wrong the wrongGuesses counter goes up by 1 and " +
                            "you get a visual display of how close to dead you are. All the wrong guesses are also displayed at the bottom of the screen." +
                            "If the player guesses right, that letter is displayed in the white square at the position that letter is in the word." +
                            "There is also a timer counting how long each round takes."))
            }
            "C#" -> {
                projects.add(Project("My Discord Bot",
                    "C# Discord bot, does some database & api stuff. Also rolls dice",
                    R.drawable.discordbot_dbcall,
                    R.drawable.discordbot_knowszelda,
                    "This was a hobby project of mine, where i learned how to create discord bots in C#." +
                            "Need to add config.json for the bot to work, in project/bin/debug/net.0/ ( Not included in repo since that" +
                            "would make the bot very easy to hack)"+
                            "config.json should contain a token and a prefix.\n" +
                            "token is the bots id.\n" +
                            "prefix is what you type before a command, ie to do helloworld command you would type prefixhelloworld\n" +
                            "\n" +
                            "Bot wont know commands not registered in bot.cs." +
                            "the bot can do anything I thought was interesting at the time, such as roll dice," +
                            " fetch and display magic cards from Mtgio, do a poll, fetch and display information" +
                            "from a database."))

            }
            /* Skippar Unity projekten fornow kan inte fixa bilder för jao har inte tillgång till min gammla dator atm
             där de projekten finns och har inge gh repo på dom heller atm. #fixa i framtiden
            "Unity" -> {
                projects.add(Project("Blackjack",
                    "a 2D blackjack game.",
                    0,
                    R.drawable._552908835510,
                    "Gamble away on my blackjack table! The goal of the game is to have a hand of cards" +
                            "with a value closer to 21 than the dealers hand without going over 21" +
                            "You can bet fake money and then use the hit and stay buttons to try and win."))

                projects.add(Project("Platformer 101",
                    "a platofrming game featuring about 4 levels.",
                    0,
                    R.drawable._552908835510,
                    "Another of my hobby projects. This game is a 3D platformer, inspired by games" +
                            "such as the Super Mario series, Crash Bandicoot, Super Frog." +
                            "Contains a spagethi solution for a rideable yoshi."))

                projects.add(Project("Tower Defense 101",
                    "a game where you build towers to defend against waves of enemies.",
                    0,
                    R.drawable._552908835510,
                    "This was my first unity projcet IIRC. The goal was to learn and get comfy" +
                            "with UNITYs tools and create something" +
                            "simmilar to what I've previously created ( Big WC3 moder back in the day)" +
                            " in other enviroments, but this time in Unity." +
                            "Waves of enemies spawn the walk in a set path and you can build towers" +
                            "to try and prevent them from reaching the end. If a enemy reaches the end" +
                            "you will lose life, and when you have no lives left you lose the game."))
            }
             */
            "Html Css" -> {
                projects.add(Project("POE Assencdancy",
                    "One of my first Grid projects",
                    R.drawable.poe_globalnav,
                    R.drawable.poe_berserker,
                    "Its one of my first okay html / css projects where I learned how to  make use of grid and flexbox to create" +
                            "a layout. I use on hover effects to highlight some elements when the user is hovering over them." +
                            "The Global nav is using a flexbox layout and the other pages are using grid layout."))

            }
            else -> {
                projects.add(Project("dummy project 1",
                    "a project",
                    0,
                    0,
                    "Just a dummy project"))
            }
        }
//        projects = generateDummyData()
        return projects
    }
}
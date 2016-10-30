[![Build Status](https://travis-ci.org/HUGB2016/gens.svg?branch=master)](https://travis-ci.org/HUGB2016/gens/docs)
# Design report
Late term group assignment in HUGB 2016 at Reykjavík University.

##Introduction:

This assignment is about programming the game TicTacToe. The programming language is Java. We use tdd or test driven development. To be able to work together and keeping everyone updated we used GitHub to keep eveything we are doing in one place and make it more accessable. We used applications like Gradle, Travis and Heroku on this assignment.

##Design:
The game is designed so that two players can play a game of TicTacToe

The code will be split in three differnet categories, StartGame, Move and GameOver.

###StartGame:
Initalizes the board and displays it

###Move
Lets the players make moves until either has been declared a winner or it becomes a tie

###GameOver
It goes to this class when the game is over and it checks if the players want to take another game, if so it goes back to StartGame. if not it closes  


##Programming rules:
1. We accepted that in every function the braces would be at the end of the line not below

    example: initializeBoard(){

2. Functions and attributes are written in camelCase syntax

     example: makeMove(), displayBoard()

3. Classes are written in PascalCase syntax

    example: Board, TicTacToe

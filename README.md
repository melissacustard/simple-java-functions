# simple-java-functions

## Homework 2

We're going to write a two functions to calculate the *equivalent* human age of cats and dogs.

Note that these are rough estimations based generally accepted observation and opinion, and are interesting food for thought, but not exact science.


## GitHub Info
Repository:  https://github.com/htc-ccis2595/simple-java-functions

You need to fork this repository and submit a pull request to turn in the assignment.  Please post a screenshot of the pull request to the D2L dropbox.  The dropbox is mainly used to communicate due dates, not for storing the completed work.  You do not need to upload the project to D2L, only to GitHub.

## Assignment
Use InteliJ to create a new project called simple-java-functions in the spot where you clone the GitHub Repository.

Use the Command Line template to make a basic "Main" class with a main function.  Create two additional functions as indicated below. These functions must be __static__ functions, just like main.  Inside the main function you will use these functions to calculate some pet human ages.

### Dog Human Age
Make a static function called "calculateDogHumanAge" that:
 - takes a single input parameter (that might be a decimal)
 - returns the human age

For the first two years, a dog year is equal to 10.5 human years.
After that, each dog year equals 4 human years.

FYI: This calculation is based on studies that indicate dogs, except maybe larger breeds, develop more quickly in the first two years of life.

### Cat Human Age
Make a static function called "calculateCatHumanAge" that:
 - takes a single input parameter (that might be a decimal)
 - returns the human age

A one year old, a cat is roughly equal to a 15 year old human.
At two years, a cat is roughly equal to a 25 year old human.
After that, each cat year equals about 4 human years.  So a 3 year old cat is 29, and a 4 year old cat is 33.

### Main method
Use each of the above functions in your main method.  Call them 3-4 times with different values and print friendly messages to the output that show both the pet age and their human age.  Make sure to check your calculation results to show that the functions work.

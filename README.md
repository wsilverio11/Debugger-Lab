# CSCI 121: Computer Science II - Debugger Lab

## Overview

The goal of this lab is for you to learn about and practice using the debugger
built into DrJava. In addition, you will see an example of a program where
multiple classes work together to solve a larger problem.

## Workflow

You will use the same GitHub workflow for this lab as you did for last week's
lab. To get started, fork this repository. Clone your forked repository to the
machine you are working on, complete the lab, add to the repository the files
you created, commit, push, and create a pull request. If you forget the details
of these steps, see last week's lab.

In last week's lab you created a text file and a Java file for your
submission. This week's lab requires you to answer a series of questions and
fix some Java code. The changes you make to the Java code will be detected and
added to the repository by git when you commit. Your answers to the questions
in the lab should be placed in a *Markdown* file.

Markdown allows you to add special formatting syntax to text files so that they
can be converted to nice looking web pages or documents. This lab document was
written in Markdown and saved as README.md in the lab repository. GitHub looks
for a file called README.md in every repository, and displays it nicely on the
home page for the repository.

## Pig

In CS I there was a lab in which you implemented the dice game pig. For those of
you who haven't been playing pig regularly since then, here are the rules of
the game to refresh your memory:

> The object of pig is to be the first player to reach 100 points. On your
turn, you repeatedly roll a six-sided die until you choose to stop or you roll
a one, whichever comes first. If you choose to stop, then you score the sum of
all your die rolls. However, if you roll a one before stopping, you score 0 for
your turn.

## Pig Implementation

In the git repository for the lab you will find four Java files. Open all four
files in DrJava.

The following questions are designed to help you become familiar with the code
you just copied.

**Question 1:** Why is `cutoff` not a parameter to the method `playTurn` in the
`PigGame` class?

**Question 2:** What would the following code print?
```
ScoreSheet s = new ScoreSheet();
System.out.println(s.getTurnAverage());
```

**Question 3:** In the `PigGame` class, `numBusts` is incremented in the
`playGame` class. Describe how this statement could be moved to another method
in the class without affecting the results.

## Fixing the Pig

Compile and run the program in DrJava. `Main.java` must be the currently
selected file in DrJava when you press `Run`, because it is the class that
contains the `main()` function for our program.

When you run this program, it produces no output and does not terminate.  Your
goal is to find the error(s) causing this behavior and to fix the code so that
it executes correctly. **You may not add any additional print statements to
the code.** Instead, you should use the debugger to trace the execution of the
program. Before you begin, be sure to answer the following question:

**Question 4:** Based on your current understanding of the code, where do you
think the problem(s) might be located?  Are there portions of the code where
you are fairly certain the problem(s) could not possibly be?

For this portion of the lab, please do not tell other students what you
discover.  The point of the exercise is for each of you to determine what is
wrong by eliminating lines of code until you find the one(s) that are
incorrect.

**Question 5:** Describe the problem(s) with the program and the way(s) you
made the program execute correctly.

**Question 6:** Using the correct program, what are the average number of turns
for cutoff values 10, 15, 20, and 25?

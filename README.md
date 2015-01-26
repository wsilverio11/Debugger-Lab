# CSCI 121: Computer Science II
## Debugger Lab

### Overview

The goal of this lab is for you to learn about and practice using the debugger
built into DrJava. In addition, you will see an example of a program where
multiple classes work together to solve a larger problem.

### Workflow

You will use the same git workflow for this lab as you did for last week's lab:

1. Fork the assignment repository
2. Clone your forked repository to the machine you are working on
3. Complete the lab
4. Add any files you created to the repository
5. Commit
6. Push
7. Review your repository on GitHub to make sure everything looks good
8. Create a pull request

If you forget the details of these steps, review last week's lab.

In last week's lab you created a text file and a Java file for your
submission. This week's lab requires you to answer a series of questions and
fix some Java code. The changes you make to the Java code will be detected and
added to the repository by git automatically when you commit. Your answers to
the questions in the lab should be placed in a *Markdown* file.

### Editing Markdown Files

Markdown is a markup language. Markup languages allow you to add special
formatting syntax to text files so that they can be converted to nice looking
web pages or documents. This lab document was written in Markdown and saved as
`README.md` in the lab repository. GitHub looks for a file called `README.md`
in every repository. If it exists, GitHub displays it nicely on the home page
for the repository.

In the lab repository there is a file called `ExampleAnswers.md`. Click on this
file in GitHub and notice how it is formatted. Now click on the "Raw" button
above the formatted text. This will show you what the file looks like before
GitHub applies the formatting.

Open `ExampleAnswers.md` on your computer by opening up Finder and navigating
to your local clone of the lab repository. By default OS X will open the file
using TextEdit. When you edit a Markdown file in a text editor you will see the
raw text as opposed to the formatted text.

TextEdit is fine for editing simple text files, but more sophisticated text
editors will detect that this file is a Markdown file and add some syntax
highlighting to make it easier to read and edit. There is a nice text editor
called TextWrangler installed on the lab machines (this is a free program you
may want to install on your machine as well if you are using your own Macbook
for the lab). Open `ExampleAnswers.md` in TextWrangler and note that
TextWrangler highlights the formatting syntax for you.

Put your answers to the lab questions in a file called `Answers.md`. If you use
TextWrangler you should open a new text file and immediately save it as
`Answers.md` in the assignment repository directory. TextWrangler will note the
`.md` extension on the filename and apply Markdown highlighting automatically.

### Pig

In CS I there was a lab in which you implemented the dice game pig. For those of
you who haven't been playing pig regularly since then, here are the rules of
the game to refresh your memory:

> The object of pig is to be the first player to reach 100 points. On your
turn, you repeatedly roll a six-sided die until you choose to stop or you roll
a one, whichever comes first. If you choose to stop, then you score the sum of
all your die rolls. However, if you roll a one before stopping, you score 0 for
your turn.

### Pig Implementation

In the git repository for the lab you will find a directory called `src`. This
stands for "source" and is a common naming convention for directories that
contain source code. In the `src` directory you will find four Java files. Open
all four files in DrJava.

The following questions are designed to help you become familiar with the code
you just opened.

**Question 1:** Why is `cutoff` not a parameter to the method `playTurn` in the
`PigGame` class?

**Question 2:** What would the following code print?
```
ScoreSheet s = new ScoreSheet();
System.out.println(s.getTurnAverage());
```

**Question 3:** In the `PigGame` class, `numBusts` is incremented in the
`playGame` method. Describe how this statement could be moved to another
method in the class without affecting the results.

### Fixing the Pig

Compile and run the program in DrJava. `Main.java` must be the currently
selected file in DrJava when you press `Run`, because it is the class that
contains the `main` method for our program.

When you run the program you should see `> run Main` in the Interactions pane,
and it should say "Running main Method of Current Document" on the bottom bar
of DrJava. However, the program does not seem do anything.

The program is stuck in an infinite loop. If you open up Activity Monitor
(start spotlight with cmd-space and start typing Activity Monitor) and look at
the CPU tab, you will see that java is using a significant portion of your
CPU. This is because the program is running, but it is not producing output or
terminating. Press "Reset" in DrJava to halt execution of the program.

Clearly this infinite loop behavior is not what we want this program to
do. Your goal is to find the error(s) causing this behavior and to fix the code
so that it executes correctly. **You may not add any additional print
statements to the code.** Instead, you should use the debugger to trace the
execution of the program. Before you begin, be sure to answer the following
question:

**Question 4:** Based on your current understanding of the code, where do you
think the problem(s) might be located?  Are there portions of the code where
you are fairly certain the problem(s) could not possibly be?

### Using the Debugger in DrJava

**For this portion of the lab, please do not tell other students what you
discover.  The point of the exercise is for each of you to determine what is
wrong by examining lines of code until you find the one(s) that are
incorrect.**

To trace code in the debugger you need to toggle "Debug Mode" in the "Debugger"
menu. You will need to set up breakpoints and watches to step through the code
and see the values of variables. Start by setting a breakpoint at the
first line of execution on line 12 of Main.java. Place your cursor on the line
and select "Toggle Breakpoint on Current Line". You may also use the keyboard
shortcut cmd-b. The line should now be highlighted in red.

Now when you run the program it will pause when it hits the breakpoint. You can
step through the program line by line by pressing the "Step Into"
button. DrJava will step forward one line of execution each time you press the
button. If a method is called, it will take you into the method. After the
method returns, you will be returned to the calling method. Keep pressing "Step
Into" and notice what happens. Read on when you're sure you understand how this
works.

We would like to see the values of different variables while we are stepping
through the execution. To do this we need to set up watches. When you have
stepped to a part of the code where you would like to see the value of a
variable, enter the name of the variable in the "Name" field of an empty row in
the "Watches" pane. Now every time a variable with that name is in scope it
will show you the variable's value and type.

Find the issue in the code by stepping through and finding the variable(s)
whose values are not what they should be, and the statement(s) that are causing
the problem. Change the code so that it works correctly.

**Question 5:** Describe the problem(s) with the program and the way(s) you
made the program execute correctly.

**Question 6:** Using the correct program, what are the average number of turns
for cutoff values 10, 15, 20, and 25?

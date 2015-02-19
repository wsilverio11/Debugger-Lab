**Question 1:** Why is `cutoff` not a parameter to the method `playTurn` in the
`PigGame` class?

>````Cutoff```` isn't a parameter to the method ````playTurn```` in the ````PigGame```` class because cutoff is an instance variable that being declared a the beginning of the class.

**Question 2:** What would the following code print?
```
ScoreSheet s = new ScoreSheet();
System.out.println(s.getTurnAverage());
```

>This code will print 0.0 because ````numTurns```` has a value of 0.

**Question 3:** In the `PigGame` class, `numBusts` is incremented in the
`playGame` method. Describe how this statement could be moved to another
method in the class without affecting the results.

>numBusts can be implemented in the ````playTurn```` method without affecting the results because it already has check to when the turn ends.

**Question 4:** Based on your current understanding of the code, where do you
think the problem(s) might be located?  Are there portions of the code where
you are fairly certain the problem(s) could not possibly be?

> I think the problem is going to be within the Main.java, specifically, in the playTurn function. I think something isn't communicating correctly.

**Question 5:** Describe the problem(s) with the program and the way(s) you
made the program execute correctly.

>The ````int```` type was making the random function always return 0, which makes the equation always return 1. By casting out the ````int```` from the equation, it'll let the ````math.random```` function actually get a random number. 

**Question 6:** Using the correct program, what are the average number of turns
for cutoff values 10, 15, 20, and 25?

>Average number of turns for:

10: 5.55

15: 12.625

20: 8.5

25: 11.333

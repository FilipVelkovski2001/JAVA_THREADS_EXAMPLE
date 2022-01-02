# Java Threads

Threads allows a program to operate more efficiently by doing multiple things at the same time.
Threads can be used to perform complicated tasks in the background without interrupting the main program.

![](https://media.geeksforgeeks.org/wp-content/uploads/main-thread-in-java.jpeg)

*Creating a Thread*
There are two ways to create a thread.

It can be created by extending the Thread class and overriding its run() method

*Running Threads*
If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start() method
f the class implements the Runnable interface, the thread can be run by passing an instance of the class to a Thread object's constructor and then calling the thread's start() method

*Concurrency Problems*
Because threads run at the same time as other parts of the program, there is no way to know in which order the code will run. When the threads and main program are reading and writing the same variables, the values are unpredictable. 
The problems that result from this are called concurrency problems.
To avoid concurrency problems, it is best to share as few attributes between threads as possible. 
If attributes need to be shared, one possible solution is to use the isAlive() method of the thread to check whether the thread has finished running before using any attributes that the thread can change.


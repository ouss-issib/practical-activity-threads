
# Java Threading Exercises

This repository contains solutions to practical exercises focused on multi-threading and parallel programming in Java. These exercises are part of the Java Object-Oriented Programming course led by Mr. Abdelmajid Bousselham.

## Exercises Overview

### Exercise 1: Multi-Threading with `Runnable`

- **Objective**: Create a simple application demonstrating classic multi-threading behavior.
- **Steps**:
  1. Implement the `Talkative` class with an integer attribute.
  2. Modify `Talkative` to implement the `Runnable` interface.
  3. Override the `run` method to print the attribute's value 100 times.
  4. In the `main` method, create 10 instances of `Thread`, each with a unique `Talkative` instance.
  5. Start each thread and observe the output.
- **Expected Outcome**: The application showcases concurrent execution with each thread printing its respective attribute value.
- **Execution**:
    <img src="./captures/result__ex1.png"/>
    <img src="./captures/result_ex1.png"/>
<h4>
  En exécutant ce programme, je constate que les messages s'affichent de manière désordonnée. Chaque thread exécute sa propre méthode run, et c'est le système qui détermine l'ordre d'exécution. 

</h4>
### Exercise 2: Parallel Sum Calculation Using Thread Pool

- **Objective**: Use a thread pool to compute the sum of array elements in parallel.
- **Steps**:
  1. Implement the `Sommeur` class that calculates the sum over a range of indices in an array.
  2. Provide a `getSomme` method to return the computed sum.
  3. In the `main` class, divide the array into ranges, create a thread pool, and assign each range to a `Sommeur` instance.
  4. Wait for all threads to finish and display the total sum.
- **Expected Outcome**: The program demonstrates efficient parallel computation of the array sum using thread pools.

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/java-threading-exercises.git



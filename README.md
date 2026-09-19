# Lab 2 - Linear Search in Real Applications

## Overview

This project demonstrates Linear Search using Java.

The program uses an array of library titles and provides two search methods:

- `findFirst()` - finds the index of the first matching title.
- `countMatches()` - counts how many times a title appears in the array.

## Program

The program uses this library list:

`[C, Java, DSA, Java, SQL]`

The program tests different search situations, including:

- Target at the first position
- Target at the last position
- Target not found
- Repeated titles
- Adjacent duplicate titles
- Manual traces for `Java` and `Python`

## Methods

### findFirst()

`findFirst(String[] items, String target)`

This method checks each element from the beginning of the array.

If the target is found, it returns its index.

If the target is not found, it returns `-1`.

### countMatches()

`countMatches(String[] items, String target)`

This method checks the entire array and counts every occurrence of the target.

It returns the total number of matches.

## Test Results

| Test Case | Target | findFirst() | countMatches() |
|---|---|---:|---:|
| Target at first position | C | 0 | 1 |
| Target at last position | SQL | 4 | 1 |
| Target missing | Python | -1 | 0 |
| Repeated titles | Java | 1 | 2 |

## Linear Search

Linear Search checks elements one by one from the beginning of the array.

It works even when the data is unsorted because it does not require the elements to be arranged in a particular order.

For `findFirst()`, the search stops when the first match is found.

For `countMatches()`, the search must continue until the end because it needs to count every match.

## Time Complexity

### findFirst()

- Best case: `O(1)` - target is at the first position.
- Worst case: `O(n)` - target is at the last position or is not found.

### countMatches()

- Best case: `O(n)`
- Worst case: `O(n)`

`countMatches()` always checks the entire array.

## How to Run

Open the terminal in the project folder and run:

    javac src\LibraryFinder.java
    java -cp src LibraryFinder

## Files

    Lab2/
    ├── src/
    │   ├── LibraryFinder.java
    │   └── LibraryFinder.class
    └── README.md

## Verification

The program was compiled and executed successfully.

The test cases produced the expected results:

- `C` → index `0`
- `SQL` → index `4`
- `Python` → not found (`-1`)
- `Java` → first occurrence at index `1` and `2` total matches

The program also prints every inspected index during the search.

## AI Use

AI was used as a programming tutor and assistant during the development of this laboratory activity.

Model used:

**Nemotron 3 Ultra Free through OpenCode**

AI was used to help with:

- Understanding Linear Search
- Planning the program
- Explaining the required methods
- Creating and checking test cases
- Reviewing the manual trace
- Debugging and verifying the Java program

The final program was compiled and tested manually, and the results were checked against the expected outputs.

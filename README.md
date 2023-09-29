# Grokking Data Structure and Algorithm

This repository contains solutions to various problems related to data structure and algorithm interview preparation.
The problems are categorized into different coding patterns, each in a separate package.
Each package contains solutions to multiple problems.

## Project structure

The problems are organized into packages based on the coding pattern they belong to. For example, if the coding pattern
is "Two Pointers", all the problems related to two pointers will be in the `twoPointers` package. Each package contains
a
`Solution.kt` file that contains the code for the problem and a `SolutionTest.kt` file that contains tests for the
problem.

## How to run

Each Solution.kt file contains a link to the problem at the beginning. If there are no links, a `Problem` file will be
provided.

To check the solution, you need to run the tests in the `SolutionTest.kt` file. For example, if you want to check the
solution of the LeetCode problem, [125. Valid Palindrome](https://leetcode.com/problems/valid-palindrome/description/),
you can run the tests in the `src/test/kotlin/twoPointers/validPalindrome/SolutionTest.kt` file.

For trying out the implementation of the data structures, you have to run the `Driver.kt` file in the corresponding
package.

## Contributing

Contributions are welcome! Please feel free to submit a pull request if you have a solution for a problem that is not
yet included in this repository. Please ensure that your solution is organized into a package based on the coding
pattern it belongs to, and that it includes a `Solution.kt` file with the code for the problem and a `SolutionTest.kt`
file
with tests for the problem.
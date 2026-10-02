# Recursion & Backtracking

## Recursion
Break problem into smaller subproblems. Identify base case and recursive case.

## Backtracking
Explore all possibilities, undo choices that don't lead to a solution.

## Patterns
- Subsets, permutations, combinations
- N-Queens, Sudoku solver
- Tree/graph traversal

## Template
```java
void backtrack(state) {
    if (done) { record(); return; }
    for (choice : choices) {
        make(choice);
        backtrack(state);
        undo(choice);
    }
}
```

## Problems Covered
_None yet._

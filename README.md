This repository demonstrates an unexpected behavior of the `removeIf` function in Kotlin when used with `MutableList` and `MutableSet`. The `MutableList` version works as expected, while the `MutableSet` version does not remove all elements satisfying the condition.

The `bug.kt` file shows the unexpected behavior.  The `bugSolution.kt` file demonstrates a workaround using an iterator.
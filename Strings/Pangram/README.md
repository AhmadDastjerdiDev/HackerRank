# Pangrams – HackerRank (Java)

This repository contains two solutions for the **Pangrams** problem from HackerRank.

## Solution 1: Initial Approach
- Uses Java Streams and Collections
- Removes duplicates, sorts characters, and compares with the alphabet
- Correct but uses unnecessary sorting and extra memory

**Complexity:**  
Time: O(n log n)  
Space: O(n)

## Solution 2: Optimized Approach
- Uses a boolean array to track letter presence
- Single pass through the string
- No sorting or extra data structures

**Complexity:**  
Time: O(n)  
Space: O(1)

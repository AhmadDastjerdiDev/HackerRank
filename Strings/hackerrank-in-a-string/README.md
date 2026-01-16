### Solution 1 (Initial Approach)
- Converted input string to a list of characters
- Iteratively matched each character of "hackerrank"
- Used subList to ensure characters are matched in order
- Correct but uses extra memory and nested loops

### Solution 2 (Optimized Approach)
- Uses a single pointer to track progress in "hackerrank"
- Scans the input string once
- Time Complexity: O(n)
- Space Complexity: O(1)
- Cleaner, faster, and easier to reason about

### Mars Exploration Problem

**Problem:** Count altered letters in repeated "SOS" messages.

**Solution 1:** Original implementation
- Works correctly
- Used substring and nested ifs
- Slight inefficiency in character checking

**Solution 2:** Improved implementation
- Uses charAt() and modulo to determine expected letters
- Avoids creating substrings → better performance
- Cleaner, shorter, and more readable

**Takeaways:**
- Always prefer direct character access for large strings
- Use modulo for repeated patterns
- Clear code is almost as important as correctness

# AI Usage

Q: In a concise way, explain the file structure for this assignment and nd give step by step instructions to implement this

A: 

## **File Structure**

The assignment follows a strict Java package structure. The main source code is placed under the `src` directory, organized by package name:

```plaintext
src/org/howard/edu/lsp/assignment5/
 ├── IntegerSet.java
 ├── Driver.java
 └── doc/
      └── AI_Usage_Report.md
```

* `IntegerSet.java` contains the implementation of the set operations.
* `Driver.java` is provided and used to test functionality (must not be modified).
* `doc/AI_Usage_Report.md` documents any AI or external resources used.

---

## **Step-by-Step Implementation**

1. **Create the folder structure**
   Set up directories exactly as required to match the package name.

2. **Add package declaration**
   At the top of `IntegerSet.java`, include:

   ```java
   package org.howard.edu.lsp.assignment5;
   ```

3. **Initialize data structure**
   Use an `ArrayList<Integer>` to store set elements and prevent duplicates.

4. **Implement basic methods**
   Start with `add`, `remove`, `contains`, `length`, and `clear`.

5. **Handle edge cases**
   For `largest()` and `smallest()`, throw an exception if the set is empty.

6. **Implement set operations**
   Write `union`, `intersect`, `diff`, and `complement`, ensuring:

   * A new `IntegerSet` is returned
   * Original sets are not modified

7. **Implement equality check**
   Compare both sets to ensure they contain the same elements.

8. **Override `toString()`**
   Sort elements and return them in the format `[1, 2, 3]`.

9. **Test with Driver.java**
   Compile and run to verify all methods behave correctly.

10. **Create AI usage report**
    Add `AI_Usage_Report.md` in the `doc` folder documenting any tools used.

---

This ensures the program compiles, runs correctly, and meets all assignment requirements.

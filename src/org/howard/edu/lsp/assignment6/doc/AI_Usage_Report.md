# AI Usage

Q: In a concise way, explain the file structure for this assignment and give step by step instructions to implement this

A: ## File structure (what you should have)

```
src/
 └── org/
     └── howard/
         └── edu/
             └── lsp/
                 └── assignment6/
                     ├── IntegerSet.java
                     ├── IntegerSetTest.java
                     └── doc/
                         └── AI_Usage_Report.md
```

---

## Step-by-step implementation instructions

### 1. Create the correct package structure

Make sure both Java files start with:

```java
package org.howard.edu.lsp.assignment6;
```

---

### 2. Copy your Assignment 5 class

* Copy `IntegerSet.java` into `assignment6`
* Do NOT rename methods or change required signatures

---

### 3. Create JUnit test file

* Create `IntegerSetTest.java` in the same package
* Add JUnit 5 imports
* Write tests for every method

---

### 4. Ensure JUnit is configured

* Add JUnit 5 library (or `junit-platform-console-standalone`)
* Confirm imports resolve:

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
```

---

### 5. Run tests (not Driver)

* DO NOT use `Driver.java`
* Run using VS Code Testing tab or:

  * “Run Tests” button

---

### 6. Verify output

All tests must:

* Pass (green checkmarks)
* Include normal + edge cases for every method

---

### 7. Add AI usage file

Create:

```
assignment6/doc/AI_Usage_Report.md
```

If you used AI:

* list usage briefly
  If not:

```
nothing used
```

---

### 8. Final check before submission

* No compilation errors
* All tests pass
* Correct package structure
* All required methods tested
* AI report included

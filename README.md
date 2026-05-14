# Sixth Assignment — Exceptions and Files

## Introduction

In this assignment, you will practice working with:
- File reading and writing
- Exception handling
- CSV data processing
- Validation of user/file input
- Basic report generation

The goal is to build a small sales report system that reads product and order information from CSV files, validates the data, calculates totals, and generates a final report file.

This assignment focuses heavily on using exceptions and file operations correctly while keeping the program stable even when invalid data exists in the input files.

---

# Objectives

By completing this assignment, you should be able to:

- Read data from CSV files using Java file handling tools
- Parse and process text-based data
- Use exception handling (`try-catch`) to manage invalid input safely
- Validate numeric and logical data
- Skip invalid rows without stopping the entire program
- Generate and save reports into output files
- Organize code into multiple classes and methods
- Use Git and GitHub/Gitea workflows professionally

---

# Tasks

## Part 1 — Load Product Data

Implement the `loadProducts()` method in `Main.java`.

Requirements:
- Read product data from `products.csv`
- Each line follows this format:

```text
[productId],[name],[price]
```

Example:

```text
1,Apple iPhone 16,999.99
```

Notes:
- The product file data is guaranteed to be valid.
- Every line contains exactly two commas.
- No additional validation is required for this file.

You should:
- Read each line
- Parse the values
- Create `Product` objects
- Store them inside `productCatalog`

---

## Part 2 — Process Order File

Implement the `processFile()` method in `ReportGenerator.java`.

The order details file follows this format:

```text
[productId],[quantity],[discountPercent]
```

Example:

```text
1,2,10
3,5,25
```

---

### Validation Rules

A line is considered invalid if:
- `quantity` is not a valid integer
- `discountPercent` is not a valid integer
- `quantity <= 0`
- `discountPercent` is outside the range `0–99`
- The `productId` does not exist in `productCatalog`

If even one field is invalid, the entire line must be skipped.

---

### Important Requirement

You are strongly encouraged to use:
- `try-catch`
- exception handling
- `NumberFormatException`

to safely process invalid rows without terminating the program.

The program should continue processing the remaining lines even if some rows are invalid.

---

### Calculations

For every valid row:

```text
subtotal = quantity × productPrice

discountValue = subtotal × discountPercent / 100

finalCost = subtotal - discountValue
```

Update the following totals:

- `totalQuantity`
- `totalFinalCost`
- `totalDiscountValue`
- `totalInvalidLines`

---

## Part 3 — Generate Report

Implement the `saveReport()` method.

The generated report should contain:
- Total quantity
- Total final cost
- Total discount value
- Number of invalid lines

Example:

```text
===== SALES REPORT =====

Total Quantity: 25
Total Final Cost: 1520.50
Total Discount Value: 210.75
Invalid Lines: 3
```

Save the report into an output file.

---

# Submission ⌛

Before submitting:

- Add your mentor as a contributor to the repository
- Create a `develop` branch for implementation
- Use Git regularly with meaningful commits
- Push all code to the remote repository
- Push the answers/documentation file if required
- Create a Pull Request from `develop` → `main`

---

# Additional Resources 📚

## Assignment Explanation Videos
- https://drive.meshcomp.ir/d/15b6b853da8d4ade97de/

## Java File Handling
- https://docs.oracle.com/javase/tutorial/essential/io/

## Java Exceptions
- https://docs.oracle.com/javase/tutorial/essential/exceptions/

## Scanner Class
- https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html

## Try-Catch in Java
- https://www.w3schools.com/java/java_try_catch.asp

## Git Branching
- https://git-scm.com/book/en/v2/Git-Branching-Branches-in-a-Nutshell

## CSV Basics
- https://en.wikipedia.org/wiki/Comma-separated_values
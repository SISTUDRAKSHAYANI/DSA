🔎 Binary Search on 2D Arrays

Binary Search can also be applied to 2D arrays/matrices when the elements follow a sorted order.

📌 Concept

The main idea is to treat the 2D matrix as a virtual 1D sorted array.

For a matrix with:

- "m" rows
- "n" columns

The total number of elements is:

m × n

We perform Binary Search using indices from:

0 → (m × n) - 1

Then convert the virtual 1D index back into row and column:

row = mid / n
col = mid % n

🧠 Algorithm

1. Set "low = 0".
2. Set "high = (rows × cols) - 1".
3. Find the middle index:
   mid = low + (high - low) / 2
4. Convert "mid" into matrix coordinates:
   row = mid / cols
col = mid % cols
5. Compare "matrix[row][col]" with the target.
6. If equal → target found.
7. If target is smaller → move "high" left.
8. If target is larger → move "low" right.
9. Continue until "low > high".

💡 Example

Matrix:

1   3   5
7   9   11
13  15  17

Target = "11"

Treat it as:

1  3  5  7  9  11  13  15  17

If "mid = 5":

row = 5 / 3 = 1
col = 5 % 3 = 2

So:

matrix[1][2] = 11

Target found ✅

⏱️ Complexity

Time Complexity

O(log(m × n))

Space Complexity

O(1)

📌 Important Formula

The most important part to remember:

row = mid / numberOfColumns
col = mid % numberOfColumns

This allows us to perform Binary Search on a sorted 2D matrix without actually converting it into a 1D array.

🧩 Pattern

2D Matrix
   ↓
Treat as Virtual 1D Array
   ↓
Binary Search
   ↓
Convert mid → row & column
   ↓
Compare with target

🚀 Key Takeaway

Whenever a 2D matrix is sorted in such a way that every element in a row is greater than the last element of the previous row, we can flatten it conceptually and apply Binary Search in O(log(m × n)).

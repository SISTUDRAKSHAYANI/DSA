# Binary Search on Answers

## 📌 What is Binary Search on Answers?

Binary Search on Answers is a technique where we apply Binary Search on the **range of possible answers** instead of searching directly in an array.

It is mainly used when a problem asks us to find the **minimum or maximum possible value** satisfying a given condition.

The key idea is to check whether a candidate answer `mid` is **possible** or not.

---

## 🧠 When to Use?

Look for problems with:

- Minimum possible answer
- Maximum possible answer
- Minimize the maximum
- Maximize the minimum
- A known range of possible answers
- A condition that can be checked for a given answer
- A **monotonic** possible/impossible pattern

---

## 🔑 Core Idea

Suppose we need to find the **minimum possible answer**.

The answers may look like:

```text
False  False  False  False  True  True  True  True
                              ↑
                       Minimum valid answer

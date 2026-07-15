# Prefix Sum + HashMap Interview Cheat Sheet

## 1. When should I think of Prefix Sum?

If the question contains:

* ✅ Subarray (contiguous)
* ✅ Range Sum
* ✅ Sum = K
* ✅ Sum Divisible by K
* ✅ Count of Subarrays
* ✅ Longest/Shortest Subarray
* ✅ Continuous Segment

**Keyword:** Contiguous ⇒ Think **Prefix Sum**

---

# 2. Core Formula

```
prefix[i] = nums[0] + nums[1] + ... + nums[i]
```

Subarray Sum:

```
sum(l, r) = prefix[r] - prefix[l-1]
```

Everything in Prefix Sum is built on this formula.

---

# 3. The Golden Pattern

Every problem follows this flow:

```
Current Prefix Sum
        ↓
Apply required condition
        ↓
Need a previous prefix?
        ↓
Store it in HashMap
        ↓
Use it to answer in O(1)
```

---

# 4. Pattern 1 → Subarray Sum = K

### Condition

```
prefix[r] - prefix[l-1] = k
```

Rearrange:

```
prefix[l-1] = prefix[r] - k
```

### Store

```
Prefix Sum
```

### HashMap

```
Key   = Prefix Sum
Value = Frequency
```

### Code Logic

```java
count += map.getOrDefault(prefixSum - k, 0);
map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
```

### Remember

> Exact Sum ⇒ Store Prefix Sum

---

# 5. Pattern 2 → Sum Divisible by K

### Condition

```
(prefix2 - prefix1) % k == 0
```

Which becomes

```
prefix2 % k == prefix1 % k
```

### Store

```
Prefix Sum % k
```

### HashMap

```
Key   = Remainder
Value = Frequency
```

### Code Logic

```java
int rem = ((prefixSum % k) + k) % k;

count += map.getOrDefault(rem, 0);

map.put(rem, map.getOrDefault(rem, 0) + 1);
```

### Remember

> Same Remainder ⇒ Sum Divisible by K

---

# 6. Pattern 3 → Longest Subarray

### Store

First occurrence only

```
Key   = Prefix Sum / Remainder
Value = First Index
```

### Why?

Earliest index gives maximum length.

---

# 7. Pattern 4 → Existence Check

Need only:

```
Have I seen this before?
```

Return immediately when found.

---

# 8. Which HashMap Should I Use?

| Problem                  | Store            | Value       |
| ------------------------ | ---------------- | ----------- |
| Sum = K (Count)          | Prefix Sum       | Frequency   |
| Sum = K (Longest)        | Prefix Sum       | First Index |
| Divisible by K (Count)   | Remainder        | Frequency   |
| Divisible by K (Longest) | Remainder        | First Index |
| Exists?                  | Prefix/Remainder | Presence    |

---

# 9. The Most Important Initializations

### Count Problems

```java
map.put(0, 1);
```

Meaning:

```
Empty Prefix Sum = 0
Occurred Once
```

This counts subarrays starting from index **0**.

---

### Longest Problems

Usually

```java
map.put(0, -1);
```

Meaning

```
Empty Prefix exists before array starts.
```

---

# 10. Negative Numbers

Java gives

```
-2 % 5 = -2
```

We need

```
3
```

Use

```java
int rem = ((prefixSum % k) + k) % k;
```

Never forget this for modulo problems.

---

# 11. Prefix Sum Mental Flow

```
Current Number
      ↓
Update Prefix Sum
      ↓
Convert to Needed Form
      ↓
(Prefix / Prefix-K / Remainder)
      ↓
Check HashMap
      ↓
Update Answer
      ↓
Store Current State
```

---

# 12. Decision Tree

```
Question about Subarray?
          │
          ▼
      Prefix Sum
          │
          ▼
Exact Sum?
      │
      ├── Yes → Store Prefix Sum
      │
      ▼
Divisible?
      │
      ├── Yes → Store Remainder
      │
      ▼
Need Count?
      │
      ├── Frequency Map
      │
      ▼
Need Longest?
      │
      ├── First Occurrence
      │
      ▼
Need Exists?
      │
      └── Presence Map
```

---

# 13. Interview Pattern Recognition

| Question Says    | Think         |
| ---------------- | ------------- |
| Sum = K          | Prefix Sum    |
| Count Subarrays  | Frequency Map |
| Longest Subarray | First Index   |
| Divisible by K   | Remainder     |
| Contiguous       | Prefix Sum    |
| Range Sum        | Prefix Sum    |
| Running Sum      | Prefix Sum    |

---

# 14. Common Mistakes

❌ Forget `map.put(0,1)`

❌ Forget negative remainder handling

❌ Store frequency instead of first index (or vice versa)

❌ Update map before checking (problem dependent)

❌ Forget that subarray uses **difference of prefix sums**

---

# 15. 30-Second Interview Summary

```
Subarray Sum

↓

Convert into Prefix Sum Difference

↓

Find the required previous prefix

↓

Use HashMap for O(1) lookup

↓

Store:
• Prefix Sum → Exact Sum Problems
• Prefix Sum % K → Divisibility Problems

↓

Frequency → Count

First Index → Longest

Presence → Exists
```

---

# 16. Ultimate Memory Trick

```
EXACT SUM
----------
Need Difference

prefix - k

Store Prefix Sum


DIVISIBLE
----------
Need Same Modulo

prefix % k

Store Remainder


COUNT
------
Frequency


LONGEST
--------
First Occurrence


EXISTS
-------
Presence


SUBARRAY
---------
Think Prefix Sum First.
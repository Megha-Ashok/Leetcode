
# 🔧 Bit Manipulation – Full Guide

## 🔧 Why Use Bit Manipulation?

- **Speed**: Bit operations are extremely fast (constant time O(1)).
- **Memory Efficiency**: Helps save memory by storing multiple boolean states in a single integer.
- **Low-Level Control**: Crucial in systems programming, embedded systems, and hardware control.
- **Mathematical Tricks**: Can solve complex problems with elegant and efficient one-liners.
- **Competitive Programming**: Many problems (e.g., subsets, parity, toggling, bitmasks) require bit manipulation.

## ✅ Bit Manipulation Operators

| Operator | Symbol | Description        | Example       |
|----------|--------|--------------------|---------------|
| AND      | &      | Bitwise AND        | 5 & 3 = 1     |
| OR       | \|    | Bitwise OR         | 5 \| 3 = 7   |
| XOR      | ^      | Bitwise XOR        | 5 ^ 3 = 6     |
| NOT      | ~      | Bitwise NOT        | ~5 = -6       |
| Left Shift | <<   | Shifts bits to left| 5 << 1 = 10   |
| Right Shift| >>   | Shifts bits to right| 5 >> 1 = 2   |

## 📚 Common Bit Manipulation Functions

### 1. Check if a bit is set
```cpp
bool isSet(int n, int i) {
    return (n & (1 << i)) != 0;
}
```
🔹 Use case: Checking if i-th bit is 1 (e.g., permissions, toggles)

### 2. Set a bit
```cpp
int setBit(int n, int i) {
    return n | (1 << i);
}
```
🔹 Use case: Enable a feature, mark a bit as ON.

### 3. Clear a bit
```cpp
int clearBit(int n, int i) {
    return n & ~(1 << i);
}
```
🔹 Use case: Disable a feature, mark a bit as OFF.

### 4. Toggle a bit
```cpp
int toggleBit(int n, int i) {
    return n ^ (1 << i);
}
```
🔹 Use case: Switch ON→OFF or OFF→ON without checking current state.

### 5. Count set bits (1s)
```cpp
int countSetBits(int n) {
    int count = 0;
    while (n) {
        n &= (n - 1); // Brian Kernighan’s Algo
        count++;
    }
    return count;
}
```
🔹 Use case: Count features enabled, binary weight, Hamming weight.

### 6. Check if number is power of two
```cpp
bool isPowerOfTwo(int n) {
    return n > 0 && (n & (n - 1)) == 0;
}
```
🔹 Use case: Optimization check for fast division/multiplication.

### 7. Get lowest set bit
```cpp
int getLowestSetBit(int n) {
    return n & (-n);
}
```
🔹 Use case: Isolate rightmost 1 (used in Fenwick Tree, etc.)

### 8. Remove lowest set bit
```cpp
int removeLowestSetBit(int n) {
    return n & (n - 1);
}
```
🔹 Use case: Iterate over all set bits in a number.

### 9. Swap two numbers without temp variable
```cpp
void swap(int &a, int &b) {
    a ^= b;
    b ^= a;
    a ^= b;
}
```
🔹 Use case: Space-saving trick (though not used often in production).

### 10. Check parity (even/odd)
```cpp
bool isEven(int n) {
    return (n & 1) == 0;
}
```
🔹 Use case: Faster than n % 2 == 0.

### 11. Turn off rightmost 1-bit
```cpp
int turnOffRightmostOne(int n) {
    return n & (n - 1);
}
```

### 12. Turn on rightmost 0-bit
```cpp
int turnOnRightmostZero(int n) {
    return n | (n + 1);
}
```

### 13. Generate all subsets using bitmask
```cpp
void generateSubsets(vector<int>& nums) {
    int n = nums.size();
    for (int mask = 0; mask < (1 << n); ++mask) {
        for (int j = 0; j < n; ++j) {
            if (mask & (1 << j))
                cout << nums[j] << " ";
        }
        cout << endl;
    }
}
```
🔹 Use case: Power set generation in O(2^n) time.

### 14. Insert bits from one number into another
```cpp
int insertBits(int N, int M, int i, int j) {
    int mask = ~(((1 << (j - i + 1)) - 1) << i);
    return (N & mask) | (M << i);
}
```
🔹 Use case: Used in bit-packing and image/video compression.

### 15. Reverse bits of a number
```cpp
unsigned int reverseBits(unsigned int n) {
    unsigned int rev = 0;
    for (int i = 0; i < 32; ++i) {
        rev <<= 1;
        if (n & 1)
            rev |= 1;
        n >>= 1;
    }
    return rev;
}
```
🔹 Use case: Reverse-endian storage, network protocols.

## 🔍 Where Is Bit Manipulation Used?
- Data compression & encoding  
- Cryptography  
- Graphics (e.g., color channels)  
- Networking protocols  
- Embedded systems / Device drivers  
- Competitive programming  
- Game development (flags, status masks)  
- Scheduling, permission handling (UNIX file permission bits)  

## 🧠 Tips for Mastering Bit Manipulation

- Know powers of 2 and binary representation well.  
- Think in bits: visualize the binary.  
- Practice common patterns like:  
  - `(n & (n - 1))`  
  - `(n & -n)`  
  - `(n | (n + 1))`  
- Use bitmasks for representing states (e.g., subset of elements).

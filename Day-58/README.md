# Trapping Rain Water Problem

## Problem Statement

Given an array `arr[]` of non-negative integers representing the **height of blocks**, compute how much **water can be trapped** between the blocks after it rains.  
Assume the **width of each block is 1**.

---

## Examples

### Example 1
- **Input:**  
  `arr[] = [3, 0, 1, 0, 4, 0, 2]`
- **Output:**  
  `10`
- **Explanation:**  
  Water trapped = `0 + 3 + 2 + 3 + 0 + 2 + 0 = 10` units

---

### Example 2
- **Input:**  
  `arr[] = [3, 0, 2, 0, 4]`
- **Output:**  
  `7`
- **Explanation:**  
  Water trapped = `0 + 3 + 1 + 3 + 0 = 7` units

---

### Example 3
- **Input:**  
  `arr[] = [1, 2, 3, 4]`
- **Output:**  
  `0`
- **Explanation:**  
  No water can be trapped since there are no dips between heights.

---

### Example 4
- **Input:**  
  `arr[] = [2, 1, 5, 3, 1, 0, 4]`
- **Output:**  
  `9`
- **Explanation:**  
  Water trapped = `0 + 1 + 0 + 1 + 3 + 4 + 0 = 9` units

---

## Constraints

- `1 < arr.length < 10^5`
- `0 < arr[i] < 10^3`

---

## Optimal Approach – Two-Pointer Technique

### Idea

1. **Use two pointers** `left` and `right` initialized at both ends of the array.
2. Maintain two variables:
   - `leftMax` – max height from the left side
   - `rightMax` – max height from the right side
3. If `arr[left] < arr[right]`:
   - If `arr[left] < leftMax` → water trapped = `leftMax - arr[left]`
   - Else update `leftMax`
   - Move `left` pointer to the right
4. Else:
   - If `arr[right] < rightMax` → water trapped = `rightMax - arr[right]`
   - Else update `rightMax`
   - Move `right` pointer to the left

---

## Java Implementation (Efficient, O(n) Time | O(1) Space)

```java
public class TrappingRainWater {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax)
                    leftMax = height[left];
                else
                    water += leftMax - height[left];
                left++;
            } else {
                if (height[right] >= rightMax)
                    rightMax = height[right];
                else
                    water += rightMax - height[right];
                right--;
            }
        }

        return water;
    }
}
# Container With Most Water

## Problem Statement

Given an array `arr[]` of non-negative integers, where each element `arr[i]` represents the height of vertical lines drawn at coordinate `i`, find the **maximum area of water** that can be trapped between **any two vertical lines** and the **x-axis**.

> Note: The container must be formed between **two different lines**, so a single vertical line cannot hold any water.

---

## Examples

### Example 1
- **Input:**  
  `arr[] = [1, 5, 4, 3]`
- **Output:**  
  `6`
- **Explanation:**  
  Choose lines 5 and 3 at a distance of 2:  
  `min(5, 3) * (3 - 1) = 3 * 2 = 6`

---

### Example 2
- **Input:**  
  `arr[] = [3, 1, 2, 4, 5]`
- **Output:**  
  `12`
- **Explanation:**  
  Choose lines 5 and 3 at a distance of 4:  
  `min(5, 3) * (4 - 0) = 3 * 4 = 12`

---

### Example 3
- **Input:**  
  `arr[] = [2, 1, 8, 6, 4, 6, 5, 5]`
- **Output:**  
  `25`
- **Explanation:**  
  Choose lines 8 and 5 at a distance of 5:  
  `min(8, 5) * (6 - 1) = 5 * 5 = 25`

---

## Constraints

- `1 <= arr.length <= 10^5`
- `1 <= arr[i] <= 10^4`

---

## Optimal Approach – Two Pointer Strategy

### Strategy

- Start with two pointers:
  - `left` at the beginning of the array
  - `right` at the end
- At each step, compute:
  - `area = min(height[left], height[right]) * (right - left)`
- Move the pointer which has the **shorter height** inward to maximize the area.
- Keep track of the **maximum area found so far**.

---

## Java Implementation

```java
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            maxArea = Math.max(maxArea, h * w);

            // Move the pointer with the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
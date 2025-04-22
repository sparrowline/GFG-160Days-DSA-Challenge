# 📈 Problem: Best Time to Buy and Sell Stock (One Transaction)

You are given an array `prices[]` of length `n`, representing the prices of a stock on different days.  

Your task is to find the **maximum profit** possible by **buying and selling the stock only once**.  
If it is not possible to make a profit, return **0**.

---

> 📌 **Note:**  
- You must **buy before selling** (no future selling before buying).
- Only **one transaction** is allowed, meaning one **buy + one sell**.

---

## 🧠 Examples

### Example 1:
**Input:**  
`prices[] = [7, 10, 1, 3, 6, 9, 2]`  
**Output:**  
`8`  
**Explanation:**  
- Buy at price 1 (day 2), sell at price 9 (day 5), profit = `9 - 1 = 8`.

---

### Example 2:
**Input:**  
`prices[] = [7, 6, 4, 3, 1]`  
**Output:**  
`0`  
**Explanation:**  
- Prices are in decreasing order. No transaction possible to get profit.

---

### Example 3:
**Input:**  
`prices[] = [1, 3, 6, 9, 11]`  
**Output:**  
`10`  
**Explanation:**  
- Buy at price 1 (day 0), sell at price 11 (day 4), profit = `10`.

---

## ✅ Constraints
- `1 <= prices.length <= 10⁵`
- `0 <= prices[i] <= 10⁴`

---

## 💡 Approach

- Initialize `minPrice = prices[0]` and `maxProfit = 0`.
- Traverse the array:
  - At each step, calculate the profit: `profit = prices[i] - minPrice`.
  - Update `maxProfit` if profit is greater.
  - Update `minPrice` if current price is lower.

---


# 📈 Problem: Stock Buy and Sell – Multiple Transactions Allowed

The cost of stock on each day is given in an array `price[]`. Each day, you may decide to **buy** or **sell** the stock `i` at `price[i]`, and you can even buy and sell the stock on the same day.

Your task is to **find the maximum profit** that you can achieve.

---

> 📌 **Note:**  
- A stock can **only be sold** if it has been **bought previously**.  
- You **cannot hold multiple stocks** on any given day.

---

## 🧠 Examples

### Example 1:
**Input:**  
`prices[] = [100, 180, 260, 310, 40, 535, 695]`  
**Output:**  
`865`  
**Explanation:**  
- Buy on day 0 (price = 100), sell on day 3 (price = 310), profit = 210  
- Buy on day 4 (price = 40), sell on day 6 (price = 695), profit = 655  
- **Total Profit = 210 + 655 = 865**

---

### Example 2:
**Input:**  
`prices[] = [4, 2, 2, 2, 4]`  
**Output:**  
`2`  
**Explanation:**  
- Buy on day 3 (price = 2), sell on day 4 (price = 4), profit = 2  
- **Total Profit = 2**

---

## ✅ Constraints
- `1 <= prices.length <= 10⁵`
- `0 <= prices[i] <= 10⁴`

---

## 💡 Hint
You are allowed to make **multiple buy/sell transactions** as long as you **do not hold more than one stock** at a time.  
Iterate through the array and sum all **incremental gains** wherever `prices[i] > prices[i - 1]`.

---

## 💻 Suggested Approach
Use a greedy strategy:
```java
int profit = 0;
for (int i = 1; i < prices.length; i++) {
    if (prices[i] > prices[i - 1]) {
        profit += prices[i] - prices[i - 1];
    }
}
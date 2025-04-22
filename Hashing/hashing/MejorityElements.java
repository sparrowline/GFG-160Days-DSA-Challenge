package hashing;

import java.util.HashMap;
import java.util.Map;

public class MejorityElements {

	public int majorityElement(int[] nums) {

		int n = nums.length;
		HashMap<Integer, Integer> map = new HashMap<>();

		// create temp array to store n/2 apeared elements;
		// ArrayList<Integer> result = new ArrayList();
		int result = 0;
		// count the frequency;
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		// collect elements apear more than n/2 times
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > n / 2) {
				result = entry.getKey();
			}
		}
		return result;
	}
}

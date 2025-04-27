import java.util.HashMap;

class AreAnagram {
	// Function is to check whether two strings are anagram of each other or not.
	public static boolean areAnagrams(String s1, String s2) {

		// Your code here
		HashMap<Character, Integer> freq1 = new HashMap<>();

		if (s1.length() != s2.length())
			return false;

		for (char ch : s1.toCharArray()) {
			freq1.put(ch, freq1.getOrDefault(ch, 0) + 1);
		}

		HashMap<Character, Integer> freq2 = new HashMap<>();

		for (char ch : s2.toCharArray()) {
			freq2.put(ch, freq2.getOrDefault(ch, 0) + 1);
		}

		return freq1.equals(freq2) ? true : false;
	}
}
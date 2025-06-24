import java.util.*;

class FindPermutation {
    public ArrayList<String> findPermutation(String s) {
        ArrayList<String> result = new ArrayList<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars); // To handle duplicates
        boolean[] visited = new boolean[s.length()];
        
        backtrack(chars, visited, new StringBuilder(), result);
        return result;
    }

    private void backtrack(char[] chars, boolean[] visited, StringBuilder current, ArrayList<String> result) {
        if (current.length() == chars.length) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (visited[i]) continue;

            // Skip duplicate characters (only use the first one at the same level)
            if (i > 0 && chars[i] == chars[i - 1] && !visited[i - 1]) continue;

            visited[i] = true;
            current.append(chars[i]);

            backtrack(chars, visited, current, result);

            visited[i] = false;
            current.deleteCharAt(current.length() - 1);
        }
    }
}
class FindUnique {
    public int findUnique(int[] arr) {
        int xor = 0;
        for (int num : arr) {
            xor ^= num; // cancels out pairs
        }
        return xor;
    }
}
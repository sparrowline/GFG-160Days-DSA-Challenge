class MissingNum {
    int missingNum(int arr[]) {
        int xor1 = 0, xor2 = 0;
        int n = arr.length + 1;

        for (int i = 1; i <= n; i++) xor1 ^= i;
        for (int num : arr) xor2 ^= num;

        return xor1 ^ xor2;
    }
}
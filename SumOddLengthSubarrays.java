class SumOddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length, sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if ((j - i + 1) % 2 == 1) {
                    for (int k = i; k <= j; k++)
                        sum += arr[k];
                }
            }
        }
        return sum;
    }
}

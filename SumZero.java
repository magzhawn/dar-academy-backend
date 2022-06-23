class SumZero {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        if (n % 2 == 1) {
            res[0] = - n / 2;
            for (int i = 1; i < res.length; i++) {
                res[i] = res[i - 1] + 1;
            }
        }
        else {
            res[0] = - n / 2;
            for (int i = 1; i < res.length; i++) {
                if (res[i - 1] + 1 == 0) res[i] = res[i - 1] + 2;
                else res[i] = res[i - 1] + 1;
            }
        }
        return res;
    }
}

class IsPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        int temp = 0;
        int n = x;
        while (x > 0) {
            temp = temp * 10 + x % 10;
            x /= 10;
        }
        //System.out.print(temp + " " + x);
        return temp == n;
    }
}

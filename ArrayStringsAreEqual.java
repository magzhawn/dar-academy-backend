class ArrayStringsAreEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "", str2 = "";
        for (int i = 0; i < word1.length; i++)
            str1 = str1 + word1[i];
        for (int i = 0; i < word2.length; i++)
            str2 = str2 + word2[i];

        if (str1.length() != str2.length()) return false;

        for(int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }
}

class RestoreString {
    public String restoreString(String s, int[] indices) {
        String res = "";
        char[] arr = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = s.charAt(i);
        }
        for (int i = 0; i < indices.length; i++) {
            res = res + arr[i];
        }
        return res;
    }
}

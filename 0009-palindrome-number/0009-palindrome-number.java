class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        String st = String.valueOf(x);
        String reversed = new StringBuilder(st).reverse().toString();
        return st.equals(reversed);
    }
}
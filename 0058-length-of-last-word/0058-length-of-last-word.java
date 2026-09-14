class Solution {
    public int lengthOfLastWord(String s) {
        int i;
        s= s.trim();
        int l= s.length();
        for(i=l-1; i>=0; i--){
            if(s.charAt(i)==' '){
                s= s.substring(i+1);
                break;
            }
            else
            continue;
        }
        return s.length();
    }
}
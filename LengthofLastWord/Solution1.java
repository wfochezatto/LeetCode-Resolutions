class Solution {
    public int lengthOfLastWord(String s) {
        int ret = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == ' '){
                if(ret > 0) {
                    break;
                }
            } 
            else {
                ret++;
            }
        }
        return ret;
    }
}
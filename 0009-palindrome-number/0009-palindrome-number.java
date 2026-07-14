class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int og = x, rev = 0, rem;
        while(og > 0){
            rem = og%10;
            rev = 10*rev + rem;
            og/=10;
        }
        if(rev == x) return true;
        return false;
    }
}
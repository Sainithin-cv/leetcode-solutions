class Solution {
    public boolean isPalindrome(int x) {
        int s = x;
        int rev = 0;
        int i=0;
        while(x>=1){
            int r = x%10;
            rev = (rev*10) + r; 
            x/=10;
            i++;
        }
        if(s==rev){
            return true;
        }
        return false;
    }
}
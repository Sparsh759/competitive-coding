//https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3284/

class Solution {
    boolean res = false;
    HashSet<Integer> save = new HashSet<Integer>();
    public boolean isHappy(int n) {
        int sqSum = 0;
        if(n != 1){
            while(n>0) {
                sqSum = sqSum + (n%10)*(n%10);
                n = n/10;
            }
            if(save.contains(sqSum)) {
                return false;
            }
            save.add(sqSum);
            res = isHappy(sqSum);
            return res;
        }
        else
            return true;
    }
}
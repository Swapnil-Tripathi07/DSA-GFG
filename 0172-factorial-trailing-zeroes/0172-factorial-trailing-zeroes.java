class Solution {
    public int trailingZeroes(int n) {
        int fac = 1;
        for(int i = n ; i>0 ; i--){
            fac = fac*i;
        }
    
        int count = 0;
        int i = fac;
        while(i>0){
            if(i%10 == 0){
                count++;
                i=i/10;
            }
            else{
                break;
            }
        }
        return count;
    }
}
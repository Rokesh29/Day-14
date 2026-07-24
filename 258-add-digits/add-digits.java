class Solution {
    public int addDigits(int x) {
         
        while(x>=10){
        int d=0;
        while(x>0){
             d += x%10;
             x=x/10;
        }
        x = d;

     }

        return x;
    }
}
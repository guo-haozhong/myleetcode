class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=getNext(n);
        while(fast!=1 && slow!=fast){
            slow=getNext(slow);
            fast=getNext(getNext(fast));
        }
        return fast==1;
    }

    public int getNext(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            n=n/10;
            sum+=d*d;
        }
        return sum;
    }
}
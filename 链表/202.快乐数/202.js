/**
 * @param {number} n
 * @return {boolean}
 */

function getNext(n) {
    let sum=0;
    while(n>0){
        let d=n%10;
        //n-必须要通过Math.floor取整
        n=Math.floor(n/10);//Math.floor返回小于或等于一个给定数字的最大整数
        sum+=d*d;
    }
    return sum
}
 var isHappy = function(n) {
    let slow=n;
    let fast=getNext(n);
    while(fast!==1 && fast!==slow){
        slow=getNext(slow);
        fast=getNext(getNext(fast));
    }
    return fast==1
};
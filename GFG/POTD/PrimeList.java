class Solution {
    boolean isPrime(int val){
        if(val<=1) return false;
        if(val<=3) return true;
        if(val%2==0 || val%3==0) return false;
        for(int i=5; i*i<=val; i+=6){
            if(val%i==0 || val%(i+2)==0) return false;
        }
        return true;
    }
    int getPrime(int val){
        if(isPrime(val)) return val;
        int l=val-1, r=val+1;
        while(true){
            if(isPrime(l)) return l;
            if(isPrime(r)) return r;
            l--;
            r++;
        }
        // return -1;
    }
    Node primeList(Node head) {
        Node temp=head;
        while(temp != null){
            temp.val=getPrime(temp.val);
            temp=temp.next;
        }
        return head;
    }
}

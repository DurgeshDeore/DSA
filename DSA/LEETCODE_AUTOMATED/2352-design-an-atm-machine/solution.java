class ATM {
    HashMap<Integer, Integer> map;
    int[] atm;
    public ATM() {
        map = new HashMap<>(Map.of(
            0,20,
            1,50,
            2,100,
            3,200,
            4,500
        ));
        atm = new int[5];
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i=0; i<5; i++)
            atm[i] += banknotesCount[i];
    }
    
    public int[] withdraw(int amount) {
        int[] res = new int[5];
        int[] temp = atm.clone();

        for(int i=4; i>=0; i--){
            while(amount >= map.get(i) && temp[i] > 0){
                int notes = Math.min((amount/map.get(i)), temp[i]);
                temp[i] -= notes;
                res[i] += notes;
                amount -= notes*map.get(i);
            }  
        }

        if(amount != 0)
            return new int[]{-1};

        atm = temp;
        return res;
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */

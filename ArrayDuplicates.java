//Array Duplicates
    public static ArrayList<Integer> duplicates(int[] arr) {
        int ans[] = new int[arr.length+1];
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i< arr.length; i++){
            ans[arr[i]]+=1;
        }
        for(int i=0;i< ans.length; i++){
            if(ans[i]>1){
                al.add(i);
            }
        }
        if(al.size() == 0){
            al.add(-1);
        }
        return al;
    }

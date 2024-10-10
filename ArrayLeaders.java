static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        int greater = arr[n-1];
        if(n == 0){
            return arrlist;
        }
        arrlist.add(greater);
        for(int i=n-2;i>=0;i--){
            if(greater <= arr[i]){
                arrlist.add(arr[i]);
                greater = arr[i];
            }
            
        }
        ArrayList<Integer> arrlistRev = new ArrayList<>();
        for(int i=arrlist.size()-1; i>0;i--){
            arrlistRev.add(arrlist.get(i));
        }
        arrlistRev.add(arr[n-1]);
        return arrlistRev;
    
    }

public Pair<Long, Long> getMinMax(int[] arr) {
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length ; i++){
            max = arr[i]>=max ? arr[i] : max;
            min = arr[i]<=min ? arr[i] : min;
        }
        return new Pair(min,max); //Pair is a container class that allows you to store two related objects
    }

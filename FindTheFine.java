//Q Find the fine
public long totalFine(int date, int car[], int fine[]) {
        long total_fine =0;
        for(int i=0; i<car.length; i++){
            if( car[i]%2 != 0 && date%2 == 0){
                total_fine += fine[i];
            }else if( car[i]%2 == 0 && date%2 != 0){
                total_fine += fine[i];
            }
        }
        return total_fine;
    }

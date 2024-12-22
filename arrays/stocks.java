package arrays;

public class stocks {
    public static int op(int num[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0; i<num.length; i++){
            if(buyprice < num[i]){
                int profit = num[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            }
            else{
                buyprice = num[i];
            }

        }
        return maxprofit;
    }
    public static void main(String args[]){
        int num [] = {7,1,5,3,6,4};
        System.out.println(op(num));
    }    
}

package arrays;

public class trappedWater {
    public static int op(int num[]){
        //auxiliary arrays
        int rm [] = new int[num.length];
        int lm [] = new int [num.length];
        int width = 1;
        rm[0] = num[0];
        for(int i = 1; i < num.length ; i++){
            if(num[i]< rm[i-1]){
                rm[i] = rm[i-1];
            }
            else{
                rm[i] = num[i];
            }
        }
        lm[num.length-1] = num[num.length-1];
        for(int  i= num.length-2 ; i>=0; i--){
            if(num[i] < lm[i+1]){
                lm[i] = lm[i+1];
            }
            else{
                lm[i] = num [i];
            }
        }

        int water = 0;
        for(int i = 0; i< num.length; i++){
            int wl = Math.min(rm[i], lm[i]);
            //water trapped :
            water += wl-num[i];
        }
        return water;
    }
    public static void main(String args[]){
        int num [] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(op(num));
    }    
}

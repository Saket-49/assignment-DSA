package arrays;

public class rotatedBinary {
    public static int op(int num[] , int target){
        int start = 0;
        int end = num.length-1;
        
        while(start <= end){
            int mp = (start + end)/2;
            if(num[mp] == target){
                return mp;
            }
            if(num[mp] >= num[start] ){
                if(target < num[mp] && num[start] <= target){
                    end = mp-1;
                }
                else{
                    start = mp +1;
                }
            }
            else{
                if(target > num[mp] && target <= num[end]){
                    start = mp+1;
                }
                else{
                    end = mp-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num [] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(op(num, target));
    }    
}

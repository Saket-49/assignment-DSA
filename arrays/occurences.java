package arrays;

public class occurences {
    public static boolean op(int num []){
        boolean occured= false;
        for(int i = 0 ; i<num.length; i++){
            for(int j = i+1; j<num.length; j++){
                if(num[i]==num[j]){
                    occured = true;
                }
            }
        }
        return occured;
    }
    public static void main(String args[]){
        int num [] = {1,2,3,1};
        System.out.println(op(num));
    }    
}

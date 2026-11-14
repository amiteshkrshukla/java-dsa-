public class perfect {
    static int isPerfect(int n){
        int sum = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                sum = sum + i;
            }
        }
        if(sum == n){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String args[]){
        int num = 28;
        if(isPerfect(num) == 1){
            System.out.println(num + " is a perfect number");
        }else{
            System.out.println(num + " is not a perfect number");
        }
    }
}

public class armstrong {
    static boolean isArmstrong(int n){
        int sum = 0;
        int temp = n;
        while(temp>0){
            int digit = temp % 10;
            sum = sum + digit * digit * digit;
            temp = temp / 10;
        }
        return sum == n;
    }
    public static void main(String args[]){
        int num = 153;
        if(isArmstrong(num)){
            System.out.println(num + " is an Armstrong number");
        }
        else{
            System.out.println(num + " is not an Armstrong number");
        }
    }
}

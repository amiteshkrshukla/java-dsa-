public class sum_of_digit {
    public static void main(String args[]){
        int num =123456789;
        int sum = 0;
        int count = 0;
        while(num>0){
            int digit = num % 10;
            sum = sum + digit ;
            count++;
            num = num / 10;
            
        }
        System.out.println("Sum of digits is: " + sum);
        System.out.println("Count of digits is: " + count);
}
}
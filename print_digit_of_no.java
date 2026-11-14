public class print_digit_of_no {
    public static void main(String args[]){
        int num = 12345678;
        while(num>0){
           int digit = num % 10;
            System.out.println("Digit is: " + digit);
            num = num / 10;
        }
    }
}

import java.util.*;
public class product{
   public static int mult(int a , int b){
    int mult=a*b;
    return mult;
    }
   public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int mul;
    mul= mult(a,b);
    System.out.println("product is :"+ mul );
   }
}
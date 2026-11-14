import java.util.*;
public class function{
     public static void printHello(){
        System.out.println("hello");
        // function mein void ka use karte hai toh return type likhna nhi padta hai warna jab hum void ke alawa int ya float etc use hota toh hum return declare karna padta hai  
     }

   public static void cal(){
      //function using parameter use karte hai tab hum ye baat dhyan rakhna hai ki jab bhi parameter functionn mein define kar diye ho toh fir baad mein uss varibale ko nhi batana padta hai ki ye int hai ya float etc 
      Scanner sc= new Scanner(System.in);
      int a= sc.nextInt();
      int b=sc.nextInt();
      int sum = a+b;
      System.out.println("sum is : " +sum );
      
   }

    public static int summ(int num1, int num2 ){
      int add = num1+num2 ;
      return add ;
    }

   public static void main(String args[]){
    printHello();
      cal();
       Scanner sc = new Scanner(System.in);
       int x= sc.nextInt();
       int y= sc.nextInt();
       int add = summ(x, y);//arguments or actual paramters 
       System.out.println("sum is :"+ add );
   }
}

// java always use call by value 


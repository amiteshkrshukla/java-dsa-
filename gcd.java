public class gcd {
    static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
 static int gcd_recursion(int a, int b){
        if(b==0){
            return a;
        }
        return gcd_recursion(b, a % b);
    }

    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }

    public static void main(String args[]){
        int a = 12;
        int b = 18;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a,b));
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm(a,b));
    }
}

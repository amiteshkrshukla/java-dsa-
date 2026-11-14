public class binomial_coff{
  public static int fact(int n){
    int f = 1;
    for (int i=1; i<=n ; i++){
        f= f*i;
        }   
         return f ;
    
    }
    public static int bincoeff(int n , int r)
    {
        int factn= fact(n);
        int factr = fact(r);
        int factnminusr = fact(n-r);
        int bincoeff= factn/(factr * factnminusr);
        return bincoeff;
    }
     public static void main (String args[]){
        int n = 10 ;
         int r= 2;
         int ans= bincoeff(n,r);
         System.out.println("binomial ans = " + ans );
     }
  }    

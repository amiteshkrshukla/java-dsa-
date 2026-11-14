public class string {

    static void stt(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
        
    }
static int length(String str){
    char[] arr = str.toCharArray();
    int len = arr.length;
    return len ;
}

 static String reverse(String str){
      String rev= "";
      for(int i = str.length()-1; i>=0; i--){
        char ch = str.charAt(i);
        rev = rev + ch;

      }
      return rev;
 }

    public static void main(String args[]) {
        String str = "Hello";
        stt(str);
        int len = length(str);
        System.out.println("Length of the string is: " + len);
        String rev = reverse(str);
        System.out.println("Reverse of the string is: " + rev);
        if(str.equals(rev)){
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class java_collection {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
       // List<Integer> list = new ArrayList<>(); this is similar to the above line but it is a interface and we can not create object of interface
       //  Collection<Integer> collection = new ArrayList<>(); this is similar to the above line but it is a interface and we can not create object of interface
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list); 
        list.add(40);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}

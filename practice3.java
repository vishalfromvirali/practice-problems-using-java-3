import java.util.*;
class practice3{
    public static void main(String[]args){
        Map<String,Integer> names=new HashMap<>();
        names.put("vishal",1);
        names.put("hello",2);
        names.put("laptop",3);
        String first=names.getKey(1);
        System.out.println(first);
    }
}
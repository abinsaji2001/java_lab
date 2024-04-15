import java.util.*;
public class Linkedlist {
public static void main(String[] args){
System.out.println("Abin Saji");
System.out.println("23MCA003");
System.out.println("15/03/2024");
LinkedList<String> L=new LinkedList<>();
L.add("Gold");
L.add("Silver");
L.add("Bronze");
L.add(0,"Olympics Medals");
System.out.println(L);
L.remove("Bronze");
System.out.println(L);
L.remove(2);
System.out.println(L);
L.removeLast();
System.out.println(L);
L.removeFirst();
System.out.println(L);

}
}

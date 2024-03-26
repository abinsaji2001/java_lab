import java.util.Scanner;
public class Stringman{
public static void main(String[] args) {
System.out.println("Abin Saji \n 23MCA003\n 14-March-2024");
System.out.pArintln("Enter The String");
Scanner sc = new Scanner(System.in);
String str1 = sc.nextLine();
System.out.println("Length of String = "+str1.length());
System.out.println("Character at First position = "+str1.charAt(1));
System.out.println("String Contains 'Col' sequence :"+str1.contains("Col"));
System.out.println("String ends with e : "+str1.endsWith("e"));
System.out.println("Replace'col' with 'kol' : "+str1.replaceAll("Col","kol"));
System.out.println("LOWERCASE : "+str1.toLowerCase());
System.out.println("UPPERCASE : "+str1.toUpperCase());
}
}

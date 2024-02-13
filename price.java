class Product {
int pcode;
String pname;
double price;
public Product(int x, String y, double z) {
pcode = x;
pname = y;
price = z;
}
}
public class price {
public static void main(String[] args) {
System.out.println("Abin saji\n 23MCA003 \n 13-FEBRUARY-2024");
Product p1 = new Product(1, "Apple", 100);
Product p2 = new Product(2, "Grapes", 50);
Product p3 = new Product(3, "Pineapple", 70);
Product cheapestProduct = p1;
if (p2.price < cheapestProduct.price) {
cheapestProduct = p2;
}
if (p3.price < cheapestProduct.price) {
cheapestProduct = p3;
}
System.out.println("The product with the lowest price is " + cheapestProduct.pname + " with a price of "  + cheapestProduct.price);
}
}


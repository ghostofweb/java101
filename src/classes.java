public class classes {
    public static void main(String[] args) {
    Product y = new Product("PS5","Gaming Console");
    Product x = new Product("PS5","description",299.99,true);
    // whenever we print the object -> it defaults use the toString();
    System.out.println(x.getName());
    x.setPrice(-1.00);
//    x.name = "PS5";
//    x.description = "Gaming Console";
//    x.price = 299.99;
//    x.inStock = true;
    x.printall();
    }
}

public class Product {
    private String name;
    private String description;
    private Double price;
    private boolean inStock;
    //constructor
    Product(String name , String description, Double price, boolean inStock){
//        this.name = name;
//        this.description = description;
//        this.price = price;
//        this.inStock =inStock;
        setPrice(price);
        setName(name);
        setDescription(description);
        setInStock(inStock);
    }

    Product(String n, String d){
        System.out.println(n + " " + d);
    }

    //getters and setters

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if(price < 0.0){
            System.out.println("Invalid Price");
            return;
        }
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    // Getters get Data which are private as well
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    //Setters
    // sets the data
    public void setName(String name){
        if(name == null || name.isEmpty()){
            //returns jumps out of the method and dosen't continue
            return;
        }
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }


    @Override
    public String toString(){
        return "Name" + name;
    }
    void printall(){
        System.out.println(name + " " + description + " " + price + " " + inStock);
    }
}

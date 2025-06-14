import java.util.ArrayList;

public class arraylists {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Peach");
        fruits.add("ayo");
        fruits.add(null);
        System.out.println(fruits);
        fruits.add(1,"pineapple");
        System.out.println(fruits);
        System.out.println(fruits.size());

    }
}

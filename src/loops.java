import java.util.ArrayList;
import java.util.Arrays;

public class loops {
    public static void main(String[] args) {
        //for(initialization,condition,update){}

        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

//        String[] fruits = {"banana","icecream","cocaine"};
//        for(int i = 0; i< fruits.length;i++){
//           fruits[i] = fruits[i].toUpperCase() + "!";
//        }
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple");
        for(int i = 0; i< fruits.size();i++){
            fruits.set(i,fruits.get(i).toUpperCase()+"!!");
        }
        System.out.println(fruits);

        // for console mostly type
        for(String fruit:fruits){
            System.out.println(fruit + "!");
        }
        //forEach like in js, with lamda function/anonymous function
        fruits.forEach(x->{
            System.out.println(x+"!");
        });
        // while loop
        int i = 0;
        while (i<10){
            System.out.println(i);
            i++;
        }

        //DO-While

    }
}

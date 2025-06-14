import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
       String[] a = new String[3];
       a[0] = "hello";
       a[1] = "world";
       System.out.println(a[2]);

       //another way
        String[] b = {"hello","world",null};
        Integer[] c = {1,2,3,4};
        System.out.println(Arrays.toString(c));
        for(int i = 0;i<c.length ;i++){
            System.out.print(c[i]);
        }
    }
}

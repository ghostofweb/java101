public class opertators {
    public static void main(String[] args){
        Integer x = 12;
        Integer y = 5;
        //!Imp this will force the integer to convert itself to string, so use ()
        System.out.println("This is the result of the addition "+ x+y ); //125 "12" + "5"
        System.out.println("This is the result of the addition "+ (x+y) ); // 17 (12+5)
        x++;
        System.out.println(x);
        System.out.println(x-y);
        System.out.println(x/y);
        System.out.println(x%y);

    }
}

public class methods {
    static void print(){
        System.out.println("peach");
    }
    static int printnum(){
        System.out.println("peach");
        return 1;
    }
    static String getHelloWorld(){
        return "Hello world";
    }
    static Integer addTwoNum(int a,int b){
        return a + b;
    }

    public static void main(String[] args){
        Integer check = printnum();
        print();
        System.out.println(getHelloWorld());
        System.out.println(check);

        //parameters
        int a = 10;
        int b = 20;
        System.out.println(addTwoNum(a,b));
    }

}

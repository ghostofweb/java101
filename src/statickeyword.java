public class statickeyword {
    public static void main(String[] args) {
    Integer a = new Calculator().add(2,3);
        System.out.println();
    // java loves objects, if there is no object, java hates it and need static keyword
        //subTwoNumber()
        //Non-static method 'subTwoNumber(int, int)' cannot be referenced from a static context
        System.out.println(subTwoNumber(10,2));
    }
    //example
    public static int subTwoNumber(int a,int b){
        return a - b;
    }
}

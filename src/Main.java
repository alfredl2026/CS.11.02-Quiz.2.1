public class Main {

    public static void main(String[] args) {
        int resultOne = add(1, 2);
        System.out.println(resultOne);
        String resultTwo = greeting("Alfred");
        System.out.println(resultTwo);
        int resultThree = add(1,2,3,4);
        System.out.println(resultThree);
        printMe("printing something");
    }
    public static int add(int numOne, int numTwo){
        return(numOne + numTwo);
    }
    public static String greeting(String name){
        return("Bonjour, " + name + "!");
    }
    public static int add(int numOne, int numTwo, int numThree, int numFour){
        int sum1 = add(numOne, numTwo);
        int sum2 = add(sum1, numThree);
        int sum3 = add(sum2, numFour);
        return(sum3);
    }
    public static String printMe(String toBePrinted){
        System.out.println(toBePrinted);
        return(toBePrinted);
    }

}

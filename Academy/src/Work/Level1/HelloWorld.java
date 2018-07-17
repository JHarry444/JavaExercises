package Work.Level1;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String helloWorld = "Hello World!";
        System.out.println(helloWorld);
        printOut("hello World!");
        helloWorld();
    }

    private static void printOut(String print) {
        System.out.println(print);
    }

    private static void helloWorld(){
        System.out.println("Hello World");
    }
}

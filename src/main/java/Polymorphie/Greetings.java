package Polymorphie;

public class Greetings {
    public static void main(String[] args) {
        Greetings g = new Greetings();
        g.print("Hallo");
        g.print("Hallöchen","Peter");
    }

    private void print(String text){
        System.out.println(text);
    }

    private void print(String text, String name){
        System.out.println(text + " " + name);
    }
}

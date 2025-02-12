public class demo {
    static int num = 10; // Static variable

    public static void main(String[] args) {
        System.out.println(demo.num); // Accessing static variable
    }
}

class B {
    public void printNum() {
        System.out.println(demo.num+2); // Accessing static variable from class B
    }
}
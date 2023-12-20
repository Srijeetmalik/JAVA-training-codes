import java.util.Scanner;

class Calculator {
    int r;
    final float PI = 3.14f; // "final" makes it a constant
    Scanner sc = new Scanner(System.in);

    public void areaOfCircle() {
        System.out.println("Enter the radius:");
        r = sc.nextInt();
        float area = PI * r * r;
        System.out.println("Area of circle is: " + area);
    }

    public void circumferenceOfCircle() {
        System.out.println("Enter the radius:");
        r = sc.nextInt();
        float circumference = 2 * PI * r;
        System.out.println("Circumference of circle is: " + circumference);
    }

    public void volumeOfSphere() {
        System.out.println("Enter the radius:");
        r = sc.nextInt();
        float volume = (4.0f / 3.0f) * PI * r * r * r;
        System.out.println("Volume of sphere is: " + volume);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner sc1 = new Scanner(System.in);

        while (true) {
            System.out.println("1. Area of Circle");
            System.out.println("2. Circumference of Circle");
            System.out.println("3. Volume of Sphere");
            System.out.println("4. EXIT");
            System.out.println("Select any choice:");

            int ch = sc1.nextInt();

            if (ch == 1) {
                c.areaOfCircle();
            } else if (ch == 2) {
                c.circumferenceOfCircle();
            } else if (ch == 3) {
                c.volumeOfSphere();
            } else if (ch == 4) {
                System.exit(0);
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}

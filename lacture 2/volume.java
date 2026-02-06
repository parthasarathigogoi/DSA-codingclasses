import java.util.*;

class volumecone {
    public static void calculate(double pi) {
        Scanner sc = new Scanner(System.in);
        System.out.print("radius: ");
        int r = sc.nextInt();
        double volume = (1.0 / 3.0) * pi * r * r;
        System.out.println("Volume: " + volume);
    }
}

class volumecylinder {
    public static void calculate(double pi) {
        Scanner sc = new Scanner(System.in);
        System.out.print("radius: ");
        int r = sc.nextInt();
        System.out.print("height: ");
        int h = sc.nextInt();
        double volume = pi * h * r * r;
        System.out.println("Volume: " + volume);
    }
}

class hemisphere {
    public static void calculate(double pi) {
        Scanner sc = new Scanner(System.in);
        System.out.print("radius: ");
        int r = sc.nextInt();
        double volume = (2.0 / 3.0) * pi * r * r * r;
        System.out.println("Volume: " + volume);
    }
}

class volume {
    public static void main(String[] args) {
        System.out.println("cone: c");
        System.out.println("cylinder: cy");
        System.out.println("hemisphere: h");
        double pi = 22.0 / 7.0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter choice: ");
        String a = sc.nextLine();
        if (a.equals("c"))
            volumecone.calculate(pi);
        else if (a.equals("cy"))
            volumecylinder.calculate(pi);
        else if (a.equals("h"))
            hemisphere.calculate(pi);
        else
            System.out.println("invalid");
    }
}
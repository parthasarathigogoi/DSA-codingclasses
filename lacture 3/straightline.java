import java.util.*;
class straightline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int x3 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            int y3 = sc.nextInt();

            int dx1 = x2 - x1;
            int dx2 = x3 - x2;
            int dy1 = y2 - y1;
            int dy2 = y3 - y2;

            if (dy1 * dx2 == dy2 * dx1)
                System.out.println("straight line");
            else
                System.out.println("not straight");
       
        }
    
}
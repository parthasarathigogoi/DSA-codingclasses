import java.util.Scanner;
class multiplicationtable{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int a=1;a<=10;a++)
            System.out.println(x*a);
    }
}
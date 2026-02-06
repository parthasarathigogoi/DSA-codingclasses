import java.util.Scanner;

class pattern3{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int j=1;j>=n;j--){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
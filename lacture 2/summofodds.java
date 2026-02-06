import java.util.*;
class sumofodds{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int b=0;
        for(int a=0;a<=x;a++)
            if(a%2==1){
                System.out.println(a*=a);
            }
            else{
                System.out.println();

            }
    }
}
import java.util.*;
class lotery{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=300 && n<=460){
            System.out.println("the prize is macbook");
        
    
            if(n>=300 && n>=380){

               System.out.println("macbook m1");
            }
            else{
               System.out.println("mcbook m2");

        }
    
        
        }
        else if(n>=200 && n<=280){
            System.out.println("the prize is kurkure");
            if(n>=200 && n<=240){
                System.out.println("chilliflavour");
            }
            else{
                System.out.println("onion");

            }
            
        }
        else if(n>=50 && n<=80){
            System.out.println("the prize is bike");
            if(n>=1100 && n<=1300){
                System.out.println("avon");
            
            }
            else{
                System.out.println("hero");
            }
        }
        else if(n>50 && n<=80){
            System.out.println("bike");
            if(n>50 && n<=65){
                System.out.println("bullet");

            }
            else{
                System.out.println("rajdoot");
            }
    }
        else{
            System.out.println("betterluck next time");
        }
}
    
}
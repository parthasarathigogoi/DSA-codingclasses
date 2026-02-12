class allevenreturn{
    public static int alleven(int a){

        
            
            if(a%2==0){
                return 0;
                
            }
            else{
                return 1;
            }
       }
       
    
    public static void main(String []args){
        int a=1;
        int b;
        while(a<=1000){
            b=alleven(a);
            if(b==0){
                System.out.println(a);
            }
            a++;    
        }
        
       
    }
}

        
        
    

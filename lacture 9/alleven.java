class alleven{
    public static void alleven(int a){
        
        while(a<=1000){
            if (a%2==0){
                System.out.println(a);
                
            }
            a++;
            
            
        }
    
    }
    public static void main(String []args){
        int a=0;
        alleven(a);
    }
}
class pattern8{
    public static void main(String []args){
        int star=1;
        int space=5;
        int n=6;
        int row=1;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            space--;
            star+=2;
            row++;
        }
        
        
    }
}
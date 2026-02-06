class pattern1while{
    public static void main(String []args){
        int n=5;
        int row=1;
        while(row<=n){
            int j=1;
            while(j<=n){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            row++;
        }
    }
}
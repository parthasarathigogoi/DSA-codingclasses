class inserstion{
    public static void main(String []args){
        int []arr={3,4,2,7,5};
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int item=arr[i];
            while(j>=0&&arr[j]>item){
                arr[j+1]=arr[j];
                arr[j]=item;
                j--;
            }
        }
        
        for(int ele=0;ele<arr.length;ele++){
            System.out.print(arr[ele]+ " ");
        }
    }
}
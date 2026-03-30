class triplesum{
    public static void main(String []args){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        int target=10;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }
}
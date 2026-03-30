class mxsumarr{
    public static void main(String []args){
        int arr[]={1,2,5,-6,4,-7,5};
        int n=arr.length;
        int mxsum=arr[0];
        int cur=0;
        for(int i=0;i<n;i++){
            cur=cur+arr[i];
            if(cur>mxsum){
                mxsum=cur;
            }
            if(cur<0){
                cur=0;
            }
        }
        System.out.println(mxsum);



    }
}
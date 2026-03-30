
class hwplayer{
    public static void main (String []args){
        int arr[]={4,1,3,2,10};
        int n=arr.length;
        int a=0, b=0;
        int i=0 , j=n-1;
        int turn=1;
        while(i<=j){
            if(turn==1){
            if(arr[i]>arr[j]){
                a+=arr[i];
                i++;
            }
            else{
                a+=arr[j];
                j--;
            }
            turn=0;
        }
        else{
            if(arr[i]>arr[j]){
                b+=arr[i];
                i++;
            }
            else{
                b+=arr[j];
                j--;
            }
            turn=1;
        }
        System.out.println(a+" "+b);
        }
    }
}
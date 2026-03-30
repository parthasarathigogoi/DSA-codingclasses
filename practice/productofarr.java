import java.util.*;
class productofarr{
    public static void main(String[] args){
        int arr[]={1,2,4,6,8};
        int n=arr.length;
        int res[]=new int[n];
        for (int i=0;i<n;i++){
            res[i]=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    res[i]=res[i]*arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
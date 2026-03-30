import java.util.*;
import java.util.stream.*;
class median{
    public static void main(String[] args){
        int []arr1={1,2,3,4};
        int []arr2={5,6,7,8};
        
        int [] mergearr=IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
        int n1=mergearr.length;
        if(n1%2==0){
            float median=(float)(mergearr[n1/2]+mergearr[(n1/2)-1])/2;
            System.out.println(median);
        }
        else{

            int median=mergearr[mergearr.length/2];
            System.out.println(median);
        }

    }
}
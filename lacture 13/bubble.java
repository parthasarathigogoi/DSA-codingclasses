import java.util.*;

class bubble {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        int i = 0;
        while(i < arr.length) {
            arr[i] = sc.nextInt();
            i++;
        }

        int a = 0;
        while(a < arr.length ) {

            int j = 0;
            while(j < arr.length-1 ) {

                if(arr[j] > arr[j + 1]) {
                    int k = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = k;
                }

                j++;
            }

            a++;
        }

        int l = 0;
        while(l < arr.length) {
            System.out.print(arr[l] + " ");
            l++;
        }
    }
}

public class moves{
    public static void main(String args[]) {
        int[] arr = {1, 2, 3};

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            min = Math.min(min, arr[i]);
        }

        int moves = 0;

        for(int i = 0; i < arr.length; i++){
            moves += arr[i] - min;
        }

        System.out.println(moves);
    }
}
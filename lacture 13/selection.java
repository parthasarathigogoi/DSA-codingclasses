class selection {

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 9, 2};

        for(int i = 0; i < arr.length ; i++) {

            int mini = i;

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[mini]) {
                    mini = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }

        for(int l = 0; l < arr.length; l++) {
            System.out.print(arr[l] + " ");
        }
    }
}
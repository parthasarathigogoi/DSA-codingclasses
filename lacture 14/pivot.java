class pivot{
    public static void main(String []args){
        int []nums={1,2,3,1,4};
        int n=nums.length;
        for(int i=1;i<=n-2;i++){
            if(nums[i-1]<nums[i]&&nums[i+1]<nums[i]){
                System.out.println(i);

            }else{
                continue;
            }
        }
    }
}
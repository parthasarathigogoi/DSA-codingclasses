class product{
    public static void main(String []args){
        int []nums={1,0,3,4};
        int []answer=new int[4];
        int total=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                
            }else{

                total=total*nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            answer[i]=total/nums[i];
            System.out.println(answer[i]+" ");
        }
        
        
    }
}
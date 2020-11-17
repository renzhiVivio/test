class Solution {
    // public void methodOne(int[] nums,int l){
    //     int temp=nums[l-1];
    //     for(int i=l-1;i>0;i--){
    //         nums[i]=nums[i-1];
    //     }
    //     nums[0]=temp;
    // }
    
    public void methodFour(int[] nums, int head, int tail){
        while(head<tail){
            int temp=nums[head];
            nums[head]=nums[tail];
            nums[tail]=temp;
            head++;
            tail--;
        }
    }
    
    public void rotate(int[] nums, int k) {
        int l=nums.length;
        k%=l;
        if(k==0){
            return;
        }
        //method 1, a function to rotate 1, then for loop
//         for(int i=0;i<k;i++){
//             methodOne(nums,l);
//         }
        
        //method 2, copy array, split
//         int[] temp=new int[l];
//         for(int i=0;i<l-k;i++){
//             temp[i]=nums[i];
//         }
//         for(int i=0;i<k;i++){
//             nums[i]=nums[l-k+i];
//         }
//         for(int i=k;i<l;i++){
//             nums[i]=temp[i-k];
//         }
        
        //method 3, construct a new array with duplicate the array nums, then get l ints
        // int[] temp=new int[l*2];
        // for(int i=0;i<l;i++){
        //     temp[i]=nums[i];
        //     temp[i+l]=nums[i];
        // }
        // for(int i=0;i<l;i++){
        //     nums[i]=temp[i+l-k];
        // }
        
        //method 4, reverse 3 times, 1 whole array, 2 is l-k+i to l-1, 3 is 0 to l-k-1
        methodFour(nums,0,l-1);
        methodFour(nums,0,k-1);
        methodFour(nums,k,l-1);
        
    }
}
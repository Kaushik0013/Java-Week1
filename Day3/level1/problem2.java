import java.util.Scanner;
class problem2 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        int[]nums = new int[5];
        for(int i=0; i<nums.length;i++){
            System.out.println("Enter number"+(i+1)+":");
            nums[i] = input.nextInt();
        }
        for(int num:nums){
            if(num%2==0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
            
            if(nums[0]>nums[nums.length-1]){
                System.out.println(nums[0]+"is greater"+","+nums[nums.length-1]+"is smaller");
            }
            else if(nums[0]<nums[nums.length-1]){
                System.out.println(nums[nums.length-11]+"is greater"+","+nums[0]+"is smaller");
            }
        }
        input.close();

    }
}

    
    


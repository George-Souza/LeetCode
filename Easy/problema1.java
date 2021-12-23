package Easy;

public class problema1{
    static int[] twoSum(int[] arr, int target){
        int solucao[] = new int[2];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            for(int h = i+1; h < arr.length; h++){
                if(arr[i] + arr[h] == target){
                    solucao[j] = i;
                    solucao[j+1] = h;
                }
            }
        }
        return solucao;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};

        for(int i: twoSum(nums, 6)){
            System.out.println(i);
        }
    }
}
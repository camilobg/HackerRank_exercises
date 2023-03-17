package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeSubarrays {
    public static boolean IsMinor(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum<0)return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[scan.nextInt()];
        scan.nextLine();
        int counter=0;
        String[] s=scan.nextLine().split(" ");
        for(int i=0;i< arr.length;i++){
            arr[i]=Integer.parseInt(s[i]);
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(IsMinor(Arrays.copyOfRange(arr,i,j+1)))counter++;
            }
        }
        System.out.println(counter);
    }
}

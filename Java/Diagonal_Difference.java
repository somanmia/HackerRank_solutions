

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int A,sum=0,sum2=0;
       A=input.nextInt();
       int arr[][]=new int[A][A];
       for(int i=0;i<A;i++){
           for(int j=0;j<A;j++){
               arr[i][j]=input.nextInt();
           }
       }
       //first..//
       for(int row=0;row<A;row++){
           for(int col=0;col<A;col++){
               if(row==col){
                   sum+=arr[row][col];
               }
               if(row+col==A-1){
                   sum2+=arr[row][col];
               }
           }
           
       }
       
        System.out.println(Math.abs(sum-sum2));
           
           
       
    }
    
}


package array;

import java.util.Scanner;

public class j {
    

    public static void main(String[] args) {
       Scanner x = new Scanner(System.in);
       System.out.println("please enter 10 num");
       
      int[] num = new int [10];
     
      for (int i = 0 ; i < 10 ; i++ ){
          num [i] = x.nextInt();
          System.out.println(num[i]);
      }
      
      for (int i = num.length-1; i >= 0; i--) {

           System.out.print(num[i] + " "); }
    
        int max = num[0]; 
        int min = num[0];
        
      for (int i = 0 ; i < 10 ; i++){
        if (num[i] > max){
            max = num[i];
        }
        
        if (num[i] < min){
            min = num[i];
        }
    } 
      
      
      
      System.out.println(" Maximum value: " + max);
        System.out.println(" Minimum value: " + min);
        
        //for (int i = 0; i < num.length-1; i++)
        //{
           // for (int j = i+1; j < num.length; j++)
            //{
                //if ((num[i] == num[j]) && (i != j))
                //{
                    //System.out.println("is repeated" +num[j]+ "times");
                                                                  
                //}
            //}
       // }
    }
}
    


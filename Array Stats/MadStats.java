import java.util.Arrays;

public class MadStats {
    public static void main(String[] args) {
        int[][] TwoDimArr = {
            {0,1,0,1,11,10,3,5,67,321,4,31},  // row 0
            {43, 53, 63, 93,24,54,6,7,8,2,1,2,3,4,5,7,8},  // row 1
            {12,3,4,5,6,1,2,3,4}, // row 2
            {1, 2, 3}, // row 3
            {4, 5, 6, 9,4,6,7,2,3,4,5,2,34,5,6,1}, // row 4
            {7,12,4,5,6,1,34, -5}, // row 5
            {1, 2, 3, -50}, // row 6
            {4, 5, 6, 9,4,6,7,2,3,4,5,2,34,5,6,1}, //row 7
            {7,12,4,5,6,1,34},  // row 8
        };
    
        // call and print functions here
        System.out.println("Max: " + max(TwoDimArr)); 
        System.out.println("Min: " + min(TwoDimArr));  
        System.out.println("Most common: " + mostCommon(TwoDimArr));  
        System.out.println("Least common:" + leastCommon(TwoDimArr)); 
        System.out.println("Mean per row: " + Arrays.toString(mean(TwoDimArr))); 
        
        
    }
            
    /*Purpose: 
        return the OVERALL largest number within the 2D arrays (values from different rows should be compared)
    */
    public static int max(int[][] arr){
        // your code here
        return 0;
    }
    
    /*Purpose: 
        return the OVERALL smallest number within the 2D array (values from different rows should be compared)
    */
    public static int min(int[][] arr){
        // your code here
        return 0;
    }
    
    /*Purpose: 
        return the value that is most common, OVERALL, in the 2D array (values can be in different rows)
    */
    public static int mostCommon(int[][] arr){
        //your code here
        return 0;
    }
    
    /*Purpose: 
        return the value that is least common, OVERALL, in the 2D arrays (values can be in different rows)
    */
    public static int leastCommon(int[][] arr){
        //your code here
        return 0;
               
    }
            
            
    /* Purpose: 
        Return the average of the numbers in each, individual, array within the 2D array - rounded to one decimal place.
        The indexes of the array returned in the mean() function correspond to the rows in the 2D Array.
        This means, the mean of arr[0] returned in this function represents the mean of row 0.
    */
    public static double[] mean(int[][] arr){
        //your code here
        double[] test = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        return test;
    }
       
 
}

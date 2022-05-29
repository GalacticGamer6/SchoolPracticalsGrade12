
package Arrays;

public class Searches {
    
    public static int binarySearch(int [] sorted_array, int value){
        
        int start = 0;
        int end = sorted_array.length - 1;
        
        while(start <= end){
            
            int middle = (start + end) / 2;
            
            if(sorted_array[middle] == value){
                return middle;
            }
            else if(sorted_array[middle] > value){
                end = middle - 1;
            }
            else{
                start = middle + 1;
            }
            
        }
        
        return -1;
    }
    
    
    public static int linearSearch(int [] array , int value){
        
        for(int i = 0 ; i < array.length - 1; i++){
            if(array[i] == value){
                return i;
            }
        }
        
        return -1;
    }
}

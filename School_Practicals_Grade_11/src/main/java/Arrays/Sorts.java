package Arrays;


public class Sorts {
    
    public static void main(String[] args) {
        
      
        
        int [] arr = {9,8,7,6,5,4,3,2,1};
        
        insertion_sort(arr);
        print(arr);
        
    }
    
    public static void bubble_sort(int [] arr){
        for(int last_index = arr.length - 1; last_index >= 0 ; last_index--){
            for(int current_index = 0 ; current_index < last_index; current_index++){
                if(arr[current_index] > arr[current_index + 1]){
                    int temp = arr[current_index];
                    arr[current_index] = arr[current_index + 1];
                    arr[current_index + 1] = temp;
                }
            }
        }
        
    }
    
    public static void insertion_sort(int [] arr){
        for(int last_index = arr.length - 1 ; last_index >= 0 ;last_index--){
            for(int current_index = 0 ; current_index < last_index; current_index++){
                if(arr[current_index] > arr[last_index]){
                    int temp = arr[current_index];
                    arr[current_index] = arr[last_index];
                    arr[last_index] = temp;
                    
                }
                
            }
        }
        
    }
    
//        public static void improved_insertion_sort(int [] arr){
//        for(int first_index = 0 ; first_index < arr.length ; first_index++){
//            
//                int smallest_index = last_index;
//            
//            for(int current_index = arr.length - 1 ; current_index >=  0; current_index--){
//                if(arr[current_index] > arr[last_index]){
//                    int temp = arr[current_index];
//                    arr[current_index] = arr[last_index];
//                    arr[last_index] = temp;
//                    
//                }
//                
//            }
//        }
//        
//    }
    
    
    public static void print(int [] arr){
     for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}

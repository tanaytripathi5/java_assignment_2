package java_assignment2;

public class sort_array {
    public static void main(String [] args){
        int arr[] = {4,8,1,3,5,9,6};
        System.out.print("Origninal Array : ");
        for(int k:arr){
            System.out.print(k+" ");
        }  
        System.out.println();
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   int temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }
        System.out.print("Sorted Array : ");
        for(int k:arr){
            System.out.print(k+" ");
        }  
    }
}

package java_assignment2;

public class print_all_elements_array {
    public static void main(String [] args){
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int arr2[] = {12,1,3,1,4,1,5};
       
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }

        for(int k:arr2){
            System.out.println(k);
        }        
    }
}

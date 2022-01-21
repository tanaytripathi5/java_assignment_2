package java_assignment2;

public class print_array_reverse {
    public static void main(String [] args){
    int arr_og[] = {1,2,3,4,5};
    System.out.print("Origninal Array : ");
    for(int k:arr_og){
        System.out.print(k+" ");
    }  

    int arr_rev[] = new int[arr_og.length];
    for (int i= arr_og.length-1;i>=0;i--){
        arr_rev[arr_og.length-1-i] = arr_og[i];
    }

    System.out.println();

    System.out.print("Reverse Array : ");
    for(int k:arr_rev){
        System.out.print(k+" ");
    }  
}
}
package java_assignment2;

public class reverse_a_num {
    public static void main(String [] args){
        int num = 123456;
        int rev_num=0;
        int remainder=0;
        while (num>0){
            remainder = num%10;
            rev_num = (rev_num*10)+remainder;
            num= num/10;
        }
        System.out.println(rev_num);
    }
}

import java.util.Scanner;

public class NumberOfOneBits{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number !!! ");
        int number=scanner.nextInt();
        int setNums=numberofSet(number);

        System.out.println("Number of set bits : "+setNums);

    }

    private static int numberofSet(int number) {
        int count=0;
//        String binary=Integer.toBinaryString(number);
//        int size=binary.length();
//        for(int i=0;i<size;i++){
//            if(checkBit(number,i)){
//                count++;
//            }
//        }

        for(int i=0;i<32;i++){
            if(checkBit(number,i)){
                count++;
            }
        }
        return count;
    }

    private static boolean checkBit(int number, int i) {
        if((number & (1<<i))==0){
            return false;
        }
        else{
            return true;
        }
    }
}
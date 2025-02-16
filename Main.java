import java.util.ArrayList;
import java.util.Collection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1.Write a Java program to test if the first and the last element of an array of
        //integers are same. The length of the array must be greater than or equal to
        //2
       int [] numbers={ 50, -20, 0, 30, 40, 60, 10};
       boolean isTrue=false;
               if(numbers[0]==numbers[numbers.length-1]&&numbers.length>=2){
                   isTrue=true;
           }
        System.out.println(isTrue);
//2-Write a Java program to find the numbers greater than the average of the
//numbers of a given array.
        int [] LargeAvgNumbers={1, 4, 17, 7, 25, 3, 100};
        ArrayList Largnumbers=new ArrayList();
        int summation=0;
        for(int sum :LargeAvgNumbers){
            summation+=sum;}
       double avg=summation/7;
        for(int avreg:LargeAvgNumbers){
            if(avreg>avg){
              Largnumbers.add(avreg);
            }
        }
        System.out.println("the numbers greater than the average: "+Largnumbers);
//3.Write a Java program to get the larger value between first and last
//element of an array of integers.
        int[] numberof={20,30,40};
        int lastindex=numberof[numberof.length-1];
            if (numberof[0] > numberof[numberof.length - 1]) {
                System.out.println("Larger value between first and last element: " + numberof[0]);
            } else {
                System.out.println("Larger value between first and last element: " + lastindex);
            }


//4.Write a Java program to swap the first and last elements of an array and
//create a new array.
        ArrayList numbersSwap=new ArrayList();
        numbersSwap.add(20);
        numbersSwap.add(30);
        numbersSwap.add(40);
      numbersSwap.set(0,40);
      numbersSwap.set(2,20);
        System.out.println("New array after swapping the first and last elements:"+numbersSwap);
        //5. Write a program that places the odd elements of an array before the
        //even elements.
        int[] OriginalArray={2,3,40,1,5,9,4,10,7};
        ArrayList numberStartOdd=new ArrayList();
        int evennumbers=0;
        for(int numO:OriginalArray) {
            if (numO % 2 == 1) {
                numberStartOdd.add(numO);
            }
        }
        for (int even:OriginalArray){
            if(even%2==0){
                numberStartOdd.add(even);
                System.out.println();
            }
        }
        System.out.println(numberStartOdd);


       // 6. Write a program that test the equality of two arrays
        int [] numbersEquals1={2,3,6,6,4};
        int numEqual1=0;
        boolean istrue=false;
        int numEqual2=0;
        int [] numbersEquals2={2,3,6,6,4};
        for(int num1:numbersEquals1){
            numEqual1=num1;
        for(int num2:numbersEquals2) {
numEqual2=num2;
        }}
            if (numEqual1 == numEqual2){
               istrue=true;
                System.out.println(istrue);
            }else{
                istrue=false;
                System.out.println(istrue);
            }
    }}

//Java is pass by value ex

public class call {

    public static void main(String[] args)
    {

        int num1 = 21 ;
        int num2 = 22;

        swap(num1 , num2) ;

        System.out.println(num1 +" "+ num2); //no value will be swap 
                                                // no change in original copy


    }

    static void swap(int a , int b)
    {
        int temp =a ;
        a= b ;
        b=temp ;

    }

}
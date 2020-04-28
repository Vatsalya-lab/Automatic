
public class methods {

    public static void main(String[] args)
    {
        int num1 = 23 ;
        int num2 = 320 ;
        int num3 = 44 ;

        int result = max(num1 , num2 , num3);

        System.out.println(result);
        end();


    }
    static int max(int a , int b ,int c)
    {
        if(a>b)
        {
           if(a>c)
           {
               return a ;
           }
           else
           {
               return c;
           }
        }
        else
        {
               if(b>c)
               {
                   return b ;
               }
               else
               {
                   return c;
               }
        }


    }
        static void end()
        {
            System.out.println("end of program");

        }


}
// class danish {
//     public int dan() {
//         try {
//             int a = 10;
//             int b = 5;
//             int c = a / b;
//             return c;
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//         finally{
//             System.out.println("finall");
//         }
//         return 0;
//     }
// }

// public class error {
//     public static void main(String[] args) {
//         danish d=new danish();
//         d.dan();
//     }

// }

//HANDLING DIFFERENT EXCEPTIONS

// public class error {
//     public static void main(String[] args) {
//         int[] marks = new int[3];
//         marks[0] = 1;
//         marks[1] = 10;
//         marks[2] = 100;
//         int ind = 12;
//         int no = 0;
//         try {
//             System.out.println(marks[ind] / no);
//         } catch (ArithmeticException e) {
//             System.out.println("some exception error which is ivided by 0");
//             System.out.println(e);
//         } catch (IndexOutOfBoundsException e) {
//             System.out.println("some exception error which is array out of bound");
//             System.out.println(e);
//         } catch (Exception e) {
//             System.out.println(e);
//         }

//     }
// }

//NESTED TRY CATCH

// public class error{
//     public static void main(String[] args) {
//         int[] marks = new int[3];
//         marks[0] = 1;
//         marks[1] = 10;
//         marks[2] = 100;
//       try {
//         try {
//             System.out.println("welcome");
//             System.out.println(marks[10]);
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println(e);
//         }
//       } catch (Exception e) {
//         System.out.println(e);
//       }
//     }
// }

//first it will check inside first catch which is nested if the matter is resolved then it will get breaked
//otherwise it will move inside the catch whicb is outside.

//EXCEPTION CLASS

// class my extends Exception{
//     public String toString()
//     {
//         return "i am to";
//     }
//     public String getMessage()
//     {
//         return "i am";
//     }

// }
// public class error{
//     public static void main(String[] args) {
//        int a=10;
//        if (a>9)
//        {
//         try{
//         throw new my();
//         }
//         catch(Exception e)
//         {
//             System.out.println(e.getMessage());
//             System.out.println(e);
//             e.printStackTrace();
//             System.out.println("finished");

//         }
//        }
//     }
// }

//THROW VS THROWS

class my extends Exception{
    public String toString()
    {
        return "i am to";
    }
    public String getMessage()
    {
        return "i am";
    }

}

public class error extends Exception{
    
    public static int div(int b) throws ArithmeticException, my {
       if(b<0)
       {
       throw new my();
       }
       else{
        System.out.println(b);
       }
       return 0;
    }

    public static void main(String[] args) {
        try {
        int c=div(19);
        } catch (Exception e) {
            System.out.println("error"+e);
        }
    }
}
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//      Q1--------------------------------------------------------------------------------------------------------------
//        int fnum;
//        int snum;
//        System.out.println("Enter the first number ");
//        try {
//            fnum=input.nextInt();
//            System.out.println("Enter the second number ");
//            snum=input.nextInt();
//
//            System.out.println(fnum+" + "+snum+" = "+(fnum+snum));
//            System.out.println(fnum+" - "+snum+" = "+(fnum-snum));
//            System.out.println(fnum+" x "+snum+" = "+(fnum*snum));
//            System.out.println(fnum+" / "+snum+" = "+(fnum/snum));
//            System.out.println(fnum+" mod "+snum+"="+(fnum%snum));
//        }catch (InputMismatchException e){
//            System.out.println("Enter valid number");
//        }catch (ArithmeticException e2){
//            System.out.println("Cannot divided by Zero");
//        }catch (Exception e3){
//            System.out.printf(e3.getMessage());
//        }finally {
//            System.out.println("it work");
//        }


        //      Q2------------------------------------------------------------------------------------------------------
          try {
            System.out.println("Enter number ");
               int num=input.nextInt();
               check_num(num);             //I used method to use throws and throw in this code
                int total;
                             for (int i=1;i<=10;i++){
                    total=num*i;
                    System.out.println(num+" x "+i+" = "+total);
                }
            }catch (InputMismatchException e){
                System.out.println("Enter numbers only");
            }catch (Exception e){
              System.out.println(e.getMessage());
          }finally {
                System.out.println("The finally ");}



    //      Q3------------------------------------------------------------------------------------------------------
//        System.out.println("enter the radius of circle: ");
//      try {
//          int num = input.nextInt();
//         if(num==0){
//             throw new Exception("The radias can not be 0 ");
//         }
//          double area;
//          double pi = 3.14;
//          double total_per;
//
//          total_per = pi * num * 2;
//          area = pi * num * num;
//          System.out.println("The perimeter is :" + total_per);
//          System.out.println("The Area is :" + area);
//      }catch (InputMismatchException e){
//          System.out.println("Enter integer numbers only");
//      }catch (Exception e){
//          System.out.print(e.getMessage());
//      }
//      finally{
//          System.out.println("Finally");
//      }

    //      Q4------------------------------------------------------------------------------------------------------
//        int count;
//        double avr,sum;
//        System.out.println("enter the count number ");
//       try {
//           count=input.nextInt();
//           if(count==0  || count<0){
//               throw new Exception("The count can not be 0 or negative number");
//           }
//            avr=count;
//           sum=0;
//           while (count!=0){
//               System.out.println("Enter number ");
//               double num=input.nextInt();
//               sum=sum+num;
//               count--;
//                          }
//           System.out.println("The avrage is "+(sum/avr));
//       }catch (InputMismatchException e){
//           System.out.println("Enter integer numbers only");
//       }catch(Exception e){
//           System.out.println(e.getMessage());
//       }
//       finally {
//           System.out.println("Finally");
//       }


    //      Q5------------------------------------------------------------------------------------------------------
//        int f_num,s_num,th_num,sum;
//
//          try {System.out.println("Enter first number ");
//               f_num=input.nextInt();
//              System.out.println("Enter second number ");
//              s_num=input.nextInt();
//              System.out.println("Enter third number ");
//              th_num=input.nextInt();
//              sum=f_num+s_num;
//              System.out.println(sum==th_num);
//          }catch (InputMismatchException e){
//              System.out.println("Enter integer numbers only");
//          }finally {
//              System.out.println("Finally");
//          }


    //      Q6------------------------------------------------------------------------------------------------------

//            System.out.println("Enter the word to reverse :");
//           try {
//               String word=input.nextLine();
//               if(word.equals("")){
//                   throw new Exception("Enter value");
//               }
//               String rev="";
//               char ch;
//               for (int i=0;i<word.length();i++){
//                   ch=word.charAt(i);
//                   rev=ch+rev;
//               }
//               System.out.println(rev);
//           }catch (Exception e){
//               System.out.println(e.getMessage());
//           }finally {
//               System.out.println("Finally block");
//           }


    //      Q7------------------------------------------------------------------------------------------------------
//        int num;
//        System.out.println("Enter the number to check if even or odd : ");
//           try {
//               num = input.nextInt();
//               if (num==0){
//                   throw new Exception("You entered 0 ");
//               }
//               if (num %2==0){
//                   System.out.println(num+" is Even");
//               }else {
//                   System.out.println(num+" is Odd");
//               }
//           }catch (InputMismatchException e){
//               System.out.printf("Entr intger numbers");
//           }catch (Exception e){
//               System.out.println(e.getMessage());
//           }
//           finally {
//               System.out.println("Finally done ");
//           }


    //      Q8------------------------------------------------------------------------------------------------------

//                System.out.println("Enter temperature in Centigrade ");
//                try {
//                    int deg=input.nextInt();
//                    double total=(deg*1.8)+32;
//                    System.out.println("Temperature in fahrenheit is "+total);
//                }catch (InputMismatchException e){
//                    System.out.println("Enter numbers only ");
//                }finally {
//                    System.out.println("Finally ");
//                }


    //      Q9------------------------------------------------------------------------------------------------------
//        int num;
//       try {
//           System.out.println("Enter the string ");
//           String word =input.nextLine();
//           if (word.equals("")){
//               throw new Exception("Enter value");
//           }
//           System.out.println("Enter number ");
//            num=input.nextInt();
//            if(num<0){
//                throw new Exception("The index cannot be in negative values");
//            }
//           System.out.println(word.charAt(num));
//       }catch (InputMismatchException e){
//           System.out.println("Enter integer number to extract from string  ");
//       }catch (StringIndexOutOfBoundsException e1){
//           System.out.println("Out of boundaries of string");
//       }catch (Exception e){
//           System.out.println(e.getMessage());
//       }
//       finally {
//           System.out.println("Finally block");
//       }


    //      Q10-----------------------------------------------------------------------------------------------------

//     try {
//         System.out.println("Enter the height");
//         int  high=input.nextInt();
//         System.out.println("Enter the width");
//         int wdth=input.nextInt();
//         System.out.println("Area is "+high+" x "+wdth+" = "+(high*wdth));
//         System.out.println("Perimeter is 2 * ("+high+" + "+wdth+") = "+(2*(high+wdth)));
//     }catch (InputMismatchException e){
//         System.out.println("enter numbers only");
//     }finally {
//         System.out.println("Finall block");
//     }


    //      Q11-----------------------------------------------------------------------------------------------------
//int fnum;
//int snum;
//        System.out.println("Enter the first number ");
//       try {
//           fnum = input.nextInt();
//           System.out.println("Enter the second number ");
//           snum = input.nextInt();
//           if (fnum == snum) {
//               System.out.println(fnum + " == " + snum);
//           } else {
//               System.out.println(fnum + " != " + snum);
//           }
//           if (fnum > snum) {
//               System.out.println(fnum + " > " + snum);
//           } else {
//               System.out.println(fnum + " < " + snum);
//           }
//           if(fnum>=snum){
//               System.out.println(fnum+" >= "+snum);
//           } else {
//               System.out.println(fnum+" <= "+snum);}
//       }catch (InputMismatchException e){
//           System.out.println("Enter numbers only");
//       }finally {
//           System.out.printf("Finally statement");
//       }

    //      Q12-------------------------------------------------------------------------------
//        int sec,total_min,total_hour,total_sec;
//        System.out.println("Enter the number of seconds :");
//       try {
//           sec=input.nextInt();
//           if(sec==0 || sec <0){
//               throw new Exception("Enter number greater than 0");
//           }
//           total_min=(sec%3600)/60;
//           total_hour=(sec/3600)%24;
//           total_sec=sec%60;
//           System.out.println(total_hour+":"+total_min+":"+total_sec);
//       }catch (InputMismatchException e){
//           System.out.println("Enter numbers only");
//       }catch (Exception e){
//           System.out.println(e.getMessage());
//       }
//       finally {
//           System.out.println("Finally block ");
//       }

    //      Q13-------------------------------------------------------------------------------
//        int f_num,s_num,thir_num,four_num;
//        System.out.println("Enter the first number ");
//       try {
//            f_num = input.nextInt();
//           System.out.println("Enter the second number ");
//           s_num = input.nextInt();
//           System.out.println("Enter the third number ");
//           thir_num = input.nextInt();
//           System.out.println("Enter the fourth number ");
//           four_num = input.nextInt();
//
//           if ((f_num == s_num) && (thir_num == four_num) && (f_num == four_num)) {
//
//               System.out.println("Numbers are equals");
//
//           } else {
//               System.out.println("Numbers are NOT equals");
//           }
//       }catch (InputMismatchException e){
//           System.out.println("Enter numbers only");
//       }finally {
//           System.out.println("Finally block");
//       }

    //      Q14-------------------------------------------------------------------------------
//            System.out.println("Enter number to check");
//           try {
//               int num = input.nextInt();
//               if (num > 0) {
//                   System.out.println(num + " is positive number");
//               } else if (num < 0) {
//                   System.out.println(num + " is negative number");
//               } else {
//                   System.out.println(num + " You entered zero");
//               }
//           }catch (InputMismatchException e){
//               System.out.println("Enter numbers only");
//           }finally {
//               System.out.println("finally block");
//           }

    //      Q15-------------------------------------------------------------------------------
//        System.out.println("Enter number or -1 to quit");
//        int num;
//        int positive = 0;
//        int negative = 0;
//        int zero = 0;
//        try {
//            do {
//                num = input.nextInt();
//                if (num > 0) {
//                    positive = positive + 1;
//                } else if (num < 0) {
//                    negative = negative + 1;
//
//                } else {
//                    zero++;
//                }
//
//            } while (num != -1);
//            System.out.println(negative + " negative");
//            System.out.println(positive + " positive");
//            System.out.println(zero + " zero");
//        } catch (InputMismatchException e) {
//            System.out.println("Enter numbers only ");
//        }finally {
//            System.out.println("Finally block");
//        }

    //     Q16-------------------------------------------------------------
//        int num;
//        int reverse=0;
//        System.out.println("Enter number ");
//           try {
//             num=input.nextInt();
//             if(num==0 || num<0 || num<10){
//                 throw new Exception("Enter number greater than 0 with two digit");
//             }
//               while (num>0){
//                   int rem=num %10;
//                   reverse = reverse * 10 + rem;
//                   num=num/10;
//               }
//               System.out.println("The reverse number is : "+reverse);
//           }catch (InputMismatchException e){
//               System.out.printf("Enter number only ");
//           }catch (Exception e){
//               System.out.println(e.getMessage());
//           }
//               finally {
//               System.out.println("Finally block");
//           }

    //     Q17------------------------------------------------------------------
//            int num;
//            int large=0;
//            int small=0;
//        int count;
//            System.out.println("Enter the counter ");
//           try {
//              count =input.nextInt();
//              if (count==0 || count<0){
//                  throw new Exception("Counter cannot be 0 or negative number ");
//              }
//               for(int i=1;i<=count;i++){
//                   System.out.println("Enter number ");
//                   num=input.nextInt();
//                   if(num>large){
//                       large=num;
//                   } else if (num<small) {
//                       small=num;
//                   }
//
//               }
//               System.out.println("The large number : "+large);
//               System.out.println("The smllest number : "+small);
//           }catch (InputMismatchException e){
//               System.out.println("Enter numbers only ");
//           }catch (Exception e){
//               System.out.println(e.getMessage());
//           }
//           finally {
//               System.out.println("Finally block");
//           }

    //     Q18----------------------------------------------------------------------
//
//        System.out.println("Enter the sentence");
//           try {
//               String word=input.nextLine();
//               if(word.equals("")){
//                   throw new Exception("Enter value");
//               }
//               int count=1;
//               for(int i=0;i<word.length();i++){
//                   if (word.charAt(i)==  'a'){
//                       count++;
//                   }
//               }
//               System.out.println( word.indexOf("Number of a's =")+count);
//           }catch (Exception e){
//               System.out.println(e.getMessage());
//           }

}


public static void check_num(int x)throws Exception{
    if(x==0 ){
        throw new Exception("The output will be 0");
    }
}
    }





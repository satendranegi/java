package com.satendranegi.javalearnings;

import java.util.Scanner;

public class NumbersPrintingWithLoopsDemo {
    public static void main(String[] args) {

        //1
        //1,2
        //1,2,3
        //1,2,3,4
        //1,2,3,4,5
        //1,2,3,4,5,6

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to see the magic: ");
        //int numberToDisplay = scanner.nextInt();
        int numberToDisplay = 5;

        System.out.println("--------------------------------");
        for (int i=1;i<=numberToDisplay;i++){
            int number = 1;
            for (int j=1;j<=i;j++){
                System.out.print(number+" ");
                number ++;
            }
            System.out.println();
        }

        //1
        //1,2
        //1,2,3
        //1,2,3,4
        //1,2,3,4,5
        //1,2,3,4,5,6
        //1,2,3,4,5
        //1,2,3,4
        //1,2,3
        //1,2
        //1

       while (numberToDisplay>=1){
           int numberToPrint =1;
           for (int j=1;j<numberToDisplay;j++){
               System.out.print(numberToPrint+" ");
               numberToPrint ++;
           }
           System.out.println();
           numberToDisplay --;
       }
        System.out.println("--------------------------------");

//        A
//        A B
//        A B C
//        A B C D
//        A B C D E
//        A B C D E F
//        A B C D E F G
//        A B C D E F G H
//        A B C D E F G H I
//        A B C D E F G H I J
//        A B C D E F G H I J K
//        A B C D E F G H I J K L
//        A B C D E F G H I J K L M
//        A B C D E F G H I J K L M N
//        A B C D E F G H I J K L M N O
//        A B C D E F G H I J K L M N O P
//        A B C D E F G H I J K L M N O P Q
//        A B C D E F G H I J K L M N O P Q R
//        A B C D E F G H I J K L M N O P Q R S
//        A B C D E F G H I J K L M N O P Q R S T
//        A B C D E F G H I J K L M N O P Q R S T U
//        A B C D E F G H I J K L M N O P Q R S T U V
//        A B C D E F G H I J K L M N O P Q R S T U V W
//        A B C D E F G H I J K L M N O P Q R S T U V W X
//        A B C D E F G H I J K L M N O P Q R S T U V W X Y
//        A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

        for (int i=1;i<=26;i++){

           int number = 65;

           for(int j=1;j<=i;j++){
               System.out.print((char) number+" ");
               number ++;
           }
           System.out.println();
       }

        System.out.println();

//        * * * * *
//        *       *
//        *       *
//        *       *
//        * * * * *

        for (int i=1;i<=5;i++){

            for (int j=1;j<=5;j++)
            {
                if(i>1 && i<5){
                    if(j>1 && j<5){
                        System.out.print("  ");
                    }else {
                        System.out.print("*" + " ");
                    }

                }else {
                    System.out.print("*"+ " ");
                }

            }
            System.out.println();


        }




    }
}

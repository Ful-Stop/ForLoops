package com.company;

public class Exercises {

    public static int addEvens(int n){
        int evensSum = 0;
        for (int i = 2; i <= n; i += 2){
            evensSum += i;
        }
        return evensSum;
    }

    public static void printSquaresBack(int n){
        for (int i = n; i >= 1; i -= 1){
            System.out.print(i * i + " ");
        }
    }

    public static void sillyNumbers(){
        for (int i = 1; i <= 3; i++){
            System.out.println("");
            for (int j = 0; j <= 9; j++){
                for (int k = 1; k <= 3; k++){
                    System.out.print(j);
                }
            }
        }
    }

    public static void sillyNumbers2(){
        for (int i = 1; i <= 3; i++){
            System.out.println("");
            for (int j = 9; j >= 0; j--){
                for (int k = 1; k <= j; k++){
                    System.out.print(j);
                }
            }
        }
    }

    public static void dollarsAndStars(){
        int starsCheck1 = 0;
        int starsCheck2 = 14;
        int dollarCheck = 7;

        for (int i = 1; i <= 7; i++){
            System.out.println();
            for (int j = starsCheck1; j > 0; j -= 1){
                System.out.print("*");
            }
            for (int j = dollarCheck; j > 0; j -= 1){
                System.out.print("$");
            }
            for (int j = starsCheck2; j > 0; j -= 1){
                System.out.print("*");
            }
            for (int j = dollarCheck; j > 0; j -= 1){
                System.out.print("$");
            }
            for (int j = starsCheck1; j > 0; j -= 1){
                System.out.print("*");
            }
            starsCheck1 += 2;
            starsCheck2 -= 2;
            dollarCheck -= 1;

        }
    }

    public static void main(String[] args) {

    // addEvens
        System.out.println(addEvens(10));
        System.out.println(addEvens(20));
        System.out.println(addEvens(56));
        System.out.println("");

    // printSquaresBack
        printSquaresBack(8);
        System.out.println("");
        printSquaresBack(10);
        System.out.println("");
        printSquaresBack(4);
        System.out.println("");

    // sillyNumbers
        sillyNumbers();
        System.out.println("");

    // sillyNumbers2
        sillyNumbers2();
        System.out.println("");

    //dollarsAndStars
        dollarsAndStars();

    }
}

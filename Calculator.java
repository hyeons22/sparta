package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        while(true){
            // 숫자 2개 입력
            System.out.print("num1 입력 : ");
            int num1 = sc.nextInt();
            System.out.print("num2 입력 : ");
            int num2 = sc.nextInt();
            System.out.print("+, -, *, / 입력 : ");
            String sachic = sc.next();

            // 사칙연산
            if(sachic.charAt(0) == '+'){
                result = num1 + num2;
                System.out.println("결과 : " + result);
            }else if(sachic.charAt(0) == '-'){
                result = num1 - num2;
                System.out.println("결과 : " + result);
            }else if(sachic.charAt(0) == '*') {
                result = num1 * num2;
                System.out.println("결과 : " + result);
            }else if(sachic.charAt(0) == '/') {
                result = num1 / num2;
                System.out.println("결과 : " + result);
            }else {
                System.out.println("기호를 잘못 입력하셨습니다.");
            }

            System.out.print("더 계산하시겠습니까? ");
            String answer = sc.next();
            if(answer.equals("exit")){
                System.out.println("계산기가 종료 되었습니다.");
                break;
            }
        }




    }
}

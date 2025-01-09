package com.example.calculator2_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        Queue<Integer> results = new LinkedList<Integer>();

        while(true) {
            int result;
            // num1,num2,func 입력
            System.out.print("num1 입력 : ");
            int num1 = sc.nextInt();
            System.out.print("num2 입력 : ");
            int num2 = sc.nextInt();
            System.out.print("+, -, *, / 및 다른 기능 입력 : ");
            String func = sc.next();

            // 연산값 result에 저장
            result = cal.calculate(num1, num2, func);
            cal.setResult(result);
            System.out.println("결과값 : "+ cal.getResult());

            // reults에 저장
            cal.saveResults(result);
            System.out.print("저장된 값 전체조회 : ");
            cal.resultScreen();
            System.out.print("더 계산하시겠습니까? (exit 입력시 종료)");
            String answer = sc.next();
            if(answer.equals("exit")){
                System.out.println("계산기가 종료 되었습니다.");
                break;
            }
        }



    }
}

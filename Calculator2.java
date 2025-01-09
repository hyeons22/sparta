package com.example.calculator2_2;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator2 {

    int num1;
    int num2;
    private int result;
    private Queue<Integer> results = new LinkedList<Integer>();

    // 사칙연산
    public int calculate(int num1, int num2, String func){

        switch (func.charAt(0)) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return  num1 * num2;
            case '/':
                return  num1 / num2;
            case 'd':
                return resultsPoll();
            default:
                return -1;
        }
    }
    // setter 저장 / 수정
    public void setResult(int result){
        this.result = result;
    }

    // getter 읽기
    public int getResult(){
        return result;
    }


    // results에 저장
    public void saveResults(int result){
        this.results.add(result);
    }


    // 제일 처음 저장된값 삭제
    public int resultsPoll(){
        return results.poll();
    }

    // 저장된값 전체 조회
    public void resultScreen(){
        System.out.println(results.toString());
    }


}

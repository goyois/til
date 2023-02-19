package til.java.algorithm.method.stack;

import java.util.Stack;

import static til.java.baekjoon.silver.S_05.pop;

public class StackMethod {

    public static Stack<Integer> stack = new Stack<Integer>();


    public static void main(String[] args) {
        stack.push(1);  //값 추가
        stack.pop();  //값 삭제
        stack.clear();  //값 전체삭제
        stack.size();  //크기 반환
        stack.empty();  //비어있으며 true 아니면 false
        stack.contains(1);  //1을 포함하고 있으면 true, 아니면 false
        stack.peek();  //stack top 출력(제거 x) 비어있으면 null 반환
    }
}

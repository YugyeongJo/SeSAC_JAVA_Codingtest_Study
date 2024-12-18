// https://campus.programmers.co.kr/app/courses/24866/curriculum/lessons/377356#part-79602

// 문제 설명
// Stack 개요
// image.png

// Stack은 LIFO (Last In, First Out) 구조를 가진 자료구조입니다.
// Java에서 Stack은 java.util.Stack 클래스를 통해 구현됩니다.
// 주요 특징:
// Push: 스택에 데이터를 추가합니다.
// Pop: 스택에서 데이터를 제거하고 반환합니다.
// Peek: 스택의 최상단 데이터를 확인합니다.
// Empty: 스택이 비어 있는지 확인합니다.
// Search: 특정 요소의 위치를 반환합니다 (1부터 시작).
// Stack 클래스 주요 메소드
// push(E item)
// 스택에 데이터를 추가합니다.
// pop()
// 스택의 최상단 데이터를 제거하고 반환합니다.
// peek()
// 스택의 최상단 데이터를 반환하지만 제거하지는 않습니다.
// isEmpty()
// 스택이 비어 있는지 확인합니다.
// search(Object o)
// 스택에서 특정 요소의 위치를 반환합니다 (1부터 시작).

import java.util.*;

class Solution {
    public int solution(int param0) {
        
        int answer = 0;
        
        Stack<Integer> stk = new Stack<>();
        
        // 넣기
        stk.push(211);
        stk.push(23);
        stk.push(456);
        System.out.println("스택에 들어가있는 데이터 수 : " + stk.size());
        System.out.println("스택에 넣은 데이터 : " + stk);
        
        System.out.println("마지막에 넣은 데이터 : " + stk.peek());
        
        System.out.println("마지막꺼 꺼내기 데이터 : " + stk.pop());
        System.out.println("지금 상태 스택 : " + stk);
        
        stk.push(34);
        stk.push(133);
        System.out.println("211을 찾아라 : " + stk.search(211)); //4
        System.out.println("133을 찾아라 : " + stk.search(133)); //1
        
        // 스택이 비워질 때까지 pop
        while (!stk.isEmpty()) {
            System.out.println("하나하나 꺼내면서 : " + stk.pop());
        }
        
        // 비어있는 스택에서 pop() 호출 시 예외 발생
        try {
            stk.pop();
        } catch (Exception e) {
            System.out.println("비워져있을때 pop을 하는 경우 나오는 error 메세지 : " + e.getMessage());
        }
        
        return answer;
    }
}
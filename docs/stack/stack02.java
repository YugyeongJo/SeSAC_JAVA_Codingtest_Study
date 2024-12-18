// https://campus.programmers.co.kr/app/courses/24866/curriculum/lessons/377357#part-79602

// 문제 설명
// Stack은 "더미"란 뜻을 가집니다.

// 책 더미, 신문 더미 등에 사용하는 단어입니다.

// 책 더미를 예로 들어 봅시다.

// 책 더미를 쌓았다고 했을 때, 이 책 더미에서 책을 가져오는 가장 정상적인 방법은 제일 위에 있는 책을 가져오는 방식입니다.

// 다시 말하면 가장 먼저 들어간 책은 가장 나중에 꺼낼 수 있을 것입니다.

// 이런식으로 자료가 가장 밑에 쌓이고(입력). 자료를 가져올 때(출력)는 가장 위(최근)의 자료를 가져오는 자료구조를 Stack하고 합니다.

// 이러한 Stack의 특징 때문에 흔히 "FILO(First-In-Last-Out : 선입후출)" 혹은 "LIFO(Last-In-First-Out : 후입선출)"라고 합니다.

// image.png

// 문제설명

// 입력에 대한 주어진 명령을 분석하여
// 입력에 대한 모든 결과를 출력하세요
// 입력 명령에 대한 설명은 다음의 3가지입니다.

// "i"는 스택에 값을 추가하는 의미 입니다. 그래서
// "i a"는 a라는 수를 스택에 넣습니다.
// 이때, a는 10,000 이하의 자연수입니다.

// "o"는 스택에서 데이터를 빼고, 그 데이터를 출력합니다.
// 만약 스택이 비어있으면, "empty"를 출력합니다.

// "c"는 스택에 쌓여있는 데이터의 수를 출력합니다.

// 입력 설명
// 첫 줄에 N이 주어진다.
// N은 주어지는 명령의 수입니다.
// (1≤N≤100)

// 둘째 줄부터 N+1줄까지 N개의 명령이 주어지는데
// 명령은 한 줄에 하나씩 주어집니다.

// 출력 설명
// 각 명령에 대한 출력 값을 한 줄에 하나씩 출력합니다.

// 출력내용이 하나도 없는 경우는 주어지지 않습니다.

import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stk = new Stack<>();
        
        // 명령의 수 입력
        int n = sc.nextInt();
        sc.nextLine(); // 줄바꿈 문자 소비
        
        // 명령 처리
        for (int i = 0; i < n; i++) {
            String[] cmd = sc.nextLine().split(" "); // 명령을 공백으로 분리
            
            // 명령어가 "i"일 경우
            if (cmd[0].equals("i")) {
                int value = Integer.parseInt(cmd[1]); // 두 번째 값을 정수로 변환
                stk.push(value); // 스택에 값 추가
                
            // 명령어가 "o"일 경우
            } else if (cmd[0].equals("o")) {
                if (stk.isEmpty()) {
                    System.out.println("empty"); // 스택이 비어있으면 "empty" 출력
                } else {
                    System.out.println(stk.pop()); // 스택에서 값을 제거하고 출력
                }
            
            // 명령어가 "c"일 경우
            } else if (cmd[0].equals("c")) {
                System.out.println(stk.size()); // 스택에 쌓인 데이터 수 출력
            }
        }
        
        sc.close(); // Scanner 종료
    }
}

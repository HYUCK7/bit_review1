package com.example.arrayexam.array;

/**
 * packageName: com.example.arrayexam.array
 * fileName   : tempController
 * author     : HYUCK7
 * date       : 2022/02/05
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022/02/05         HYUCK7         최초 생성
 */
public class tempController {
        public static void main(String[] args) {
            String[] arr = {"유재혁", "강 민", "김아름", "장원종", "최건일",
                             "해시",  "DP",   "스택", "완전 탐색", "이분 탐색",
                             "정렬",  "그랲 ", "힙",  "DFS",  "탐욕법",
                             "--" ,   "--"   , "큐", "BFS", "--"};
            String team = " ";
            System.out.println("Q1. 팀별 과제를 출력하세요 ");
            for(int i=0; i<arr.length; i++){
                if(i%5 == 0){
                    team += "\n";}
                    team +=  i + ":" + arr[i] + "\t";
                if(i == 21){break;}
            }
            System.out.println(team);
            System.out.println("\n");

            String ae = "";
            System.out.println("Q2. 팀장이 맡은 과제만 출력하세요. 예) 김진영, 힙, 그래프 ");
            String tm = "최건일";
            for(int i=0; i<arr.length; i++) {
                if (arr[i].equals(tm)) {
                    for (int j = i; j < arr.length; j = j+5) {
                        ae += j + " : " + arr[j] + ",\t" ;
                    }
                }if(i==20){break;}
            }
                System.out.print(ae);
            System.out.println("\n");

            String subject = "큐";
            String student = "";
            System.out.println("Q3. 큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람: 권혜민 "); //arr[17]를 담당한 사람: arr[2];
            for(int i = 0; i<arr.length; i++){
                if(arr[i].equals(subject)){
                    student += arr[i-15];
                }
            }
            System.out.println(subject +"를 담당한 사람 : " + student );

       }

    }



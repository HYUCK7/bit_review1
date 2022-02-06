package com.example.arrayexam.array;

/**
 * packageName: com.example.arrayexam.array
 * fileName   : tempController
 * author     : HYUCK7
 * date       : 2022/02/05
 * desc       : 수업시간의 배열 예제 복습
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
            System.out.println("Q3. 큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람: 김아름 "); //arr[17]를 담당한 사람: arr[2];
            for(int i = 0; i<arr.length; i++){
                if(arr[i].equals(subject)){
                    student += arr[i%5]; // 뭔 숫자를 넣어도, 5로 나눴을 때, 나머지 0,1,2,3,4로 나오므로 팀원의 값을 뽑을 수 있음.
                }
            }
            System.out.println(subject +"를 담당한 사람 : " + student );

            // arr[19] , arr[14] , arr[9] : arr[4]
            subject = "";
            student = "";
            subject = "큐";
            System.out.println("Q4. 큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람: 김아름 ");
            for(int i = 0; i< arr.length; i++) {
                if (arr[i].equals(subject)) {
                    for(int j = 0; j<4; j++){
                        student += arr[i - 5*j] + "," + "\t";
                    }
                }
                if(i==20){break;}
            }System.out.print(student);
            System.out.println("\n");

            // 수업 듣고 다시 진행
            System.out.println("Q5.팀원이 맡은 과제 수를 출력하세요 예) 유재혁(2개), 강 민(2개), 김아름(3개), 장원종(3개), 최건일(2개)");
            int arr1[] = new int[5];
            String manager ="";
            arr1[0] = arr1[1] = arr1[2] = arr1[3] = arr1[4] = 0;

            for(int i = 0; i<arr.length; i++) {
                if (arr[i].equals(arr[i % 5])) {
                    arr1[0]++;
                }if (arr[i % 5].equals(1)) {
                    arr1[1]++;
                }if (arr[i % 5].equals(2)) {
                    arr1[2]++;
                }if (arr[i % 5].equals(3)) {
                    arr1[3]++;
                }if (arr[i % 5].equals(4)) {
                    arr1[4]++;
                }
                System.out.println(arr1[2]);
            }


            /**System.out.println(arr[0] + arr1[2]);
            *System.out.println(arr[1] + arr1[2]);
            *System.out.println(arr[2] + arr1[3]);
            *System.out.println(arr[3] + arr1[3]);
            *System.out.println(arr[4] + arr1[2]);
            */
       }

    }



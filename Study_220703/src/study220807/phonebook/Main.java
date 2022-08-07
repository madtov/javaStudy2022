package study220807.phonebook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. 자바 입력 API Scanner를 만든다.
        Scanner sc = new Scanner(System.in);
        Manager m = new Manager();  // Manager 클래스에 대한 객체를 하나 생성한다.

        // 2. 구현할 시스템을 뼈대를 만든다.
        // > 뼈대 : 눈에 보이는 글씨와 사용자가 직접 입력하는 값
        while (true) {
            System.out.println("1.추가    2.전체출력    3.검색    4.종료");
            System.out.println("메뉴의 번호 선택 : ");
            String menu = sc.nextLine();    // String 데이터형으로 받으면, 문자열을 선택하는 조건이 있어야 한다.

            switch (menu) { //switch (menu) 입력되는 값에 따라서, case를 찾아간다.
                case "1" : // 1.추가
                    m.addPhone();
                    break;

                case "2" : // 2.전체출력
                    m.listPhone();
                    break;

                case "3" : // 3.검색
                    m.searchPhone();
                    break;

                case "4" : // 4.종료
                    System.out.println("프로그램이 종료되었습니다.");
                    return;
                    //값을 변환하지 않으면, 종료의 역할을 수행한다.
            }
        }

        // > 뼈대 (눈에 보이는 글씨와 사용자가 직접 입력하는 값)을 구현했으면, Manager() 영역으로 가자~
    }
}

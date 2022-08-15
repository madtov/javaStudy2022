package study_220807.phonebook;

import java.util.Scanner;

public class Manager {
    Scanner sc = new Scanner(System.in);
    PhoneInfo[] arr = new PhoneInfo[10];        // PhoneInfo 클래스에 대한 10개의 객체를 만들었다.
    int count = 0;

    // 1. 프로그램을 구동할 세부적인 메서드(기능적인 부분)룰 만들어준다.
    // 기능 : 전화번호 추가, 전화번호 출력, 전화번호 검색
    public void addPhone() {
        System.out.println("이름 : ");
        String name = sc.nextLine();
        System.out.println("전화번호 : ");
        String phoneNo = sc.nextLine();
        System.out.println("생년월일 : ");
        String birth = sc.nextLine();

        arr[this.count++] = new PhoneInfo(name, phoneNo, birth);
        // 전화번호를 추가할 때 마다 각각의 객체에 데이터를 추가한다.
        System.out.println("전화번호가 등록되었습니다.");
        // 전화번호 추가
    }

    public void listPhone() {
        for (int i = 0; i < this.count; i++) {
            arr[i].show(); // PhoneInfo 클래스에 대한 show() 매서드를 호출
        }
    }   // 전화번호 출력

    public void searchPhone() {
        System.out.println("이름 : ");
        String name = sc.nextLine(); //찾고자 하는 변수를 만들고, 입력한다.
        int idx = -1; // 문자열의 위치를 알기 위해서 만든 변수이다.

        //name 내가 쓴 문자열이 어디 있는지 모르기 때문에 하나씩 비교한다. for문으로..
        for (int i = 0; i < count; i++) {
            PhoneInfo info = arr[i]; // 이미 생성된 객체를 변수에 넣는 것이므로, new 연산자를 사용하지 않아도 된다.
            if (name.equals(info.name)) {   //i값은 배열의 위치를 알려준다.
                info.show();
                idx = i;    // 문자열의 존재여부를 확인 - 임시 변수! (0~9)
                break;      // 나간다!
            }
        }

        if (idx == -1) {
            System.out.println("해당하는 정보를 찾을 수 없습니다. ");
        }

    } // 전화번호 검색
}

    //////////////////////////////////////////////////////////////////
    // <<<<<<<<<<<<<<<<<<< Main() 영역 >>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // //2. Manager 클래스를 Main() 영역에서 사용하기 위한 객체를 생성한다.
    // // <객체를 반복적으로 생성하면 값에 영향을 주므로, Scanner 밑에 생성하는 것이 좋다. >
    // Manager m = new Manager();
    //
    // // 3. 생성한 Manager 클래스에 대한 객체의 메서드(기능적인 부분)을 뼈대에 추가한다.
    // m.addPhone();
    // m.listPhone();
    // m.searchPhone();
    /////////////////////////////////////////////////////////////////

        // 4. 메서드를 하나씩 구현하기 위한 코드를 작성한다.
        // addPhone() {소스 코드 작성}, listPhone() {소스 코드 작성}, searchPhone() {소스 코드 작성}

        // 5. 전화번호의 추가와 검색에 필요한 자바 입력 API Scanner를 만든다.
        // Scanner sc = new Scanner(System.in);

        // 6. 전화번호부 관리프로그램의 상태와 기능을 담당하는 PhoneInfo 클래스의 객체를 생성한다.
        // PhoneInfo[] arr = new PhoneInfo[10];

        // 7.1 전화번호를 추가하는 메서드인 addPhone() {}의 소스 코드를 작성한다.
        // 모든 변수의 쓰임은 항상 통일해주는 것이 좋다.
        // String name = sc.nextLine();, String phoneNo = sc.nextLine();, String birth = sc.nextLine();

        // 7.2 전화번호를 관리하는 arr[] 배열의 인덱스를 바꿔줄 수 있는 count를 선언한다.
        // int count = 0;
        // arr[count++] = new PhoneInfo(name, phoneNo, birth);

        // 8. 전화번호부를 전체출력하는 메서드인 listPhone() {}의 소드 코드를 작성한다.
        // for문을 사용하여, arr[]의 인덱스를 count의 멤버변수(필드)에 저장된 값에 따라서 결과를 출력한다.
        // 출력을 할 때는, PhoneInfo 클래스의 show() 메서드를 사용한다.
        // <<<<<<<<<<< 향상된 for문을 사용하면 안된다. 각각의 인덱스에 접근할 수 없기 때문이다. >>>>>>>>>>>>>>

        // 9. 전화번호부를 검색하는 메서드인 searchPhonw() {}의 소스 코드를 작성한다.
        // idx = -1; 배열은 0부터 시작하므로, -1로 초기화한 변수를 하나 선언한다.
        // 이름에 대한 문자열을 비교하기 위해서, 각각의 객체의 값들을 info 변수에 넣어준다. PhoneInfo info = arr[i];
        // equals 자바 APT를 통하여, if(name.equals(info.name))로 이름 문자열을 비교한다.
        // 있을 경우, PhoneInfo 클래스의 show 메서드로 info의 변수에 존재하는 arr(idx)에 대한 데이터를 출력한다.
        // 없는 경우, idx의 초기값이 -1을 그대로 얻으므로써 없다라는 메세지를 출력한다.

        // > 세부적인 기능을 구현했으면, 실행한다.
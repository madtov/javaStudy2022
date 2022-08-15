package study_220807.phonebook;

public class PhoneInfo {

    //전화번호부 관리 프로그램 구현하자 (1명의 전화번호부)
    // 상태 : 이름, 전화번호, 생년월일
    // 기능 : 1명의 전화내역을 출력

    // 1. 각각의 상태에 따른 필드(속성)을 선언한다.
    String name;            //이름
    String phoneNo;         //전화번호
    String birth;           //생년월일

    // 2. 사용할 생성자를 생성한다. (생성자는 리턴형이 존재하지 않는다.)
    public PhoneInfo() { }  //디폴트 생성자(기본생성자) : 입력매개변수(파라미터)가 아무것도 없을 때를 항상 생각한다.

    // 3. Source 메뉴에서 필드를 통해서 만들어준다. (직접 입력도 가능하다.)
    public PhoneInfo(String name, String phoneNo, String birth) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.birth = birth;
    }

    // 4. 전화내역을 출력할 메서드를 생성한다.
    public void show() { //출력은 리턴값이 필요하지 않기 때문에 void를 사용한다. >
        // void의 사용은 입력매개변수(파라미터)가 없음과도 같다.}

    }

    // 상태와 기능을 구현했으면, main() 영역으로 가자~

}
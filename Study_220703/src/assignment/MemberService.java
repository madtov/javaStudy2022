package assignment;

public class MemberService {

    boolean login (String id, String password) {
        if ("hong".equals(id) && "12345".equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    void logout (String id) {
        if ("hong".equals(id)) {
            System.out.println("로그아웃되었습니다.");
        }
    }


}

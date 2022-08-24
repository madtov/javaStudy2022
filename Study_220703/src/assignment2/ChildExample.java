package assignment2;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child ();
    }
}

//Parent(String nation) call => Parent() call => Child(String name) call => Child() call
//Child가 Parent 상속받아서 Parent 먼저 들어가고 Parent가 내려오는 중에 this받아서 this 가 먼저 출력되는거라고 함.
//Child도 같은방식

package assignment;

import java.util.Scanner;

public class BankApplication {
    private static BankAccount[] accountArray = new BankAccount[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("--------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("--------------------------");
            System.out.print("선택>  ");

            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountlist();
            } else if (selectNo == 3) {
//                deposit();
            } else if (selectNo == 4) {
//                withdraw();
            } else if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    //계좌 생성하기
    private static void createAccount() {
        System.out.println("---------");
        System.out.println("계좌생성");
        System.out.println("---------");
        System.out.println("계좌번호 : " + accountArray);
        System.out.println("계좌주 : " + scanner.nextInt());
 //       scanner.nextInt() = String.ano;
    }

    //계좌 목록보기
    private static void accountlist() {

    }

    //예금하기
//    private static void deposit() {

    }

    //출금하기
//    private static void withdraw() {

//    }
//
    //Account 배열에서 ano와 동일한 Account 객체 찾기
  //  private static BankAccount findAccount(String ano)}

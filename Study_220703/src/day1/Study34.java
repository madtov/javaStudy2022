package day1;

import java.util.Scanner;

public class Study34 {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0;
        Scanner credit = new Scanner(System.in);
        while(run) {
            System.out.println("--------------------");
            System.out.println("1.예금 / 2.출금 / 3.잔고 / 4.종료");
            System.out.println("--------------------");
            System.out.println("선택 > ");
            int bank = credit.nextInt();
            switch (bank) {
                case 1 :
                    System.out.println("예금액 : ");
                    balance += credit.nextInt();
                    break;
                case 2 :
                    System.out.println("출금액 > ");
                    balance -= credit.nextInt();
                    break;
                case 3 :
                    System.out.println("잔고 > " + balance);
                    break;
                case 4 :
                    System.out.println("프로그램 종료");
                    run = false;
            }
        }
    }
}

package day1;

public class Study14 {
    public static void main(String[] args) {
        int time = (int)(Math.random()*4) +8;
        System.out.println("[현재시간 : "+ time + "시]");

         switch(time) {
             case 8:
                 System.out.println("비트 타임");
             case 9:
                 System.out.println("다니엘 타임");
             case 10:
                System.out.println("코인 타임(short!!!! long!!!!! 분봉으로 봤어요?)");
             default :
                 System.out.println("♬  ♬ ~~허밍 중~~ ♬  ♬");
         }
    }
}

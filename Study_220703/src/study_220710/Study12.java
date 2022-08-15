package study_220710;

public class Study12 {
    public static void main(String[] args) {
//        Week today = null;
//
//        Calendar cal = Calendar.getInstance();
//        int week = cal.get(Calendar.DAY_OF_WEEK);
//
//        System.out.println("week = " + week);
//        switch (week) {
//            case 1 :
//                today = Week.SUNDAY;
//                break;
//            case 2 :
//                today = Week.MONDAY; break;
//            case 3 :
//                today = Week.TUESDAY; break;
//            case 4 :
//                today = Week.WEDNESDAY; break;
//            case 5 :
//                today = Week.THURSDAY.; break;
//            case 6 :
//                today = Week.FRIDAY; break;
//            case 7 :
//                today = Week.SATURDAY; break;
//        }
//
//        System.out.println("오늘 요일: " + today);
//
//        if(today == Week.SUNDAY) {
//            System.out.println("일요일에는 축구를 합니다.");
//        } else {
//            System.out.println("열심히 자바 공부합니다.");
//        }
        Week today = Week.SUNDAY;
        String name = today.name();
        System.out.println("오늘 무슨 요일 " + name);

        Week tomorrow = Week.SUNDAY;
        int ordinal = tomorrow.ordinal();
        System.out.println("ordinal = " + ordinal);

        Week day1 = Week.MONDAY;
        Week day2 = Week.WEDNESDAY;
        int result1 = day1.compareTo(day2); //-2
        int result2 = day2.compareTo(day1); //2
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        Week weekDay = Week.valueOf("SATURDAY");
        System.out.println("weekDay = " + weekDay);

        Week[] days = Week.values();
        for (Week day : days) {
            System.out.println(day);
        }
    }
}

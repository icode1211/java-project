package chap04;

public class MonthSwitchCaseExample {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);   // 문자열 -> 정수
        String monthString;
        switch (month) {
            case 1 ->
                monthString = "January";
            case 2 ->
                monthString = "February";
            case 3 ->
                monthString = "March";
            case 4 ->
                monthString = "April";
            case 5 ->
                monthString = "May";
            case 6 ->
                monthString = "June";
            case 7 ->
                monthString = "July";
            case 8 ->
                monthString = "August";
            case 9 ->
                monthString = "September";
            case 10 ->
                monthString = "October";
            case 11 ->
                monthString = "November";
            case 12 ->
                monthString = "December";
            default ->
                monthString = "Invalid month";   // 유효하지 않은 범위의 값을 입력받았을 때 예외처리
        }
        System.out.println(monthString);
    }
}

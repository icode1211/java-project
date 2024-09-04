package chap04;

public class DaySwitchCaseExample {
    public static void main(String[] args) {
        String dayString = "수요일";
        switch (args[0]) {
            case "월요일":
                dayString = "Start of the work week";
                break;
            case "금요일":
                dayString = "Almost weekend";
                break;
            default:
                dayString = "Midweek";
                break;
        }
        System.out.println("dayString = " + dayString);
    }
}

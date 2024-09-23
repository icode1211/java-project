package weekly.weeklyquiz2;

import java.util.Scanner;

/**
 * Java 자료구조 주말 퀴즈
 */
public class AddressBookProgram {
    static void printMenu() {
        String menu = """
                1. 비즈니스 연락처 추가
                2. 개인 연락처 추가
                3. 연락처 출력
                4. 연락처 검색
                5. 종료
                메뉴를 선택해주세요: ↵
                """;
        System.out.println(menu);
    }
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        while (true) {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            int selectedMenu = scanner.nextInt();
            switch (selectedMenu) {
                case 1:
                    System.out.println("이름 입력하세요:");
                    String name = scanner.next();
                    System.out.println("전화번호 입력하세요:");
                    String phoneNumber = scanner.next();
                    System.out.println("회사명 입력하세요:");
                    String company = scanner.next();
                    addressBook.add(new BusinessContact(name, phoneNumber, company));
                    break;
                case 2:
                    System.out.println("이름 입력하세요:");
                    String name2 = scanner.next();
                    System.out.println("전화번호 입력하세요:");
                    String phoneNumber2 = scanner.next();
                    System.out.println("관계 입력하세요:");
                    String company2 = scanner.next();
                    addressBook.add(new PersonalContact(name2, phoneNumber2, company2));
                    break;
                case 3:
                    addressBook.displayContacts();
                    break;
                case 4:
                    System.out.println("검색하고싶은 이름을 입력하세요: ");
                    String searchName = scanner.next();
                    addressBook.searchContact(searchName);
                    break;
                case 5:
                    return;
            }
        }
    }
}

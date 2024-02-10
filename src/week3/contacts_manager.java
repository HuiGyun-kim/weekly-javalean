package week3;

import java.util.Scanner;

public class contacts_manager {
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. 비즈니스 연락처 추가\n2. 개인 연락처 추가\n3. 연락처 출력\n4. 연락처 검색\n5. 종료");
			System.out.print("메뉴를 선택해주세요(숫자): ");
			choice = getIntegerInput(sc);
			switch (choice) {
				case 1:
					System.out.print("이름을 입력하세요:");
					String businessName = sc.next();
					System.out.print("전화번호를 입력하세요:");
					String businessPhoneNumber = sc.next();
					System.out.print("회사명을 입력하세요:");
					String businessCompany = sc.next();
					if (addressBook.duplicateContact(businessName, businessPhoneNumber)) {
						System.out.println(businessName + " 과 " + businessPhoneNumber + " 가 중복되는 연락처가 이미 존재합니다.");
						break;
					}
					addressBook.addContact(new BusinessContact(businessName, businessPhoneNumber, businessCompany));
					break;
				case 2:
					System.out.print("이름을 입력하세요:");
					String personalName = sc.next();
					System.out.print("전화번호를 입력하세요:");
					String personalPhoneNumber = sc.next();
					System.out.print("관계를 입력하세요:");
					String personalCompany = sc.next();
					if (addressBook.duplicateContact(personalName, personalPhoneNumber)) {
						System.out.println(personalName + " 과 " + personalPhoneNumber + " 가 중복되는 연락처가 이미 존재합니다.");
						break;
					}
					addressBook.addContact(new PersonalContact(personalName, personalPhoneNumber, personalCompany));
					break;
				case 3:
					addressBook.displayContacts();
					break;
				case 4:
					System.out.print("검색할 이름을 입력하세요:");
					String searchName = sc.next();
					addressBook.searchContact(searchName);
					break;
				case 5:
					System.out.println("프로그램을 종료합니다.");
					break;
				default:
					System.out.println("잘못된 입력입니다. 1부터 5까지의 숫자를 선택해주세요.");
					break;
			}
		} while (choice != 5);
		sc.close();
	}

	private static int getIntegerInput(Scanner scanner) {
		while (!scanner.hasNextInt()) {
			scanner.next(); // 잘못된 입력을 건너뛰기
			System.out.print("잘못된 입력입니다. 숫자를 입력해주세요: ");
		}
		return scanner.nextInt();
	}
}

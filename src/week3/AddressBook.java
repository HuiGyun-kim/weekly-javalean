package week3;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	List<Contact> contacts = new ArrayList<>();

	// 연락처를 추가하는 메소드
	public void addContact(Contact contact) {
		contacts.add(contact);
	}

	// 모든 연락처를 화면에 표시하는 메소드
	public void displayContacts() {
		for (Contact contact : contacts) {
			if (contact instanceof BusinessContact) {
				System.out.println("이름 : " + contact.getName() + ", 전화번호 : " + contact.getPhoneNumber()
					+ ", 회사명 : " + ((BusinessContact)contact).getCompany());
			} else if (contact instanceof PersonalContact) {
				System.out.println("이름 : " + contact.getName() + ", 전화번호 : " + contact.getPhoneNumber()
					+ ", 회사명 : " + ((PersonalContact)contact).getRelationship());
			}
		}
		if (contacts.isEmpty()) {
			System.out.println("연락처를 찾을 수 없습니다.");
		}
	}

	//중복되는 이름과 번호 체크하는 메소드
	public boolean duplicateContact(String name, String phoneNumber) {
		for (Contact contact : contacts) {
			if (contact.getName().equalsIgnoreCase(name) && contact.getPhoneNumber().equals(phoneNumber)) {
				return true; // 이름이 중복될 경우 true 반환
			}
		}
		return false; // 중복되는 이름이 없으면 false 반환
	}

	// 특정 이름을 가진 연락처를 검색하는 메소드
	public List<Contact> searchContact(String name) {
		List<Contact> result = new ArrayList<>();
		for (Contact contact : contacts) {
			if (contact.getName().equals(name)) {
				if (contact instanceof BusinessContact) {
					System.out.println("이름 : " + contact.getName() + ", 전화번호 : " + contact.getPhoneNumber()
						+ ", 회사명 : " + ((BusinessContact)contact).getCompany());
				}
				if (contact instanceof PersonalContact) {
					System.out.println("이름 : " + contact.getName() + ", 전화번호 : " + contact.getPhoneNumber()
						+ ", 회사명 : " + ((PersonalContact)contact).getRelationship());
				}
				result.add(contact);
			}
		}
		if (result.isEmpty()) {
			System.out.println("연락처를 찾을 수 없습니다.");
		}
		return result;
	}
}

package week2;

public class PersonalContact extends Contact {
	private String relationship;

	public PersonalContact(String name, String phoneNumber, String relationship) {
		super(name, phoneNumber);
		this.relationship = relationship;
		System.out.println("이름은 " + name + ", 전화번호는 " + phoneNumber + ", 관계는 " + relationship + "로 저장합니다.");
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
}

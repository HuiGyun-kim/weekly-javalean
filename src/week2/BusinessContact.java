package week2;

public class BusinessContact extends Contact {
	private String company;

	public BusinessContact(String name, String phoneNumber, String company) {
		super(name, phoneNumber);
		this.company = company;
		System.out.println("이름은 " + name + ", 전화번호는 " + phoneNumber + ", 회사이름은 " + company + "로 저장합니다.");
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}

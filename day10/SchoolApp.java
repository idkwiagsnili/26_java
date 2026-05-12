package day10;

public class SchoolApp {

	public static void print(Person p) {
		if(p instanceof Person) {
			System.out.println("사람객체 입니다.");
		}
		if(p instanceof Student) {
			System.out.println("학생객체 입니다.");
		}
		else if(p instanceof Researcher) {
			System.out.println("리서처객체 입니다.");
		}
	}
		
	//업캐스팅
	public static void main(String[] args) {
		Person p = new Person("이사람", "0110");
		Person p1 = new Student("김학생", "1111");
		Person p2 = new Researcher("빅리서쳐", "2222");
		
		print(p);
	}
}


import java.util.*;

class SexualException extends Exception{}
class OldException extends Exception{}

class Person{
	String name;
	String sexual;
	int old;
	Person(){
		Scanner in = new Scanner(System.in);
		System.out.println("���������������");
		name = in.nextLine();
		System.out.println("����������Ա�");
		sexual = in.nextLine();
		System.out.println("������������䣺");
		old = in.nextInt();
	}
}

public class PersonText {
	public static void main(String[] args) {
		Person person = new Person();
		Scanner in = new Scanner(System.in);
		while(true){
		try {
			if(!(person.sexual.equals("man") || person.sexual.equals("feman")))
				throw new SexualException();
		}catch (SexualException e1) {
			System.out.println("�Ա������������������룡");
			person.sexual = in.nextLine();
		}
		try {
			if(person.old < 0 || person.old > 120)
				throw new OldException();
		}catch (OldException e2) {
			System.out.println("���������������������룡");
			person.old = in.nextInt();
		}
	}
	}
}


import java.util.*;

class SexualException extends Exception{}
class OldException extends Exception{}

class Person{
	String name;
	String sexual;
	int old;
	Person(){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入你的姓名：");
		name = in.nextLine();
		System.out.println("请输入你的性别：");
		sexual = in.nextLine();
		System.out.println("请输入你的年龄：");
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
			System.out.println("性别输入有误，请重新输入！");
			person.sexual = in.nextLine();
		}
		try {
			if(person.old < 0 || person.old > 120)
				throw new OldException();
		}catch (OldException e2) {
			System.out.println("年龄输入有误，请重新输入！");
			person.old = in.nextInt();
		}
	}
	}
}

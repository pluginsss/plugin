
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
		while(true) {
			try {
				sexual = in.nextLine();
				if(!(sexual.equals("man") || sexual.equals("feman")))
					throw new SexualException();
				else
					break;
			}catch (SexualException e1) {
				System.out.println("性别输入有误，请重新输入！");
			}
		}
		System.out.println("请输入你的年龄：");		
		while(true) {
			try {
				old = in.nextInt();
				if(old < 0 || old > 120)
					throw new OldException();
				else
					break;
			}catch (OldException e2) {
				System.out.println("年龄输入有误，请重新输入！");
			}
		}
	}
		public static void main(String[] args) {
			Person a = new Person();
			System.out.println("你的名字：" + a.name);
			System.out.println("你的性别：" + a.sexual);
			System.out.println("你的年龄：" + a.old);
		}
		}

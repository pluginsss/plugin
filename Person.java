
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
		while(true) {
			try {
				sexual = in.nextLine();
				if(!(sexual.equals("man") || sexual.equals("feman")))
					throw new SexualException();
				else
					break;
			}catch (SexualException e1) {
				System.out.println("�Ա������������������룡");
			}
		}
		System.out.println("������������䣺");		
		while(true) {
			try {
				old = in.nextInt();
				if(old < 0 || old > 120)
					throw new OldException();
				else
					break;
			}catch (OldException e2) {
				System.out.println("���������������������룡");
			}
		}
	}
		public static void main(String[] args) {
			Person a = new Person();
			System.out.println("������֣�" + a.name);
			System.out.println("����Ա�" + a.sexual);
			System.out.println("������䣺" + a.old);
		}
		}

public class ThrowText {
	public static void main(String[] args) {
		int a = 5, b = 0, c[] = {1, 2 ,3 ,4, 5};
		try {
			System.out.println("Before throw");
			if(a > 4)
				throw new ArrayIndexOutOfBoundsException();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���������±�Խ���쳣��catch���鲶�����쳣��");
			System.out.println("������쳣Ϊ" + e);
		}finally {
			System.out.println("��������catch��Ĺ��в��֣�");
		}
		try {
			System.out.println("Before throw");
			if(b == 0)
				throw new ArithmeticException();
		}catch(ArithmeticException e2) {
			System.out.println("��������Ϊ0�쳣��catch���鲶�����쳣��");
			System.out.println("������쳣Ϊ" + e2);
		}finally {
			System.out.println("��������catch��Ĺ��в��֣�");
		}
	}
}

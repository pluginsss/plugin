public class ThrowText {
	public static void main(String[] args) {
		int a = 5, b = 0, c[] = {1, 2 ,3 ,4, 5};
		try {
			System.out.println("Before throw");
			if(a > 4)
				throw new ArrayIndexOutOfBoundsException();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("处理数组下标越界异常的catch语句块捕获了异常！");
			System.out.println("捕获的异常为" + e);
		}finally {
			System.out.println("这是所有catch块的共有部分！");
		}
		try {
			System.out.println("Before throw");
			if(b == 0)
				throw new ArithmeticException();
		}catch(ArithmeticException e2) {
			System.out.println("处理被除数为0异常的catch语句块捕获了异常！");
			System.out.println("捕获的异常为" + e2);
		}finally {
			System.out.println("这是所有catch块的共有部分！");
		}
	}
}

package xiaolu;
import java.util.Scanner;
 
class Complex { // ������
	double real;  // ʵ��
	double image; // �鲿
	
	Complex(){  // ���������Ĺ��췽��
		Scanner input = new Scanner(System.in);
		double real = input.nextDouble();
		double image = input.nextDouble();
		Complex(real,image);
	}
 
	private void Complex(double real, double image) { // �����������Ĺ��췽������
		// TODO Auto-generated method stub
		this.real = real;
		this.image = image;
	}
 
	Complex(double real,double image){ // �������Ĺ��췽��
		this.real = real;
		this.image = image;
	}
 
	public double getReal() {
		return real;
	}
 
	public void setReal(double real) {
		this.real = real;
	}
 
	public double getImage() {
		return image;
	}
 
	public void setImage(double image) {
		this.image = image;
	}
	
	Complex add(Complex a){ // �������
		double real2 = a.getReal();
		double image2 = a.getImage();
		double newReal = real + real2;
		double newImage = image + image2;
		Complex result = new Complex(newReal,newImage);
		return result;
	}
	
	Complex sub(Complex a){ // �������
		double real2 = a.getReal();
		double image2 = a.getImage();
		double newReal = real - real2;
		double newImage = image - image2;
		Complex result = new Complex(newReal,newImage);
		return result;
	}
	
	Complex mul(Complex a){ // �������
		double real2 = a.getReal();
		double image2 = a.getImage();
		double newReal = real*real2 - image*image2;
		double newImage = image*real2 + real*image2;
		Complex result = new Complex(newReal,newImage);
		return result;
	}
	
	Complex div(Complex a){ // �������
		double real2 = a.getReal();
		double image2 = a.getImage();
		double newReal = (real*real2 + image*image2)/(real2*real2 + image2*image2);
		double newImage = (image*real2 - real*image2)/(real2*real2 + image2*image2);
		Complex result = new Complex(newReal,newImage);
		return result;
	}
	
	public void print(){ // ���
		if(image > 0){
			System.out.println(real + " + " + image + "i");
		}else if(image < 0){
			System.out.println(real + "" + image + "i");
		}else{
			System.out.println(real);
		}
	}
}

public class Xiaolusss { // ���ڲ��Ը�����
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���û������һ��������ʵ�����鲿:");
        Complex data1 = new Complex();
        System.out.println("���û�����ڶ���������ʵ�����鲿:");
        Complex data2 = new Complex();
       
        // ���·ֱ�Ϊ�Ӽ��˳�
        Complex result_add = data1.add(data2);
        Complex result_sub = data1.sub(data2);
        Complex result_mul = data1.mul(data2);
        Complex result_div = data1.div(data2);
        
        result_add.print();
        result_sub.print();
        result_mul.print();
        result_div.print();
	}
}
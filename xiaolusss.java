public class xiaolusss{
	static class Julong{//����������
		float a = 1;
	}
	static class Shenxianshui{//Ѫƿ�ظ�ָ��
		float ip = 2;
	}
	public static void main (String[] args) {
		float x;//Ů��Ѫ��
		float i, j, z;
		Julong jianxue = new Julong();
		Shenxianshui jiaxue = new Shenxianshui();
		for(i = 0; i < 5; i += jianxue.a) {//�������˺�
			;
		}
		for(j = 1; j < 2*2*2*2*2; j *= jiaxue.ip) {//Ѫƿ�����Ʊ���
			;
		}
		x = i / j;
		z = i - x;
		System.out.println("�������˺�Ϊ�� " + i);
		System.out.println("Ѫƿ��������Ϊ��" + z);
		System.out.println("Ů��Ѫ��Ϊ��" + x);
	}
}
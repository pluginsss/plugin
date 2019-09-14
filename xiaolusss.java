public class xiaolusss{
	static class Julong{//巨龙攻击力
		float a = 1;
	}
	static class Shenxianshui{//血瓶回复指数
		float ip = 2;
	}
	public static void main (String[] args) {
		float x;//女警血量
		float i, j, z;
		Julong jianxue = new Julong();
		Shenxianshui jiaxue = new Shenxianshui();
		for(i = 0; i < 5; i += jianxue.a) {//巨龙总伤害
			;
		}
		for(j = 1; j < 2*2*2*2*2; j *= jiaxue.ip) {//血瓶总治疗倍数
			;
		}
		x = i / j;
		z = i - x;
		System.out.println("巨龙总伤害为： " + i);
		System.out.println("血瓶总治疗量为：" + z);
		System.out.println("女警血量为：" + x);
	}
}
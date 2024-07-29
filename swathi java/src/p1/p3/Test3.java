package p1.p3;

import p1.Test1;

public class Test3 {
			public void mul(int x,int y) {
			System.out.println("multiplication is :" + (x*y));
			}
			public static void main(String[] args)	{
				Test1 obj=new Test1();
				Test3 obj1=new Test3();
				obj.sum(5, 6);
				obj1.mul(10,2);
			}
}

package cn.tedu;

public class Ha {
	class A{//爷爷
		int a;
		public A(int a){//原则：就近原则 离这个变量最近的上边大括号
			this.a = a;
			System.out.println("A");
		}
		public A(){}
	}
	class B extends A{//爸爸
		int b;
		public B(){//构造方法  第一行  默认会有一个super()
			super();
			b = super.a;
		}
	}
	class C extends B{//儿子
		
	}

	class D{//捡来的
	
	}
	public static void main(String[] args) {
		
	}
	
	
}


public class TestString1
{	public static void main(String[] args)
	{	String s1 = "Computer Science";
		int x = 595;
		String s2 = s1 + " " + x;
		String s3 = s2.substring(10,17);
		String s4 = "is fun";
		String s5 = s2 + s4;
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
		System.out.println("s4: " + s4);
		System.out.println("s5: " + s5);
		
		//showing effect of precedence
		
		x = 3;
		int y = 5;
		String s6 = x + y + "total";
		String s7 = "total " + x + y;
		String s8 = " " + x + y + "total";
		System.out.println("s6: " + s6);
		System.out.println("s7: " + s7);
		System.out.println("s8: " + s8);
	}
}

/*

Symbolic Resolution（符号解析） ✅
测试字符串常量池（String Pool）
代码中 s1 = "Computer Science"，s4 = "is fun" 这些字符串存储在字符串常量池中。
s2 = s1 + " " + x; 需要解析 s1 和 x，然后进行拼接，涉及 符号解析（s1 解析为 String 类型，x 解析为 int 并隐式转换）。
JVM 需要将符号引用解析为实际的内存地址，并确保 s1、s4 等字符串在常量池中的唯一性（字符串驻留机制）。

Bytecode Interpretation（字节码解释） ✅
测试 + 操作符的字节码执行方式
s2 = s1 + " " + x; 的 + 运算符在 Java 代码中表示字符串拼接，但 JVM 实际上会使用 StringBuilder.append()。
s3 = s2.substring(10, 17); 测试 substring() 方法的字节码执行，不同 JDK 版本可能有不同的实现（JDK 6 之前 substring() 共享原始 char[]，JDK 7+ 创建新 String）。
s6 = x + y + "total"; 和 s7 = "total " + x + y; 体现 运算符优先级，测试 字节码解释器如何解析字符串和整数的运算顺序。


*/
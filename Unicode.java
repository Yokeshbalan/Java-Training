import java.io.*;
class Unicode {
	public static void main(String[] args)
	{
		String str = "JAVA";
	int result_1 = str.codePointAt(0);
		int result_2 = str.codePointAt(1);
		int result_3 = str.codePointAt(2);
		int result_4 = str.codePointAt(3);
		System.out.println("Original String : " + str);
		System.out.println(result_1+” “ +result_2+” ”+result_3+” ”+result_4);
	}
}

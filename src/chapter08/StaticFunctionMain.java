package chapter08;

public class StaticFunctionMain {

	public static void main(String[] args) {
		//��ü�� ����
		StaticFunction st=new StaticFunction();
		System.out.println(st.str2);
		String s=st.getStatic();
		System.out.println(s);
		//Ŭ���� ������ ����
		String str;
		str=StaticFunction.getStatic();
		System.out.println(str);
		
		
		//StaticFunction.add �� ������ �ʰ� st.add �� ���´�.
		//static �޼ҵ� ������ Ŭ���� ������ ������ �����ϴ�.
	}

}

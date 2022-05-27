import java.util.Scanner;

public class StackManager {
	public static void main(String []args) {
		Scanner st = new Scanner(System.in);
		
		String ob = st.nextLine();
		String [] arr = ob.split(" ");
		
		StringStack stack = new StringStack(arr.length);
		int len = stack.length();
		//���ڿ��� �Է¹ް� push�� ���ڿ� stack�� ����
		
		for(int i = 0; i < len; i++){
			if(!stack.push(arr[i])) {
				System.out.println("������ ������ �Ѱ�ġ�� �����߽��ϴ�.");
				break;
			}
			
		}
		
		//pop�� ���� stack�� ����� �������� s ���
		for(int i = 0; i < len ; i ++) {
			if(len < i) {
				System.out.println("�ִ� ���� ���� �ε������� �Ѿ����ϴ�.");
				break;
			}
			String s= stack.pop();
			System.out.print(s + " ");
		}
		/*
		for(int i = 0; i < stack.length() ; i ++) {
			String s= stack.pop();
			System.out.print(s + " ");
		}
		*/
		st.close();
	}
}

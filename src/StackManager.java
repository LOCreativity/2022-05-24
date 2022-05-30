import java.util.Scanner;

public class StackManager {
	public static void main(String []args) {
		Scanner st = new Scanner(System.in);
		
		String ob = st.nextLine();
		String [] arr = ob.split(" ");
		
		StringStack stack = new StringStack(arr.length);
	
		//문자열을 입력받고 push로 문자열 stack에 저장
		
		for(int i = 0; i < arr.length; i++){
			if(!stack.push(arr[i])) {
				System.out.println("정해진 스택의 한계치에 도달했습니다.");
				break;
			}
			
		}
		
		//pop에 의해 stack에 저장된 역순으로 s 출력
		for(int i = 0; i < stack.length() ; i ++) {
			String s= stack.pop();
			if(s == null){
				System.out.println("스택이 비어있습니다.");
				break;
			}
			System.out.print(s + " ");
		}
		
		st.close();
	}
}

class StringStack extends stack{
	
	private int count = 0; //데이터 개수
	private int num;
	private int top = -1;
	private String[] stack;
	
	public StringStack(int num) {
		this.num = num;
		this.stack = new String[num];
	}
	//데이터의 개수를 출력 수정
	int length() {
		return this.count;
	}
	//팝의 index와 push의 index가 다를 경우 수정(모르겠음)
	String pop() {
		// stack배열 반대순으로 출력
		if(!(this.top == -1)) {
			String s = this.stack[this.top--];
			return s;
		}
		else
			return null;
	}
	boolean push(String ob) {
		//입력된 문자열 stack배열에 저장
		if(!(this.top == this.num - 1)) {
			this.stack[++this.top] = ob;
			if(!ob.equals(null))
				this.count++;
			return true;
		}
		else
			return false;
		
	}
}

class StringStack extends stack{
	
	private int num;
	private int top = 0;
	private String[] stack;
	
	public StringStack(int num) {
		this.num = num;
		this.stack = new String[num];
	}
	//데이터의 개수를 출력 수정
	int length() {
		return this.top;
	}
	String pop() {
		// stack배열 반대순으로 출력
		if(!(this.top <= 0)) {
			String s = this.stack[--this.top];
			return s;
		}
		else
			return null;
	}
	boolean push(String ob) {
		//입력된 문자열 stack배열에 저장
		if(!(this.top >= this.num)) {
			this.stack[this.top++] = ob;
			return true;
		}
		else
			return false;
		
	}
}

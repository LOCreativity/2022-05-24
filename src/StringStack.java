class StringStack extends stack{
	
	private int num; //데이터 개수
	private int index;
	private String[] stack;
	
	public StringStack(int num) {
		this.num = num;
		this.index = 0;
		this.stack = new String[num];
	}
	//데이터의 개수를 출력 수정
	int length() {
		return this.num;
	}
	//팝의 index와 push의 index가 다를 경우 수정(모르겠음)
	String pop() {
		// stack배열 반대순으로 출력
		//this.num = this.index;
		this.index--;
		String s = this.stack[this.index];
		return s;
			
	}
	boolean push(String ob) {
		//입력된 문자열 stack배열에 저장
		if(this.index < this.num) {
			this.stack[this.index] = ob;
			this.index++;
			return true;
		}
		else
			return false;
	}
}

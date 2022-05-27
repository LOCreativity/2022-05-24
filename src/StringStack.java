class StringStack extends stack{
	
	private int num; //������ ����
	private int index;
	private String[] stack;
	
	public StringStack(int num) {
		this.num = num;
		this.index = 0;
		this.stack = new String[num];
	}
	//�������� ������ ��� ����
	int length() {
		return this.num;
	}
	//���� index�� push�� index�� �ٸ� ��� ����(�𸣰���)
	String pop() {
		// stack�迭 �ݴ������ ���
		//this.num = this.index;
		this.index--;
		String s = this.stack[this.index];
		return s;
			
	}
	boolean push(String ob) {
		//�Էµ� ���ڿ� stack�迭�� ����
		if(this.index < this.num) {
			this.stack[this.index] = ob;
			this.index++;
			return true;
		}
		else
			return false;
	}
}

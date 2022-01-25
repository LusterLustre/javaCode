package JavaTest;

class App_By_stack implements Make_Stack {
	
	String arr[];
	int top = 0;
	int[] ttop = new int[top];

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return top;
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return top;
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		int tmp = top;
		top++;
		return arr[tmp];
	}

	@Override
	public boolean push(String val) {
		// TODO Auto-generated method stub
		if (top > 0) {
			arr[top-1] = val;
			top--;
			return true;
		}
		else
			return false;
	}

}


public class intstack {
private int stack[];
private int top;
private int size;
public intstack() {
	size=50;
	top=-1;
	stack=new int[size];
}
	public intstack(int size) {
		this.size=size;
		top=-1;
		stack=new int [this.size];
	}
//is full
	public boolean full() {
		return top==stack.length-1;
	}
	
	//push
	public boolean push(int item) {
		if(!full()) {
			top++;
			stack[top]=item;
			return true;
		}
		else
			return false;
	}
	
	//is empty
	
	public boolean empty() {
		return top==-1;
		
	}
	
	
	
	//pop
	
	public int pop() {
		if(!empty()) {
			return stack[top--];
		}
		else return 0;
		
	}
	
}


public class mainn {
	public static void main(String args[]) {
		intstack obj=new intstack();
		obj.push(2);
		obj.push(3);
		obj.push(7);
		obj.push(9);
		
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
	}
}

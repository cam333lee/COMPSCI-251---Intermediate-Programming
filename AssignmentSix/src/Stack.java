public class Stack extends DynArray{
	
	//default constructor
	public Stack() {
		super();
	}
	
	public int size() {
		return super.arraySize();
	}
	
	public boolean isEmpty() {
		return size() == 1 && super.elements() == 0;
	}
	
	public void push(double value) {
		super.insert(value);
		//System.out.print("Pushed Value is: " + value);
	}
	
	public double pop() {
		//System.out.println("In pop");
		if (!isEmpty()) {
			return super.remove();
		} else {
			return Double.NaN;
		}
	}
	
	public void stackDump() {
		for(int i = super.elements() - 1; i >= 0; --i) {
			System.out.println(super.at(i));
		}
	}
	
}

public class Queue extends DynArray{

	public Queue() {
		super();
	}
	
	public int size() {
		return super.arraySize();
	}
	
	public boolean isEmpty() {
		return size() == 1 && super.elements() == 0;
	}
	
	public void que(double value) {
		super.insert(value);
	}
	
	public double deQue() {
		if(!isEmpty()) {
			return super.removeAt(0);
		} else {
			return Double.NaN;
		}
	}
	
	public void queueDump() {
		super.printArray();
	}
}

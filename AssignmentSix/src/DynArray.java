public class DynArray {
	  private double[] array;
	  private int size; //to keep track of the size of the array
	  private int nextIndex; //to keep track of the nextIndex number in the array (Size of the array is nextIndex - 1)
	  
	  public int arraySize()
	  {
		  return this.size;
	  }
	  
	  public int elements()
	  {
		  return this.nextIndex;
	  }
	  
	  public double at(int index) {
		  if (0 <= index && index < nextIndex) {
			  return array[index];
		  } else {
			  return Double.NaN;
		  }
	  }
	   
	  public DynArray()
	  {
		  this.array = new double[1];
		  this.size = 1;
		  this.nextIndex = 0;
	  }
	  
	  private void grow()
	  {
		  
		  double[] newArray = new double[this.size *2];
		  for(int i = 0; i <= (this.nextIndex - 1); ++i) {
			  //System.out.println("this.array at [" + i + "] is: " + this.array[i]);
			  //this.array[i] = newArray[i];
			  newArray[i] = this.array[i];
			  
			  //System.out.println("New value at element " + i + ": " + newArray[i]);
		  }
		  
		  this.array = newArray; //assign array address to this new array that was created 
		  this.size = this.size * 2;
	  }
	  private void shrink()
	  {
		  
		  double[] newArray = new double[this.size / 2];
		  
		 
		  //for(int i = 0; i <= (this.size/2) - 1; ++i) {
		  for(int i = 0; i <= (this.size/2) - 1; ++i) {
			  //System.out.println("The value at " + i + " = " + this.array[i]);
			  newArray[i] = this.array[i];
			  //System.out.println("New value at element " + i + ": " + newArray[i]);
		  }
		  
		  this.array = newArray; //assign array address to this new array that was created 
		  this.size = this.size / 2;
	
	  }
	  
	  public void insertAt(int index, double value) {
		  if(index >= 0 && index <= this.nextIndex) {
			  if(elements() == arraySize()) { //if the current size and index are the same 
				  grow(); //grow the array to fit another element
			  }
			  
//			  for(int i = 0; i <= this.nextIndex - 1; ++i) {
//				  //System.out.println(this.array[i]);
//			  }
			  
			  if(index == this.nextIndex) { //check to see if it is being added to the back
				  this.array[index] = value;
				  ++this.nextIndex;
			  } else {
				  double[] insertingArray = new double[this.size];				  
				  
				  for(int i = 0; i < index; ++i) {
					  insertingArray[i] = this.array[i];
				  }
				  
				  for(int i = (index + 1); i <= this.nextIndex; ++i) {
					  insertingArray[i] = this.array[i - 1];
				  }
				  
				  this.array =insertingArray;
				  this.array[index] = value; //need to set the value of the index 
				 
				  ++this.nextIndex;
			  }   
		  } 
	  }
	  
	  public void insert(double value) {
		  insertAt(nextIndex, value);
//		  array[this.nextIndex] = value;
//		  ++this.nextIndex;
	  }
	  
	  public double removeAt(int index) {
		  
		  if(index >= 0 && index < this.nextIndex) {
			  
			  double saveVal = this.array[index]; //save the value of the 
			  //System.out.println("The value of saveVal is: " + saveVal);
			  for(int i = index; i < this.nextIndex - 1; ++i) {
				  //System.out.println(this.array[i]);
				  //System.out.println(this.array[i+1]);
				  this.array[i] = this.array[i+1];
			  }
			  
			  this.array[nextIndex - 1] = Double.NaN;
			  
			  
			  if((arraySize() / elements()) == 2) {
				  shrink();
			  }
			  
			  --this.nextIndex;
			  return saveVal;


		  } else {
			return Double.NaN;  
		  }
	  }
	  
	  public double remove() {
		  return removeAt(this.nextIndex - 1);
	  }
	  
	  public void printArray() {
		  for(int i = 0; i <= elements() - 1; ++i) {
			  System.out.println(this.array[i]);
		  }
	  }
}


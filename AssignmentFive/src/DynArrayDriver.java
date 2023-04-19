
public class DynArrayDriver {

	public static void main(String[] args) {
		DynArray myArray = new DynArray();
		System.out.println("size = " + myArray.arraySize());
		System.out.println("elements = " + myArray.elements());
		System.out.println("\n");
		
		//Growing
		System.out.println("Starting to grow!");
		System.out.println("\n");

		int pot = 1;
		for (int v = 0; v < 10; ++v)
		{
		myArray.insert(pot);
		System.out.println("myArray.at(" + v + ") = " + myArray.at(v));
		System.out.println("size = " + myArray.arraySize());
		System.out.println("elements = " + myArray.elements() + "\n");
		pot *= 2;
		}
		/*System.out.println("myArray.at(10) = " + myArray.at(10));
		System.out.println("\n");
		
		System.out.println("\n\nREMOVING\n\n");
		//Shrinking
		for (int v = 0; v < 10; ++v)
		{
		double value = myArray.remove();
		System.out.println("value = " + value);
		System.out.println("size = " + myArray.arraySize());
		System.out.println("elements = " + myArray.elements() + "\n");
		}
		double value = myArray.remove();
		System.out.println("value = " + value);
		System.out.println("size = " + myArray.arraySize());
		System.out.println("elements = " + myArray.elements());
		System.out.println("\n");
		
		for (int i = 0; i < 5; ++i)
		{
		myArray.insertAt(i, 3 * i);
		System.out.println("myArray.at(" + i + ") = " + myArray.at(i));
		System.out.println("size = " + myArray.arraySize());
		System.out.println("elements = " + myArray.elements() + "\n");
		}
		
		System.out.println();*/
		
		myArray.insertAt(2, 896);
		myArray.printArray();
		
		myArray.removeAt(2);
		myArray.printArray();
		
		myArray.remove();
		myArray.printArray();

//		value = myArray.removeAt(2);
//		System.out.println("value = " + value);
//		System.out.println("size = " + myArray.arraySize());
//		System.out.println("elements = " + myArray.elements() + "\n");
//		myArray.printArray();
//		System.out.println();
//		value = myArray.removeAt(4);
//		System.out.println("value = " + value);
//		System.out.println("size = " + myArray.arraySize());
//		System.out.println("elements = " + myArray.elements() + "\n");
	}
	
}

/*OUTPUT
 * 
 *size = 1
		 elements = 0


		 Starting to grow!


		 myArray.at(0) = 1.0
		 size = 1
		 elements = 1

		 myArray.at(1) = 2.0
		 size = 2
		 elements = 2

		 myArray.at(2) = 4.0
		 size = 4
		 elements = 3

		 myArray.at(3) = 8.0
		 size = 4
		 elements = 4

		 myArray.at(4) = 16.0
		 size = 8
		 elements = 5

		 myArray.at(5) = 32.0
		 size = 8
		 elements = 6

		 myArray.at(6) = 64.0
		 size = 8
		 elements = 7

		 myArray.at(7) = 128.0
		 size = 8
		 elements = 8

		 myArray.at(8) = 256.0
		 size = 16
		 elements = 9

		 myArray.at(9) = 512.0
		 size = 16
		 elements = 10

		 myArray.at(10) = NaN




		 REMOVING


		 value = 512.0
		 size = 16
		 elements = 9

		 value = 256.0
		 size = 16
		 elements = 8

		 value = 128.0
		 size = 8
		 elements = 7

		 value = 64.0
		 size = 8
		 elements = 6

		 value = 32.0
		 size = 8
		 elements = 5

		 value = 16.0
		 size = 8
		 elements = 4

		 value = 8.0
		 size = 4
		 elements = 3

		 value = 4.0
		 size = 4
		 elements = 2

		 value = 2.0
		 size = 2
		 elements = 1

		 value = 1.0
		 size = 1
		 elements = 0

		 value = NaN
		 size = 1
		 elements = 0


		 myArray.at(0) = 0.0
		 size = 1
		 elements = 1

		 myArray.at(1) = 3.0
		 size = 2
		 elements = 2

		 myArray.at(2) = 6.0
		 size = 4
		 elements = 3

		 myArray.at(3) = 9.0
		 size = 4
		 elements = 4

		 myArray.at(4) = 12.0
		 size = 8
		 elements = 5

		 array.at(0) = 0.0
		 array.at(1) = 3.0
		 array.at(2) = 6.0
		 array.at(3) = 9.0
		 array.at(4) = 12.0

		 value = 6.0
		 size = 8
		 elements = 4

		 array.at(0) = 0.0
		 array.at(1) = 3.0
		 array.at(2) = 9.0
		 array.at(3) = 12.0

		 value = NaN
		 size = 8
		 elements = 4


 */


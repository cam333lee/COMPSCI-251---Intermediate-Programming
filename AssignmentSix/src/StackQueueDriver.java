
public class StackQueueDriver {
	public static void main(String[] args)
	{
		//System.out.print("About to create stack and queue stuff");
		Stack myStack = new Stack();
		Queue myQueue = new Queue();
		System.out.println("Filling Stack:");
		
		//System.out.print(myStack.());
		
		double value;
		for (int s = 1; s < 11; ++s)
		{
			value = s + s/10.0;
			System.out.println("pushing " + value);
			myStack.push(value);
		}
		System.out.println("\nStack Dump:");
		myStack.stackDump();
		System.out.println("\nEmptying Stack:");
		while(!myStack.isEmpty()) //not working because the size minimum value is 1
		{
			value = myStack.pop();
			System.out.println("pop = " + value);
		}
		System.out.println("\nStack Dump:");
		myStack.stackDump();
		System.out.println("\nA pop too far = " + myStack.pop());
		System.out.println("\n");
		System.out.println("Filling Queue:");
		for (int q = 1; q < 11; ++q)
		{
			value = 2*q + q/10.0;
			System.out.println("queing " + value);
			myQueue.que(value);
		}
		System.out.println("\nQueue Dump:");
		myQueue.queueDump();
		System.out.println("\nEmptying Queue:");
		while(!myQueue.isEmpty())
		{
			value = myQueue.deQue();
			System.out.println("deQue = " + value);
		}
		System.out.println("\nQueue Dump:");
		myQueue.queueDump();
		System.out.println("\nA deQue too far = " + myQueue.deQue());
	}
}

/*
 * OUTPUT
 * 
 * Filling Stack:
pushing 1.1
pushing 2.2
pushing 3.3
pushing 4.4
pushing 5.5
pushing 6.6
pushing 7.7
pushing 8.8
pushing 9.9
pushing 11.0

Stack Dump:
11.0
9.9
8.8
7.7
6.6
5.5
4.4
3.3
2.2
1.1

Emptying Stack:
pop = 11.0
pop = 9.9
pop = 8.8
pop = 7.7
pop = 6.6
pop = 5.5
pop = 4.4
pop = 3.3
pop = 2.2
pop = 1.1

Stack Dump:

A pop too far = NaN


Filling Queue:
queing 2.1
queing 4.2
queing 6.3
queing 8.4
queing 10.5
queing 12.6
queing 14.7
queing 16.8
queing 18.9
queing 21.0

Queue Dump:
2.1
4.2
6.3
8.4
10.5
12.6
14.7
16.8
18.9
21.0

Emptying Queue:
deQue = 2.1
deQue = 4.2
deQue = 6.3
deQue = 8.4
deQue = 10.5
deQue = 12.6
deQue = 14.7
deQue = 16.8
deQue = 18.9
deQue = 21.0

Queue Dump:

A deQue too far = NaN

 * 
 */

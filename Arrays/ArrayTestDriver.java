package chap2;

public class ArrayTestDriver {

	public static void main(String[] args) {
		Array arr = new Array(10);
		arr.add(5);
		arr.add(5);
		arr.add(5);
		arr.add(5);
		arr.insert(2, 3);
		arr.printArray();
		
		System.out.println("\n****************");
        arr.remove(1);
        arr.printArray();
        System.out.println("\n****************");

        arr.add(6);
        arr.insert(2, 8);
        arr.printArray();
        System.out.println("\n****************");
        arr.remove(1);
        arr.printArray();

        
	}

}

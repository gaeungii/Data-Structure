package chap2;

public class ArrayTestDriver {
	public static void main(String[] args) {
		Array arr = new Array(10);
		arr.add(5);
		arr.add(5);
		arr.add(5);
		arr.add(5);
		arr.insert(2, 3);
		System.out.print("Array : ");
		arr.printArray();
		
		arr.remove(1);
                System.out.print("Array : ");
                arr.printArray();

                arr.add(6);
                arr.insert(2, 8);
                System.out.print("Array : ");
                arr.printArray();
        
                arr.remove(1);
                System.out.print("Array : ");
                arr.printArray();

        
	}

}

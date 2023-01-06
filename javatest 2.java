3] generalized class is nothing but inbuild classes in java, were its provides from object 
   specilaized class is nothing but were developer has to write and excigute,
    ex for generalized class is String,Double,etc
    ex for specilaized class is developer writen codes. 
    Generalization is a bottom-up design process .
	Specialization is a top-down design process	.
	
	
4] a] i wil do interfacse.
   b] final classes String,System,Abstract,Scanner
   c] Alternative for inheritense is Interface.
   
   
5] Comparater.sorted we used.

6]Arraylist
     It stores elements in contiguous memory locations.
     This means the specific elements can be accessed using easily calculable addresses.
     It provides fast access to find element at a specific index.
     Size can’t be altered during runtime.
     This would overwrite the data.
Linked List
     They are less rigid, elements can be stored in non-contiguous locations.
     They require additions values to reference the next element.
     Every node in the linked list points to the next element in the linked list.
     Since they are non-contiguous, the size of the linked list can be altered at run-time.
     Memory is allocated to linked list at run time.
     Operations like insertion or deletion are quick in linked list
	 
	 
7]Iterator
  Iterator we can traverse the list of objects in forward direction
  Iterator can be used for traversing Set, List and Map
  We cannot obtain indexes while using Iterator.
  We cannot replace the existing element value when using Iterator
ListIterator
  ListIterator can traverse the collection in both directions that is forward as well as backward
  ListIterator can only be used for traversing a List
  We can add element at any point of time while traversing a list using ListIterator.
  But in ListIterator we can replace the last element returned by next() or previous() methods by using set(E e) method
  
  
 8]Covariant maethod is Super() method
 where it get implimatntation from base classes ;
 
9]Memory leak 
   In Java, the memory leak is a situation when the garbage collector does not recognize the unused objects and they remain in the memory indefinitely that reduces the amount of memory allocated to the application. Because the unused objects still being referenced that may lead to OutOfMemoryError. It also affects the reliability of the application.

10]Static polymorhism 
     is nothing but method overloding 
	 wher it is compiletime polymorhism
	 method overloding is same method name different in parameters is called methodo overloding.
	 
	 Dynamic polymorhism 
	 is nothing but method overriding
	 where it is runtime polymorhism
	 method overriding is same method name in different classes were inheritening from super class 
	 
	 
11] Heama can use  encapsulation  to hide her information

1]     public static void main(String[] args) {
		int[] values = { 45, 333, 900, 23, 76, 29, 474, 654, 29, 454 };
		int temp = 0;
		for (int i = 0; i < values.length - 1; i++) {
			for (int j = i + 1; j < values.length - 1; j++) {
				if (values[i] < values[j]) {
					temp = values[i];
					values[i] = values[j];
					values[j] = temp;

				}

			}
		}
		for (int k = 0; k < values.length; k++) {
			// System.out.println(values[k]);
			if (k == 0) {
				System.out.println("Max ->" + values[k]);

			}
			if (k == 8) {
				System.out.println("Min ->" + values[k]);
			}
		}
2]//2
		int[] flowers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < flowers.length; i++) {
			if (flowers[i] % 2 == 0) {

				System.out.println("Love is true");
			} else {
				System.out.println("Love is not true");
			}

		}
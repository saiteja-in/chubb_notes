class Parent{
	public static void display() {
		System.out.println("inside parent");
	}
}
class Child extends Parent{
	public static void display() {
		System.out.println("inside child");
	}
	
}

public class BothStatic {
	
	public static void main(String[]args) {
		Parent p=new Child();
		p.display();
	}

	
}


//
//Non-static methods are virtual — resolved at runtime based on the actual object.
//
//The object is a Child, so Child.greet() executes.

//Static methods are resolved at compile time, based on the reference type, not the object type.
//
//p is of type Parent, so the compiler binds Parent.display() — even though the actual object is a Child.
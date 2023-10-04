import java.util.*;

public class Hello {
	public static void main() {
		System.out.println("Wrong method");
	}

	public static void main(String x) {
		System.out.println("String parameter");
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}


		System.out.println("names array");
		String[] names = {"Quick","Brown","Fox","Jumps","Over","The","Lazy","Dog"};
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}

		Date now = new Date();
		System.out.println(now);
	}

}

class Subsidary {
	public static void main(String[] args) {
		Hello.main();
		//Hello.main(10);
	}
}
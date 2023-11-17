What will happen when you compile?

1.	Question-1
	Sample.java
	public abstract class Sample {
		public String welcome() {
			System.out.println("Hello World");
			return null;
		}

		public abstract void calculate();
	}

	Example.java
	public class Example extends Sample {
		static int i = 20;
		static int j = 30;

		public static void main(String[] args) {
			System.out.println("Running Sample class");
			calculate();
		}

		public static void calculate() {
			double x = i + j;
			System.out.println(x);
		}
	}


2:	Question-2
	public abstract class Simple {
		public void go() {
			System.out.println("go");
		}

		public final void run() {
			System.out.println("run");
		}

		public abstract void jump();
	}

	class Simulation extends Simple {
		public void jump() {
			System.out.println("jump");
		}

		public void run() {
			System.out.println("start");
		}
	}

3:	Question-3

	import java.io.PrintStream;

	class Print {
		public static void main(String[] args) {
			PrintStream x = System.out;
			x.println("Print");
		}
	}

4:	Question-4
	public class Output {
		public static void main(String[] args) {
			File f = new File("outFile.sys");
			OutputStream o = new FileOutputStream(f);
			PrintStream x = new PrintStream(o);
			x.println("Print");
		}
	}

5:	Question-5

	public class Overloading {
		public static void main() {
			System.out.println("main()");
		}
		public static void main(int i) {
			System.out.println("main(int)");
		}
		public static void main(String x) {
			System.out.println("main(String)");
		}
		public static void main(String[] args) {
			System.out.println("main(String[])");
		}
	}

	public class Run {
		public static void main(String args[]) {
			Overloading.main(new String[] {"1","2","3","4"});
		}
	}

6:	Question-6
	public class Important {
		public static void main(String[] args[]) {
		}

		public static void main(String[] args) {
		}

		public static void main(String args[]) {
		}
	}

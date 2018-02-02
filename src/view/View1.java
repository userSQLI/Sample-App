public class View1 {

	static int hello;

	private static int div(int a, int b) {
		return a / b;
	}

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int subs(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

      String message = "Hello world";
      System.out.println(message);
      int a=5;
      int b=6;
      System.out.println("Addition: "add(a,b));
      System.out.println("Multiply: "multiply(a,b));
      System.out.println("Subs: "subs(a,b));

  }

}

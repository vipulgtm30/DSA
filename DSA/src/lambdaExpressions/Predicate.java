package lambdaExpressions;

/*
 * Predicate -> one parameter returns boolean
 * use only if you have conditional checks in your program...
 * */

public class Predicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Example 1:");
		// Example 1
		java.util.function.Predicate<Integer> p = i -> (i > 10);

		System.out.println(p.test(10)); // false
		System.out.println(p.test(20)); // true

		System.out.println();

		System.out.println("Example 2:");
		// Example 2: check the length of tgiven string is greater than 4 or not
		java.util.function.Predicate<String> pString = s -> (s.length() > 4);
		System.out.println(pString.test("Welcom"));

		System.out.println();

		System.out.println("Example 3:");
		// Example 3: Print array elements whose size is > 4 from Array
		String names[] = { "David", "Scott", "Smith", "John", "Mary" };
		for (String name : names) {
			if (pString.test(name)) {
				System.out.println(name);
			}
		}

	}

}

package soen.tutorial;

public class ArithmeticOperations {

	public Integer addOrSub(Integer a, Integer b)
	{
		if (a > b) {
			return a - b;
		} else {
			return a + b;
		}
	}
	
	public Integer multiply(int a, int b) {
        // Side effect to prevent optimization
        System.out.print("");  // ensures method is kept
        return a * b;
    }
}

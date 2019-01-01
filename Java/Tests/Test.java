package Tests;
import Stacks.Stack;

public class Test{

	private static boolean IntegerStackTest(){
		Stack<Integer> integerStack = new Stack<>();
		if (integerStack != null){
			return true;
		}
		return false;
	}

	private static boolean StringStackTest(){
		Stack<String> stringStack = new Stack<>();
		if (stringStack != null){
			return true;
		}
		return false;
	}

	private static boolean FloatStackTest(){
		Stack<Float> floatStack = new Stack<>();
		if (floatStack != null){
			return true;
		}
		return false;
	}

	private static boolean DoubleStackTest(){
		Stack<Double> doubleStack = new Stack<>();
		if (doubleStack != null){
			return true;
		}
		return false;
	}

	private static boolean LongStackTest(){
		Stack<Long> longStack = new Stack<>();
		if (longStack != null){
			return true;
		}
		return false;
	}


	private static boolean PopulateInteger(){
		int[] insert = {1, 2, 3, 4};
		Stack<Integer> integerStack = new Stack<>();
		for (int i = 0; i < insert.length; i++){
			integerStack.push(insert[i]);
		}
		if (integerStack.getSize() == 4){
			return true;
		}
		return false;
	}

	private static boolean PopulateString(){
		String[] insert = {"1", "2", "3", "4"};
		Stack<String> stringStack = new Stack<>();
		for (int i = 0; i < insert.length; i++){
			stringStack.push(insert[i]);
		}
		if (stringStack.getSize() == 4){
			return true;
		}
		return false;
	}

	private static boolean PopulateFloat(){
		float[] insert = {1, 2, 3, 4};
		Stack<Float> floatStack = new Stack<>();
		for (int i = 0; i < insert.length; i++){
			floatStack.push((float)(insert[i]));
		}
		if (floatStack.getSize() == 4){
			return true;
		}
		return false;
	}

	private static boolean PopulateDouble(){
		double[] insert = {1.2, 2.2, 3.2, 4.2};
		Stack<Double> doubleStack = new Stack<>();
		for (int i = 0; i < insert.length; i++){
			doubleStack.push(insert[i]);
		}
		if (doubleStack.getSize() == 4){
			return true;
		}
		return false;
	}

	private static boolean PopulateLong(){
		long[] insert = {10, 20, 30, 40};
		Stack<Long> longStack = new Stack<>();
		for (int i = 0; i < insert.length; i++){
			longStack.push(insert[i]);
		}
		if (longStack.getSize() == 4){
			return true;
		}
		return false;

	}


	private static boolean ExpandInteger(){
		Stack<Integer> integerStack = new Stack<>();
		int[] insert = {1, 2, 3, 4, 5, 6};
		for (int i = 0; i < insert.length; i++){
			integerStack.push(insert[i]);
		}
		if (integerStack.getCapacity() == 20){
			return true;
		}
		return false;

	}

	private static boolean ExpandString(){
		Stack<String> stringStack = new Stack<>();
		String[] insert = {"1", "2", "3", "4", "5", "6"};
		for (int i = 0; i < insert.length; i++){
			stringStack.push(insert[i]);
		}
		if (stringStack.getCapacity() == 20){
			return true;
		}
		return false;
	}

	private static boolean ExpandFloat(){
		Stack<Float> floatStack = new Stack<>();
		float[] insert = {1, 2, 3, 4, 5, 6};
		for (int i = 0; i < insert.length; i++){
			floatStack.push(insert[i]);
		}
		if (floatStack.getCapacity() == 20){
			return true;
		}
		return false;
	}

	private static boolean ExpandDouble(){
		Stack<Double> doubleStack = new Stack<>();
		double[] insert = {1, 2, 3, 4, 5, 6};
		for (int i = 0; i < insert.length; i++){
			doubleStack.push(insert[i]);
		}
		if (doubleStack.getCapacity() == 20){
			return true;
		}
		return false;
	}

	private static boolean ExpandLong(){
		Stack<Long> longStack = new Stack<>();
		long[] insert = {1, 2, 3, 4, 5, 6};
		for (int i = 0; i < insert.length; i++){
			longStack.push(insert[i]);
		}
		if (longStack.getCapacity() == 20){
			return true;
		}
		return false;
	}

	private static boolean PopInteger(){
		Stack<Integer> integerStack = new Stack<>();
		int[] insert = {1, 2, 3, 4, 5, 6};
		for (int i = 0; i < insert.length; i++){
			integerStack.push(insert[i]);
		}


		for (int i = insert.length; i < 0; i--){
			if (integerStack.pop() != insert[i]){
				return false;
			}
		}
		return true;
	}

	private static boolean PopString(){
		Stack<String> stringStack = new Stack<>();
		String[] insert = {"1", "2", "3", "4", "5", "6"};
		for (int i = 0; i < insert.length; i++){
			stringStack.push(insert[i]);
		}

		for (int i = insert.length; i < 0; i--){
			if(stringStack.pop() != insert[i]){
				return false;
			}
		}
		return true;
	}

	private static boolean PopFloat(){
		Stack<Float> floatStack = new Stack<>();
		float[] insert = {1, 2, 3, 4, 5, 6};
		for (int i = 0; i < insert.length; i++){
			floatStack.push(insert[i]);
		}

		for (int i = insert.length; i < 0; i--){
			if (floatStack.pop() != insert[i]){
				return false;
			}
		}
		return true;
	}

	private static boolean PopDouble(){
		Stack<Double> doubleStack = new Stack<>();
		double[] insert = {1, 2, 3, 4, 5, 6};
		for (int i = 0; i < insert.length; i++){
			doubleStack.push(insert[i]);
		}

		for (int i = insert.length; i < 0; i--){
			if (doubleStack.pop() != insert[i]){
				return false;
			}
		}
		return true;
	}

	private static boolean PopLong(){
		Stack<Long> longStack = new Stack<>();
		long[] insert = {1, 2, 3, 4, 5, 6};
		for (int i = 0; i < insert.length; i++){
			longStack.push(insert[i]);
		}

		for (int i = insert.length; i < 0; i--){
			if (longStack.pop() != insert[i]){
				return false;
			}
		}
		return true;
	}

	private static boolean TopInteger(){
		Stack<Integer> integerStack = new Stack<>();
		integerStack.push(1);
		if (integerStack.top() != integerStack.pop()){
			return false;
		}
		return false;
	}

	private static boolean TopString(){
		Stack<String> stringStack = new Stack<>();
		stringStack.push("1");
		if (stringStack.top() != stringStack.pop()){
			return false;
		}
		return true;
	}

	private static boolean TopFloat(){
		Stack<Float> floatStack = new Stack<>();
		floatStack.push((float)(1));
		if (floatStack.top() != floatStack.pop()){
			return false;
		}
		return true;
	}

	private static boolean TopDouble(){
		Stack<Double> doubleStack = new Stack<>();
		doubleStack.push((double)(1));
		if (doubleStack.top() != doubleStack.pop()){
			return false;
		}
		return true;
	}

	private static boolean TopLong(){
		Stack<Long> longStack = new Stack<>();
		longStack.push((long)(1));
		if (longStack.top() != longStack.pop()){
			return false;
		}
		return true;
	}


	public static void main(String[] args){
		System.out.println("Integer Stack Creation Status: " + IntegerStackTest());
		System.out.println("String Stack Creation Status: " + StringStackTest());
		System.out.println("Float Stack Creation Status: " + FloatStackTest());
		System.out.println("Double Stack Creation Status: " + DoubleStackTest());
		System.out.println("Long Stack Creation Status: " + LongStackTest());
		System.out.println("Populate Integer Stack Status: " + PopulateInteger());
		System.out.println("Populate String Stack Status: " + PopulateString());
		System.out.println("Populate Float Stack Status: " + PopulateFloat());
		System.out.println("Populate Double Stack Statue: " + PopulateDouble());
		System.out.println("Populate Long Stack Status: " + PopulateLong());
		System.out.println("Expand Integer Stack Status: " + ExpandInteger());
		System.out.println("Expand String Stack Status: " + ExpandString());
		System.out.println("Expand Float Stack Status: " + ExpandFloat());
		System.out.println("Expand Double Stack Status: " + ExpandDouble());
		System.out.println("Expand Long Stack Status: " + ExpandLong());
		System.out.println("Pop Integer Stack Status: " + PopInteger());
		System.out.println("Pop String Stack Status: " + PopString());
		System.out.println("Pop Float Stack Status: " + PopFloat());
		System.out.println("Pop Double Stack Status: " + PopDouble());
		System.out.println("Pop Long Stack Status: " + PopLong());
		System.out.println("Top Integer Stack Status: " + TopInteger());
		System.out.println("Top String Stack Status: " + TopString());
		System.out.println("Top Float Stack Status: " + TopFloat());
		System.out.println("Top Double Stack Status: " + TopDouble());
		System.out.println("Top Long Stack Status: " + TopLong());

	}
}
package Stacks;

public class Stack<T> {

	private int size;
	private int index;

	private Object[] array;

	public Stack(){
		this.array = new Object[10];
		this.index = 0;
		this.size = 0;
	}

	private void expand(){
		Object[] temp = this.array;
		this.array = new Object[temp.length * 2];
		for (int i = 0; i < this.size; i++){
			this.array[i] = temp[i];
		}
	}

	public boolean isEmpty(){
		if (this.size == 0){
			return true;
		}
		return false;
	}

	public void push(T object){
		if ((this.array.length - this.size) <= 5){
			this.expand();
		}

		this.array[index] = object;
		this.index += 1;
		this.size  += 1;
	}

	public T top(){
		if (this.isEmpty()){
			return null;
		}

		@SuppressWarnings("unchecked")
		T object = (T)(this.array[index-1]);
		return object;
	}

	public T pop(){
		if (this.isEmpty()){
			return null;
		}

		this.index -= 1;
		this.size -= 1;

		@SuppressWarnings("unchecked")
		T object = (T)(this.array[index]);
		this.array[index] = null;
		return object;
	}

	public int getSize(){
		return this.size;
	}

	public int getCapacity(){
		return this.array.length;
	}

}


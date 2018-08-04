package templatemethoddemo;

public abstract class BubbleSort {
	public final int[] sort(int[] numbers){
		for(int i=0;i<numbers.length-1;i++){
			for(int j=0;j<numbers.length-1;j++){
				if( isSwap(numbers[j], numbers[j+1]) ){
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		return numbers;
	}

	protected abstract boolean isSwap(int a, int b);
}

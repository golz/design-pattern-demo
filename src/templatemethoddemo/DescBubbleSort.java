package templatemethoddemo;

public class DescBubbleSort extends BubbleSort {

	@Override
	protected boolean isSwap(int a, int b) {
		return a < b;
	}

}

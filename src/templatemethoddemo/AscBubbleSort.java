package templatemethoddemo;

public class AscBubbleSort extends BubbleSort {

	@Override
	protected boolean isSwap(int a, int b) {
		return a > b;
	}

}

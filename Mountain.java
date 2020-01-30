public class Mountain {
	
	public static boolean isMountain(int[] array){
		int peaks = this.getPeakIndex(array);
		if (peaks ==-1) {
			return false;
		}
		
		if (this.isIncreasing(array,peaks) && this.isDecreasing(array,peaks)) {
			return true;
		}
		
		return false;
	}
	
	public static int getPeakIndex(int[] array){
		if (array.length<3) {
			return -1;
		}
		
		for (int i=1; i<array.length-1; i++) {
			if (array[i-1] < array[i] && array[i+1] < array[i]) {
				return i;
			}
		}
		
		return -1;
	}
}

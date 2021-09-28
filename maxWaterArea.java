public class maxWaterArea{
	public static void main(String[] args){
		int[] arr = {3,5,1,7,23,5,1,6,4};
		int res=maxArea(arr);
		System.out.println(res);
	}

	/**
	 * 传入一个数组，数组的值为墙壁的高度，计算可以最多盛装多少体积的水
	 * 
	 * @param height 传入的数组
	 * @return 返回可以能盛的最大容量的水
	 */
	public static int maxArea(int[] height){
		int left = 0,right = height.length - 1,max = 0,area = 0;
		while(left<right){
			area=Math.min(height[left] ,height[right] )*(right - left);
			//如果新得到的面积大于上一个面积，就进行交换
			if(area>max){
				max=area;
			}
			if(height[left]<height[right]){
				left++;
			}else{
				right--;
			}
		}
		return max;
	}

}
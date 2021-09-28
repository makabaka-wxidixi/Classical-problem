public class maxWaterArea{
	public static void main(String[] args){
		int[] arr = {3,5,1,7,23,5,1,6,4};
		int res=maxArea(arr);
		System.out.println(res);
	}

	/**
	 * ����һ�����飬�����ֵΪǽ�ڵĸ߶ȣ�����������ʢװ���������ˮ
	 * 
	 * @param height ���������
	 * @return ���ؿ�����ʢ�����������ˮ
	 */
	public static int maxArea(int[] height){
		int left = 0,right = height.length - 1,max = 0,area = 0;
		while(left<right){
			area=Math.min(height[left] ,height[right] )*(right - left);
			//����µõ������������һ��������ͽ��н���
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
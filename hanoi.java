public class hanoi{
	public static void main(String[] args) {
		hanoiSolve(3,'A','B','C');
	}

	/**
	 * 打印汉诺塔步骤
	 * 
	 * @param num 汉诺塔层数
	 * @param a 柱子a
	 * @param b 柱子b
	 * @param c 柱子c
	 */
	public static void hanoiSolve(int num,char a,char b,char c){
		if(num==1){//如果只有一层，那么直接将圆环从柱子a放到柱子c
			System.out.println(a+"——>"+c);
		}else{
			//将上面的n-1层，从a柱子借助于c柱子移动到b柱子
			hanoiSolve(num-1,a,c,b);
			//将底层圆环从a柱子移动到c柱子
			System.out.println(a+"——>"+c);
			//将之前移动的n-1一个圆环借助于a柱子，从b柱子移动到c柱子上
			hanoiSolve(num-1,b,a,c);
		}
	}
}
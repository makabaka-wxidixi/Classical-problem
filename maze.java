import java.util.*;

public class maze{
	static final int CAPACITY=7;
	
	static int[][] arr=new int[CAPACITY][CAPACITY];

	public static void main(String[] args){
		//初始化数组
		initArr();
		//打印数组
		printArr();
		System.out.println("生成的路径");
		System.out.println(runOut(1,1));	
		printArr();
	}

	/**
	 * 判断是否找到合适的路径
	 * 
	 * @param row 起始位置的行号
	 * @param lin 起始位置的列号
	 * @return 找到就返回true，找不到就返回false
	 */
	static boolean runOut(int row,int lin){
		//找到出口就返回
		if(arr[CAPACITY-2][CAPACITY-2]==2){
			return true;
		}else{
			//如果该点还没有被访问过
			if(arr[row][lin]==0){
				//对该点进行标记
				arr[row][lin]=2;
				if(runOut(row+1,lin)){
					return true;
				}else if(runOut(row,lin-1)){
				    return true;
				}else if(runOut(row,lin+1)){
					return true;
				}else if(runOut(row-1,lin)){
					return true;
				}else{
					//走到这一步就说明该位置是死路
					arr[row][lin]=3;
					return false;
				}
			}else{
				//如果已经访问过那就直接返回上一级
				return false;
			}
		}
	}

	/**
	 * 初始化数组，并设置障碍
	 * 
	 */
	static void initArr(){
		for(int row=0;row<arr.length;row++){
			arr[0][row]=1;
			arr[CAPACITY-1][row]=1;
			arr[row][0]=1;
			arr[row][CAPACITY-1]=1;
		}
		arr[3][1]=1;
		arr[3][2]=1;
	}


	static void printArr(){
		for(int i=0;i<arr.length;i++){
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
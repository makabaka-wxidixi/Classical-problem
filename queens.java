import java.util.*;

public class queens{
	static final int CAPACITY=8;
	static int count=0;//用于记录有多少种摆法
	static int[] arr=new int[CAPACITY];

	public static void main(String[] args) {
		place();
		System.out.println("共有："+count+"摆法");
	}

	static void place(){
		place(0);
	}

	static void place(int n){
		if(n==8){//因为第一个皇后摆放在第0个位置，当n==8时，就已经摆放完毕
			print();//打印摆法
			return;
		}else{
			for(int i=0;i<8;i++){//回溯
				arr[n]=i;
				/*
				合理：就对下一个皇后进行摆置
				不合理：就向前摆着当前皇后，如果每个位置都不合理，就返回上一个皇后，上一个皇后在
						再往后摆着
				*/
				if(isReasonable(n)){
					place(n+1);
				}
			}
		}
	}

	/**
	 * 用于判断当前皇后摆放的位置是否合理（不和前面的皇后冲突）
	 * 
	 * @n 放置第n个皇后
	 * @return 合理就返回true，不合理就false
	 */
	static boolean isReasonable(int n){
		for(int i=0;i<n;i++){
			if(arr[n]==arr[i]||Math.abs(arr[n]-arr[i])==Math.abs(n-i)){
				return false;
			}
		}
		return true;
	}

	/**
	 * 用于打印摆放方法
	 * 
	 */
	static void print(){
		count++;
		System.out.println(Arrays.toString(arr));
	}

}
import java.util.*;

public class queens{
	static final int CAPACITY=8;
	static int count=0;//���ڼ�¼�ж����ְڷ�
	static int[] arr=new int[CAPACITY];

	public static void main(String[] args) {
		place();
		System.out.println("���У�"+count+"�ڷ�");
	}

	static void place(){
		place(0);
	}

	static void place(int n){
		if(n==8){//��Ϊ��һ���ʺ�ڷ��ڵ�0��λ�ã���n==8ʱ�����Ѿ��ڷ����
			print();//��ӡ�ڷ�
			return;
		}else{
			for(int i=0;i<8;i++){//����
				arr[n]=i;
				/*
				�����Ͷ���һ���ʺ���а���
				����������ǰ���ŵ�ǰ�ʺ����ÿ��λ�ö��������ͷ�����һ���ʺ���һ���ʺ���
						���������
				*/
				if(isReasonable(n)){
					place(n+1);
				}
			}
		}
	}

	/**
	 * �����жϵ�ǰ�ʺ�ڷŵ�λ���Ƿ��������ǰ��Ļʺ��ͻ��
	 * 
	 * @n ���õ�n���ʺ�
	 * @return ����ͷ���true���������false
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
	 * ���ڴ�ӡ�ڷŷ���
	 * 
	 */
	static void print(){
		count++;
		System.out.println(Arrays.toString(arr));
	}

}
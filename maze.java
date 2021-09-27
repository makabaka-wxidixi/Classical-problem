import java.util.*;

public class maze{
	static final int CAPACITY=7;
	
	static int[][] arr=new int[CAPACITY][CAPACITY];

	public static void main(String[] args){
		//��ʼ������
		initArr();
		//��ӡ����
		printArr();
		System.out.println("���ɵ�·��");
		System.out.println(runOut(1,1));	
		printArr();
	}

	/**
	 * �ж��Ƿ��ҵ����ʵ�·��
	 * 
	 * @param row ��ʼλ�õ��к�
	 * @param lin ��ʼλ�õ��к�
	 * @return �ҵ��ͷ���true���Ҳ����ͷ���false
	 */
	static boolean runOut(int row,int lin){
		//�ҵ����ھͷ���
		if(arr[CAPACITY-2][CAPACITY-2]==2){
			return true;
		}else{
			//����õ㻹û�б����ʹ�
			if(arr[row][lin]==0){
				//�Ըõ���б��
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
					//�ߵ���һ����˵����λ������·
					arr[row][lin]=3;
					return false;
				}
			}else{
				//����Ѿ����ʹ��Ǿ�ֱ�ӷ�����һ��
				return false;
			}
		}
	}

	/**
	 * ��ʼ�����飬�������ϰ�
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
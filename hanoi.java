public class hanoi{
	public static void main(String[] args) {
		hanoiSolve(3,'A','B','C');
	}

	/**
	 * ��ӡ��ŵ������
	 * 
	 * @param num ��ŵ������
	 * @param a ����a
	 * @param b ����b
	 * @param c ����c
	 */
	public static void hanoiSolve(int num,char a,char b,char c){
		if(num==1){//���ֻ��һ�㣬��ôֱ�ӽ�Բ��������a�ŵ�����c
			System.out.println(a+"����>"+c);
		}else{
			//�������n-1�㣬��a���ӽ�����c�����ƶ���b����
			hanoiSolve(num-1,a,c,b);
			//���ײ�Բ����a�����ƶ���c����
			System.out.println(a+"����>"+c);
			//��֮ǰ�ƶ���n-1һ��Բ��������a���ӣ���b�����ƶ���c������
			hanoiSolve(num-1,b,a,c);
		}
	}
}
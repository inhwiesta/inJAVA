//�ε� �Ҽ��� ����� ����

package chapter2;

public class DoubleEx2 {
	public static void main(String[] args) {
		double dnum = 1;
		
		
		for(int i = 0; i <10000; i++) {
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);
		
	}

}

/*
 �� ������ ���� ����� 1�� 0.1�� 10,000�� �������Ƿ� 1001�� �� ������
 ��� ���� 1001.000000000159 �� ���´�.
 ������ �ణ�� ������ �����ϰ��� �� ���� ������ �Ǽ� ���� ǥ���ϱ� ���� �ε� �Ҽ��� ����� ����Ѵ�. 
*/

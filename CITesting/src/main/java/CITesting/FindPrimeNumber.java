package CITesting;

public class FindPrimeNumber {
	
	public static int findPrimeNum(int[] arr) { // �迭 �߿� �Ҽ��� ã��, �Ҽ��� ���� ���� ��� �ִ��� ��ȯ�ϴ� �Լ�
		int primenum = 0;
		
		if(arr.length < 1) {
			throw new IllegalArgumentException("Empty Array");
		}
		for(int i = 0 ; i < arr.length ; i++) {
			int cnt = 0;
			for(int j = 1 ; j < arr[i] ; j++) { // �迭�� ���� �ڱ� �ڽű��� ������ �ϳ� ���� �߻��� ���� �ڱ� �ڽ��� ������
				if ( arr[i] % j == 0 ) {
					cnt++;
				}
			}
			if(cnt == 2 && arr[i] > primenum) {
				primenum = arr[i];
			}
		}
		
		if(primenum == 0) {
			throw new IllegalArgumentException("Prime Number doesn't exist");
		} else return primenum;
	}
}

package CITesting;

public class FindPrimeNumber {
	
	public static int findPrimeNum(int[] arr) { // 배열 중에 소수를 찾고, 소수가 여러 개인 경우 최댓값을 반환하는 함수
		int primenum = 0;
		
		if(arr.length < 1) {
			throw new IllegalArgumentException("Empty Array");
		}
		for(int i = 0 ; i < arr.length ; i++) {
			int cnt = 0;
			for(int j = 1 ; j < arr[i] ; j++) { // 배열은 원래 자기 자신까지 나눠야 하나 결함 발생을 위해 자기 자신은 미포함
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

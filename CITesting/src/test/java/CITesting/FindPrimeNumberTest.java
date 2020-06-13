package CITesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindPrimeNumberTest {

	@Test
	void test1() { // 여러 개의 소수 중 최댓값 출력 테스트
		assertEquals(13, FindPrimeNumber.findPrimeNum(new int[] {2, 3, 13}));
	}
	
	@Test
	void test2() { // 하나의 소수 찾기 테스트
		assertEquals(13, FindPrimeNumber.findPrimeNum(new int[] {1, 6, 13}));
	}
	
	@Test
	void testArrayEmpty() { // 입력 배열 값이 비어있는 경우 테스트
		assertEquals("Empty Array", FindPrimeNumber.findPrimeNum(new int[] {}));
	}
	
	@Test
	void testNotExistPN() { // 입력 배열 값이 비어있는 경우 테스트
		assertEquals("Prime Number doesn't exist", FindPrimeNumber.findPrimeNum(new int[] {2, 6, 8}));
	}

}

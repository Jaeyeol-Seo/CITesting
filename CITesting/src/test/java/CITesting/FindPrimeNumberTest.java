package CITesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindPrimeNumberTest {

	@Test
	void test1() { // ���� ���� �Ҽ� �� �ִ� ��� �׽�Ʈ
		assertEquals(13, FindPrimeNumber.findPrimeNum(new int[] {2, 3, 13}));
	}
	
	@Test
	void test2() { // �ϳ��� �Ҽ� ã�� �׽�Ʈ
		assertEquals(13, FindPrimeNumber.findPrimeNum(new int[] {1, 6, 13}));
	}
	
	@Test
	void testArrayEmpty() { // �Է� �迭 ���� ����ִ� ��� �׽�Ʈ
		assertEquals("Empty Array", FindPrimeNumber.findPrimeNum(new int[] {}));
	}
	
	@Test
	void testNotExistPN() { // �Է� �迭 ���� ����ִ� ��� �׽�Ʈ
		assertEquals("Prime Number doesn't exist", FindPrimeNumber.findPrimeNum(new int[] {2, 6, 8}));
	}

}

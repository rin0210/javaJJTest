package TestCode;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import mainSrc.Member;

// MemberŬ������ �׽�Ʈ�ϱ� ���� Ŭ����
public class TMember {
	// '����'�� ���� �׽�Ʈ�� �ϱ� ���ؼ��� ���̺귯��(JUnit)�� �߰��Ѵ�.
	// JUnit�̶�? ������ ���� �׽�Ʈ�� �������ִ� �����ӿ�ũ�� �ٷ� JUnit
	// ���Ǵ� ������̼�
	// >> 1. @Test : @Test�� ����� �޼��尡 �׽�Ʈ�� �����Ѵ�.
	// >> 2. @Ignore : �׽�Ʈ�� �������� �ʴ´�.
	// >> 3. @Before : @Test�� ����� �޼��尡 ����Ǳ� ���� �����Ѵ�.
	
	// sysout���δ� �ֿܼ� ����� ��������� 
	// ����(assert)�޼���� �׽�ũ�� ����� �Ǻ��Ѵ�.
	// ���� ��� asserEquals(����, ������)
	// ���� ���� �޼���� ���󰪰� �������� ��ġ�ϸ� ����, ��ġ���� ������ ����
	
	// ���� ���Ǵ� JUnit �޼���
	// assertEquals(a,b) : ��ü �Ǵ� ���� ��ġ�ϴ°�?
	// assertArrayEquals(a,b) : �迭�� ���� ��ġ�ϴ°�?
	// assertSame(a,b) : ���� ��ü�ΰ�?
	// assertTrue(a) : ������ ���ΰ�?
	// assertNotNull(a) : ��ü�� null�� �ƴѰ�?
	// assertNull(a) : ��ü�� null�ΰ�?
	
	
	Member newMember;
	Member oldMember;
	
	@Test
	public void test1() {
//		System.out.println(newMember);
//		System.out.println(oldMember);
//		assertEquals(newMember, oldMember);
		
//		assertNotNull(newMember);
		// ()���� ��ü�� null�� �ƴϸ� ����, null�̸� ����
		// arrertNull();�� null�̸� ����, null�� �ƴϸ� ����
		
//		assertSame(newMember, oldMember);
		// �� ��ü�� ������ ����, �ٸ��� ����
		
		if(newMember == null) {
			System.out.println("ok");
		}
		assertTrue(newMember == null); // �����׽�Ʈ
	}
	
	@Before
	public void test2() {
		newMember = new Member();
		oldMember = newMember;
	}
	
//	@Ignore
//	public void test2() {
//		newMember = new Member();
//		oldMember = new Member();
//	}
}

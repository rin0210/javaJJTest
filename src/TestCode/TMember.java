package TestCode;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import mainSrc.Member;

// Member클래스를 테스트하기 위한 클래스
public class TMember {
	// '독립'된 단위 테스트를 하기 위해서는 라이브러리(JUnit)를 추가한다.
	// JUnit이란? 독립된 단위 테스트를 지원해주는 프레임워크가 바로 JUnit
	// 사용되는 어노테이션
	// >> 1. @Test : @Test가 선언된 메서드가 테스트를 수행한다.
	// >> 2. @Ignore : 테스트를 실행하지 않는다.
	// >> 3. @Before : @Test가 선언된 메서드가 실행되기 전에 수행한다.
	
	// sysout으로는 콘솔에 결과를 출력하지만 
	// 단정(assert)메서드로 테스크의 결과를 판별한다.
	// 예를 들어 asserEquals(예상값, 실제값)
	// 위의 단정 메서드는 예상값과 실제값이 일치하면 성공, 일치하지 않으면 실패
	
	// 자주 사용되는 JUnit 메서드
	// assertEquals(a,b) : 객체 또는 값이 일치하는가?
	// assertArrayEquals(a,b) : 배열의 값이 일치하는가?
	// assertSame(a,b) : 같은 객체인가?
	// assertTrue(a) : 조건이 참인가?
	// assertNotNull(a) : 객체가 null이 아닌가?
	// assertNull(a) : 객체가 null인가?
	
	
	Member newMember;
	Member oldMember;
	
	@Test
	public void test1() {
//		System.out.println(newMember);
//		System.out.println(oldMember);
//		assertEquals(newMember, oldMember);
		
//		assertNotNull(newMember);
		// ()안의 객체가 null이 아니면 성공, null이면 실패
		// arrertNull();은 null이면 성공, null이 아니면 실패
		
//		assertSame(newMember, oldMember);
		// 두 객체가 같으면 성공, 다르면 실패
		
		if(newMember == null) {
			System.out.println("ok");
		}
		assertTrue(newMember == null); // 조건테스트
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

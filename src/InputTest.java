import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InputTest {
	
	// main이 없어서 단위 테스트 진행, 파일 찾기

	@Test
	public void testInput() {
		Student [] array = new Student[12];
		String path = "C:/project/test/sungjuk_utf8.dat";
		Input input = new Input (array, path);

	}

}

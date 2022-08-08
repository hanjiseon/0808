import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InputTest {

	private Student[] array;
	private Input input;

	@Before
	public void init() {
		array = new Student[12];
		String path = "C:/project/test/sungjuk_utf8.dat";
		input = new Input(array, path);

	}

	// main이 없어서 단위 테스트 진행, 파일 찾기

	@Test
	public void testInput() {
		this.input.fileInput();
//		assertEquals("한송이", this.array[0].getName());
		assertEquals((78 + 87 + 83+ 78), (this.array[0].getKor() +this.array[0].getEng() + this.array[0].getMat() + this.array[0].getEdp()));

	}

}

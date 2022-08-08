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

	}

}

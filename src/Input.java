import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {

	private Student[] array;
	private Scanner sc;
	private File file;

	public Input(Student[] array, String path) {
		this.array = array;
		this.file = new File(path);
		try {
			this.sc = new Scanner(this.file, "utf-8");  //scanner는 file을 바라보고 있다.
			System.out.println("File founded");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}

	}
	
	public void fileInput() {
		for (int i = 0; i < array.length; i++) {
			String line = this.sc.nextLine();
			System.out.println(line);
			
			
		}
		
		
	}

}

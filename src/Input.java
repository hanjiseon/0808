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
			this.sc = new Scanner(this.file, "utf-8"); // scanner는 file을 바라보고 있다.
//			System.out.println("File founded");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}

	}

	public void fileInput() {
		for (int i = 0; i < array.length; i++) {
			String line = this.sc.nextLine(); // 1101 한송이 78 87 83 78
//			String[] values = line.split("\\s+");       // s+ 한개이상 띄워서 배열에 넣어주세요
//			System.out.println(values[1]);               //단점: Strnig을 자르면 String

			Scanner myScanner = new Scanner(line);
			myScanner = myScanner.useDelimiter("\\s+"); // Delimiter:구분자 //\\s+ 정규식
//			myScanner.next();
//			myScanner.next();
//			int kor = myScanner.nextInt();
//			System.out.println(kor);

			this.array[i] = new Student(myScanner.next(), myScanner.next(), myScanner.nextInt(), myScanner.nextInt(),
					myScanner.nextInt(), myScanner.nextInt());
			
			
		}

	}

}

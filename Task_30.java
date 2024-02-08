/*------------------------READING LINES FROM A TEXT FILE USING hasNextLine----------------------*/

package Tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner(new File("read.txt"));
			int i = 1;
			while(scanner.hasNextLine()) {
				System.out.println(i++ +". " + scanner.nextLine());
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}

package lab4;

import com.neuralsoft.pao.ppldatabase.MainWindow;

import lab4.date.Profesor;
import lab4.date.Student;

public class Lansator {

	public static void main(String[] args) {
		MainWindow a = new MainWindow();
		
		a.addElementType(Student.class);
		a.addElementType(Profesor.class);
		a.show();
	}

}

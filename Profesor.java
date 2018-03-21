package lab4.date;

public class Profesor extends Persoana {
	private String disciplina;

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public String toString() {
		return super.toString() + "(" + this.getDisciplina() + ")";
	}
	
	public String getElementType() {
		return "Profesor";
	}
	
	public String getName() {
		return this.getNume();
	}
	
	public String getType() {
		return "profesor" + this.disciplina;
	}
	
	public String[] getDataFieldNames () {
		return new String[] {"nume", "prenume", "disciplina"};
	}
	
	public void setFieldAt(int pozitie, String valoare) {
		switch (pozitie){
		case 0 : 
			setNume(valoare);
			break;
		case 1 : 
			setPrenume(valoare);
			break;
		case 2 : 
			setDisciplina(valoare);
			break;
		}
	}
}

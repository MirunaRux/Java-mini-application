package lab4.date;

public class Student extends Persoana {
	int an;
	
	public int getAn() {
		return an;
	}

	public void setAn(int an) {
		this.an = an;
	}
	
	public String toString() {
		return super.toString() + "(" + this.an + ")";
	}
	
	public String getElementType() {
		return "Student";
	}
	
	public String getName() {
		return this.getPrenume();
	}
	
	public String getType() {
		return "profesor" + this.an;
	}
	
	public String[] getDataFieldNames () {
		return new String[] {"nume", "prenume", "an"}; 
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
			setAn(Integer.parseInt(valoare));
			break;
		}
	}
}

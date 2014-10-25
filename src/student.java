public class student {

	private String Nume;
	private String Prenume;
	private String Telefon;

	public String getStudent() {
		
		return this.Nume + ' ' + this.Prenume + ' ' + this.Telefon;
	}

	public String getNume() {

		return this.Nume;
	}

	public String getPrenume() {

		return this.Prenume;
	}

	public String getTelefon() {

		return this.Telefon;
	}

	public void setStudent(String nume, String prenume, String telefon) {

		this.Nume = nume;
		this.Prenume = prenume;
		this.Telefon = telefon;
	}
}

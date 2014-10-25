import java.util.ArrayList;
import java.util.List;


public class main {
	
	static List<student> listaStd = new ArrayList<student>();
	
	public static void main(String[] args){
		
		student std1 = new student();
		std1.setStudent("Popescu", "Ion", "0743351642");
		
		student std2 = new student();
		std2.setStudent("Ionescu", "Gheroghe", "0231241536");
		
		listaStd.add(std1);
		listaStd.add(std2);
	}
}

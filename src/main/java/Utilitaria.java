import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Utilitaria {
	
	public Utilitaria(){
		
	}
	
	public String generateRandomName(String base){
		  Random rand = new Random();
		  return base+"-"+rand.nextInt(1000);
		}
	
	private String getDate(){
		  DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HH.mm.ss a");
		  Date date = new Date();
		  return dateFormat.format(date);
		}
}

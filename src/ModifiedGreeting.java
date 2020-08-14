import java.time.LocalTime;

public class ModifiedGreeting {
	
	private LocalTime time;
	
	ModifiedGreeting(LocalTime time) {
		this.time = time;
		
	}
	
	public String greet(String name) {
		int hh = time.getHour();
				
		if (hh > 5 && hh < 12) {
			return "Good Morning "+name;
		}
		else if (hh >= 12 && hh < 16) {
			return "Good Afternoon "+name;
		}
		else if (hh >= 16 && hh < 21){
			return "Good Evening "+name;
		}
		else {
			return "Good Night";
		}		
	}
}

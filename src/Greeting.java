import java.time.LocalTime;

public class Greeting {
	public String greet(String name) {
		LocalTime now = LocalTime.now();  
		
//		System.out.println(now.toLocalTime().getHour());
		
		if (now.getHour() > 5 && now.getHour() < 12) {
			return "Good Morning "+name;
		}
		else if (now.getHour() >= 12 && now.getHour() < 16) {
			return "Good Afternoon "+name;
		}
		else if (now.getHour() >= 16 && now.getHour() < 21){
			return "Good Evening "+name;
		}
		else {
			return "Good Night";
		}
		
//		if(ldt.now().toLocalTime())
	}
//	public static void main(String[] args) {
//		System.out.println(greet("Aayush"));
//	}
}
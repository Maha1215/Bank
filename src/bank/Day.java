package bank;

public class Day {
	Week week;
	public Day(Week week) {
		this.week=week;
				
	}
	public void whatToDo() {
		switch(week) {
		
		case MONDAY	:System.out.println("i will be at home");break;
		case TUESDAY :System.out.println("i will be at work");break;
		case WEDNESDAY :System.out.println("i will be at park");break;
		case THURSDAY :System.out.println("i will be at libary");break;
		case FRIDAY :System.out.println("i will be at pool");break;
		case SATURDAY :System.out.println("i will be at store");break;
		case SUNDAY	:System.out.println("i will be sleeping");break;
		default : System.out.println("doing nothing! "); 
		}
	}

}

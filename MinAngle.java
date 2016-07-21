import java.util.Scanner;


public class MinAngle {
	
	public static void main(String[] args) {
	System.out.println("Enter the time in HH:MM format");
	Scanner value = new Scanner(System.in);
	String InputTime = value.nextLine();
	value.close();
	System.out.println(InputTime);
	String[] splitvalue = InputTime.split(":");
	int hour= Integer.parseInt(splitvalue[0]);
	int minute= Integer.parseInt(splitvalue[1]);
	
	double HourHandPosition,MinuteHandPosition;
	HourHandPosition=hour*30 + Minute*0.5 ;
	MinuteHandPosition= Minute * 6;
	
	double resultAngle= Math.abs(HourHandPosition-MinuteHandPosition);
	if (resultAngle > 180){
		resultAngle=360-resultAngle;
	}
		System.out.println("The angle is: "+resultAngle);
		
	}
				
	}
************************************************



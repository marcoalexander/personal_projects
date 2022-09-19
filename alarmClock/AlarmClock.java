import java.util.*;
import java.awt.*;
import java.io.*;
import java.awt.Robot;
import java.awt.AWTEvent;


/** 
 @author Marco Tabora
 @version 0.20

	parse custom tags with the following command:

    javadoc -tag custom.require:cm:"Precondition:"  -tag custom.ensure:cm:"Postcondition:" -Xdoclint:none  *.java

 	This will function as a basic alarm clock, using two key elements. Java.awt functions, and Java.io functions are used
 	to connect two pieces: the file opener and the actual alarm clock.

 	Please refer to API for all technical definitions.

*/

public class AlarmClock{


	//Scanner for all user input
	public static Scanner input = new Scanner(System.in);
	//calendar object used for setting alarm
	//underneath Calendar date will be the variables needed for creating the instance of that object
	//There is a reason it's set up that way. i had trouble using the calendar.set() method
	//with all parameters set up to work. Maybe you can do it.
	public static Calendar date = Calendar.getInstance();
	public static int year;
	public static int month;
	public static int day;
	public static int hour;
	public static int minutes;

	//Desktop Object is a part of Java.io API. Used for opening the video
	public static Desktop d = Desktop.getDesktop();
	//File Object is a part of Java.io API. Used for opening the video
	public static File mp3 = new File("/Users/marcotabora/workspace/personal_projects/alarmClock/AlarmSound.mp4");
	
	//The next two lines deal with Java.io functions. Used for opening the video.
	public static Timer timer = new Timer();
	public static TimerTask task = new TimerTask(){
		@Override
		public void run() {
			try{
				d.open(mp3);
			}catch(Exception e){
				System.out.println("oops!");
			}
			
		}//end run

	};//end timertask

	//String array for holding prompt for year, month, date, user input in welcome script
	public static String[] yearMonthDateUI = {"Enter year: ", "Enter month: ", "Enter day: "};

	//public static Robot robot = new Robot();


	//main method used to test program. This main method should only be aparent in the pubAlarmClock as ghost code.	
	public static void main(String[] args) {
		welcomeScript();
		setDate();
		System.out.println("enter hour in military format");
		hour = input.nextInt();
		date.set(Calendar.HOUR_OF_DAY,hour);
		System.out.println("enter minute");
		minutes = input.nextInt();
		date.set(Calendar.MINUTE,minutes);

		date.set(Calendar.SECOND,0);
		date.set(Calendar.MILLISECOND,0);

		System.out.println("you have set an alarm for: " + date.getTime());



		
		timer.schedule(task, date.getTime());
		//robot.keyPress(KeyEvent.VK_SPACE);
		//robot.keyRelease(KeyEvent.VK_SPACE);


	}//end main
	/*
	what is for the welcome script we add a menu, which will allow a user to make their own choice instead of presenting them with a statement. 
	menu:
		Set an alarm
		check your alarm times
			print all alarm times
			calc avg
	*/
	public static void welcomeScript(){
		System.out.println("Welcome to Slumbr");
		System.out.println("Lets set your Alarm");
		System.out.println("*insert menu here for later*");
//writing scripts: 
		//Prompt users to type whole words for input(ex. "print alarms" would have to be typed inorder to validate input)
	}

	public static void setDate(){
		for (int i = 0;i < yearMonthDateUI.length ;i++) {
			System.out.println(yearMonthDateUI[i]);
			if (i == 0) {
				int year = input.nextInt();
				date.set(Calendar.YEAR,year);
			}
			if (i == 1) {
				int month = input.nextInt() - 1;
				date.set(Calendar.MONTH,month);
			}
			if (i == 2) {
				int day = input.nextInt();
				date.set(Calendar.DAY_OF_MONTH,day);
			}
		}
	}
	//this serves for the year, month, day input of the calendar Object.











}//end class






















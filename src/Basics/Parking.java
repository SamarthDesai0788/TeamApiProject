package Basics;
import java.util.*;
import java.time.*;
public class Parking {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
		  System.out.println("Enter the IN TIME as HH:MM:SS");
		  String intime=s.next();

		  LocalTime lt=LocalTime.parse(intime);
		  
		  LocalTime lt2=LocalTime.now();

		  Duration d=Duration.between(lt,lt2);
		  System.out.println(d);
		  
		  LocalDateTime ldt=LocalDateTime.now();
		  System.out.println(ldt);
		  }
		}
	
import java.util.Scanner;
import java.util.Arrays;

public class Novid {
	//covid or not
	private boolean covid;
	//if they have covid then people surrounding them
	private int peopleExposed;
	//chance they have it
	private double chance;
	private String name;
	private int age;
	private boolean atRisk;

	public boolean mask(String ans)
	{
		if(ans.equals("Y")) {
			return true;
		} else if(ans.equals("N")) {
			return false;
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("| Welcome to Novid-19                           |");
		System.out.println("| Where you guide humans to being COVID free!   |");

	}

}
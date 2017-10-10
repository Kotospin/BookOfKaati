import java.util.Arrays;//For array functions and sorting
public class statBlockRollerSmoot {
	public static void main(String[] args) {
		//Create an array to store statRolls
		int statRollArray[] = new int[4];
		//Call the statRoll method
		statRoll(statRollArray);
		//Call statRollCalc method
		statRollCalc(statRollArray);
	} //End main

	public static int statRoll(int[] a) { //Array passed to method as 'a'
		for(int i = 0; i < 4; i++) { //FOR loop for 4 random six sided rolls
			a[i] = (int) (Math.random() * 6) + 1; //Random six sided roll stored to array
			//System.out.println("Roll: " + i + " \tValue: " + statRollArray[i]); //Debug text
		}
		return 0;
	} //End statRoll method

	public static int statRollCalc(int[] a) { //Array passed to method as 'a'
		Arrays.sort(a); //Sort the array smallest to largest
		int statRollFinal = a[1] + a[2] + a[3]; //We drop the first figure and only add the remaining 3 figures; array figures are 0-3 for four dice
		//Start debug text
		//for(int i = 0; i < 4; i++) {
			//System.out.println("Roll: " + i + " \tValue: " + a[i]);
		//}
		System.out.println("Final figure: " + statRollFinal);
		//End debug text
		return statRollFinal;
	} //End statRollCalc method
} //End program
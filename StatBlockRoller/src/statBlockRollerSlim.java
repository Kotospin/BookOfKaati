public class statBlockRollerSlim {
	public static void main(String[] args) {

		//For loop to iterate between each sRF# variable so that they all contain unique values
		for(int i = 0; i < 6; i++){

			if (i == 0) {
				int statRollFinal1 = statRollCalc();
				System.out.println("First Value: " + statRollFinal1);
			}
			else if (i == 1) {
				int statRollFinal2 = statRollCalc();
				System.out.println("Second Value: " + statRollFinal2);
			}
			else if (i == 2) {

				int statRollFinal3 = statRollCalc();
				System.out.println("Third Value: " + statRollFinal3);
			}
			else if (i == 3) {

				int statRollFinal4 = statRollCalc();
				System.out.println("Fourth Value: " + statRollFinal4);
			}
			else if (i == 4) {

				int statRollFinal5 = statRollCalc();
				System.out.println("Fifth Value: " + statRollFinal5);
			}
			else if (i == 5) {

				int statRollFinal6 = statRollCalc();
				System.out.println("Sixth Value: " + statRollFinal6);
			} 
		}
	}

	public static int statRollCalc() {

		int statRollInt1 = (int) (Math.random()* 6 + 1);
		int statRollInt2 = (int) (Math.random()* 6 + 1);
		int statRollInt3 = (int) (Math.random()* 6 + 1);
		int statRollInt4 = (int) (Math.random()* 6 + 1);

		int statRollFinal = 0;

		//if 1 and 3 are separately larger than 2 and 4
		if (statRollInt1 >= statRollInt2 && statRollInt3 >= statRollInt4) {

			//If 2 is larger than 4
			if (statRollInt2 >= statRollInt4) {
				statRollFinal = statRollInt1 + statRollInt2 + statRollInt3;


				//If 4 is larger than 2	
			} else if (statRollInt2 <= statRollInt4) {
				statRollFinal = statRollInt1 + statRollInt3 + statRollInt4;

			}

			//If 1 and 4 are separately larger than 2 and 3
		} else if (statRollInt1 >= statRollInt2 && statRollInt3 <= statRollInt4) {

			//If 2 is larger than 3, add 1 + 2 + 4
			if (statRollInt2 >= statRollInt3) {
				statRollFinal = statRollInt1 + statRollInt2 + statRollInt4;


				//If 3 is larger than 2, add 1 + 3 + 4
			} else if (statRollInt2 <= statRollInt3) {
				statRollFinal = statRollInt1 + statRollInt3 + statRollInt4;

			}

			//If 2 and 3 are separately larger than 1 and 4
		} else if (statRollInt1 <= statRollInt2 && statRollInt3 >= statRollInt4) {

			//If 1 is larger than 4, add 1 + 2 + 3
			if (statRollInt1 >= statRollInt4) {
				statRollFinal = statRollInt1 + statRollInt2 + statRollInt3;


				//If 4 is larger than 1, add 2 + 3 + 4
			} else if (statRollInt1 <= statRollInt4) {
				statRollFinal = statRollInt2 + statRollInt3 + statRollInt4;

			}

			//If 2 and 4 are separately larger than 1 and 3
		} else if (statRollInt1 <= statRollInt2 && statRollInt3 <= statRollInt4) {

			//If 1 is larger than 3, add 1 + 2 + 3
			if (statRollInt1 >= statRollInt3) {
				statRollFinal = statRollInt1 + statRollInt2 + statRollInt3;


				//If 3 is larger than 1, add 2 + 3 + 4
			} else if (statRollInt1 <= statRollInt3) {
				statRollFinal = statRollInt2 + statRollInt3 + statRollInt4;

			}
		}
		return statRollFinal;
	}
}
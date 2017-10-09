public class statBlockRollerOrig {

	public static void main(String[] args) {

		int statRollInt1 = (int) (Math.random()* 6 + 1);
		int statRollInt2 = (int) (Math.random()* 6 + 1);
		int statRollInt3 = (int) (Math.random()* 6 + 1);
		int statRollInt4 = (int) (Math.random()* 6 + 1);

		int statRollInt5 = (int) (Math.random()* 6 + 1);
		int statRollInt6 = (int) (Math.random()* 6 + 1);
		int statRollInt7 = (int) (Math.random()* 6 + 1);
		int statRollInt8 = (int) (Math.random()* 6 + 1);

		int statRollInt9 = (int) (Math.random()* 6 + 1);
		int statRollInt10 = (int) (Math.random()* 6 + 1);
		int statRollInt11 = (int) (Math.random()* 6 + 1);
		int statRollInt12 = (int) (Math.random()* 6 + 1);

		int statRollInt13 = (int) (Math.random()* 6 + 1);
		int statRollInt14 = (int) (Math.random()* 6 + 1);
		int statRollInt15 = (int) (Math.random()* 6 + 1);
		int statRollInt16 = (int) (Math.random()* 6 + 1);

		int statRollInt17 = (int) (Math.random()* 6 + 1);
		int statRollInt18 = (int) (Math.random()* 6 + 1);
		int statRollInt19 = (int) (Math.random()* 6 + 1);
		int statRollInt20 = (int) (Math.random()* 6 + 1);

		int statRollInt21 = (int) (Math.random()* 6 + 1);
		int statRollInt22 = (int) (Math.random()* 6 + 1);
		int statRollInt23 = (int) (Math.random()* 6 + 1);
		int statRollInt24 = (int) (Math.random()* 6 + 1);


		int statRollFinal1;
		int statRollFinal2;
		int statRollFinal3;
		int statRollFinal4;
		int statRollFinal5;
		int statRollFinal6;

		

		//if 1 and 3 are separately larger than 2 and 4
		if (statRollInt1 >= statRollInt2 && statRollInt3 >= statRollInt4) {

			//If 2 is larger than 4
			if (statRollInt2 >= statRollInt4) {
				statRollFinal1 = statRollInt1 + statRollInt2 + statRollInt3;
				System.out.println(statRollFinal1);

				//If 4 is larger than 2	
			} else if (statRollInt2 <= statRollInt4) {
				statRollFinal1 = statRollInt1 + statRollInt3 + statRollInt4;
				System.out.println(statRollFinal1);
			}

			//If 1 and 4 are separately larger than 2 and 3
		} else if (statRollInt1 >= statRollInt2 && statRollInt3 <= statRollInt4) {

			//If 2 is larger than 3, add 1 + 2 + 4
			if (statRollInt2 >= statRollInt3) {
				statRollFinal1 = statRollInt1 + statRollInt2 + statRollInt4;
				System.out.println(statRollFinal1);

				//If 3 is larger than 2, add 1 + 3 + 4
			} else if (statRollInt2 <= statRollInt3) {
				statRollFinal1 = statRollInt1 + statRollInt3 + statRollInt4;
				System.out.println(statRollFinal1);
			}

			//If 2 and 3 are separately larger than 1 and 4
		} else if (statRollInt1 <= statRollInt2 && statRollInt3 >= statRollInt4) {

			//If 1 is larger than 4, add 1 + 2 + 3
			if (statRollInt1 >= statRollInt4) {
				statRollFinal1 = statRollInt1 + statRollInt2 + statRollInt3;
				System.out.println(statRollFinal1);

				//If 4 is larger than 1, add 2 + 3 + 4
			} else if (statRollInt1 <= statRollInt4) {
				statRollFinal1 = statRollInt2 + statRollInt3 + statRollInt4;
				System.out.println(statRollFinal1);
			}

			//If 2 and 4 are separately larger than 1 and 3
		} else if (statRollInt1 <= statRollInt2 && statRollInt3 <= statRollInt4) {

			//If 1 is larger than 3, add 1 + 2 + 3
			if (statRollInt1 >= statRollInt3) {
				statRollFinal1 = statRollInt1 + statRollInt2 + statRollInt3;
				System.out.println(statRollFinal1);

				//If 3 is larger than 1, add 2 + 3 + 4
			} else if (statRollInt1 <= statRollInt3) {
				statRollFinal1 = statRollInt2 + statRollInt3 + statRollInt4;
				System.out.println(statRollFinal1);
			}
		}

		

		//if 1 and 3 are separately larger than 2 and 4
		if (statRollInt5 >= statRollInt6 && statRollInt7 >= statRollInt8) {

			//If 2 is larger than 4
			if (statRollInt6 >= statRollInt8) {
				statRollFinal2 = statRollInt5 + statRollInt6 + statRollInt7;
				System.out.println(statRollFinal2);

				//If 4 is larger than 2	
			} else if (statRollInt6 <= statRollInt8) {
				statRollFinal2 = statRollInt5 + statRollInt7 + statRollInt8;
				System.out.println(statRollFinal2);
			}

			//If 1 and 4 are separately larger than 2 and 3
		} else if (statRollInt5 >= statRollInt6 && statRollInt7 <= statRollInt8) {

			//If 2 is larger than 3, add 1 + 2 + 4
			if (statRollInt6 >= statRollInt7) {
				statRollFinal2 = statRollInt5 + statRollInt6 + statRollInt8;
				System.out.println(statRollFinal2);

				//If 3 is larger than 2, add 1 + 3 + 4
			} else if (statRollInt6 <= statRollInt7) {
				statRollFinal2 = statRollInt5 + statRollInt7 + statRollInt8;
				System.out.println(statRollFinal2);
			}

			//If 2 and 3 are separately larger than 1 and 4
		} else if (statRollInt5 <= statRollInt6 && statRollInt7 >= statRollInt8) {

			//If 1 is larger than 4, add 1 + 2 + 3
			if (statRollInt5 >= statRollInt8) {
				statRollFinal2 = statRollInt5 + statRollInt6 + statRollInt7;
				System.out.println(statRollFinal2);

				//If 4 is larger than 1, add 2 + 3 + 4
			} else if (statRollInt5 <= statRollInt8) {
				statRollFinal2 = statRollInt6 + statRollInt7 + statRollInt8;
				System.out.println(statRollFinal2);
			}

			//If 2 and 4 are separately larger than 1 and 3
		} else if (statRollInt5 <= statRollInt6 && statRollInt7 <= statRollInt8) {

			//If 1 is larger than 3, add 1 + 2 + 3
			if (statRollInt5 >= statRollInt7) {
				statRollFinal2 = statRollInt5 + statRollInt6 + statRollInt7;
				System.out.println(statRollFinal2);

				//If 3 is larger than 1, add 2 + 3 + 4
			} else if (statRollInt5 <= statRollInt7) {
				statRollFinal2 = statRollInt6 + statRollInt7 + statRollInt8;
				System.out.println(statRollFinal2);
			}
		}

		

		//if 1 and 3 are separately larger than 2 and 4
		if (statRollInt9 >= statRollInt10 && statRollInt11 >= statRollInt12) {

			//If 2 is larger than 4
			if (statRollInt10 >= statRollInt12) {
				statRollFinal3 = statRollInt9 + statRollInt10 + statRollInt11;
				System.out.println(statRollFinal3);

				//If 4 is larger than 2	
			} else if (statRollInt10 <= statRollInt12) {
				statRollFinal3 = statRollInt9 + statRollInt11 + statRollInt12;
				System.out.println(statRollFinal3);
			}

			//If 1 and 4 are separately larger than 2 and 3
		} else if (statRollInt9 >= statRollInt10 && statRollInt11 <= statRollInt12) {

			//If 2 is larger than 3, add 1 + 2 + 4
			if (statRollInt10 >= statRollInt11) {
				statRollFinal3 = statRollInt9 + statRollInt10 + statRollInt12;
				System.out.println(statRollFinal3);

				//If 3 is larger than 2, add 1 + 3 + 4
			} else if (statRollInt10 <= statRollInt11) {
				statRollFinal3 = statRollInt9 + statRollInt11 + statRollInt12;
				System.out.println(statRollFinal3);
			}

			//If 2 and 3 are separately larger than 1 and 4
		} else if (statRollInt9 <= statRollInt10 && statRollInt11 >= statRollInt12) {

			//If 1 is larger than 4, add 1 + 2 + 3
			if (statRollInt9 >= statRollInt12) {
				statRollFinal3 = statRollInt9 + statRollInt10 + statRollInt11;
				System.out.println(statRollFinal3);

				//If 4 is larger than 1, add 2 + 3 + 4
			} else if (statRollInt9 <= statRollInt12) {
				statRollFinal3 = statRollInt10 + statRollInt11 + statRollInt12;
				System.out.println(statRollFinal3);
			}

			//If 2 and 4 are separately larger than 1 and 3
		} else if (statRollInt9 <= statRollInt10 && statRollInt11 <= statRollInt12) {

			//If 1 is larger than 3, add 1 + 2 + 3
			if (statRollInt9 >= statRollInt11) {
				statRollFinal3 = statRollInt9 + statRollInt10 + statRollInt11;
				System.out.println(statRollFinal3);

				//If 3 is larger than 1, add 2 + 3 + 4
			} else if (statRollInt9 <= statRollInt11) {
				statRollFinal3 = statRollInt10 + statRollInt11 + statRollInt12;
				System.out.println(statRollFinal3);
			}
		}

		

		//if 1 and 3 are separately larger than 2 and 4
		if (statRollInt13 >= statRollInt14 && statRollInt15 >= statRollInt16) {

			//If 2 is larger than 4
			if (statRollInt14 >= statRollInt16) {
				statRollFinal4 = statRollInt13 + statRollInt14 + statRollInt15;
				System.out.println(statRollFinal4);

				//If 4 is larger than 2	
			} else if (statRollInt14 <= statRollInt16) {
				statRollFinal4 = statRollInt13 + statRollInt15 + statRollInt16;
				System.out.println(statRollFinal4);
			}

			//If 1 and 4 are separately larger than 2 and 3
		} else if (statRollInt13 >= statRollInt14 && statRollInt15 <= statRollInt16) {

			//If 2 is larger than 3, add 1 + 2 + 4
			if (statRollInt14 >= statRollInt15) {
				statRollFinal4 = statRollInt13 + statRollInt14 + statRollInt16;
				System.out.println(statRollFinal4);

				//If 3 is larger than 2, add 1 + 3 + 4
			} else if (statRollInt14 <= statRollInt15) {
				statRollFinal4 = statRollInt13 + statRollInt15 + statRollInt16;
				System.out.println(statRollFinal4);
			}

			//If 2 and 3 are separately larger than 1 and 4
		} else if (statRollInt13 <= statRollInt14 && statRollInt15 >= statRollInt16) {

			//If 1 is larger than 4, add 1 + 2 + 3
			if (statRollInt13 >= statRollInt16) {
				statRollFinal4 = statRollInt13 + statRollInt14 + statRollInt15;
				System.out.println(statRollFinal4);

				//If 4 is larger than 1, add 2 + 3 + 4
			} else if (statRollInt13 <= statRollInt16) {
				statRollFinal4 = statRollInt14 + statRollInt15 + statRollInt16;
				System.out.println(statRollFinal4);
			}

			//If 2 and 4 are separately larger than 1 and 3
		} else if (statRollInt13 <= statRollInt14 && statRollInt15 <= statRollInt16) {

			//If 1 is larger than 3, add 1 + 2 + 3
			if (statRollInt13 >= statRollInt15) {
				statRollFinal4 = statRollInt13 + statRollInt14 + statRollInt15;
				System.out.println(statRollFinal4);

				//If 3 is larger than 1, add 2 + 3 + 4
			} else if (statRollInt13 <= statRollInt15) {
				statRollFinal4 = statRollInt14 + statRollInt15 + statRollInt16;
				System.out.println(statRollFinal4);
			}
		}

		

		//if 1 and 3 are separately larger than 2 and 4
		if (statRollInt17 >= statRollInt18 && statRollInt19 >= statRollInt20) {

			//If 2 is larger than 4
			if (statRollInt18 >= statRollInt20) {
				statRollFinal5 = statRollInt17 + statRollInt18 + statRollInt19;
				System.out.println(statRollFinal5);

				//If 4 is larger than 2	
			} else if (statRollInt18 <= statRollInt20) {
				statRollFinal5 = statRollInt17 + statRollInt19 + statRollInt20;
				System.out.println(statRollFinal5);
			}

			//If 1 and 4 are separately larger than 2 and 3
		} else if (statRollInt17 >= statRollInt18 && statRollInt19 <= statRollInt20) {

			//If 2 is larger than 3, add 1 + 2 + 4
			if (statRollInt18 >= statRollInt19) {
				statRollFinal5 = statRollInt17 + statRollInt18 + statRollInt20;
				System.out.println(statRollFinal5);

				//If 3 is larger than 2, add 1 + 3 + 4
			} else if (statRollInt18 <= statRollInt19) {
				statRollFinal5 = statRollInt17 + statRollInt19 + statRollInt20;
				System.out.println(statRollFinal5);
			}

			//If 2 and 3 are separately larger than 1 and 4
		} else if (statRollInt17 <= statRollInt18 && statRollInt19 >= statRollInt20) {

			//If 1 is larger than 4, add 1 + 2 + 3
			if (statRollInt17 >= statRollInt20) {
				statRollFinal5 = statRollInt17 + statRollInt18 + statRollInt19;
				System.out.println(statRollFinal5);

				//If 4 is larger than 1, add 2 + 3 + 4
			} else if (statRollInt17 <= statRollInt20) {
				statRollFinal5 = statRollInt18 + statRollInt19 + statRollInt20;
				System.out.println(statRollFinal5);
			}

			//If 2 and 4 are separately larger than 1 and 3
		} else if (statRollInt17 <= statRollInt18 && statRollInt19 <= statRollInt20) {

			//If 1 is larger than 3, add 1 + 2 + 3
			if (statRollInt17 >= statRollInt19) {
				statRollFinal5 = statRollInt17 + statRollInt18 + statRollInt19;
				System.out.println(statRollFinal5);

				//If 3 is larger than 1, add 2 + 3 + 4
			} else if (statRollInt17 <= statRollInt19) {
				statRollFinal5 = statRollInt18 + statRollInt19 + statRollInt20;
				System.out.println(statRollFinal5);
			}
		}

		

		//if 1 and 3 are separately larger than 2 and 4
		if (statRollInt21 >= statRollInt22 && statRollInt23 >= statRollInt24) {

			//If 2 is larger than 4
			if (statRollInt22 >= statRollInt24) {
				statRollFinal6 = statRollInt21 + statRollInt22 + statRollInt23;
				System.out.println(statRollFinal6);

				//If 4 is larger than 2	
			} else if (statRollInt22 <= statRollInt24) {
				statRollFinal6 = statRollInt21 + statRollInt23 + statRollInt24;
				System.out.println(statRollFinal6);
			}

			//If 1 and 4 are separately larger than 2 and 3
		} else if (statRollInt21 >= statRollInt22 && statRollInt23 <= statRollInt24) {

			//If 2 is larger than 3, add 1 + 2 + 4
			if (statRollInt22 >= statRollInt23) {
				statRollFinal6 = statRollInt21 + statRollInt22 + statRollInt24;
				System.out.println(statRollFinal6);

				//If 3 is larger than 2, add 1 + 3 + 4
			} else if (statRollInt22 <= statRollInt23) {
				statRollFinal6 = statRollInt21 + statRollInt23 + statRollInt24;
				System.out.println(statRollFinal6);
			}

			//If 2 and 3 are separately larger than 1 and 4
		} else if (statRollInt21 <= statRollInt22 && statRollInt23 >= statRollInt24) {

			//If 1 is larger than 4, add 1 + 2 + 3
			if (statRollInt21 >= statRollInt24) {
				statRollFinal6 = statRollInt21 + statRollInt22 + statRollInt23;
				System.out.println(statRollFinal6);

				//If 4 is larger than 1, add 2 + 3 + 4
			} else if (statRollInt21 <= statRollInt24) {
				statRollFinal6 = statRollInt22 + statRollInt23 + statRollInt24;
				System.out.println(statRollFinal6);
			}

			//If 2 and 4 are separately larger than 1 and 3
		} else if (statRollInt21 <= statRollInt22 && statRollInt23 <= statRollInt24) {

			//If 1 is larger than 3, add 1 + 2 + 3
			if (statRollInt21 >= statRollInt23) {
				statRollFinal6 = statRollInt21 + statRollInt22 + statRollInt23;
				System.out.println(statRollFinal6);

				//If 3 is larger than 1, add 2 + 3 + 4
			} else if (statRollInt21 <= statRollInt23) {
				statRollFinal6 = statRollInt22 + statRollInt23 + statRollInt24;
				System.out.println(statRollFinal6);
			}
		}
	}
}
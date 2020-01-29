package com.clock;

public class Convert {
	public static String colourC(String clockString) throws Exception{
		String[] numberString = clockString.split("[:]");
		String formattedString = null;
		if(clockString.equals(null) || clockString.length() < 8 )
			throw new Exception("Time Not provied or Invalid Time Format");
		else if(clockString.length() > 8)
			throw new Exception("Invalid Time Format");
		else {
//		String secondString = checkSeconds(numberString[2]);
//		String minuteString = checkMintues(numberString[1])+checkMintuesLower(numberString[1]);
//		String hourString = checkHours(numberString[0])+checkHoursLower(numberString[0]);
//		formattedString = secondString + hourString+ minuteString ;
		formattedString = checkSeconds(numberString[2]) + checkHours(numberString[0]) + 
			checkHoursLower(numberString[0]) + checkMintues(numberString[1]) + 
			checkMintuesLower(numberString[1]);
		}
		return formattedString;
		
	}
	private static String iteratorForString(int size,int mainValue,String variable1 ,
			String variable2,boolean flagForOperation)
	{
		String finalString="";
		int offLamps =size-mainValue;
		for(int i=0;i<mainValue;i++)
		{
			if((i+1)%3==0 && flagForOperation==false)
				finalString+="R";
			else
				finalString+=variable1;
		}
		for(int i=0; i< offLamps; i++) {
			finalString  += variable2;
		}
		return finalString;
	}
	private static String checkMintuesLower(String string) {
		int mintues=Integer.parseInt(string);
		int que = mintues%5;
		return iteratorForString(4, que, "Y", "O" , true);
	}
	private static String checkMintues(String string) {
		int mintues=Integer.parseInt(string);
		int que = mintues/5;
		return iteratorForString(11, que, "Y", "O" , false);
	}
	private static String checkHoursLower(String string) {
		int hours=Integer.parseInt(string);
		int que = hours%5;
		return iteratorForString(4, que, "R", "O" , true);
	}
	private static String checkHours(String string) {
		int hours=Integer.parseInt(string);
		int que = hours/5;
		return iteratorForString(4, que, "R", "O", true);
	}
	private static String checkSeconds(String string) {
		int seconds=Integer.parseInt(string);
		if(seconds%2==0)
			return "Y";
		else
			return "O";
	}
}

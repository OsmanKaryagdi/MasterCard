package theLongestInString;

public class TheLongestWordInAString {

	public static void main(String[] args) {

		String str = "A poor man helped a rich woman carrying her heavy goods to home from a long distance. \" +\n"
				+ "\nThe man’s coat was torn and he asked the woman to fix his coat."
				+ "She took the needle and sewed the coat coarsely. What she did was shoddy and so ugly.\" +\n"
				+ "The man looked at the coat first, and then the woman and asked, \" +\n"
				+ "\"Did you like what you did?\" \nThe woman said recklessly that the coat was very old and of poor quality.\" +\n"
				+ "\n\"Ma'am, you should do your business according to your own value, not by the value of the coat.\" +\n"
				+ "\n\"In fact, you showed your personal value doing this.\"";

		System.out.println(theLongest(str));

	}

	public static String theLongest(String str) {
		String[] strArr = str.split(" ");
		
		String longestWord = "";
		int maxLength = 0;
		
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].length()>maxLength) {
				longestWord = strArr[i];
				maxLength = strArr[i].length();
			}
	
		
		}
		return maxLength+" and " + "\"" +longestWord +"\"";
	}
}


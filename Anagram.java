public class Anagram {

	public static void main(String[] args) {
		String str1 = "Mother in Law";
		String str2 ="Hitler Woman";
		str1=str1.replaceAll("\\s","").toLowerCase();
		str2=str2.replaceAll("\\s","").toLowerCase();
		char[] arrayS1 = str1.toCharArray();
		char[] arrayS2 = str2.toCharArray();
		Arrays.sort(arrayS1);
		Arrays.sort(arrayS2);
		System.out.println("Given String is Praveen");
		
		if(Arrays.equals(arrayS1, arrayS2)) {
			System.out.println("Given String is Anagram");
		}
		else {
			System.out.println("String is not a anagram");
		}

	}

}

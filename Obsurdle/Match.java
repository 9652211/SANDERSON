
public class Match {
	private static String w = "";
	private static String g = "";
	public void setWords(String word, String guess) {
		this.w = word;
		this.g = guess;
	}
	public static String matchText() {
		String output = "";
		for(int i = 0; i<7; i++) {
			char check = ' ';
			for(int j = 0; j<7; j++) {
				if(w.charAt(i)==g.charAt(j)) {
					if (i==j) {
						check = '■';
					} else if (check != '■') {
						check = '□';
					}
				}
			}
			output = output + check;
		}
		return output;
	}
}

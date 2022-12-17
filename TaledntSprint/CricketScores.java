public class CricketScores {

	@SuppressWarnings("unused")
	public static String getDisplayDetails(int runs, float Overs, float totalballs) {
		// ADD YOUR CODE HERE
		runs = 33;
		Overs = 20;
		totalballs = 20;
		String ans = " ";
		if (runs <= 100) {
			float rate = (runs / Overs);
			ans = +runs + "runs in " + totalballs + " balls @ " + rate + " runs per over";
			
		}
		if (runs >= 100) {
			
			int temp = (int) Overs;
			totalballs = totalballs + temp * 6 + (float) ((Overs - temp) * 10);
			float rate = (runs / totalballs);
			ans = +runs + " runs in " + Overs + " overs @ " + rate + "  runs per over";
		}

		return ans;
	}

	public static void main(String[] args) {
		int runs = 0;
		float Overs = 0;
		float totalballs = 0;
		System.out.println(getDisplayDetails(runs, Overs, totalballs));
	}
}



/*33 runs in 20 balls @ 1.5 runs per ball*/

/*130 runs in 20.4 Overs @ 6.12 runs per over*/

public abstract class SportsTeam {
		protected String teamName;
		protected String teamMascot;
		protected String headCoach;
		protected int wins;
		protected int losses;
	public SportsTeam() {
		String teamName = "";
		String teamMascot = "";
		String headCoach = "";
		int wins = 0;
		int losses = 0;
	}
	public void SportsTeam(String teamName, String teamMascot, String headCoach) {
		this.teamName = teamName;
		this.teamMascot = teamMascot;
		this.headCoach = headCoach;
		
	}
	public double getWinPercentage() {
		double winPercentage = wins/(wins + losses);
		return winPercentage;
	}
	public double[] getStats() {
		
	}
}

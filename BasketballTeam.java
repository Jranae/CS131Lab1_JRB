
public class BasketballTeam extends SportsTeam{
	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	public BasketballTeam() {
		String teamName = "";
		String teamMascot = "";
		String headCoach = "";
		int wins = 0;
		int losses = 0;
		int fieldGoals = 0;
		int fieldGoalsAttempted = 0;
		int freeThrows = 0;
		int freeThrowsAttempted = 0;
	}
	public void BasketballTeam(String teamName, String teamMascot, String headCoach) {
		int wins = 0;
		int losses = 0;
		int fieldGoals = 0;
		int fieldGoalsAttempted = 0;
		int freeThrows = 0;
		int freeThrowsAttempted = 0;
	}
	public double fieldGoalPercentage() {
		double fieldGoalPercentage = fieldGoals/fieldGoalsAttempted;
		return fieldGoalPercentage;
	}
	public double freeThrowPercentage() {
		double freeThrowPercentage = freeThrows/freeThrowsAttempted;
		return freeThrowPercentage;
	}
	public double[] getStats() {
		double [] stats = new double[3];
		stats [0] = getWinPercentage();
		stats [1] = fieldGoalPercentage();
		stats [2] = freeThrowPercentage();
		return stats;
	
	}
		
}

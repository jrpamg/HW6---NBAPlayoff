import java.util.ArrayList;
public class NBATeam {
	private String teamName;
	private ArrayList <String> playerNames = new ArrayList <String>();
	private ArrayList <Integer> playerAges = new ArrayList <Integer>();

	public NBATeam(String name) {
		this.teamName = name;
	}

	public void addAPlayer(String name, int age) {
		this.playerNames.add(name);
		this.playerAges.add(age);
	}

	public int getMaxAge() {
		int max = 0;
		for(int i = 0; i < this.playerAges.size(); i++) {
			if(max < this.playerAges.get(i)) max = this.playerAges.get(i);
		}
		return max;
	}

	public int getMinAge() {
		int min = this.playerAges.get(0) + 1;
		for(int i = 0; i < this.playerAges.size(); i++) {
			if(this.playerAges.get(i) < min) min = this.playerAges.get(i);
		}
		return min;
	}

	public int getAvgAge() {
		int sum = 0;
		for(int i = 0; i < this.playerAges.size(); i++) {
			sum += this.playerAges.get(i);
		}

		return sum/this.playerAges.size();
	}

	public int getNumOfPlayer(){
		return this.playerNames.size();
	}

}

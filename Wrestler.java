package Wrestlingrepeat;


public class Wrestler {
	
	private String name;
	private int rank;
	private double height;
	private double weight;
	private int matchesWon;
	private int matchesLost;
	private int totalMatches;

	public Wrestler(String name, int rank, double height, double weight,
			int matchesWon, int matchesLost) {
		
		this.name = name;
		this.rank = rank;
		this.height = height;
		this.weight = weight;
		this.matchesWon = matchesWon;
		this.matchesLost = matchesLost;
		this.totalMatches = matchesWon + matchesLost;
				
	}
	public void display(){
		System.out.println("name"+this.name);
		System.out.println("Rank" + this.rank  );
		System.out.println("height"+this.height);
		System.out.println("weight"+this.height);
		System.out.println("matcheswon"+this.matchesWon);
		System.out.println("matcheslost"+this.matchesLost);
		System.out.println("totalmatches"+this.totalMatches);
		
		}
	
	
	
}

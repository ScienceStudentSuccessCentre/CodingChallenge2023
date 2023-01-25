package application;

public class Player implements Comparable <Player> {
	private int rating;
	private String name;
	public static int SORT_BY_NAME = 0;
	public static int SORT_BY_RATING =1;
	public static int sortValue;


	public Player(String Name, int rating){
		name = Name;
		this.rating = rating;
	}
	public String getName(){
		return name;
	}
	public int getRating(){
		return rating;
	}


	public static void sortBy (int sortBy) {
		sortValue = sortBy;
	}

	public int compareTo(Player p) {
		int comparison = 0;
		if (sortValue == SORT_BY_NAME){
			comparison = name.compareTo(p.getName());
		}
		else if (sortValue == SORT_BY_RATING){
			comparison = Integer.valueOf(rating).compareTo(p.getRating());

		}
		return comparison;
	}
	public String toString() {

		return String.format("%-30s%-10s",name, rating);
	}

}

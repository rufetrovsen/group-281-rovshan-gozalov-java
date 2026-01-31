package homework_4;

public class PLayer {
	public class Player {
	    int id;

	    Player(int id) {
	        this.id = id;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Player player = (Player) obj;
	        return id == player.id;
	    }

	    public static void main(String[] args) {
	        Player p1 = new Player(1);
	        Player p2 = new Player(1);

	        System.out.println(p1.equals(p2)); // true
	    }
	}
}


8 9 ?
		
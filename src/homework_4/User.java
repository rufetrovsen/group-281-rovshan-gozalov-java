package homework_4;

public class User {

	    String role;

	    {
	        role = "guest";
	    }

	    public static void main(String[] args) {
	        User user = new User();
	        System.out.println(user.role);
	    }
	}


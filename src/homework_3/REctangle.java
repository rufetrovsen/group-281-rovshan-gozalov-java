package homework_3;

public class REctangle {
	    double width;
	    double height;

	    public REctangle(double width, double height) {
	        this.width = width;
	        this.height = height;
	    }

	    double area() {
	        return width * height;
	    }

	    REctangle scale(double factor) {
	        return new REctangle(width * factor, height * factor);
	    }
	}


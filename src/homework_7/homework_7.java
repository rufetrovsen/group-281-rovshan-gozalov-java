package homework_7;

public class homework_7 {
	    static int randomGrade() {
	        return (int)(Math.random() * 4) + 2;
	    }
	    public static void main(String[] args) {
	        int sum = 0;
	        int fives = 0;
	        for (int i = 1; i <= 20; i++) {
	            int g = randomGrade();
	            System.out.println("Lesson " + i + " → grade " + g);
	            sum += g;
	            if (g == 5) {
					fives++;
				}
	        }
	        System.out.println(Math.round((double)sum / 20));
	        System.out.println("Fives: " + fives);
	    }
	}

	class WeeklyWeather {
	    static long round(double t) {
	        return Math.round(t);
	    }
	    public static void main(String[] args) {
	        double[] t = {18.4,19.7,17.2,20.9,16.8,21.3,18.1};

	        double max = -100, min = 100;
	        for (double x : t) {
	            System.out.println(x + " → " + round(x));
	            max = Math.max(max, x);
	            min = Math.min(min, x);
	        }
	        System.out.println(max);
	        System.out.println(min);
	        System.out.println(max - min);
	    }
	}

	class PiggyBank {
	    static int coin() {
	        int[] c = {1,2,5,10};
	        return c[(int)(Math.random() * 4)];
	    }
	    public static void main(String[] args) {
	        int count = 0, sum = 0;
	        for (int i = 1; i <= 30; i++) {
	            int c = coin();
	            System.out.println(c);
	            count++;
	            sum += c;
	            if (c == 10) {
					System.out.println("Big coin!");
				}
	        }
	        System.out.println(count);
	        System.out.println(sum);
	        System.out.println(Math.round((double)sum / count));
	    }
	}

	class HouseArea {
	    static double area(double l, double w) {
	        return l * w;
	    }
	    public static void main(String[] args) {
	        double[][] r = {{4.5,3.2},{5.0,4.0},{3.8,3.5},{6.1,2.9},{4.2,4.2}};
	        double total = 0, max = 0;
	        for (double[] x : r) {
	            double a = area(x[0], x[1]);
	            System.out.println(a);
	            total += a;
	            max = Math.max(max, a);
	        }
	        System.out.println(Math.round(total));
	        System.out.println(max);
	    }
	}

	class ShopDistance {
	    static double dist(double x1,double y1,double x2,double y2) {
	        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
	    }
	    public static void main(String[] args) {
	        double[][] s = {{2,3},{5,1},{1,7},{6,6},{3,4},{8,2}};
	        double min = 1000, max = 0;
	        for (double[] x : s) {
	            double d = dist(0,0,x[0],x[1]);
	            System.out.println(d);
	            min = Math.min(min, d);
	            max = Math.max(max, d);
	        }
	        System.out.println(Math.round(min));
	        System.out.println(Math.round(max));
	    }
	}

	class NumberSquares {
	    public static void main(String[] args) {
	        double sum = 0;
	        for (int i = 1; i <= 12; i++) {
	            int n = (int)(Math.random() * 20) + 1;
	            double s = Math.pow(n,2);
	            System.out.println(s);
	            if (s > 100) {
					System.out.println("Big number!");
				}
	            sum += s;
	        }
	        System.out.println(Math.round(sum));
	    }
	}

	class AbsoluteNumbers {
	    public static void main(String[] args) {
	        int[] n = {-5,3,-8,12,-1,6,-9,4,2,-7};
	        int min = Integer.MAX_VALUE, max = 0, sum = 0;
	        for (int x : n) {
	            int a = Math.abs(x);
	            System.out.println(a);
	            min = Math.min(min, a);
	            max = Math.max(max, a);
	            sum += a;
	        }
	        System.out.println(min);
	        System.out.println(max);
	        System.out.println(sum);
	    }
	}

	class Circles {
	    static double area(double r) {
	        return Math.PI * r * r;
	    }
	    public static void main(String[] args) {
	        int[] r = {1,2,3,4,5,6,7};
	        double min = Double.MAX_VALUE, max = 0, sum = 0;
	        for (int x : r) {
	            double a = area(x);
	            System.out.println(a);
	            min = Math.min(min, a);
	            max = Math.max(max, a);
	            sum += a;
	        }
	        System.out.println(Math.round(min));
	        System.out.println(Math.round(max));
	        System.out.println(Math.round(sum));
	    }
	}

	class CeilFloor {
	    public static void main(String[] args) {
	        int c = 0;
	        for (int i = 1; i <= 15; i++) {
	            double n = Math.random() * 10;
	            System.out.println(n);
	            System.out.println(Math.ceil(n));
	            System.out.println(Math.floor(n));
	            if (n < 5) {
					System.out.println("Small number");
				}
	            if (n > 7) {
					c++;
				}
	        }
	        System.out.println(c);
	    }
	}

	class HigherLower {
	    public static void main(String[] args) {
	        int secret = (int)(Math.random() * 100) + 1;
	        boolean ok = false;
	        for (int i = 1; i <= 10; i++) {
	            int g = (int)(Math.random() * 100) + 1;
	            System.out.println(g);
	            if (g > secret) {
					System.out.println("Too high");
				} else if (g < secret) {
					System.out.println("Too low");
				} else {
	                System.out.println("Guessed!");
	                ok = true;
	                break;
	            }
	        }
	        System.out.println(secret);
	        if (!ok) {
				System.out.println("No luck");
			}
	    }
	}



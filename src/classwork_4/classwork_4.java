package classwork_4;

public class classwork_4 {

	public static void main(String[] args) {
		int num = 31;
		if (num % 2 == 0) {
			System.out.println("cetnoe");
		} else {
			System.out.println("necetnoe");
		}

		//2
		int a = 67;
		if (a == 90 - 100) {
			System.out.println("good boy");
		}else if (a ==  75 - 89) {
			System.out.println("good");
		}else if ( a == 60 - 74) {
			System.out.println("normal");
		}else if ( a <= 60) {
			System.out.println("bad");
		}else {
			System.out.println("LIAR");
		}

		// 3

		int d = 7;
		int b = 5;
		int c = 3;

		if ( d >= b + c) {
			System.out.println("yes ");
		}else {
			System.out.println("no");
		}

		//4

		int thing = 5300 ;
		if (thing >=5000) {
			System.out.println("15%");
		}else if (thing >= 4000) {
			System.out.println("10%");
		}else if (thing >= 3000) {
			System.out.println("5 %");
		}else {
			System.out.println("0");
		}

		//5

        int h = 3;
        int w = 7;

        for (int i = 0; i < h; i++) {
            String row = "";
            for (int j = 0; j < w; j++) {
                row += "*";
            }
            System.out.println(row);
        }


        //6

		int g = 6;
		for (int k = 1; k <= 10; k++) {
			System.out.println(k + "*" + g+ "=" + k * g);
		}

		//7

        int n = 10;

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
    }

}





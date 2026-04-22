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

        //9
//        ?

       //11
        int day =3;
        if (day == 1 || day == 2 || day==3 || day == 4 || day == 5) {
        	 System.out.println("den");
        }else if (day == 6|| day ==7) {
        	 System.out.println("noc");
        }else {
        	 System.out.println("error");
        }

        //12

        int ag = 67;
        if(ag <= 0 - 2) {
        	 System.out.println("mladenec");
        }else if ( ag <= 3 - 6) {
        	 System.out.println("skolnik");
        }else if (ag <= 7 - 10) {
        	 System.out.println("skolnik jr");
        }else if (ag <= 11 - 14) {
        	 System.out.println("podrotok jr");
        }else if ( ag <=15 - 17) {
        	 System.out.println("podrostok");
        }else if (ag <= 18 - 64) {
        	 System.out.println("bolshoy");
        }else if (ag >= 65) {
        	 System.out.println("pojiloy");
        }else {
        	 System.out.println("error");
        }
}





package Homework_;

public class NUM1 {

//	Integer.MAX_VALUE = 2147483647
//	Integer.MAX_VALUE + 1 = -2147483648
//
//			eto tak potomu chto tip int v java imeet granicu (ot -2147483648 do 2147483647),
//			i kogda my pribavlyaem 1 k maksimalnomu znacheniyu, proishodit perepolnenie (overflow),
//			i chislo “pereprygivaet” na samoe minimalnoe znachenie.

	//2
	?


	//3

	//Math.addExact(Integer.MAX_VALUE, 1);

	//4
	//int a = 100000, b = 100000;

//System.out.println((long)a * b);
//System.out.println(a * b)

//eto potomu chto (long)a * b snachala perevodit a v long i umnozhenie idet bez perepolneniya, a a * b delaetsya kak int,
//			i chislo slishkom bolshoe, poetomu proishodit overflow
//			i poluchaetsya neverny rezultat.
	//5

//	double nan = 0.0/0.0;
//
//	System.out.println(nan == nan);
//	System.out.println(Double.isNaN(nan));

//	eto potomu chto NaN ne raven dazhe samomu sebe, poetomu sravnenie cherez == daet false,
//	a metod Double.isNaN pravilno proveryaet eto znachenie.
}


package Homework_;

public class NUM2 {

	//1

	//gde narisovat

	//2
//	int a = 5;
//    int b = a;
//    b++;
//
//    System.out.println(a);
//    System.out.println(b);
    // a ostalsya 5, b stal 6, potomu chto primitivy kopiruyutsya po znacheniyu,
    // to est b poluchaet kopiyu a i izmeneniya ne vliyayut drug na druga


	//3
	//ne proxodili))

	//4

//	System.out.println(("a" + "b") == "ab");
//    System.out.println("ab".equals("ab"));

    // == sravnivaet ssylki (odin li eto obekt v pamyati)
    // equals sravnivaet znacheniya strok

	//5

//	field — eto pole obekta. Ono zhivyot v samom obekte v heap (kupke). To est, u kazhdogo sozdannogo obekta est svoya kopiya etogo field, i on sohranyaetsya poka zhiv obekt.
//	local — eto lokalnaya peremennaya metoda. Ona sozdaiotsya pri vyzove m() i zhivyot tolko vo vremya vypolneniya metoda, v stack (steke). Kak tolko metod zakanchivaetsya, local ischezayet.
//	V etom primere: int local = field; — v local kopiruetsya znachenie iz pole, a potom field++ menyaet uzhe sam obekt v heap, no local ostayotsya nezavisimym.


}

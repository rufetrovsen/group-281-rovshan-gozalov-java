package homework_8;

public class jet extends vehicle implements Idryvable, Istop,Iflyable  {
   public jet (String name ) {

	   super(name);
   }
   @Override
public void drive () {}
   @Override
public void stop () {}
   @Override
public void fly()  {}
}

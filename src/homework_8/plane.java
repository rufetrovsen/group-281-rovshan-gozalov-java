package homework_8;

public class plane extends vehicle implements Iflyable,Istop{
	 public plane (String name) {
     	super(name);
     }
	 @Override
	public void fly() {}
	 @Override
	public void stop () {}
}

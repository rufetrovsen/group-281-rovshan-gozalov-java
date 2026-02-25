package homework_8;

public class car extends vehicle  implements Idryvable,Istop{
            public car (String name) {
            	super(name);

            }
            @Override
			public void drive () {}
            @Override
			public void stop () {}
}


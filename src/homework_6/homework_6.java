package homework_6;

public class homework_6 {
	public class Main {

	        BMW bmw = new BMW();
	        bmw.start();
	        bmw.drift();

	        Mercedes mercedes = new Mercedes();
	        mercedes.start();
	        mercedes.autoPark();

	        Audi audi = new Audi();
	        audi.start();
	        audi.quattro();

	        Toyota toyota = new Toyota();
	        toyota.start();
	        toyota.economyDrive();

	        Honda honda = new Honda();
	        honda.start();
	        honda.vtec();

	        Nissan nissan = new Nissan();
	        nissan.start();
	        nissan.turboBoost();

	        Tesla tesla = new Tesla();
	        tesla.start();
	        tesla.autoPilot();

	        Ford ford = new Ford();
	        ford.start();
	        ford.tow();

	        Chevrolet chevrolet = new Chevrolet();
	        chevrolet.start();
	        chevrolet.burnout();

	        Lamborghini lambo = new Lamborghini();
	        lambo.start();
	        lambo.launchControl();

	        Ferrari ferrari = new Ferrari();
	        ferrari.start();
	        ferrari.raceMode();

	        Porsche porsche = new Porsche();
	        porsche.start();
	        porsche.sportPlus();

	        Bugatti bugatti = new Bugatti();
	        bugatti.start();
	        bugatti.topSpeed();

	        Kia kia = new Kia();
	        kia.start();
	        kia.smartMode();

	        Hyundai hyundai = new Hyundai();
	        hyundai.start();
	        hyundai.assistDrive();
	        
	        Mazda mazda = new Mazda();
	        mazda.start();
	        mazda.skyActive();

	        Subaru subaru = new Subaru();
	        subaru.start();
	        subaru.boxerEngine();

	        Volkswagen vw = new Volkswagen();
	        vw.start();
	        vw.dsgMode();

	        Volvo volvo = new Volvo();
	        volvo.start();
	        volvo.safetyShield();

	        Jaguar jaguar = new Jaguar();
	        jaguar.start();
	        jaguar.dynamicMode();

	        LandRover landRover = new LandRover();
	        landRover.start();
	        landRover.offRoad();

	        Jeep jeep = new Jeep();
	        jeep.start();
	        jeep.rockCrawl();

	        Dodge dodge = new Dodge();
	        dodge.start();
	        dodge.hellcatMode();

	        McLaren mclaren = new McLaren();
	        mclaren.start();
	        mclaren.trackMode();

	        RollsRoyce rolls = new RollsRoyce();
	        rolls.start();
	        rolls.luxuryMode();

	    }
	}


	class BMW {
	    void start() { System.out.println("BMW started"); }
	    void drift() { System.out.println("BMW drifting"); }
	}

	class Mercedes {
	    void start() { System.out.println("Mercedes started"); }
	    void autoPark() { System.out.println("Mercedes auto parking"); }
	}

	class Audi {
	    void start() { System.out.println("Audi started"); }
	    void quattro() { System.out.println("Audi quattro activated"); }
	}

	class Toyota {
	    void start() { System.out.println("Toyota started"); }
	    void economyDrive() { System.out.println("Toyota eco drive"); }
	}

	class Honda {
	    void start() { System.out.println("Honda started"); }
	    void vtec() { System.out.println("Honda VTEC kicked in"); }
	}

	class Nissan {
	    void start() { System.out.println("Nissan started"); }
	    void turboBoost() { System.out.println("Nissan turbo boost"); }
	}

	class Tesla {
	    void start() { System.out.println("Tesla powered on"); }
	    void autoPilot() { System.out.println("Tesla autopilot enabled"); }
	}

	class Ford {
	    void start() { System.out.println("Ford started"); }
	    void tow() { System.out.println("Ford towing heavy load"); }
	}

	class Chevrolet {
	    void start() { System.out.println("Chevrolet started"); }
	    void burnout() { System.out.println("Chevrolet burnout"); }
	}

	class Lamborghini {
	    void start() { System.out.println("Lamborghini started"); }
	    void launchControl() { System.out.println("Lamborghini launch control"); }
	}

	class Ferrari {
	    void start() { System.out.println("Ferrari started"); }
	    void raceMode() { System.out.println("Ferrari race mode"); }
	}

	class Porsche {
	    void start() { System.out.println("Porsche started"); }
	    void sportPlus() { System.out.println("Porsche Sport+ mode"); }
	}

	class Bugatti {
	    void start() { System.out.println("Bugatti started"); }
	    void topSpeed() { System.out.println("Bugatti max speed mode"); }
	}

	class Kia {
	    void start() { System.out.println("Kia started"); }
	    void smartMode() { System.out.println("Kia smart drive"); }
	}

	class Hyundai {
	    void start() { System.out.println("Hyundai started"); }
	    void assistDrive() { System.out.println("Hyundai drive assist"); }
	    
	    class Mazda {
	        void start() { System.out.println("Mazda started"); }
	        void skyActive() { System.out.println("Mazda SkyActive engine running"); }
	    }

	    class Subaru {
	        void start() { System.out.println("Subaru started"); }
	        void boxerEngine() { System.out.println("Subaru boxer engine power"); }
	    }

	    class Volkswagen {
	        void start() { System.out.println("Volkswagen started"); }
	        void dsgMode() { System.out.println("Volkswagen DSG transmission active"); }
	    }

	    class Volvo {
	        void start() { System.out.println("Volvo started"); }
	        void safetyShield() { System.out.println("Volvo safety shield active"); }
	    }

	    class Jaguar {
	        void start() { System.out.println("Jaguar started"); }
	        void dynamicMode() { System.out.println("Jaguar dynamic drive mode"); }
	    }

	    class LandRover {
	        void start() { System.out.println("Land Rover started"); }
	        void offRoad() { System.out.println("Land Rover off-road mode"); }
	    }

	    class Jeep {
	        void start() { System.out.println("Jeep started"); }
	        void rockCrawl() { System.out.println("Jeep rock crawl mode"); }
	    }

	    class Dodge {
	        void start() { System.out.println("Dodge started"); }
	        void hellcatMode() { System.out.println("Dodge Hellcat power unleashed"); }
	    }

	    class McLaren {
	        void start() { System.out.println("McLaren started"); }
	        void trackMode() { System.out.println("McLaren track mode active"); }
	    }

	    class RollsRoyce {
	        void start() { System.out.println("Rolls Royce started"); }
	        void luxuryMode() { System.out.println("Rolls Royce luxury mode"); }
	    }

	}
    
	}


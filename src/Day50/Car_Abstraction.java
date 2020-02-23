package Day50;




public abstract class Car_Abstraction {
    // public abstract return-type methodName();

        public abstract void start();
}

    class Toyota extends Car_Abstraction{

        @Override
      public void start(){
            System.out.println("Toyota starts by Push Button");
            System.out.println("Start Engine");
        }
    }

    class Jeep extends Car_Abstraction{

        public void start(){
            System.out.println("Jeep starts by Call Mechanic");
            System.out.println("Oil change");
            System.out.println("Start engine");
        }
    }

    abstract class ElectricCars extends Car_Abstraction{
     public abstract void HasBattery();
     // there 2 abstract methods: start(), HasBattery()
    }

    class Tesla extends ElectricCars{
    @Override
        public void start() {

    }
    @Override
        public void HasBattery(){

    }
    }

    class Test{
        public static void main(String[] args) {
            Jeep c1 = new Jeep();
            c1.start();

            Toyota c2 = new Toyota();
            c2.start();

            Tesla c3 = new Tesla();
            c3.start();

            //Car_Abstraction c4 = new Car_Abstraction();
              // abstract class is not concrete we can not create object
        }
    }



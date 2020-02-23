package Day55.Taxi;

//Taxi Engine -- Driver -- Passengers

// Taxi has Driver -- Driver object has 2 attribute (name, driverID)

public class Taxi {
    int plateNumber;
    Engine eng;  // just like String, we have class Engine
    // so I can use it as data type for my field

    Driver dr;  // just like String, we have class Driver
    // so I can use it as data type for my field

    public Taxi(int plateNumber, Engine eng, Driver dr) {
        this.plateNumber = plateNumber;
        this.eng = eng;
        this.dr = dr;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "Plate Number=" + plateNumber +
                ", Engine=" + eng.toString() +
                ", Driver=" + dr.toString() +
                '}';
    }
}

class Engine{
    String type;
    int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}

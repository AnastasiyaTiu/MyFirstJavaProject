package Day55.Taxi;

//Create a class called Driver -- it has 2 attribute (name String, driverID int)
// constructor to set the value, add toString method so we can print out
// Add a instance field called Driver dr, update your constructor to set Driver as well

public class Driver {
    String name;
    int driverID;

    public Driver(String name, int driverID) {
        this.name = name;
        this.driverID = driverID;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverID=" + driverID +
                '}';
    }
}

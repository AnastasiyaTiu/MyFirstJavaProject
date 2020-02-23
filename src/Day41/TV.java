package Day41;

public class TV {
    /*     TV
    attributes :
    brand , isOn , currentChannel
    String , boolean , int   (range from 1-50)
    behaviours :
    turnOn
            turnOff
    getCurrentChannel
    setCurrentChannel (newChannelNumber)
    moveForward
            moveBackward
          */

    String name;
    boolean isOn;
    int currentChannel;

    /**A method to return the value of the current channel for the TV
     * @return the value of current channel for the TV
     */
    public int getCurrentChannel(){
        return currentChannel;
    }

    public void setCurrentChannel(int newChannel) {
        if (isOn == true) {
            currentChannel = newChannel;
        } else {
            System.out.println("Turn On the TV first");
        }
    }
    public void turnOn(){

        System.out.println("Turning on TV");
       if(isOn == false) {
           isOn = true;
       }
    }
    public void turnOff(){
        // if(isOn){ // this will also work
        if(isOn == true) {  // checking for equality

            System.out.println("Turning off TV ");
         isOn = false;   // assigning the value
        }
    }

    @Override
    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}

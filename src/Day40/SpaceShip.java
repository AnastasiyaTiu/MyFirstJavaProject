package Day40;

public class SpaceShip {
   String name, currentDirection;
   int xCoordinate, yCoordinate;

   public void setInitialPosition(int x, int y){
     xCoordinate = x;
     yCoordinate = y;
    }

    public void setDirection(String newDirection){
      if (
              newDirection.equalsIgnoreCase("up") ||
                      newDirection.equalsIgnoreCase("down") ||
                      newDirection.equalsIgnoreCase("right") ||
                      newDirection.equalsIgnoreCase("left") ){
          currentDirection = newDirection;
      }else{
          System.out.println("Invalid Direction");

          // we set the direction to empty value if user pass wrong direction
          currentDirection= "";
      }
}

    public void move1Block(){

       switch (currentDirection){
           case "right" :
               xCoordinate += 1;
               break;
           case "left" :
               xCoordinate -= 1;
               break;
           case "up" :
               yCoordinate += 1;
               break;
           case "down" :
               yCoordinate -= 1;
               break;
           default:
               break;
       }
}
       // add a functionally to moveBlock with direction provided in one shot
  // this will take direction and move spaceship object 1 block

    public void move1Block(String newDirection){
// we are reusing the functionality we already have to set the direction
       setDirection(newDirection);
       move1Block();
    }


    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }

//    public String toString(){
//     return "current location is " + xCoordinate + ", " + yCoordinate;
//}

    }


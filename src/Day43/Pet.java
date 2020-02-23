package Day43;

public class Pet {
   /* Pet
            attributes
    type
            name
    constructor :
    no arg constructor
    set the type to "unknown"
    set the name to "no-name"
            2 args constructor
    set the name and type to what the caller passed
    behaviours
            getters , setters , toString
    speak : void method
    accept no parameter
    according to the type speak following
    cat --> meow with no arg
    dog --> woof
    cow --> mooo
    horse --> neinei
       */
      private String type, name;

      public Pet(){
          this.type = "unknown";
          this.name = "no-name";
      }

    public Pet(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public void speak(){
          // switch (type.toLowerCase());
          switch (type){
              case"cat":
                  System.out.println("MEOW");
                  break;
              case"dog":
                  System.out.println("WOOF");
                  break;
              case"horse":
                  System.out.println("NEIGH");
                  break;
              case"cow":
                  System.out.println("MOOO");
                  break;
              default:
                  System.out.println("UNKNOWN ANIMAL!");
          }
    }

      public String toString() {
       return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    // If your method does not read or modify object attribute
    // you can just make it static
    public static void showGeneralInfo(){
        System.out.println("PETS ARE FRIEND OF HUMANS");
    // this will not work
        // static method
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

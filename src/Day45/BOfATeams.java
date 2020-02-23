package Day45;

public class BOfATeams {
    /*
    Inheritance + static variable

    we have several teams
    Scrum team
    performance team
    DevOps
    UAT

    PO: Esra
    BA: Nuri

    developers: Mustafa, Muge, Daria
    testers: Hasan

    team name: BugBusters

    Bank Of America, Va Mclean

    7 projects --> 20 ST
                    7 performance team
                    7 devOps
                    7 UAT
   Inheritance --> parent's properties will inherit children
  BOfATeams


     */
//information --> for teams
    // instance variable
    int teamSize;
    String teamType;
    String teamRoles;
    String teamName;
    String projectName;
    int officeLocation;

    // static variable
    static String companyName;
    // actions
    public void Demo(){
        System.out.println("The team is doing Demo");
    }
}

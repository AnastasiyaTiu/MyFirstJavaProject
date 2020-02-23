package Day45;

public class Teams {
    public static void main(String[] args) {

        // since all the objects have the same company name
        // static way:
        // call the variable

        // create object
        BOfATeams team1 = new BOfATeams();
        team1.teamName = "Eagles";
        team1.teamSize = 9;
        team1.teamType = "UAT";
        team1.companyName = "BOfA";

                           // object
        BOfATeams team2 = new BOfATeams();
        team2.teamSize=12;
        team2.teamName="BugBusters";
        team2.teamType = "Scrum Team";
        team2.companyName = "BOfA";

        ScrumTeam team3 = new ScrumTeam();
        team3.standUp();  // ScrumTeam class
        team3.teamSize = 10;  // BOfATeam
        team3.companyName = "BOfA";


        BOfATeams team = new BOfATeams();
        BOfATeams team4 = new BOfATeams();
        BOfATeams team5 = new BOfATeams();
        BOfATeams team6 = new BOfATeams();

        System.out.println(team6.teamSize);
        System.out.println(team3.teamSize);

    }
}

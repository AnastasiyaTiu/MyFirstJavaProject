package Day52.Office_Hour_02_03;

public class BOfA {
    public static void main(String[] args) {
        BA Mohammed = new BA("Mohammed", 156000);
        //Mohammed.getEmployeeInfo();

        BA Parvin = new BA("Parvin", 145000);

        Tester Sevim = new Tester("Sevim", "QA", 120000);
        Tester Gunel = new Tester("Gunel", "Manual Tester", 110000);
        Tester Serife = new Tester("Serife", "SDET", 115000);

        Tester[] testers = { Sevim, Gunel, Serife };
        BA[] BATeam = { Mohammed, Parvin };

        ScrumTeam[][] scrum = {testers, BATeam};

        for(ScrumTeam[] eachArray : scrum){
            for(ScrumTeam eachMember : eachArray){
                eachMember.getEmployeeInfo();
            }
        }
    }
}

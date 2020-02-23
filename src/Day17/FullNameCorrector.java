package Day17;

public class FullNameCorrector {
    public static void main(String[] args) {
                     //   0123456789
        String fullName ="arYa sTark" ;
        int indexOfSpace= fullName.indexOf(" ");;
        String firstName = fullName.substring(0,4); // arYa
        // fullName.substring(0, indexOfSpace);
        String lastName= fullName.substring(5);   //sTarK
        // fullName.substring(indexOfSpace + 1);
        String firstNameCorrected =
                firstName.toUpperCase().substring(0,1)+   // ARYA -->> A
                firstName.toLowerCase().substring(1);     // arya --->> rya
        System.out.println(firstNameCorrected);
        String lastNameCorrected =
                lastName.toUpperCase().substring(0,1)+
                lastName.toLowerCase().substring(1);
        System.out.println(lastNameCorrected);

        fullName = firstNameCorrected + " "+ lastNameCorrected;
        System.out.println(fullName);
    }
}

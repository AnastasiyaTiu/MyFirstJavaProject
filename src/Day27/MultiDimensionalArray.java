package Day27;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testersTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalystTeam = {"Lisa", "Ershad", "Naila"};

        String[][] scrumTeam = {developersTeam, testersTeam, businessAnalystTeam };

        int maxLength = scrumTeam[0][0].length();
        String longestString= "";       // to store the longest string
        for (String[] each1DArray : scrumTeam ){
            for (String eachElement : each1DArray ) {
                if (maxLength < eachElement.length() ){   // to compare which String has the largest
                    maxLength = eachElement.length();

                    longestString = eachElement;   // if the string has the largest length, we assign .........
                }
            }
        }
        System.out.println(maxLength);
        System.out.println(longestString);

        for (String[] each1DArray : scrumTeam){
      //      for (String :  ) {

            //}

        }

    }
}

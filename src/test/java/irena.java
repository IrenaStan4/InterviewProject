public class irena {

    public static void irena(String str){

        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--){

            reverse += str.charAt(i);
        }

        System.out.println("reverse = " + reverse);
    }

    public static void removeDuplicates(){

        String str = "aaabbbccde";

        String unique = "";

        String[] uniques = str.split("");

        for (int i = 0; i < uniques.length; i++) {

            int count = 0;

            for (int j = 0; j < uniques.length; j++) {

                if (uniques[i].equalsIgnoreCase(uniques[j])){

                    count++;
                }

                if (count == 1) {

                    unique += uniques[i];
                }

            }
        }
        System.out.println("unique = " + unique);
    }



    public static void main(String[] args) {

        irena("irena");

        removeDuplicates();
    }
}

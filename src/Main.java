public class Main {
    public static void main(String[] args) {
        int typeInt = 127;
        float typeFloat = 0.27f;
        double typeDouble = 0.27;
        boolean typeBoolean = true;
        char typeChar = 'a';
        System.out.println(typeInt + "\n"
                + typeFloat + "\n"
                + typeDouble + "\n"
                + typeBoolean + "\n"
                + typeChar);
        enum Gender {
            male, female
        }
        System.out.println(Gender.female + " " +Gender.male);
    }




}
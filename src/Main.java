public class Main {
    public static void main(String[] args) {
        //#2 Case
        int typeInt = 127;
        float typeFloat = 0.27f;
        double typeDouble = 0.27;
        boolean typeBoolean = true;
        char typeChar = 'a';
        System.out.println("Int: " + typeInt
                + "\nFloat: " + typeFloat +
                "\nDouble: " + typeDouble +
                "\nBoolean: " + typeBoolean +
                "\nChar: " + typeChar);
        //#5 Case
        enum Gender {
            MALE, FEMALE
        }
        System.out.println("Gender Output: " + Gender.MALE + " " + Gender.FEMALE);
    }
}
// #3Case (целочисленный тип данных из 12 бит)
//2^12 = 4096/2 = 2048 (диапазон значений в 12 битной целочисленный переменной от -2048 до 2047)
// #4Case
//2^4 = 16 (осчет в Char начинается с 0 и того диапазон от 0 до 15 символов)
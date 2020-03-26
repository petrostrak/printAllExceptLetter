package mypackage;

public class MainClass {

    public static void main(String[] args) {
        String[] array = {"Nikolas", "Anastasia", "George", "Sofia", "Andrew", "Mary", "John"};
        for (String names : array) {
            if (names.indexOf('A', 0)!=-1) { //-1 if the char does not occur
                continue;
            }
            System.out.println(names);
        }

    }

}

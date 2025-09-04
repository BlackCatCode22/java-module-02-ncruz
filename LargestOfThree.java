//Nicholas Cruz
//date
//ref.
//chat gpt
//description
//this program hase three ints from user
//Finding the largest of three
//
public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println("\n What is biggest of these items\n basket one with 10 apples,basket two with 30 apples,or basket three with 15 apples");
        int basket1 = 20;
        int basket2 = 30;
        int basket3 = 16;

        if (basket1 > basket2) {
            if (basket1 > basket3) {
                System.out.println("basket 1 is the largest");
            } else {
                System.out.println("basket 3 is the largest");
            }
        } else {
            if (basket2 > basket3) {
                System.out.println("basket 2 is the largest");
            } else {
                System.out.println("basket 3 is the largest");
            }
        }
    }
}
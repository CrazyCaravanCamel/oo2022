public class Kodutoo1 {
    public static void main(String[] args) {
        System.out.println("Pead ära arvama arvu vahemikus 0-100");

        int randomNum = (int)(Math.random() * 101);

        int playerGuess = 50;
        if (randomNum < playerGuess) {
            System.out.println("Pakutud arv oli liiga suur");
            System.out.println("Arv oli " + randomNum);
        } else if (randomNum > playerGuess) {
            System.out.println("Pakutud arv oli liiga väike");
            System.out.println("Arv oli " + randomNum);
        } else if (randomNum == playerGuess) {
            System.out.println("Pakkusid õigesti!");
            System.out.println("Arv oli " + playerGuess);
        }
    }





}

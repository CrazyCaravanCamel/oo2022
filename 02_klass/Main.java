//paremklõps -- new Java class -- main
//main -- enter

public class Main {
    public static void main(String[] args) {
        Human one = new Human("Mihkel", 99, 2.22, true);
        Human two = new Human("Melinda",3123, 313.22, false);
        System.out.println(one);
        System.out.println(two);

        one.sayHello();
        two.sayHello();

        //main meetod 1 klass
        //uus klass, kus on vähemalt 2 muutujat
        //                  vähemalt 1 funktsioon
        //                  toString() funktsioon
        //main meetodis on seda vähemalt 2 korda välja kutsutud
        //           funktsiooni välja kutsuda
    }
}

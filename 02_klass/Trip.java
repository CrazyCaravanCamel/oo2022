public class Trip {
    public static void main(String[] args) {
        Bicycle one = new Bicycle("mägiratas", 2.3, 4);
        Bicycle two = new Bicycle("maanteejalgratas", 3.0, 2);
        System.out.println(one);
        System.out.println(two);

        one.Riding();
        two.Riding();
    }
}

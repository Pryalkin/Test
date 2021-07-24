package control;
public class Realization {
    public static void main(String[] args) {
        Sets sets1 = new Sets(3);
        Sets sets2 = new Sets("n", 4);
        sets1.setName("m");
        sets1.fillingTheSet();
        sets2.fillingTheSet();

        System.out.println(sets1);
        sets1.affiliation(7);
        System.out.println(sets2);
        sets2.affiliation(33);
    }
}

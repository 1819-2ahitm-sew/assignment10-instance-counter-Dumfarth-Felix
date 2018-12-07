public class Person {
    private String vName = "";
    private String nName = "";
    private static int instanzen = 0;

    public Person(String vName, String nName) {
        this.vName = vName;
        this.nName = nName;
        instanzen++;
    }

    public String getvName() {
        return vName;
    }

    public String getnName() {
        return nName;
    }

    public static int getInstanzen() {
        return instanzen;
    }
}

package module;
public class Main {
    public static void main(String[] args) {
        //Car x = new Car("asjdf", "343", 45, 34);
        //x.displayInfo();
        Track y = new Track("audi", "2000", 120, 4, 320, "Kазань - Питер");
        //y.displayInfo();
        //y.Departure();
        //Auto z = new Auto("dgdsfg", "2122", 122, 2, 6);
        //System.out.println(z.canAuto(5));
        //z.displayInfo();
        Plane d = new Plane("kzn - pit", "2321", 34);
        d.displayInfo();
        d.flight();
    }
}
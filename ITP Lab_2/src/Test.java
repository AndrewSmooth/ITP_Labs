public class Test {
    public static void main(String[] args) {
        Chair chair1 = new Chair();
        Chair chair2 = new Chair(1, 2, 3);
        Chair chair3 = new Chair(1, 2, 3, 5);
        Chair chair4 = new Chair(1, 2, 3, 5, true);
        Chair chair5 = new Chair(1, 2, 3, 5, true, true);
        chair5.displayInfo();
        System.out.println(chair5.getLegs());
        chair5.setLegs(6);
        System.out.println(chair5.getLegs());
        chair5.sit();
        chair5.standUp();

        System.out.println();

        Table table1 = new Table();
        Table table2 = new Table(1, 2, 3);
        Table table3 = new Table(1, 2, 3, "квадратный");
        Table table4 = new Table(1, 2, 3, "круглый", "большой");
        Table table5 = new Table(1, 2, 3, "прямоугольный", "средний", "новый");
        table5.displayInfo();
        System.out.println(table5.getForm());
        table5.setForm("круглый");
        System.out.println(table5.getForm());
        table5.makeLong();
        table5.makeShort();

        System.out.println();

        Bed bed1 = new Bed();
        Bed bed2 = new Bed(1, 2, 3);
        Bed bed3 = new Bed(1, 2, 3, 2);
        Bed bed4 = new Bed(1, 2, 3, 2, true);
        Bed bed5 = new Bed(1, 2, 3, 2, true, true);
        bed5.displayInfo();
        System.out.println(bed5.getPlaces());
        bed5.setPlaces(1);
        System.out.println(bed5.getPlaces());
        bed5.lieDown();
        bed5.standUp();

        System.out.println(Chair.objectsCount);
        chair1.sound();
        table1.sound();
        bed1.sound();
    }
}

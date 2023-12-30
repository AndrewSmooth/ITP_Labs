public class Chair extends Furniture{
    private int legs;
    private boolean hasCusion;
    private boolean hasBackRest;

    public Chair(double x, double y, double z, int legs, boolean hasCusion, boolean hasBackRest){
        super(x, y, z);
        this.legs = legs;
        this.hasCusion = hasCusion;
        this.hasBackRest = hasBackRest;
    }
    public Chair(double x, double y, double z, int legs, boolean hasCusion){
        super(x, y, z);
        this.legs = legs;
        this.hasBackRest = hasCusion;
        this.hasCusion = false;
    }
    public Chair(double x, double y, double z, int legs){
        super(x, y, z);
        this.legs = legs;
        this.hasBackRest = false;
        this.hasCusion = false;
    }
    public Chair(double x, double y, double z){
        super(x, y, z);
        this.legs = 4;
        this.hasBackRest = false;
        this.hasCusion = false;
    }
    public Chair(){
        super(1, 1, 1);
        this.legs = 4;
        this.hasCusion = false;
        this.hasBackRest = false;
    }

    public void sit(){
        System.out.println("Вы сели на стул");
    }
    public void standUp(){
        System.out.println("Вы встали со стула");
    }

    public void displayInfo(){
        System.out.println("Мягкое сиденье: " + hasCusion  + "\n" + "Спинка: " + hasBackRest + "\n" + "Количество ножек: " + legs);
    }

    public int getLegs(){
        return this.legs;
    }
    public boolean isHasCusion(){
        return hasCusion;
    }
    public boolean isHasBackRest(){
        return hasBackRest;
    }

    public void setLegs(int val){
        legs = val;
    }
    public void setHasCusion(boolean val){
        hasCusion = val;
    }
    public void setHasBackRest(boolean val){
        hasBackRest = val;
    }

    @Override
    public void sound(){
        System.out.println("shwk-shwk");
    }
}

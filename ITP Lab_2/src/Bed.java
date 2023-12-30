public class Bed extends Furniture{
    private int places;
    private boolean hasBoxes;
    private boolean isOrtopedic;

    public Bed(double x, double y, double z, int places, boolean hasBoxes, boolean isOrtopedic){
        super(x, y, z);
        this.places = places;
        this.hasBoxes = hasBoxes;
        this.isOrtopedic = isOrtopedic;
    }
    public Bed(double x, double y, double z, int places, boolean hasBoxes){
        super(x, y, z);
        this.places = places;
        this.hasBoxes = hasBoxes;
        isOrtopedic = false;
    }
    public Bed(double x, double y, double z, int places){
        super(x, y, z);
        this.places = places;
        hasBoxes = false;
        isOrtopedic = false;
    }
    public Bed(double x, double y, double z){
        super(x, y, z);
        places = 1;
        hasBoxes = false;
        isOrtopedic = false;
    }
    public Bed(){
        super(1, 1, 1);
        places = 1;
        hasBoxes = false;
        isOrtopedic = false;
    }

    public void displayInfo(){
        System.out.println("Количество мест: " + places + "\n" + "Есть ящики: " + hasBoxes + "\n" + "Ортопедический матрас: " + isOrtopedic);
    }
    public void lieDown(){
        System.out.println("Вы легли на кровать");
    }
    public void standUp(){
        System.out.println("Вы встали с кровати");
    }

    public int getPlaces() {
        return places;
    }
    public boolean getHasBoxes() {
        return hasBoxes;
    }
    public boolean getIsOropedic(){
        return isOrtopedic;
    }

    public void setPlaces(int val){
        places = val;
    }
    public void setHasBoxes(boolean val){
        hasBoxes = val;
    }
    public void setOrtopedic(boolean val) {
        isOrtopedic = val;
    }

    @Override
    public void sound(){
        System.out.println("puff");
    }

}

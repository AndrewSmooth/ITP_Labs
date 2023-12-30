public abstract class Furniture {
    private double width;
    private double height;
    private double depth;
    static int objectsCount;

    public Furniture(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
        objectsCount++;
    }

    public Furniture() {
        this(1, 1, 1);
        objectsCount++;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    public int getCount() {
        return objectsCount;
    }

    public void setWidth(double val) {
        width = val;
    }

    public void setHeight(double val) {
        height = val;
    }

    public void setDepth(double val) {
        depth = val;
    }

    abstract void sound();
}
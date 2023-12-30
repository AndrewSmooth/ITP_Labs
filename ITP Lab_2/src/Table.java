public class Table extends Furniture {
    private String form;
    private String size;
    private String state;

    public Table(double x, double y, double z, String form, String size, String state){
        super(x, y, z);
        this.form = form;
        this.size = size;
        this.state = state;
    }
    public Table(double x, double y, double z, String form, String sizez){
        super(x, y, z);
        this.form = form;
        this.size = size;
        this.state = "Неизвестно";
    }
    public Table(double x, double y, double z, String form){
        super(x, y, z);
        this.form = form;
        this.size = "Не указано";
        this.state = "Не указано";
    }
    public Table(double x, double y, double z){
        super(x, y, z);
        this.form = "Не указано";
        this.size = "Не указано";
        this.state = "Не указано";
    }
    public Table(){
        super(1, 1, 1);
        this.form = "Не указано";
        this.size = "Не указано";
        this.state = "Не указано";
    }
    public void displayInfo(){
        System.out.println("Форма: " + form + "\n" + "Размер: " + size + "\n" + "Состояние: " + state);
    }
    public void makeLong(){
        System.out.println("Вы разложили стол");
    }
    public void makeShort(){
        System.out.println("Вы сложили стол");
    }

    public String getForm(){
        return form;
    }
    public String getSize(){
        return size;
    }
    public String getState(){
        return state;
    }

    public void setForm(String val){
        form = val;
    }
    public void setSize(String val){
        size = val;
    }
    public void setState(String val){
        state = val;
    }

    @Override
    public void sound(){
        System.out.println("pom");
    }
}

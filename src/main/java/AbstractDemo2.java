public abstract class AbstractDemo2 {

    public abstract void show();

    public void defaultLog(){
        System.out.println("This is a default logger");
    }

   public String name = "Vishal";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

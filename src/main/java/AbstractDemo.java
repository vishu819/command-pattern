public abstract class AbstractDemo {

    public abstract void show();

    String student = "Vishal";

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

public class AbstractDemoMain {

    public static void main(String[] args) {
        AbstractDemo abstractDemo = new AbstrctDemoImpl1();

        abstractDemo.show();
        abstractDemo.defaultLog();
        System.out.println(abstractDemo.getName());
    }
}

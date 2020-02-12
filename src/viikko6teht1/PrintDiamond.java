package viikko6teht1;
public class PrintDiamond implements Runnable {

    public PrintDiamond() {
    }

    public void print(){
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" *****");       
        System.out.println("*******");
        System.out.println(" *****");
        System.out.println("  ***");
        System.out.println("   *");
    }

    @Override
    public void run() {
       print();
    }

    
}

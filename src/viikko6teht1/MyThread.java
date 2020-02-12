package viikko6teht1;
public class MyThread extends Thread {

    private char merkki;

    public MyThread(char merkki) {
        this.merkki = merkki;
    }

    public char getMerkki() {
        return merkki;
    }

    public void setMerkki(char merkki) {
        this.merkki = merkki;
    }

    public MyThread() {
    }
    
    
    @Override
    public void run(){
        print();
       
    }
    
    public void print(){
        System.out.println("  "+merkki+"");
        System.out.println(" "+merkki+merkki+merkki+"");
        System.out.println(""+merkki+merkki+merkki+merkki+merkki+"");
        System.out.println(" "+merkki+merkki+merkki+"");
        System.out.println("  "+merkki+"");
    
    
    }
    
}

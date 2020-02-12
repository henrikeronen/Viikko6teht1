package viikko6teht1;
public class PrintDiamond extends Thread {

        private int lkm;

    public PrintDiamond(int lkm) {
        this.lkm = lkm;
    }

        
    @Override
    public void run(){
        int counter = 0;
        while(counter<lkm){
            System.out.print("*");
        }    

}
    

    
        
    public int getLkm() {
        return lkm;
    }

    public void setLkm(int lkm) {
        this.lkm = lkm;
    }

    
    
    
}

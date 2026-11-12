public class Panaderia implements Observable {
    private boolean hayPan = false;

    public void sacarPan() {
        hayPan = true;
        System.out.println(">> Salio el pan caliente");
    }

    public boolean hayPan() {
        return hayPan;
    }
    public boolean noPan(){
        return !hayPan;
    }
      
}

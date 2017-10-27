package Exercici.composite;


public class LsVisitor implements AComponentVisitor {
    String files;

    @Override
    public void visit(Directory e) {
        files=files+"/n"+e.getName();
    }

    @Override
    public void visit(File e) {
        files=files+"/n/t"+e.getName();
    }
}

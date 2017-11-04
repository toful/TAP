package Exercici.composite;


public class LsVisitor implements AComponentVisitor {
    //String files;

    @Override
    public void visit(Directory e) {
        System.out.println(e.getName());
    }

    @Override
    public void visit(File e) {
        System.out.println("\t"+e.getName());
    }

}

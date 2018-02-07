package Exercice_Readme;

public class LsVisitor implements Visitor{
    @Override
    public void visit(Directory e) {
        System.out.println(e.getName());
        for(IComponent elem:e.getList()){
            elem.accept(this);
        }
    }

    @Override
    public void visit(File e) {
        System.out.println(e.getName());
    }
}

package Exercice_Readme;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchVisitor implements Visitor{
    private List<File> files;
    private Predicate<File> predicate;

    public SearchVisitor(Predicate<File> predicate){
        this.predicate=predicate;
        files= new ArrayList<>();
    }

    @Override
    public void visit(Directory e) {
        for(IComponent elem:e.getList()) {
            elem.accept(this);
        }
    }

    @Override
    public void visit(File e) {
        if(predicate.test(e)) files.add(e);
    }

    public List<File> getResult(){
        return files;
    }
}

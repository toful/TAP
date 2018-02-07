package Exercice_Readme;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class File implements IComponent{
    private String name;
    private int size;

    public File(String name, int size){
        this.name=name;
        this.size=size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void ls() {
        System.out.println("\t"+name);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public List<String> collect() {
        List<String> result = new ArrayList<String>();
        result.add(name);
        return result;
    }

    @Override
    public List<IComponent> toList() {
        List<IComponent> result = new ArrayList<>();
        result.add(this);
        return result;
    }

    public List<File> search(String name) {
        List<File> result= new ArrayList<>();
        if(this.name.equals(name)) result.add(this);
        return result;
    }

    @Override
    public List<File> search2(Predicate<File> predicate) {
        List<File> result= new ArrayList<>();
        if(predicate.test(this)) result.add(this);
        return result;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

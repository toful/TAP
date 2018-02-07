package Exercice_Readme;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Directory implements IComponent{
    private String name;
    private List<IComponent> list;
    private int size=0;

    public Directory(String name){
        this.name=name;
        list=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<IComponent> getList() {
        return list;
    }

    public void addChild(IComponent elem){
        list.add(elem);
    }

    public void ls(){
        System.out.println(name);
        list.forEach(elem -> System.out.println(elem.getName()));
    }

    @Override
    public int size() {
        int size=0;
        for(IComponent elem:list){
            size= size +elem.size();
        }
        return size;
    }

    @Override
    public List<String> collect() {
        List<String> result = new ArrayList<>();
        result.add(name);
        for(IComponent elem:list){
            result.addAll(elem.collect());
        }
        return result;
    }

    @Override
    public List<IComponent> toList() {
        List<IComponent> result = new ArrayList<>();
        result.add(this);
        for(IComponent elem:list){
            result.addAll(elem.toList());
        }
        return result;
    }

    @Override
    public List<File> search(String name) {
        List<File> result= new ArrayList<>();
        for(IComponent elem:list){
            result.addAll(elem.search(name));
        }
        return result;
    }

    @Override
    public List<File> search2(Predicate<File> predicate) {
        List<File> result= new ArrayList<>();
        for(IComponent elem:list){
            result.addAll(elem.search2(predicate));
        }
        return result;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

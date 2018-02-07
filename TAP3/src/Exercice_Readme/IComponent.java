package Exercice_Readme;

import java.util.List;
import java.util.function.Predicate;

public interface IComponent {

    public void ls();
    public int size();
    public String getName();
    public List<String> collect();
    public List<IComponent> toList();
    public List<File> search(String name);
    public List<File> search2(Predicate<File> predicate);
    public void accept(Visitor v);
}

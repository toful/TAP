package Exercici.composite;

import java.util.List;
import java.util.function.Predicate;

public interface AComponent {
	public int size();
	public String ls();
	public List<String> collect();
	public List<String> collect2();
	public List<AComponent> toList();
	public List<File> search(String file);
	public List<File> search(Predicate<File> predicate);
	public void accept(AComponentVisitor v);
}

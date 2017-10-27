package Exercici.composite;

import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Directory implements AComponent {

	private String name;
	private List <AComponent> children;

	public String getName(){return name;}

	public Directory(String name) {
		this.name = name;
		children = new LinkedList<AComponent>();
	}

	public void addChild(AComponent child) {
		children.add(child);

	}

	public void removeChild(AComponent child){
		children.remove(child);
	}

	public int size() {
		int result = 0;
		for (AComponent child:children)
			result = result + child.size();
		return result;
	}

	public String ls(){
		String files= name;
		for (AComponent child:children){
			files=files+"\n"+child.ls();
		}
		return files;
	}

	public List<String> collect(){
		List<String> files= new ArrayList<String>();
		files.add(name);
		for (AComponent child:children){
			for (String elem:child.collect()){
				files.add(elem);
			}
		}
		return files;
	}

	public List<String> collect2(){
		List<String> files= new ArrayList<String>();
		files.add(name);
		for (AComponent child:children){
			files.addAll(child.collect2());
		}
		return files;
	}

	public List<AComponent> toList(){
		List<AComponent> files= new ArrayList<AComponent>();
		files.add(this);
		for (AComponent child:children){
			files.addAll(child.toList());
		}
		return files;
	}

	@Override
	public List<File> search(String file) {
		List<File> files= new ArrayList<File>();
		for (AComponent child:children){
			files.addAll(child.search(file));
		}
		return files;
	}

	@Override
	public List<File> search(Predicate<File> predicate) {
		List<File> files= new ArrayList<File>();
		for (AComponent child:children){
			files.addAll(child.search(predicate));
		}
		return files;
	}

	@Override
	public void accept(AComponentVisitor v) {
		children.forEach(a -> a.accept(v));
		v.visit(this);
	}

	@Override
	public String toString() {
		return "Directory{" +
				"name='" + name + '\'' +
				'}';
	}
}

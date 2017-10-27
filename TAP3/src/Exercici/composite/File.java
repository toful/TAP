package Exercici.composite;

import java.util.function.Predicate;
import java.util.*;

public class File implements AComponent {

	private String name;
	private int size;


	public File(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
	public int size() {
		return size;
	}

	public String  ls(){
		return name;
	}

	public List<String> collect(){
		List<String> files= new ArrayList<String>();
		files.add(name);
		return(files);
	}

	public List<String> collect2(){
		List<String> files= new ArrayList<String>();
		files.add(name);
		return(files);
	}

	public List<AComponent> toList(){
		List<AComponent> files= new ArrayList<AComponent>();
		files.add(this);
		return files;
	}

	public List<File> search(String file){
		List<File> files= new ArrayList<File>();
		if (file.equals(name)) files.add(this);
		return files;
	}

	public void accept(AComponentVisitor v){
		v.visit(this);
	}

	@Override
	public List<File> search(Predicate<File> predicate) {
		List<File> files= new ArrayList<File>();
		if(predicate.test(this)) files.add(this);
		return files;
	}

	@Override
	public String toString() {
		return "File{" +
				"name='" + name + '\'' +
				", size=" + size +
				'}';
	}
}

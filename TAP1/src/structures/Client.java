package structures;

public class Client implements Comparable<Client>{
	private String name;
	private int age;

	public Client(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Client c) {
		//return this.name.compareTo(c.getName());
		int s1 = this.getAge();
		int s2 = c.getAge();

		if (s1 > s2)
			return 1;
		else if (s1 < s2)
			return -1;
		else
			return 0;

	}
}
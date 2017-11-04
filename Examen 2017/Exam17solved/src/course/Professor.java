package course;

/**
 * Created by pedro on 27/09/15.
 */
public class Professor extends Person {
    private String code;
    private Quality type;


    public Professor(String code, String name, Quality type, int age) {
        super(code, name, age);
        this.type = type;
    }

    public Quality getType() {
        return type;
    }

    public void setType(Quality type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString()+" type="+type;
    }

}

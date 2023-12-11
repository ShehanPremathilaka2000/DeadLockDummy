package dummy.deadlock.entity;

public class T1 {
    private int id;
    private int value;
    private int T2_id;

    public T1() {
    }

    public T1(int value, int t2_id) {
        this.value = value;
        T2_id = t2_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getT2_id() {
        return T2_id;
    }

    public void setT2_id(int t2_id) {
        T2_id = t2_id;
    }
}

package dummy.deadlock.entity;

public class T2 {
    private int id;
    private int value;
    private int T1_id;

    public T2() {
    }

    public T2(int value, int t1_id) {
        this.value = value;
        T1_id = t1_id;
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

    public int getT1_id() {
        return T1_id;
    }

    public void setT1_id(int t1_id) {
        T1_id = t1_id;
    }
}

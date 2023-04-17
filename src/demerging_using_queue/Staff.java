package demerging_using_queue;

public class Staff {
    private String name;
    private String gender;
    private String doB;

    public Staff() {
    }

    public Staff(String name, String gender, String doB) {
        this.name = name;
        this.gender = gender;
        this.doB = doB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getdoB() {
        return doB;
    }

    public void setdoB(String doB) {
        this.doB = doB;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", doB='" + doB + '\'' +
                '}';
    }
}

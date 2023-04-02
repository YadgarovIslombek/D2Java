package lesson20;

public class Teacher {
    private String name;
    private int age;
    private String degree;

    private String qon_guruhi;

    public void setAge(int age){
        if (age > 15) {
            this.age = age;
        }else {
            System.out.println("Noto'g'ri yosh kiritding");
        }
    }
    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getQon_guruhi() {
        return qon_guruhi;
    }

    public void setQon_guruhi(String qon_guruhi) {
        this.qon_guruhi = qon_guruhi;
    }

    public Teacher(String name, int age, String degree) {
        this.name = name;
        this.age = age;
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", degree='" + degree + '\'' +
                ", qon_guruhi='" + qon_guruhi + '\'' +
                '}';
    }
}

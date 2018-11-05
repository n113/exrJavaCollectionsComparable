public class Students implements Comparable<Students> {
    private String name = "";
    private String age = "";
    private String sex = "";

    Students(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    String getName() {
        return name;
    }

    String getAge() {
        return age;
    }

    String getSex() {
        return sex;
    }

    @Override
    public int compareTo(Students o) {
        return age.compareTo(o.getAge());
    }
}

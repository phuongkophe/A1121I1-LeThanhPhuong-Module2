package models;

public abstract class Person {
    private int id;
    private String name;
    private String address;
    private int age;
    private String sex;
    private String email;
    private String idCard;
    private int phoneNumber;

    public Person() {
    }

    public Person(int id, String name, String address, int age, String sex, String email, String idCard, int phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

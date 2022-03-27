package FuramaResort.src.models;

public abstract class Person {
    private String id;
    private String name;
    private String address;
    private String birthday;
    private String gender;
    private String email;
    private int idCard;
    private int phoneNumber;

    public Person() {
    }

    public Person(String id, String name, String address, String birthday, String gender, String email, int idCard, int phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.gender = gender;
        this.email = email;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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
                ", age=" + birthday +
                ", sex='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

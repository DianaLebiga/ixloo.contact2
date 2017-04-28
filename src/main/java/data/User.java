package data;

/**
 * Created by Diana on 03.04.2017.
 */
public class User {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String internationalPhone;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String comments;

    public User(String firstName, String lastName, String phoneNumber, String email, String internationalPhone,
                String address, String city, String state, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.internationalPhone = internationalPhone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public User(String firstName, String lastName, String phoneNumber, String email, String internationalPhone,
                String address, String city, String state, String zip, String comments) {
        this(firstName,lastName,phoneNumber,email,internationalPhone,address,city,state,zip);
        this.comments = comments;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInternationalPhone() {
        return internationalPhone;
    }

    public void setInternationalPhone(String internationalPhone) {
        this.internationalPhone = internationalPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}

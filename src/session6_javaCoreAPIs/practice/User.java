package session6_javaCoreAPIs.practice;

import java.util.UUID;

public class User {

    private String firstName;
    private String lastName;
    private UUID userId;
    private int age;
    private boolean isOldCustomer;
    private String currentCountry;
    private String email;
    private String phoneNumber;
    private String singInDate;
    private int currency;
    private String password;
    private UserAddress userAddress;

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

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isOldCustomer() {
        return isOldCustomer;
    }

    public void setOldCustomer(boolean oldCustomer) {
        isOldCustomer = oldCustomer;
    }

    public String getCurrentCountry() {
        return currentCountry;
    }

    public void setCurrentCountry(String currentCountry) {
        this.currentCountry = currentCountry;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSingInDate() {
        return singInDate;
    }

    public void setSingInDate(String singInDate) {
        this.singInDate = singInDate;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

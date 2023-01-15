package Lesson3;

public class Person {
    private String name;
    private String lastName;
    private String surname;
    private String gender;
    private String phoneNumber;
    private String birthDate;

    public Person() {
    }

    @Override
    public String toString() {
        return surname + " " +
                name + " " +
                lastName + " " +
                birthDate + " " +
                phoneNumber + " " +
                gender;
    }

    public void setName(String name) {
        if (this.name == null) {
            this.name = name;
        } else throw new RuntimeException("Имя уже указано, пожалуйста, проверьте ввод.");
    }

    public void setSurname(String surname) {
        if (this.surname == null) {
            this.surname = surname;
        } else throw new RuntimeException("Фамилия уже указана, пожалуйста, проверьте ввод.");

    }
    public void setLastName(String lastName) {
        if (this.lastName == null) {
        this.lastName = lastName;
        } else throw new RuntimeException("Отчество уже указано, пожалуйста, проверьте ввод.");
    }

    public void setGender(String gender) {
        if (this.gender == null) {
            this.gender = gender;
        } else throw new RuntimeException("Пол уже указан, пожалуйста, проверьте ввод.");
    }

    public void setBirthDate(String birthDate) {
        if (this.birthDate == null) {
            this.birthDate = birthDate;
        } else throw new RuntimeException("Дата рождения уже указана, пожалуйста, проверьте ввод.");
    }

    public void setPhoneNumber(String phoneNumber) {
        if (this.phoneNumber == null) {
            this.phoneNumber = phoneNumber;
        } else throw new RuntimeException("Номер телефона уже указан, пожалуйста, проверьте ввод.");
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

}

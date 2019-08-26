package patterns.builder;

public class ContactBuilder {

    private String name;
    private String surname;
    private String mail;
    private String phone;
    private String addres;

    public ContactBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ContactBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public ContactBuilder mail(String mail) {
        this.mail = mail;
        return this;
    }

    public ContactBuilder addres(String addres) {
        this.addres = addres;
        return this;
    }

    public ContactBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddres() {
        return addres;
    }

    public Contact build() {
        return new Contact(this);
    }
}

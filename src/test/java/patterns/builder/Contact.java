package patterns.builder;

public class Contact {

    private final String name;
    private final String surname;
    private final String mail;
    private final String phone;
    private final String addres;

    Contact(ContactBuilder builder) {
        this.name = builder.getName();
        this.surname = builder.getSurname();
        this.mail = builder.getMail();
        this.phone = builder.getPhone();
        this.addres = builder.getAddres();
    }

    public static void main(String[] args) {
        final Contact contactAlex = new ContactBuilder()
                .name("Aleksander")
                .surname("Scomyanov")
                .mail("skimyanov_alex@gmail.com")
                .addres("Minsk")
                .phone("+375 29 116 95 34")
                .build();
    }
}

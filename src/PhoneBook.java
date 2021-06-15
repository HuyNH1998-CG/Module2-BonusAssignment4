import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;

public class PhoneBook extends Phone {
    ArrayList<PhoneBook> PhoneList = new ArrayList<>();

    public PhoneBook() {
    }

    public PhoneBook(String name, String phone) {
        super(name, phone);
    }

    public void show() {
        for (PhoneBook p : PhoneList) {
            System.out.println(p);
        }
    }

    public String toString() {
        return "" + this.getName() + "/" + this.getPhone();
    }

    @Override
    void insertPhone(String name, String phone) {
        for (PhoneBook P : PhoneList) {
            if (P.getName().equals(name)) {
                if (!P.getPhone().equals(phone)) {
                    P.setPhone(((P.getPhone() + ":" + phone)));
                    return;
                }
                return;
            }
        }
        PhoneList.add(new PhoneBook(name, phone));
    }

    @Override
    void removePhone(String name) {
        PhoneBook target = null;
        for (PhoneBook P : PhoneList) {
            if (P.getName().equals(name)) {
                target = P;
            }
        }
        PhoneList.remove(target);
    }

    @Override
    void updatePhone(String name, String newPhone) {
        for (PhoneBook P : PhoneList) {
            if (P.getName().equals(name)) {
                P.setPhone(newPhone);
                return;
            }
        }
    }

    @Override
    void searchPhone(String name) {
        for (PhoneBook P : PhoneList) {
            if (P.getName().equals(name)) {
                System.out.println(P);
            }
            return;
        }

    }

    public static Comparator<PhoneBook> comparator = (o1, o2) -> {
        String Name1 = o1.getName().toUpperCase(Locale.ROOT);
        String Name2 = o2.getName().toUpperCase(Locale.ROOT);
        return Name1.compareTo(Name2);
    };

    @Override
    void sort() {
        PhoneList.sort(PhoneBook.comparator);
    }
}

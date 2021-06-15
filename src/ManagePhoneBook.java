import java.util.Scanner;

public class ManagePhoneBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        int choice;
        while (true) {
            System.out.println("PHONEBOOK MANAGEMENT SYSTEM");
            System.out.println("1.Insert Phone");
            System.out.println("2. Remove Phone");
            System.out.println("3. Update Phone");
            System.out.println("4. Search Phone");
            System.out.println("5. Sort");
            System.out.println("6. Exit");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.println("Input Name");
                    String name = input.nextLine();
                    System.out.println("Input Phone");
                    String phone = input.nextLine();
                    phoneBook.insertPhone(name,phone);
                    phoneBook.show();
                }
                case 2 ->{
                    System.out.println("Input name");
                    String name = input.nextLine();
                    phoneBook.removePhone(name);
                    phoneBook.show();
                }
                case 3 ->{
                    System.out.println("Input Name");
                    String name = input.nextLine();
                    System.out.println("Input Phone");
                    String phone = input.nextLine();
                    phoneBook.updatePhone(name,phone);
                    phoneBook.show();
                }
                case 4 ->{
                    System.out.println("Input Name");
                    String name = input.nextLine();
                    phoneBook.searchPhone(name);
                }
                case 5 ->{
                    System.out.println("Sorting...");
                    phoneBook.sort();
                    phoneBook.show();
                }
                case 6 -> System.exit(0);
            }
        }
    }
}

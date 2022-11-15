public class Main {
    public static void main(String[] args) {
        Human meetPerson1 = new Human();
        meetPerson1.yearOfBirth = 1988;
        meetPerson1.town = "Минск";
        meetPerson1.name = "Максим";
        meetPerson1.jobTitle = "Бренд Менеджер";
        System.out.println(meetPerson1);

        Human meetPerson2 = new Human("Аня", "Москва", 1993, "Методист образовательных программ");
        System.out.println(meetPerson2);
        Human meetPerson3 = new Human("Катя", "Калининград", 1992, "Продакт-менеджер");
        System.out.println(meetPerson3);
        Human meetPerson4 = new Human("Артём", "Минск", 1995, "Директор по развитию бизнеса");
        System.out.println(meetPerson4);
    }
}

public class Human {

    public int yearOfBirth;
    public String name;
    public String town;
    public String jobTitle;

    Human(String name, String town, int yearOfBirth, String jobTitle) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.jobTitle = jobTitle;
    }

    Human() {
        name = "Вася";
        town = "Кудыкина Гора";
        yearOfBirth = 100500;
        jobTitle = "Пенёк";
    }

    void meetPerson(int yearOfBirth, String name, String town) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности "+ jobTitle +". Будем знакомы!";
    }
}

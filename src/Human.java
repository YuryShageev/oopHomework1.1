public class Human {

    public int yearOfBirth;
    public String name;
    public String town;
    public String jobTitle;

    Human(String name, String town, int yearOfBirth, String jobTitle) {
        if (yearOfBirth == 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "Информация не указана";
        } else {

            this.town = town;
        }
        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    Human() {
        if (name == null) {
            name = "Информация не указана";
        } else {
            name = "Вася";
        }
        if (town == null) {
            town = "Информация не указана";
        } else {

            town = "Кудыкина Гора";
        }
        yearOfBirth = 100500;
        if (jobTitle == null) {
            jobTitle = "Информация не указана";
        } else {
            jobTitle = "Пенёк";
        }
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

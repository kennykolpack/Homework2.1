public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1
        Human maxim = new Human();
        maxim.name = "Максим";
        maxim.yearOfBirth = 1988;
        maxim.town = "Минск";
        maxim.jobTitle = "бренд-менеджер";
        Human anya = new Human();
        anya.name = "Аня";
        anya.yearOfBirth = 1993;
        anya.town = "Москва";
        anya.jobTitle = "методист образовательных программ";
        Human katya = new Human();
        katya.name = "Катя";
        katya.yearOfBirth = 1992;
        katya.town = "Калининград";
        katya.jobTitle = "продакт-менеджер";
        Human artem = new Human();
        artem.name = "Артем";
        artem.yearOfBirth = 1995;
        artem.town = "Москва";
        artem.jobTitle = "директор по развитию бизнеса";
        maxim.hi();
        anya.hi();
        katya.hi();
        artem.hi();
        // Домашнее задание 2
        Human maxim2 = new Human("Максим", "Минск", 1988, "бренд-менеджер");
        Human anya2 = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        Human katya2 = new Human("Катя", "Калининград", 1992, "продакт-менеджер");
        Human artem2 = new Human("Артем", "Москва", 1995, "директор по развитию бизнеса");
        maxim2.hi();
        anya2.hi();
        katya2.hi();
        artem2.hi();
    }
}
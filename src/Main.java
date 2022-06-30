public class Main {
    public static void main(String[] args) {


//        Задание 1, 3
        String firstName = "Иванов";
        String middleName = "Семён";
        String lastName = "Семёнович";
        String fullName = firstName +" "+ middleName +" "+ lastName;
        fullName = fullName.replace("ё", "е");
        System.out.println("ФИО сотрудника — " + fullName);

//        Задание 2, 3
        String fullNameUpper = fullName.toUpperCase();
        fullNameUpper = fullNameUpper.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper);

//        Задание 3
    }
}
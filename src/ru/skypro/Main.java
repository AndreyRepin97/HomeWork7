package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //task1
        System.out.println("Task1");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = lastName+middleName+firstName;

        System.out.println("ФИО сотрудника - "+fullName);

        //task2
        System.out.println("Task2");

        String bigName = fullName.toUpperCase();

        System.out.println(bigName);

        //task3
        System.out.println("Task3");

        fullName = "Иванов Семён Сёменович";
        System.out.println(fullName);

        char[] bukvaArr = fullName.toCharArray();

        for (int i=0;i<bukvaArr.length;i++){
            if (bukvaArr[i]=='ё') {
                bukvaArr[i] = 'е';
            }
        }
        String fullNameE = new String(bukvaArr);
        System.out.println(fullNameE);
    }
}

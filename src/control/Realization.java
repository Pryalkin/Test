package control;

import java.util.Scanner;

public class Realization {
    public static void main(String[] args) {
        Sets sets1 = null;
        Sets sets2 = null;
        boolean exit = true;
        while (exit) {
            boolean exit1 = true;
            boolean exit2 = true;
            boolean exit3 = true;
            System.out.println("Перед началом работы программы создаются объекты.");
            while (exit1) {
                boolean ob1 = false, ob2 = false;
                if (sets1 == null || sets2 == null) {
                    if (sets1 != null) {
                        System.out.println("Объект множества №1 создан.");
                        ob1 = true;
                    }
                    if (sets2 != null) {
                        System.out.println("Объект множества №2 создан.");
                        ob2 = true;
                    }
                    if (ob1) System.out.println("Для изменения объекта множества №1 нажмите 1.");
                    else System.out.println("Для создания объекта множества №1 нажмите 1.");
                    if (ob2) System.out.println("Для изменения объекта множества №2 нажмите 2.");
                    else System.out.println("Для создания объекта множества №2 нажмите 2.");
                    System.out.println("Для завершения программы нажмите 3");
                    Scanner ii = new Scanner(System.in);
                    int i = ii.nextInt();
                    switch (i) {
                        case 1:
                            System.out.println("Для вызова конструктора объета множества №1 с инициализацией нажмите 1");
                            System.out.println("Для вызова конструктора объета множества №1 без инициализацией нажмите 2");
                            System.out.println("Для выхода в меню выше нажмите 3");
                            Scanner jj = new Scanner(System.in);
                            int j = jj.nextInt();
                            switch (j) {
                                case 1:
                                    sets1 = createObjectWithInitialization(sets1);
                                    break;
                                case 2:
                                    sets1 = createAnObjectWithoutInitialization(sets1);
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("Вы не вызвали конструктор.");
                            }
                            break;
                        case 2:
                            System.out.println("Для вызова конструктора объета множества №2 с инициализацией нажмите 1");
                            System.out.println("Для вызова конструктора объета множества №2 без инициализацией нажмите 2");
                            System.out.println("Для выхода в меню выше нажмите 3");
                            Scanner kk = new Scanner(System.in);
                            int k = kk.nextInt();
                            switch (k) {
                                case 1:
                                    sets2 = createObjectWithInitialization(sets2);
                                    break;
                                case 2:
                                    sets2 = createAnObjectWithoutInitialization(sets2);
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("Вы не вызвали конструктор.");
                            }
                            break;
                        case 3:
                            exit = false;
                            exit1 = false;
                            exit2 = false;
                            exit3 = false;
                            continue;
                        default:
                            System.out.println("Вы не создали объект.");
                    }
                } else exit1 = false;
            }
            if (exit2) System.out.println("Объекты созданы и проинициализированы конструктором.");
            while (exit2) {
                if (!sets1.getQ() | !sets2.getQ()) {
                    System.out.println("Для инициализации имени после конструктора без инициализации нажмите 1");
                    System.out.println("Для заполнения множества после полной инициализации нажмите 2");
                    System.out.println("Для завершения программы нажмите 3");
                    Scanner ii = new Scanner(System.in);
                    int i = ii.nextInt();
                    switch (i) {
                        case 1:
                            if (sets1.getU()) System.out.println("Для изменении имени множества №1 нажмите 1.");
                            else System.out.println("Для инициализации имени множества №1 нажмите 1.");
                            if (sets2.getU()) System.out.println("Для изменении имени множества №2 нажмите 2.");
                            else System.out.println("Для инициализации имени множества №2 нажмите 2.");
                            System.out.println("Для выхода в меню выше нажмите 3.");
                            Scanner jj = new Scanner(System.in);
                            int j = jj.nextInt();
                            switch (j) {
                                case 1:
                                    System.out.println("Ввведите имя множества для инициализации.");
                                    Scanner name1 = new Scanner(System.in);
                                    System.out.print("Имя множества: ");
                                    String n1 = name1.next();
                                    sets1.setName(n1);
                                    break;
                                case 2:
                                    System.out.println("Ввведите имя множества для инициализации.");
                                    Scanner name2 = new Scanner(System.in);
                                    System.out.print("Имя множества: ");
                                    String n2 = name2.next();
                                    sets2.setName(n2);
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("Вы ввели иной код.");
                            }
                            break;
                        case 2:
                            if (sets1.getQ()) System.out.println("Для изменения множества №1 нажмите 1.");
                            else System.out.println("Для заполнения множества №1 нажмите 1.");
                            if (sets2.getQ()) System.out.println("Для изменения множества №2 нажмите 2.");
                            else System.out.println("Для заполнения множества №2 нажмите 2.");
                            System.out.println("Для выхода в меню выше нажмите 3.");
                            Scanner kk = new Scanner(System.in);
                            int k = kk.nextInt();
                            switch (k) {
                                case 1:
                                    sets1.fillingTheSet();
                                    break;
                                case 2:
                                    sets2.fillingTheSet();
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("Вы ввели иной код.");
                            }
                            break;
                        case 3:
                            exit = false;
                            exit2 = false;
                            exit3 = false;
                            continue;
                        default:
                            System.out.println("Вы ввели иной код.");
                    }
                } else exit2 = false;
            }
            if (exit3) System.out.println("Объекты созданы и проинициализированы конструктором, а так же запоненно множество.");
            while (exit3) {
                System.out.println("Для вызова метода объединения двух множеств нажмите 1.");
                System.out.println("Для вызова метода отвечающий на вопрос - принадлежит ли указанное значение множеству нажмите 2.");
                System.out.println("Для вызова метода вывода на печать элементов множества нажмите 3.");
                System.out.println("Для завершения программы нажмите 4.");
                System.out.println("Для создания новых объектов нажмите 5.");
                Scanner ii = new Scanner(System.in);
                int i = ii.nextInt();
                switch (i) {
                    case 1:
                        sets1.unionOfSets(sets2);
                        break;
                    case 2:
                        System.out.println("Вызов метода для множества №1 нажмите 1.");
                        System.out.println("Вызов метода для множества №1 нажмите 2.");
                        System.out.println("Для выхода в меню выше нажмите 3.");
                        Scanner jj = new Scanner(System.in);
                        int j = jj.nextInt();
                        switch (j) {
                            case 1:
                                System.out.print("Ввведите проверяймое число: ");
                                Scanner value1 = new Scanner(System.in);
                                int v1 = value1.nextInt();
                                sets1.affiliation(v1);
                                break;
                            case 2:
                                System.out.print("Ввведите проверяймое число: ");
                                Scanner value2 = new Scanner(System.in);
                                int v2 = value2.nextInt();
                                sets2.affiliation(v2);
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Вы ввели иной код.");
                        }
                        break;
                    case 3:
                        System.out.println("Вызов метода для множества №1 нажмите 1.");
                        System.out.println("Вызов метода для множества №1 нажмите 2.");
                        System.out.println("Для выхода в меню выше нажмите 3.");
                        Scanner kk = new Scanner(System.in);
                        int k = kk.nextInt();
                        switch (k) {
                            case 1:
                                System.out.println(sets1);
                                break;
                            case 2:
                                System.out.println(sets2);
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Вы ввели иной код.");
                        }
                        break;
                    case 4:
                        exit = false;
                        exit3 = false;
                        continue;
                    case 5:
                        sets1 = null;
                        sets2 = null;
                        exit3 = false;
                        continue;
                    default:
                        System.out.println("Вы ввели иной код.");
                }
            }
        }
        System.out.println("Программа успешна завершена!");

//        Sets sets1 = new Sets(3);
//        Sets sets2 = new Sets("n", 4);
//        sets1.setName("m");
//        sets1.fillingTheSet();
//        sets2.fillingTheSet();
//
//        System.out.println(sets1);
//        sets1.affiliation(7);
//        System.out.println(sets2);
//        sets2.affiliation(33);
    }

    public static Sets createObjectWithInitialization(Sets sets){
        System.out.println("Для вызова конструктора с инициализацией введите имя и мощность множества.");
        Scanner name = new Scanner(System.in);
        Scanner powerSet = new Scanner(System.in);
        System.out.print("Имя множества: ");
        String n = name.next();
        System.out.print("Мощность множества: ");
        int p = powerSet.nextInt();
        sets = new Sets(n, p);
        return sets;
    }

    public static Sets createAnObjectWithoutInitialization(Sets sets){
        System.out.println("Для вызова конструктора без инициализации введите мощность множества.");
        Scanner powerSet = new Scanner(System.in);
        System.out.print("Мощность множества: ");
        int p = powerSet.nextInt();
        sets = new Sets(p);
        return sets;
    }

}

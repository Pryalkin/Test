package control;

import java.util.Scanner;

public class Sets {

    private String name;
    private int powerSet;
    private int [] set;

    Sets (int powerSet){
        this.powerSet = powerSet*2;
    }

    Sets (String name, int powerSet){
        this.name = name.toUpperCase();
        this.powerSet = powerSet*2;
        this.set = new int [powerSet*2];
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
        this.set = new int[powerSet];
    }

    public void fillingTheSet(){
        if (name == null)
            System.out.println("Инициализируйте имя");
        else {
            for (int i = 0; i < powerSet; i++) {
                Scanner element = new Scanner(System.in);
                System.out.println("Введите " + (i + 1) + " элемент множества");
                int a = element.nextInt();
                if (i > 0) {
                    for (int j = 0; j < i; j++) {
                        if (set[j] == a) {
                            System.out.println("Такой элемент уже есть. Введите другой");
                            a = element.nextInt();
                            j = -1;
                        }
                    }
                }
                set[i] = a;
            }
            System.out.println("Операции присваевания прошли успешно");
        }
    }

    @Override
    public String toString() {
        if (name == null)
            return "Инициализируйте имя";
        else {
            StringBuffer sb = new StringBuffer();
            if (powerSet > 0) {
                sb.append('|').append(name).append('|').append(" = {");
                for (int i = 0; i < powerSet - 1; i++) {
                    sb.append(set[i]).append(';');
                }
                sb.append(set[powerSet - 1]).append('}');
            } else sb.append('|').append(name).append('|');
            return sb.toString();
        }
    }

    public void unionOfSets(Sets a){
        if (name == null & a.name == null)
            System.out.println("Инициализируйте имя");
        else {
            int c[] = new int[a.set.length + set.length];
            int i = 0;
            for (int j = 0; j < a.set.length; j++) {
                c[i] = a.set[j];
                i++;
            }
            for (int k = 0; k < set.length; k++) {
                c[i] = set[k];
                i++;
            }
            for (int start = 0; start < c.length - 1; start++) {
                for (int index = 0; index < c.length - 1 - start; index++) {
                    if (c[index] > c[(index + 1)]) {
                        int tmp = c[index];
                        c[index] = c[(index + 1)];
                        c[(index + 1)] = tmp;
                    }
                }
            }
            System.out.print(name + " \u22c3 " + a.name + " = {"); // знак объединения
            for (int q = 0; q < c.length - 1; q++) {
                if (q == c.length - 2) {
                    if (c[q] == c[(q + 1)]) System.out.println(c[q] + "}");
                    else System.out.println(c[q] + ";" + (c[q + 1]) + "}");
                } else if (c[q] != c[(q + 1)]) System.out.print(c[q] + ";");
            }
        }
    }

    public void affiliation(int value){
        if (name == null)
            System.out.println("Инициализируйте имя");
        else {
            double a = 0.1;
            for (int i = 0; i < powerSet; i++) {
                if (set[i] == value) a = set[i];
            }
            if (a == value)
                System.out.println("Значанеи " + value + " принадлежит множеству");
            else
                System.out.println("Значанеи " + value + " не принадлежит множеству");
        }
    }
}

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // Заполнение дерева
        // Названия переменных указывают на место заполняемого узла
        // например, rl - повернуть на право, затем налево
        // После заполнения дерево выводится на консоль, можете ориентироваться на него

        Tree ll = new Tree("Александа");
        Tree lr = new Tree("Владимир");
        Tree l = new Tree("Борис");
        l.setLeft(ll);
        l.setRight(lr);

        Tree rl = new Tree("Иннокентий");
        Tree rr = new Tree("Пантелеймон");
        Tree r = new Tree("Константин");
        r.setLeft(rl);
        r.setRight(rr);

        Tree root = new Tree("Зоя");
        root.setLeft(l);
        root.setRight(r);

        System.out.println(root); // Выведем дерево в консоль

        System.out.println("Проверка поиска по дереву:");
        System.out.println(root.contains("Иннокентий")); // true
        System.out.println(root.contains("Борис")); // true
        System.out.println(root.contains("Анна")); // false

        System.out.println("Проверка на пирамидальность по длине имени:");
        System.out.println(root.isNamePyramid()); // true

        // Меняем имя в одном из узлов на Павел
        // Пирамидальность должна нарушиться
        // А из-за того что имя на ту же букву,
        // в данном случае свойства дерева поиска сохраняются
        rr.setName("Павел");
        System.out.println(root.isNamePyramid()); // false
    }
}
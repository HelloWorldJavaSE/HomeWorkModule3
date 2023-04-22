import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Рекаментудеться расширить консоль!");
        while (exit==false) {
            System.out.println("Test 1: Проверка удаления Корня");
            System.out.println("Test 2: Проверка удаления липестка (Node не имеющая детей)");
            System.out.println("Test 3: Проверка удаления родителя (Node имеющая детей)");
            System.out.println("Test 4: Проверка удаления Дедушки (Node у которой дети имеют детей)"); // Осуждаю
            System.out.print("Укажите номер теста который вас интересует: ");
            byte testIndex = scanner.nextByte();
            //Проверка удаления корня
            if (testIndex == 1) {
                MyTree<Integer> myTree = new MyTree<>();
                myTree.put(100);
                myTree.put(160);
                myTree.put(50);
                System.out.println("Корень равен: " + myTree.getRoot() + "\n---Список всех элементов до удаления---");
                myTree.printTree();
                myTree.remove(100);
                System.out.println("Корень равен: " + myTree.getRoot() + "\n---Список всех элементов после удаления---");
                myTree.printTree();
                System.out.println("Продолжим Да/Нет?");
                String string = scanner.next();
                if(string.equals("Нет") || string.equals("нет")){
                    exit = true;
                }
            } else if (testIndex == 2) {
                MyTree<Integer> myTree = new MyTree<>();
                myTree.put(100);
                myTree.put(160);
                myTree.put(50);
                System.out.println("---Список всех элементов до удаления---");
                myTree.printTree();
                myTree.remove(50);
                System.out.println("---Список всех элементов после удаления---");
                myTree.printTree();
                System.out.println("Продолжим Да/Нет?");
                String string = scanner.next();
                if(string.equals("Нет") || string.equals("нет")){
                    exit = true;
                }
            }
            else if (testIndex==3){
                MyTree<Integer> myTree = new MyTree<>();
                myTree.put(40);
                myTree.put(60);
                myTree.put(20);
                myTree.put(10);
                myTree.put(30);
                System.out.println("---Список всех элементов до удаления---");
                myTree.printTree();
                myTree.remove(20);
                System.out.println("---Список всех элементов после удаления---");
                myTree.printTree();
                System.out.println("Продолжим Да/Нет?");
                String string = scanner.next();
                if(string.equals("Нет") || string.equals("нет")){
                    exit = true;
                }

            }
            else{
                MyTree<Integer> myTree = new MyTree<>();
                myTree.put(40);
                myTree.put(60);
                myTree.put(20);
                myTree.put(10);
                myTree.put(30);
                myTree.put(5);
                System.out.println("---Список всех элементов до удаления---");
                myTree.printTree();
                myTree.remove(20);
                System.out.println("---Список всех элементов после удаления---");
                myTree.printTree();
                System.out.println("Продолжим Да/Нет?");
                String string = scanner.next();
                if(string.equals("Нет") || string.equals("нет")){
                    exit = true;
                }
            }

        }
    }
}

public class Main {
    public static void main(String[] args) {
        PriorityQue priorityQue = new PriorityQue(5);
        try {
            priorityQue.pop(0); // удаление элемента когда очередь пуста
        }catch (RuntimeException e){
            System.out.println("Вы словили ошибку: " + e.getMessage());
        }
        priorityQue.enQueue(100);
        priorityQue.enQueue(300);
        priorityQue.enQueue(1230);
        priorityQue.enQueue(2);
        priorityQue.enQueue(120);
        try {
            priorityQue.enQueue(-1); // переполнение
        }catch (RuntimeException e){
            System.out.println("Вы словили ошибку: " + e.getMessage());
        }
        /* в моей очереди самый первый элемент (front) это наименьший в массиве в радиусе от front до rear
        это доказывает код ниже ( peek - возврощает первый элемент в очереди )
         */
        /*Значения очереди сейчас
        (100); // второй самый наименьший
        (300);
        (1230);
        (2); // самый наименьший
        (120);
         */
        System.out.println(priorityQue.peek());
        priorityQue.pop(2);
        System.out.println(priorityQue.peek());
        }
    }

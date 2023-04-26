import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        ArrayList<Phone> arrayList= new ArrayList<>();
        arrayList.add(new Phone("Криница Ксения Андреевна","Iphone 20 pro max",1000000));
        arrayList.add(new Phone("Xiaomi","Xiaomi redmi note 10",13000));
        arrayList.add(new Phone("Xiaomi","Xiaomi redmi note 11",15000));
        arrayList.add(new Phone("Криница Ксения Андреевна","Iphone 5",10000));
        System.out.println("Ниже приведен список производителей, укажите цифру интересуещего вас");
        final String str = "Криница Ксения Андреевна";
        final String str1 = "Xiaomi";
        System.out.println("1. " + str +"\n2. " +str1 );
        System.out.print("Введите цифру: ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextByte();
        ArrayList<String> result;
        if(index ==1){
            result = (ArrayList<String>) arrayList.stream().
                    filter(m -> m.nameManufacturer.equals(str)).map(phone -> phone.nameModule)
                    .collect(Collectors.toList());
        }
        else {
            result = (ArrayList<String>) arrayList.stream().
                    filter(m -> m.nameManufacturer.equals(str1)).map(phone -> phone.nameModule)
                    .collect(Collectors.toList());
        }
        System.out.println("Список всех моделей этого производителя: "+result);
        System.out.println();
        System.out.println("Вот список всех имеющихся моделей и их стоимость: ");
        arrayList.stream().sorted(new Phone()).forEach(phone -> System.out.println("Модель: "+phone.nameModule+", Стоимость: "+phone.cost));
        System.out.println();
        System.out.print("Мне кажеться вы хотите отсортировать методом сначала дорогие?\nДа/Нет: ");
        String scan = scanner.nextLine();
        scan = scanner.nextLine();
        if (scan.equals("Да")){
            arrayList.stream().sorted(new Phone().reversed()).forEach(phone -> System.out.println("Модель: "+phone.nameModule+", Стоимость: "+phone.cost));
        }
        else if(scan.equals("Нет")) {
            System.out.println("Ну и ладно :(");
        }
    }
}
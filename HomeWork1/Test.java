public class Test {
    public static void main(String[] args) {
        Iron iron = new Iron();
        Copper copper = new Copper();
        Steel steel = new Steel();
        Plastic plastic = new Plastic();
        Sword<Iron> ironSword= new Sword<>(iron);
        Sword<Steel> steelSword = new Sword<>(steel);
        Sword<Copper> copperSword = new Sword<>(copper);
        /* Error: Sword<Plastic> plasticSword = new Sword<>(plastic);
        Код выше мне не оч нравиться я думаю можно как то по кароче сделать, но не знаю как. */
        System.out.println("Проверка прочности true/false" );
        System.out.println("Меч из iron = " +ironSword.test());
        System.out.println("Меч из Steel = " +steelSword.test());
        System.out.println("Меч из Copper = " +copperSword.test());
      /*невозможно создать ссылку "plasticSword" а без нее вызвать метод тоже незя
         System.out.println("Меч из Plastic = " + plasticSword.test());
       */
    }
}

public class Sword <E extends Metal>{
        public E item;
        public Sword(E item){
            this.item = item;
        }
    public boolean test() {
        return item.getEndurance() > 49;

    }
}

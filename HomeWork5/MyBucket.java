//this could be your ad
public class MyBucket {
    private MyLinkedList<MyValueEntry> entry;
    public MyBucket(){
        if (entry == null){
            entry = new MyLinkedList<>();
        }
    }
    public void addEntry(MyValueEntry valueEntry){
        entry.add(valueEntry);
    }
    public void removeEntry(MyValueEntry valueEntry){
        this.entry.remove(valueEntry);
    }
    public MyLinkedList<MyValueEntry> getEntry() {
        return entry;
    }
}

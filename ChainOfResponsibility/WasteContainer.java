

public class WasteContainer {
    private String type;
    private int capacity;
    private int currentLevel;

    public WasteContainer (String type, int capacity, int currentLevel) {
        this.type = type;
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    public boolean isFull() {
        return currentLevel >= capacity;
    }

    public String getType(){
        return type;
    }
}
public abstract class Square {
    String name;
    private static int count = 0;

    public int getId() {
        return id;
    }

    int id = count++;

    public void landedOn(Player p) {}

    @Override
    public String toString() {
        return name;
    }
}

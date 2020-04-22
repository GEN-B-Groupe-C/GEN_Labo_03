public class Square {
    private String name;
    private static int count = 0;

    public int getId() {
        return id;
    }

    private int id = count++;

    Square()
    {
        if (id == 0)
        {
            name = "Go";
        } else {
            name = "Square " + id;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}

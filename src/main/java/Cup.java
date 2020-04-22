public class Cup {
    private final int NB_DIE = 2;
    Die[] dies = {new Die(), new Die()};
    private int total;

    public void roll()
    {
        total = 0;
        for (int i = 0; i < NB_DIE; i++) {
            dies[i].roll();
            total += dies[i].getFaceValue();
        }
    }

    public int getTotal()
    {
        return total;
    }
}

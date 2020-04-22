public class IncomeTaxSquare extends Square {
    IncomeTaxSquare()
    {
        name = "Income Tax Square";
    }

    public void landedOn(Player p) {
        int  w = p.getNetWorth();
        p.reduceCash(Math.min(200, w/10));
    }
}

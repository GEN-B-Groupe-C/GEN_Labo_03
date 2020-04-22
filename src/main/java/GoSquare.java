public class GoSquare extends Square{
    GoSquare() {
        name = "Go";
    }

    public void landedOn(Player p) {
        p.addCash(200);
    }
}

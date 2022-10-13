public class Player {
    private COLOR color;
    private String name;
    private Game game;

    public Player(COLOR color, String name, Game game) {
        this.color = color;
        this.name = name;
        this.game = game;
    }

    public COLOR getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public Game getGame() {
        return game;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}

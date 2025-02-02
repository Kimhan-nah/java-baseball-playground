package baseball;

public enum GameStatus {
    IN_GAME("continue"),
    GAME_OVER("over"),
    ;

    private final String command;

    GameStatus(String command) {
        this.command = command;
    }

    public boolean isProgress() {
        return this == IN_GAME;
    }

    public String getCommand() {
        return command;
    }

    public static GameStatus findByCommand(String command) {
        for (GameStatus gameStatus : GameStatus.values()) {
            if (command.equals(gameStatus.getCommand())) {
                return gameStatus;
            }
        }
        return null;
    }
}

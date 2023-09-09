package SnakeAndLadderOptimised.utils.assetInitializer.implementations;

import SnakeAndLadderOptimised.models.implementations.Ladder;
import SnakeAndLadderOptimised.models.implementations.Player;
import SnakeAndLadderOptimised.models.implementations.Snake;
import SnakeAndLadderOptimised.utils.assetInitializer.BoardAssetInitializer;
import SnakeAndLadderOptimised.utils.dice.Dice;
import SnakeAndLadderOptimised.utils.dice.implementations.DefaultDiceImplementation;
import SnakeAndLadderOptimised.utils.rolledValueCalculator.RolledValueCalculator;
import SnakeAndLadderOptimised.utils.rolledValueCalculator.implementations.DefaultRolledValueCalculator;

import java.util.*;

public class BoardInitializerImplementation implements BoardAssetInitializer {

    private List<Player> playersList;
    private List<Snake> snakeList;
    private List<Ladder> ladderList;
    private Map<Integer,Integer> snakePositionsMap;
    private Map<Integer,Integer> ladderPositionsMap;
    private Integer numberOfPlayers;
    private Integer numberOfSnakes;
    private Integer numberOfLadders;
    private Dice dice;
    private RolledValueCalculator rolledValueCalculator;

   private final Scanner sc = new Scanner(System.in);

    public BoardInitializerImplementation() {
        playersList = new ArrayList<>();
        snakeList = new ArrayList<>();
        ladderList =  new ArrayList<>();
        snakePositionsMap = new HashMap<>();
        ladderPositionsMap =  new HashMap<>();
    }

    @Override
    public void instantiateEntities() {
    instantiatePlayers();
    instantiateSnakes();
    instantiateLadders();
    convertPositionListToMap();
    initialiseDice();
    }

    private void convertPositionListToMap() {
        for (Snake s:snakeList) {
            snakePositionsMap.put(s.getStartPosition(), s.getEndPosition());
        }
        for (Ladder l:ladderList) {
            ladderPositionsMap.put(l.getStartPosition(), l.getEndPosition());
        }
    }

    private boolean isPlayerNameValid(String player){
        if (player.matches(".*[0-9].*")) {
            System.out.println("Invalid name! Name cannot contain numbers");
            return false;
        }
        return true;
    }

    private void instantiatePlayers() {
        System.out.println("Enter Number of Players");
        int numberOfPlayer = sc.nextInt();
        while (numberOfPlayer < 2) {
            System.out.println("Unsupported Input, Number of players must be at-least 2");
            numberOfPlayer = sc.nextInt();
        }
        this.numberOfPlayers = numberOfPlayer;

        for (int i = 0; i <this.numberOfPlayers ; i++) {
            int playerNumber = (i+1);
            System.out.println("Enter player number " + playerNumber + "'s name");
            String name = sc.next();
            while (!isPlayerNameValid(name)) {
                System.out.println("Enter player number " + playerNumber + "'s name");
                name = sc.next();
            }
            this.playersList.add(new Player(name, 0));
        }
    }

    private void instantiateSnakes() {
        System.out.println("Enter Number of Snakes");
        int numberOfSnake = sc.nextInt();
        while (numberOfSnake < 1) {
            System.out.println("Unsupported Input, Number of snakes must be at-least 1");
            numberOfSnake = sc.nextInt();
        }
        this.numberOfSnakes = numberOfSnake;

        for (int i = 0; i <this.numberOfSnakes ; i++) {
            int snakeNumber = (i+1);
            System.out.println("Enter snake number " + snakeNumber + "'s start position");
            int start = sc.nextInt();
            System.out.println("Enter snake number " + snakeNumber + "'s end position");
            int end = sc.nextInt();
            this.snakeList.add(new Snake(start, end));
        }
    }

    private void instantiateLadders() {
        System.out.println("Enter Number of Ladders");
        int numberOfLadder = sc.nextInt();
        while (numberOfLadder < 1) {
            System.out.println("Unsupported Input, Number of ladders must be at-least 1");
            numberOfLadder = sc.nextInt();
        }
        this.numberOfLadders = numberOfLadder;

        for (int i = 0; i <this.numberOfLadders ; i++) {
            int ladderNumber = (i+1);
            System.out.println("Enter ladder number " + ladderNumber + "'s start position");
            int start = sc.nextInt();
            System.out.println("Enter ladder number " + ladderNumber + "'s end position");
            int end = sc.nextInt();
            this.ladderList.add(new Ladder(start, end));
        }
    }

    public List<Player> getPlayersList() {
        return playersList;
    }

    public Map<Integer, Integer> getSnakePositionsMap() {
        return snakePositionsMap;
    }

    public Map<Integer, Integer> getLadderPositionsMap() {
        return ladderPositionsMap;
    }

    public void initialiseDice() {
        this.rolledValueCalculator = new DefaultRolledValueCalculator();
        this.dice = new DefaultDiceImplementation(this.rolledValueCalculator);
    }

    public Dice getDice() {
        return this.dice;
    }
}

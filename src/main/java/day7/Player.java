package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6)
            countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;

    }
    public void run(){

        if(stamina == MIN_STAMINA)
            return;

        stamina--;

        if(stamina == MIN_STAMINA)
        countPlayers--;

    }
    public static void info(){
        switch (countPlayers){
            case 6:
                System.out.println("На поле нет свободных мест");
                break;
            case 5:
                System.out.println("Команды неполные. На поле еще есть 1 свободное место");
                break;
            case 4:
                System.out.println("Команды неполные. На поле еще есть 2 свободных места");
                break;
            case 3:
                System.out.println("Команды неполные. На поле еще есть 3 свободных места");
                break;
            case 2:
                System.out.println("Команды неполные. На поле еще есть 4 свободных места");
                break;
            case 1:
                System.out.println("Команды неполные. На поле еще есть 5 свободных мест");
                break;
        }

    }
}

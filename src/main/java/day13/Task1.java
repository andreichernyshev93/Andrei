package day13;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("Андрей");
        User user2 = new User("Дмитрий");
        User user3 = new User("Николай");

        user1.sendMessage(user2, "Привет, " + user2 + "!");
        user1.sendMessage(user2, "Как твои дела?");

        user2.sendMessage(user1, "Привет, " + user1 + "!");
        user2.sendMessage(user1, "У меня все хорошо)))");
        user2.sendMessage(user1, "Сам как?))");

        user3.sendMessage(user1, "Привет, " + user1 + "))");
        user3.sendMessage(user1, "Ты как там?");
        user3.sendMessage(user1, "Где обитаешь вообще?))");

        user1.sendMessage(user3, "Привет, " + user3 + "))");
        user1.sendMessage(user3, "Да все хорошо), ты как?");
        user1.sendMessage(user3, "Я по Ставрополью езжу)) работаю");

        user3.sendMessage(user1, "Да я тоже хорошо))" + "\nОго ни фига себе))");

        MessageDatabase.showDialog(user1, user3);



    }
}

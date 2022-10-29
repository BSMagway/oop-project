package by.itstep.model;

public class User implements Playable {

        int id;
        String name;
        char gender; //cfn be 'm' or 'f' or ?

        void sayMyName() {
            System.out.println("Hello my name " + name);
        }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public void play(Game game) {
        System.out.println(name + " is playing in " + game.getName());
        game.start(this);
    }
}

class Test {
    public static void main(String[] args) {
        User user = new User();

        int a = 50;
        user.id = 100;
        user.name = "Alex";
        user.gender = 'm';

        user.sayMyName();
        String strOfUser = user.toString();

        BlackJack blackJack = new BlackJack();

        user.play(blackJack);

        //System.out.println(strOfUser);
    }
}

//https://github.com/slawek0102/z2.git

package pl.gda.wsb;

public class Footballer extends Person {

    private String club;
    private Position position;
    private int numberOfGoals;

    public Footballer(String name, String surname, String dateOfBirth, String club, Position position) {
        super(name, surname, dateOfBirth);
        this.club = club;
        this.position = position;
        this.numberOfGoals = numberOfGoals;
    }

    public String toString() {
        return "Name and surname: " + getName() + " " + getSurname() + " date of birth: " + getDateOfBirth() + "\n" +
                "Footballer's club: " + club + ", position " + position + "." + "\n" +
                "Number of goals: " + numberOfGoals + "\n";
    }

    public void scoreAGoal() {

        System.out.println("KS Weszło  " + getSurname() + " scores!");
        numberOfGoals++;
    }
}

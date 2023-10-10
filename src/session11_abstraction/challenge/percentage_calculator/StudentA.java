package session11_abstraction.challenge.percentage_calculator;

public class StudentA extends Marks {
    public double subject1;
    public double subject2;
    public double subject3;

    public StudentA(double geographyMark, double englishMark, double mathMark) {
        this.subject1 = geographyMark;
        this.subject2 = englishMark;
        this.subject3 = mathMark;
    }

    @Override
    public double getPercentage() {
        return (subject1 + subject2 + subject3) / 3;
    }
}
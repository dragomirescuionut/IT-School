package session11_abstraction.challenge.percentage_calculator;

public class StudentB extends Marks {
    public double subject1;
    public double subject2;
    public double subject3;
    public double subject4;

    public StudentB(double geographyMark, double englishMark, double mathMark, double physicsMark) {
        this.subject1 = geographyMark;
        this.subject2 = englishMark;
        this.subject3 = mathMark;
        this.subject4 = physicsMark;
    }

    @Override
    public double getPercentage() {
        return (subject1 + subject2 + subject3 + subject4) / 4;
    }
}
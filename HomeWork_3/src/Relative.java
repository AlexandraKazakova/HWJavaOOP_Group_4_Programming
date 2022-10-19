package HW.HomeWork_3.src;

public class Relative {
    private Human humanOne;
    private Human humanTwo;
    private Relation relation;

	public Relative(Human humanOne, Human humanTwo,Relation relation){
        this.humanOne = humanOne;
        this.humanTwo = humanTwo;
        this.relation = relation;
    }

    public Relation getRelative(){
        return relation;
    }

    public String getHumanSurname() {
        return humanOne.getSurname();
    }

    public String getHumanName() {
        return humanOne.getName();
    }


    @Override
    public String toString() {
        return relation.toString() + ": " + humanTwo;
    }
}

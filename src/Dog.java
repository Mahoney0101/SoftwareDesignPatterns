public abstract class Dog {

    private BarkBehaviour barkBehaviour;
    private InstinctBehaviour instinctBehaviour;

    public void setBarkBehaviour(BarkBehaviour barkBehaviour) {
        this.barkBehaviour = barkBehaviour;
    }

    public void setInstinctBehaviour(InstinctBehaviour instinctBehaviour) {
        this.instinctBehaviour = instinctBehaviour;
    }

    public abstract String display();

    public String run (){return "Runingggg......";}

    public String bark(){return barkBehaviour.Bark();}

    public String instinct(){return instinctBehaviour.instinct();}
}

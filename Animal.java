abstract class Animal {
    private String nameOfAninal;

    public String getNameOFAninal() {
        return nameOfAninal;
    }

    public void setNameOFAninal(String nameOFAninal) {
        this.nameOfAninal = nameOFAninal;
    }

    abstract void eat();
    abstract void sleep();
    void walk(){
        System.out.println("Animal is walking");
    }
}

public class Skeleton extends Boss{
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    public String printinfo() {
    return super.printinfo()+ "Количество стрел: " + this.arrows;

    }
}

package T1904E.Exam;

public class flight {
    private int number;
    private String destination;

    public flight() {
        if (number <0){
            this.number = 0;
            this.destination = "";
        }
    }

    public flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public void display(){
        System.out.printf("so hieu : "+this.number);
        System.out.printf("diem den: "+this.destination);
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public static void main(String[] args){
        flight g1 = new flight(857,"Toronto");
        g1.display();
    }
}

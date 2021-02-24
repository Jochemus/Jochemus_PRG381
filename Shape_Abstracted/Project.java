package Shape_Abstracted;

public class Project {
    //in abstract you cannot initiate the origional shape but a abstracted class
    public static void main(String[] args) {
        Shape sh = new Circle();
        sh.Display();
        sh.ShowMe();
    }
}

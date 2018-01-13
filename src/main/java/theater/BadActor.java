package theater;

public class BadActor implements Performance {
    public void perform() throws Exception {
        System.out.println("Bad perform");
        throw new Exception();
    }
}

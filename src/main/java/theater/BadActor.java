package theater;

public class BadActor implements Performance {
    @Override
    public void perform() throws Exception {
        System.out.println("Bad perform");
        throw new Exception();
    }

    @Override
    public void sing(String songName) {
        System.out.println(String.format("Sing %s ...", songName));
    }
}

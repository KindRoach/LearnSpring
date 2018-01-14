package theater;

public class GoodActor implements Performance {
    @Override
    public void perform() {
        System.out.println("Good perform");
    }

    @Override
    public void sing(String songName) {
        System.out.println(String.format("Sing %s ...", songName));
    }
}

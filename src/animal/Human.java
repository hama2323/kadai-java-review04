package animal;

public class Human extends Animal implements Thinkable {

    // フィールド
    private String shumi; // 趣味

    // getter
    public String getShumi() {
        return shumi;
    }

    // setter
    public void setShumi(String shumi) {
        this.shumi= shumi;
    }

    // 引数なしのコンストラクタ　
    public Human() {
    }

    // 引数ありのコンストラクタ
    public Human(String name, int old, String shumi) {
        super(name, old);
        this.shumi = shumi;
    }


    @Override
    public void think() {
        System.out.println("私は" + shumi + "　について考えています。");
    }

}

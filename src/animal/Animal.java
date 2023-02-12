package animal;

public class Animal {

    // フィールド
    private String name; // 名前
    private int old;      // 年齢（old）

    // 引数なしコンストラクタ
    public Animal() {

    }

    // 引数ありコンストラクタ
    public Animal(String name, int old) {
        this.name = name;
        this.old = old;

    }

    // 発言するメソッド
    public void say() {
        System.out.println(this.name + "　です。" + this.old + "　です。");
    }


}

package Oop091;

public class Q13 {
    // Animalクラスの定義
    public static class Animal {
        private int age;
        private String name;
        private String classification;

        // コンストラクタ
        public Animal(String name) {
            this.name = name;
        }

        // sayHelloメソッド
        public void sayHello() {
            System.out.println("Hello, I'm " + name + "!");
        }

        // getNameメソッド
        public String getName() {
            return name;
        }
    }

    // オブジェクトcatの作成とメソッド呼び出し
    public static void main(String[] args) {
        Animal cat = new Animal("Tama");
        cat.sayHello();
    }
}

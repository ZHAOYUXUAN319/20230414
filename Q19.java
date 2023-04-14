package Oop091;

public class Q19 {

	// Animalクラスの定義
	public class Animal {
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

	// Catクラスの定義
	public class Cat extends Animal {
	    // コンストラクタ
	    public Cat(String name) {
	        super(name);
	    }

	    // sayHelloメソッドをオーバーライド
	    @Override
	    public void sayHello() {
	        System.out.println("ニャー");
	    }
	}

	// Dogクラスの定義
	public class Dog extends Animal {
	    // コンストラクタ
	    public Dog(String name) {
	        super(name);
	    }

	    // sayHelloメソッドをオーバーライド
	    @Override
	    public void sayHello() {
	        System.out.println("ワン");
	    }
	}


}

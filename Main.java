//Java基本　復習

class Main {
  public static void main(String[] args) {
    // 変数nameに、好きな名前を代入してください
    String name = "奥村";
    
    // 変数ageに、好きな年齢を代入してください
    int age = 28;
    
    // 変数heightに、好きな身長を代入してください（例: 1.2）
    double height = 173.5;
    
    // 変数weightに、好きな体重を代入してください（例: 20.0）
    double weight = 83.5;
    
    // 変数bmiに、BMIを計算して代入してください
    double bmi = weight / height / height;
    
    // 名前、年齢、身長、体重、BMIに関する情報を出力してください
  System.out.println("名前は" + name + "です");
  System.out.println("年齢は" + age + "歳です");
  System.out.println("身長は" + height + "mです");
  System.out.println("体重は" + weight + "kgです");
  System.out.println("BMIは" + bmi + "です");
  }
}

//論理演算子

class Main {
  public static void main(String[] args) {
    // 条件式に直接trueをいれてください
    if (true) {
      System.out.println("条件式がtrueのため、出力されます");
    }
    
    // 条件式に直接falseをいれてください
    if (false) {
      System.out.println("条件式がfalseのため、出力されません");
    }
    
    int x = 5;
    // if文を用いて、変数xが2より大きいとき「xは2より大きい」と出力してください
    if (x > 2) {
      System.out.println("xは2より大きい");
    } 
    
    // if文を用いて、変数xが8より大きいとき「xは8より大きい」と出力してください
    if (x > 8) {
     System.out.println("xは8より大きい");
      
    }
    
  }
}
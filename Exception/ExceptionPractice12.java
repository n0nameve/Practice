package exception;

import java.util.Scanner;

class Score {
    int amount;
    
    public Score() {
    	
    }

    public void number(int amount, String str) {
        this.amount = amount;
        String[] data = str.split(" ");
        if (data.length != amount) {
            System.out.println("格式錯誤：請輸入剛好 " + amount + " 個分數");
            return;
        }
    }

    public Score(String str, int amount) throws ScoreOutOfRangeException {
        String[] data = str.split(" ");
        for (int i = 0; i < amount; i++) {
            int score = Integer.parseInt(data[i]);
            if (score < 0 || score > 100) {
                throw new ScoreOutOfRangeException("輸入格式錯誤：成績超出範圍");
            }
        }
        System.out.println("所有成績皆正確");
    }
}

class ScoreOutOfRangeException extends Exception {
    public ScoreOutOfRangeException(String msg) {
        super(msg);
    }
}

public class ExceptionPractice12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("要輸入幾個數字：");
        int num = sc.nextInt();
        sc.nextLine(); // 加這行吃掉 \n

        System.out.println("請輸入 " + num + " 個分數（以空格隔開）：");
        String str = sc.nextLine();

        Score s = new Score();
        s.number(num, str);

        try {
            s = new Score(str, num);
        } catch (ScoreOutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}

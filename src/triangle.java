import java.util.ArrayList;

public class triangle {
    public static int die1;
    public static int die2;
    public static int die3;
    public static int die4;
    public static int die5;
    public static ArrayList<Integer> a = new ArrayList<Integer>();
    public static int count;

    public triangle(int numberofdice) {
        roll(numberofdice);
    }

    public void roll(int numberofdice) {

        switch (numberofdice) {
            case 1:
                die1 = (int) (Math.random() * 6) + 1;
                a.add(die1);
                break;
            case 2:
                die1 = (int) (Math.random() * 6) + 1;
                die2 = (int) (Math.random() * 6) + 1;
                a.add(die1);
                a.add(die2);
                break;
            case 3:
                die1 = (int) (Math.random() * 6) + 1;
                die2 = (int) (Math.random() * 6) + 1;
                die3 = (int) (Math.random() * 6) + 1;
                a.add(die1);
                a.add(die2);
                a.add(die3);
                break;
            case 4:
                die1 = (int) (Math.random() * 6) + 1;
                die2 = (int) (Math.random() * 6) + 1;
                die3 = (int) (Math.random() * 6) + 1;
                die4 = (int) (Math.random() * 6) + 1;
                a.add(die1);
                a.add(die2);
                a.add(die3);
                a.add(die4);
                break;
            case 5:
                die1 = (int) (Math.random() * 6) + 1;
                die2 = (int) (Math.random() * 6) + 1;
                die3 = (int) (Math.random() * 6) + 1;
                die4 = (int) (Math.random() * 6) + 1;
                die5 = (int) (Math.random() * 6) + 1;
                a.add(die1);
                a.add(die2);
                a.add(die3);
                a.add(die4);
                a.add(die5);
                break;
        }

    }

    public static int mini() {
        int min = a.get(0);
        for (int i : a) {
            min = min < i ? min : i;
        }
        removemin(min);
        return min;
    }

    public static void removemin(int minval) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == minval) {
                a.remove(i);
                break;
            }
        }
        //a.remove(minval);
    }

    public static void main(String[] args) {
        for (int s = 0; s <= 10000; s++) {
            int samp = 0;
            int numberofdice = 5;
            if (samp == 0) {
                new triangle(numberofdice);
                //System.out.println(a);
                samp = samp + 1;
            }
            for (int l = 0; l >= 0; l++) {
                if (a.contains(3)) {
                    //a.clear();
                    for (int j = 5; numberofdice > 0; j--) {
                        //System.out.println(a);
                        for (int i = 0; i < a.size(); i++) {
                            if (a.get(i) == 3) {
                                a.remove(i);
                            }
                        }
                        //System.out.println(a);
                        numberofdice = a.size();
                        a.clear();
                        new triangle(numberofdice);
                        //System.out.println(a);
                        //System.out.println(count);
                        break;
                    }
                } else {
                    for (int k = 0; k < a.size(); k++) {
                        int minimumval = mini();
                        //System.out.println(a);
                        //System.out.println(minimumval);
                        if (minimumval != 3) {
                            count = count + minimumval;
                        } else {
                            count = count + 0;
                        }
                        //System.out.println(a);
                        numberofdice = a.size();
                        a.clear();
                        new triangle(numberofdice);
                        //System.out.println(a);
                        //System.out.println(count);

                    }

                }
            }

            System.out.println(count);
            count = 0;
            a.clear();
        }
    }
}
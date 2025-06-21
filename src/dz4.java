public class dz4 {
    public static void main(String[] args) {
        var i = 0;
        while (i<=50){
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        //2
        System.out.println();
        var w = 0;
        var n = 0;
        do {
            w++;
            if (w % 7 == 0){
                n++;
            }
        }while (w<=100);
        System.out.println(n);
        //3
        var a = 0;
        var r = 0;
        while (a< 100){
            a++;
            r += a;
        }
        System.out.println(r);
        //4
        System.out.println();
        int min = 1;
        int max = 20;
        var k = 0;
        int randomNumber = 0;
        do {
            randomNumber = min + (int)(Math.random() * ((max - min) + 1));
            k++;
        }while (randomNumber != 15);
        System.out.println(k);




    }
}

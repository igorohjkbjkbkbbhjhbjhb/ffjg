public class dz5 {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6,8,9,0,7};
        double e =0;

        for (int i = 0;i<a.length; i++){
        e += a[i];
        }
        double r = e /a.length;
        System.out.println( r);
        //2
        int[]ert ={0,-1,-2,-3,-4,-5,-6,7,-8,-9};
        for (int i =0;i<ert.length;i++){
            if(ert[i]<0){
               ert[i]=ert[i]*-1;

            }
            System.out.print(ert[i] + " ");

        }
        //4
              int[]y ={1,2,3,4,5,5,6,7,8,8,9,9,8,76,5,4,};
        var u = 0;
        for (int i = 0;i<y.length;i++){
            if (y[i] >= u){
                u = y[i];
                
            }


        }
        System.out.println(u);
        //3
        var op=0;
        int[][]o ={{0,1,2,3},{4,5,6,7},{8,9,10,11}};
        var l = 0;
        for (int g =0; g<o.length;g++){
            op *=0;
            l = g;
            for (int i=0;i<o[g].length;i++){
                op += o[g][i];

            }
            System.out.println(op-l);

        }

        //5
        int[] numbers = {0,1,3,4,7,4,4,3};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (j != i) {
                    if (numbers[i] == numbers[j]) {
                        System.out.println("Совпадение с цифрой " + numbers[i] + " по индексу " + j);
                    }
                }
            }
        }


    }
}

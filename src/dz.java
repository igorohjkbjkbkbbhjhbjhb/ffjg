public class dz {
    public static void main(String[] args) {
        var age = 100;
        if (age >=2 && age <=6  ) {
            System.out.println(" если возраст человека = " + age + ", то ему нужно ходить в сад");
        } else if (age >=7 && age <=17) {
            System.out.println(" если возраст человека = " + age + ", то ему нужно ходить в школу");
        } else if (age >=18 && age <=24) {
            System.out.println("если возраст человека = " + age + ", то ему нужно ходить в университет");

        }else {
            System.out.println("если возраст человека = " + age + ", то ему нужно ходить на роботу");
            }
// номер 2

        var nompas1 = 103;
        if (nompas1 <= 102 ){
            System.out.println("есть места");
        }else {
            System.out.println("иди пешком");
        }
// nomber 3
        var year = 20080;
        if(year % 4 == 0 || year % 400 == 0 && year > 1584  && year % 100 != 0 ){
            System.out.println("год високостный");
        }else {
            System.out.println("не високостный");
        }
// nombre 4
        byte mounth = 1;
        if (mounth <= 12){
        switch (mounth) {
            case 1:
                System.out.println("zima");
                break;
            case 2:
                System.out.println("zima");
                break;
            case 3:
                System.out.println("vesna");
                break;
            case 4:
                System.out.println("vesna");
                break;
            case 5:
                System.out.println("vesna");
                break;
            case 6:
                System.out.println("leto");
                break;
            case 7:
                System.out.println("leto");
                break;
            case 8:
                System.out.println("leto");
                break;
            case 9:
                System.out.println("osen");
                break;
            case 10:
                System.out.println("osen");
                break;
            case 11:
                System.out.println("osen");
                break;
            case 12:
                System.out.println("zima");
                break;
        }



    }
}
}
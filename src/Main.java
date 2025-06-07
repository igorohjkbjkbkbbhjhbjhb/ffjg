public class Main {
    public static void main(String[] args) {
        var a = 10;
        var e = 110;
        var name = "Igor";
        System.out.println(--e);
        System.out.println("Hello world");
        System.out.println(++a);
        System.out.println("privet "+name);
        System.out.println(a-e);
        System.out.println(e%a);
        System.out.println(e+a);
        System.out.println(e*a);
        System.out.println(e/a);
////целочисленный тип (byte,short,int,long)
        byte b = 5;//от -128 до 127 занимает 1 байт памяти
        short c = 105; //от -32768 до 32767  занимает 2 байта
        int d = 100; // от -2147483648 до 2147483647 занимает 4 байта
        long f = 70; // дофига
////дробные (float, double)
        double g = 1.42343223423423;
        float h = 1.42343234432f;
        double l = b*5+c*2+d*2+f*4; // 25 + 210 + 200 + 280 =
//        System.out.println(l);

        char n =1;
        boolean m = true;
        System.out.println("Значение переменной a с типом var равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом int равно " + d);
        System.out.println("Значение переменной f с типом long равно " + f);
        System.out.println("Значение переменной g с типом double равно " + g);
        System.out.println("Значение переменной h с типом float равно " + h);
        System.out.println("Значение переменной n с типом char равно " + n);
        System.out.println("Значение переменной m с типом boolean равно " + m);
        System.out.println(l/1000);
        var masa = 67760;
        var denis = 83690;
        var crist = 26230;
        var t = masa*1.1;
        var io = denis*1.1;
        var hk = crist*1.1;
        var kl = t*12;
        var dfa = io*12;
        var fds = hk*12;
        var vsd =masa*12;
        var er = denis*12;
        var vdsd = crist*12;
        var kel = kl-vsd;
        var dfaf = dfa-er;
        var fads = fds-vdsd;
        System.out.println("Маша теперь получает "+ t + " годовой доход вырос на" + kel);
        System.out.println("Денис теперь получает "+ io + " годовой доход вырос на" + dfaf);
        System.out.println("Кристина теперь получает "+ hk + " годовой доход вырос на" + fads);
        float i = (float) g;

        byte age = 110;
        boolean inAdult = true;
        if (age >=18 && age <100  ) {
            System.out.println("возраст- " + age + ", ТЫ СОВЕРШЕННОЛЕТНИЙ");
        } else if (age <= 0 ) {
            System.out.println("НЕ ЗВЕЗДИ");
        } else if (age >=100) {
            System.out.println("возраст- " + age + ", ТЫ долгожитель");

        } else {
            System.out.println("возраст- " + age + ", ТЫ НЕ СОВЕРШЕННОЛЕТНИЙ");
            }

        }
//        byte day_of_weake = 1;
//        switch (age){
//            case 1:
//                System.out.println("ponedelnik");
//                break;
//            case 2:
//                System.out.println("vtornik");
//                break;
//            case 3:
//                System.out.println("sreda");
//                break;
//            case 4:
//                System.out.println("chetverg");
//                break;
//            case 5:
//                System.out.println("piatnica");
//                break;
//            case 6:
//                System.out.println("subbota");
//                break;
//            case 7:
//                System.out.println("voscresenie");
//                break;
//            default:
//                System.out.println("ааааааа, оса");
//                break;
//        }


    }

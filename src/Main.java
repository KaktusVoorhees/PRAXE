import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//          int i= 4444, j=7;
//        System.out.println("soucet je " +(i+j));
//        char c= '\n'; //hodnota je 10
//        System.out.println(i+c);
//        System.out.println(i+'\n');
//        System.out.println("i "+i+'\n');
//       Locale.setDefault(new Locale("en", "us"));
//        System.out.format("i=%d, j=%d%n", i,j);
//        System.out.format("i=|%7d|%n", i); //zarovnání na 7 míst do prava
//        System.out.format("i=|%-7d|%n", i); //zarovnání na 7 míst do leva
//        System.out.format("i=|%+7d|%n", i); //zarovnání na 7 míst do prava , výpis kladného znaménka
//        System.out.format("i=|%07d|%n", i); //výpis nevýznamových nul
//        System.out.format("i=|%,7d|%n", i); // oddělovaač řádů
//
//        System.out.format("i=0x%x, i=0%o, i=%d%n",i,i,i); //hexadecimální oktalová
//        System.out.format("i=0x%1$x, i=0%1%o, i=%1$d%n",i); // indexy vstupní proměnné
//        System.out.format("i=0b%16s%n", Integer.toBinaryString(i));
//        char c= '\u263a';
//        System.out.format("c=%c", c);

//        float f = 1234.56789f;
//        double d = 12345.6789123456789;
//        System.out.format("d=%f f=%f%n", d,f); // běžné reálné číslo
//        System.out.format("d=%g f=%g%n", d,f); // běžné reálné číslo, nebo vědecké notace, záleží na délce
//        System.out.format("d=%e f=%e%n", d,f); //  vědecké notace
//        System.out.format("d=%10.1f f=%8.3f%n", d,f); // počet celkových a desetiných míst
//        String s = "Dobrý den";
//        System.out.format("s=%s%n", s);
//        System.out.format("s=%S%n", s);
//        System.out.format("s=|%11s|%n", s);


        java.util.Scanner sc = new java.util.Scanner(System.in);
//        sc.useLocale(Locale.US);
//        int i;
//        double d;
//        char ch;
//        String s = sc.nextLine();
//        i =sc.nextInt();
//        d =sc.nextDouble();
//        sc.nextLine();
//        ch =sc.nextLine().charAt(0);
//        System.out.println(i);
//        System.out.println(d);
//        System.out.format("s=%s, i=%d, d=%f, ch=%c%n", s, i , d, ch);

//            char a;
//            int b;
//            a = sc.nextLine().charAt(0);
//            b=a;
//            b++;
//            a=(char)b;
//        System.out.println(a);
        char a;
        int b;
        a = sc.nextLine().charAt(0);
        b=a;
        System.out.format("%c=%d%n", b,b);




    }

}

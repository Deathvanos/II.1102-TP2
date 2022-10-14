import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        if (condition1) {
        // Bloc d’instructions a executer si condition1 est vrai
        } else if (condition2) {
        // Bloc d’instructions a executer si condition1 est faux ET condition 2 est vrai
        } else {
        // Bloc d’instructions a executer si condition1 ET condition2 sont faux
        }
        */

        // Si on connait tous les elements
        int[] tableauConnu = {4, 1, -1, 0};
        int unElement = tableauConnu[3];
        // Si on ne connait que la taille
        String[] tableauInconnu = new String[4];

        String premiereChaine = new String("Bonjour, le monde !");
        String deuxiemeChaine = new String("Hello, world!");
        String troisiemeChaine = new String("Bonjour, le monde !");
        boolean test1 = (premiereChaine == deuxiemeChaine); // <- false
        boolean test2 = (premiereChaine == troisiemeChaine); // <- false
        boolean test3 = premiereChaine.equals(deuxiemeChaine); // <- false
        boolean test4 = premiereChaine.equals(troisiemeChaine); // <- true
        //System.out.println(test1 + " " + test2 + " " + test3 + " " + test4);

        /*
        Scanner scanner = new Scanner(System.in);
        int entier;
        do {
        System.out.println("Veuillez saisir un entier positif ou nul");
        entier = scanner.nextInt();
        } while (entier < 0);
         */

        menu();
    }


    // 3.1 Structures conditionnelles

    /**
     * 3.1.1 Calcul du discriminant du second degré
     **/
    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);

        if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle");
            String x0 = "(-" + b + "+i*Math.sqrt(-" + delta + "))/2*" + a;
            String x1 = "(-" + b + "-i*Math.sqrt(-" + delta + "))/2*" + a;
            System.out.println("x0=" + x0 + " x1=" + x1);
        }

        else if (delta == 0){
            int x0 = -b/2*a;
            System.out.println("x0=" + x0);
        }
        else {
            double x0 = (-b+Math.sqrt(delta))/2*a;
            double x1 = (-b-Math.sqrt(delta))/2*a;
            System.out.println("x0=" + x0 + " x1=" + x1);
        }
    }

    /**
     * 3.1.2 Calcul de la parité d’un nombre
     */
    public static void parite() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier");
        int a = scanner.nextInt();

        if (a%2 == 0) {
            System.out.println("a=" + a + " est un chiffre pair");
        }
        else {
            System.out.println("a=" + a + " est un chiffre impair");
        }
    }

    /**
     * 3.1.3 Calcul d’extremum
     */
    public static void extremum() {
        System.out.println("Choix d'une option\n1: max \n2: min");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a == 1) {
            max();
        } else if (a == 2) {
            min();
        }
    }

    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier a");
        int a = scanner.nextInt();
        System.out.println("Saisir un entier b");
        int b = scanner.nextInt();

        if (a>b) {
            System.out.println("max(a, b) = a=" + a);
        }
        else if (a<b) {
            System.out.println("max(a, b) = b=" + b);
        }
        else {
            System.out.println("max(a, b) = a=b=" + a);
        }
    }

    public static void min() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier a");
        int a = scanner.nextInt();
        System.out.println("Saisir un entier b");
        int b = scanner.nextInt();

        if (a>b) {
            System.out.println("min(a, b) = b=" + b);
        }
        else if (a<b) {
            System.out.println("min(a, b) = a=" + a);
        }
        else {
            System.out.println("min(a, b) = a=b=" + a);
        }
    }

    /**
     * 3.1.4 Égalité entre chaînes de caractères
     */
    public static void egaliteStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir une chaine de caractères a");
        String a = scanner.nextLine();
        System.out.println("Saisir une chaine de caractères b");
        String b = scanner.nextLine();

        boolean test = a.equals(b);
        System.out.println(test);
    }




    // 3.2 Structures itératives


    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;

        for (int i = 1; i <= n; i++) {
            factorielle *= i;

        }
        System.out.println(n + "! = " + factorielle);
    }

    /**
     * 3.2.1 Compte à rebours
     */
    public static void countdown() {
        for (int i =10; i>=0; i--) {
            System.out.println(i);
        }
        System.out.println("BOOM");
    }

    /**
     * 3.2.2 Valeurs de carrés
     */
    public static void carres() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre pour connaitre son carre");
        int x = scanner.nextInt();
        System.out.println("x=" + x + " x^x=" + x*x);
    }

    /**
     * 3.2.3 Tables de multiplication
     */
    public static void tableMultiplication() {

        for (int i=1; i<=10; i++) {
            for (int j=1; j<=10; j++) {
                System.out.print(i*j + " ");
                if (i*j <= 9) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }


    /**
     * 3.2.4 Saisies de l’utilisateur
     */
    public static void division() {
        Scanner scanner = new Scanner(System.in);
        int n1 ;
        do {
            System.out.println("Veuillez saisir un entier positif ou nul");
            n1 = scanner.nextInt();
        } while (n1 <= 0);

        int n2 ;
        do {
            System.out.println("Veuillez saisir un autre entier positif ou nul");
            n2 = scanner.nextInt();
        } while (n2 <= 0);

        System.out.println(n1/n2);
    }

    // 3.3 Structures de contrôle

    /**
     * 3.3.1 Règle graduée
     */
    public static void regle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Longueur ? ");
        int n = scanner.nextInt();

        for (int i=0; i<=n; i++) {
            if (i%10==0) {
                System.out.print("|");
            }
            System.out.print("-");
        }
    }


    public static void nombrePremier() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choix d'un nombre");
        int nbr = scanner.nextInt();
        int p = 0;

        for (int i = 1; i <= nbr; i++) {
            if (nbr % i == 0) {
                p++;
            }
        }
        if (p == 2) {
            System.out.println(nbr + " est un nombre premier.");
        } else {
            System.out.println(nbr + " n'est pas un nombre premier.");
        }

    }

    // 3.4 Tableaux

    /**
     * 3.4.1 Manipulations sur un tableau
     */
    public static void initialisationTableau() {
        int[] tableau = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }
        System.out.println(Arrays.toString(tableau));
        System.out.println(Arrays.stream(tableau).min());
        System.out.println(Arrays.stream(tableau).max());
        System.out.println(Arrays.stream(tableau).sum());

        // recherche des elements pairs

        // recherche des rangs des elements pairs

        // retourne le tableau

    }




    public static void menu() {
        System.out.println(
                "Quel exercice ? Saisissez :\n" +
                        "1. Discriminant\n" +
                        "2. Parité d’un nombre\n" +
                        "3. Calcul d’extremum\n" +
                        "4. Égalité entre chaînes de caractères\n" +
                        "5. Factorielle\n" +
                        "6. Compte à rebous\n" +
                        "7. Valeurs de carrés\n" +
                        "8. Table de multiplication\n" +
                        "9. Division d’entiers\n" +
                        "10. Règle graduée\n" +
                        "11. Nombres premiers\n" +
                        "12. Manipulations sur un tableau\n");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num == 1) {
            discriminant();
        } else if (num == 2) {
            parite();
        } else if (num == 3) {
            extremum();
        } else if (num == 4) {
            egaliteStr();
        } else if (num == 5) {
            factorielle();
        } else if (num == 6) {
            countdown();
        } else if (num == 7) {
            carres();
        } else if (num == 8) {
            tableMultiplication();
        } else if (num == 9) {
            division();
        } else if (num == 10) {
            regle();
        } else if (num == 11) {
            nombrePremier();
        } else if (num == 12) {
            initialisationTableau();
        }

    }
}
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    // initialisation des données

    String[][] tabArticle = new String[21][2];
    tabArticle[1][0] = "carottes";
    tabArticle[1][1] = "0.95";
    tabArticle[2][0] = "vin";
    tabArticle[2][1] = "4.99";
    tabArticle[3][0] = "tourne vis";
    tabArticle[3][1] = "5.81";
    tabArticle[4][0] = "pull";
    tabArticle[4][1] = "17.52";
    tabArticle[5][0] = "poulet";
    tabArticle[5][1] = "6.49";
    tabArticle[6][0] = "papier de toilette";
    tabArticle[6][1] = "10.25";
    tabArticle[7][0] = "poireau";
    tabArticle[7][1] = "1.19";
    tabArticle[8][0] = "beurre";
    tabArticle[8][1] = "2.36";
    tabArticle[9][0] = "fishstick";
    tabArticle[9][1] = "14.05";
    tabArticle[10][0] = "wisky";
    tabArticle[10][1] = "16";
    tabArticle[11][0] = "bonbons";
    tabArticle[11][1] = "2.99";
    tabArticle[12][0] = "bougies";
    tabArticle[12][1] = "6.75";
    tabArticle[13][0] = "cadre";
    tabArticle[13][1] = "6.45";
    tabArticle[14][0] = "friteuse";
    tabArticle[14][1] = "78.12";
    tabArticle[15][0] = "huile vierge";
    tabArticle[15][1] = "4.55";
    tabArticle[16][0] = "whey 500g";
    tabArticle[16][1] = "4.95";
    tabArticle[17][0] = "shampoing";
    tabArticle[17][1] = "6.96";
    tabArticle[18][0] = "sauce tomate";
    tabArticle[18][1] = "1.70";
    tabArticle[19][0] = "saumon frais";
    tabArticle[19][1] = "6.96";
    tabArticle[20][0] = "bloc de feuilles";
    tabArticle[20][1] = "5.96";


    int optionPrincipal;

    Scanner menuprincipal = new Scanner(System.in);
    System.out.println("Veuillez choisir une option (1) nouveau client (2) Chiffre du jour");
    while(true) {
      try {
          while (!menuprincipal.hasNextInt()) menuprincipal.next();
          optionPrincipal=menuprincipal.nextInt();
          if( optionPrincipal==1 || optionPrincipal==2 ){break;}else{continue;}
      }catch(NumberFormatException nfe){
          continue;
      }
    }
    switch(optionPrincipal){
        case 1:
            System.out.println('1');
            break;
        case (2):
            break;
    }

    }

    public static void addToArray(String[] datas){


    }
}
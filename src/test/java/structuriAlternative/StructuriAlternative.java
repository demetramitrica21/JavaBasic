package structuriAlternative;

import org.testng.annotations.Test;

public class StructuriAlternative {

    @Test
    public void testMethod() {
//        numberVerification(10);
//        numberVerification(2);
//        verificareNumarParImparPozitivNegativ(-6);
//        verificareNumarParImparPozitivNegativ(0);
//        verificareNumarParImparPozitivNegativ(2);
//        verificareNumarParImparPozitivNegativ(-5);
//        verificareNumarParImparPozitivNegativ(3);
//        System.out.println("Evaluarea elevului este: " + gradesEvaluation('A'));
        gradesEvaluationVoid('C');

    }

    //Structurile alternative se folosesc atunci cand avem conditii
    //Structura de control "if" este folosita pentru a evalua o contindie booleana si pt a executa un bloc de cod daca aceasta conditie este adevarata;
    //if(conditie){
    //bloc de cod care va fi executat daca conditia este adevarata;
    //} Else{
    //bloc de cod care va fi executat daca conditia este falsa;
    //}

    public void numberVerification(int number) {
        if (number > 3) {
            System.out.println("Numarul : " + number + " este > decat 3");
        } else {
            System.out.println("Numarul : " + number + " este < decat 3");
        }
    }
    //diferenta dintre "if" si "else-if"
    //- daca "if" e folosit pt prima conditie pe care dorimm sa o evaluam
    //"else-if" este folosit pentru mai multe conditii, atunci cand "if" este fals;
    //"else" se foloseste pentru a executa un bloc de cod atunci cand toate conditiile sunt false;
    //este indicat sa folosesti "if" si "else-if" impreuna atunci cand ai mai multe conditii de evaluat;

    public void verificareNumarParImparPozitivNegativ(int valoare) {
        if (valoare > 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul : " + valoare + " este par si pozitiv");
            } else {
                System.out.println("Numarul : " + valoare + " este impar si pozitiv");
            }

        } else if (valoare < 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul : " + valoare + " este par si negativ");
            } else {
                System.out.println("Numarul : " + valoare + " este impar si negativ");
            }
        } else {
            System.out.println("Numarul : " + valoare + " este egal cu zero");
        }
    }
    //"switch" este o structura de control care permite evaluarea unei expresii si executarea unuia din mai multe blocuri de cod;
    // este folosit mai des cand sunt mai multe cazuri posibile si fiecare caz este asociat unui bloc de cod specific;
    // switch(conditie){
    //case valoareaUnu :
    //bloc de cod pentru cazul in care expresia are valoarea -> valoareaUnu
    //break;
    //case valoareDoi :
    //bloc de cod pentru cazul in care expresia are valoarea -> valoareaDoi
    //break;
    //alte case-uri posibile;
    //default:
    //bloc de cod care se executa daca niciunul dintre cazuri nu se potriveste;
    //}


    public String gradesEvaluation(char nota) {
        switch (nota) {
            case 'A':
                return "Excelenta! ";
            case 'B':
                return "Foarte bine!";
            case 'C':
                return "Bine!";
            case 'D':
                return "Satisfacator";
            case 'F':
                return "Repetent";
            default:
                return nota + " Nu este un calificativ acceptat";
        }

    }

    //ca si tema sa transformam metoda cu return in metoda void;

    public void gradesEvaluationVoid(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excelent");
                break;
            case 'B':
                System.out.println("Foarte bine!");
                break;
            case 'C':
                System.out.println("Bine!");
                break;
            case 'D':
                System.out.println("Satisfacator");
                break;
            case 'F':
                System.out.println("Repetent");
                break;
            default:
                System.out.println(" Nu este un calificativ acceptat");
        }
    }
    // o alta varianta a lui switch care ne poate ajuta foarte mult;
        public void evaluareNota1(char nota){
            switch (nota) {
                case 'A' -> System.out.println("Excelent");
                case 'B' -> System.out.println("Foarte bine");
                case 'C' -> System.out.println("Bine");
                case 'D' -> System.out.println("Satisfacator");
                case 'F' -> System.out.println("Repetent");
                default -> System.out.println("Unknown");
            }
        }
    }


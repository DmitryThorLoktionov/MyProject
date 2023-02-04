
import java.util.*;


public class Calculator3 {
    static Scanner scanner = new Scanner(System.in);

    static char operation;

        public static void main(String[] args) {
            while (true) {
                System.out.println("Введите пример с переменными от 1 до 10 или от I до X со знаками (+-*/)");
                String userInput = scanner.nextLine();
                boolean res2 = conct(userInput);
                boolean znak3 = znak(userInput);
                boolean cifra2 = cifra(userInput);
                char[] uchar = new char[20];
                String[] rim = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
                ArrayList<String> strBlock00 = new ArrayList<>(10);
                for (int i = 0; i < userInput.length(); i++) {
                    uchar[i] = userInput.charAt(i);
                    if (uchar[i] == '+') {
                        operation = '+';
                    }
                    if (uchar[i] == '-') {
                        operation = '-';
                    }
                    if (uchar[i] == '*') {
                        operation = '*';
                    }
                    if (uchar[i] == '/') {
                        operation = '/';
                    }


                }
                if (cifra2 == true) {
                    throw new RuntimeException("Используются одновременно разные системы счисления или строка не является математической операцией");
                } else if (cifra2 == false) {

                    if (znak3 == true) {
                        throw new RuntimeException("Формат математической операции не удовлетворяет заданию.");
                    } else if (znak3 == false) {

                        if (res2 == true) {
                            String[] s = userInput.split("\\D+");
                            int x = Integer.parseInt(s[0]);
                            int y = Integer.parseInt(s[1]);
                            int res = calc(x, y, operation);
                            if (x > 0 && x <= 10 && y > 0 && y <= 10) {
                                System.out.println(res);
                            } else {
                                throw new RuntimeException("Введеные переменные не входят в значения от 1 до 10! Повторите ввод.");
                            }
                        } else if (res2 == false) {
                            String[] s = userInput.split("[X, IX, VIII, VII, VI, V, IV, III, II, I]");
                            char l = userInput.charAt(0);
                            char k = userInput.charAt(1);
                            if (l != 0 && k != 0) {
                                String conver = userInput;
                                conver = conver.replaceAll("(?i)X", "10").
                                        replaceAll("(?i)IX", "9").
                                        replaceAll("(?i)VIII", "8").
                                        replaceAll("(?i)VII", "7").
                                        replaceAll("(?i)VI", "6").
                                        replaceAll("(?i)V", "5").
                                        replaceAll("(?i)IV", "4").
                                        replaceAll("(?i)III", "3").
                                        replaceAll("(?i)II", "2").
                                        replaceAll("(?i)I", "1");
                                String[] s2 = conver.split("\\D+");
                                int x = Integer.parseInt(s2[0]);
                                int y = Integer.parseInt(s2[1]);
                                int res = calc(x, y, operation);
                                if (res == 100) {
                                    System.out.println("C");
                                } else if (res == 90) {
                                    System.out.println("XC");
                                } else if (res == 81) {
                                    System.out.println("LXXXI");
                                } else if (res == 80) {
                                    System.out.println("LXXX");
                                } else if (res == 72) {
                                    System.out.println("LXXII");
                                } else if (res == 70) {
                                    System.out.println("LXX");
                                } else if (res == 64) {
                                    System.out.println("LXIV");
                                } else if (res == 63) {
                                    System.out.println("LXIII");
                                } else if (res == 60) {
                                    System.out.println("LX");
                                } else if (res == 56) {
                                    System.out.println("LVI");
                                } else if (res == 54) {
                                    System.out.println("LIV");
                                } else if (res == 50) {
                                    System.out.println("L");
                                } else if (res == 49) {
                                    System.out.println("XLIX");
                                } else if (res == 45) {
                                    System.out.println("XLV");
                                } else if (res == 42) {
                                    System.out.println("XLII");
                                } else if (res == 40) {
                                    System.out.println("XL");
                                } else if (res == 36) {
                                    System.out.println("XXXVI");
                                } else if (res == 35) {
                                    System.out.println("XXXV");
                                } else if (res == 32) {
                                    System.out.println("XXXII");
                                } else if (res == 30) {
                                    System.out.println("XXX");
                                } else if (res == 28) {
                                    System.out.println("XXVIII");
                                } else if (res == 27) {
                                    System.out.println("XXVII");
                                } else if (res == 25) {
                                    System.out.println("XXV");
                                } else if (res == 24) {
                                    System.out.println("XXIV");
                                } else if (res == 21) {
                                    System.out.println("XXI");
                                } else if (res == 20) {
                                    System.out.println("XX");
                                } else if (res == 19) {
                                    System.out.println("XIX");
                                } else if (res == 18) {
                                    System.out.println("XVIII");
                                } else if (res == 17) {
                                    System.out.println("XVII");
                                } else if (res == 16) {
                                    System.out.println("XVI");
                                } else if (res == 15) {
                                    System.out.println("XV");
                                } else if (res == 14) {
                                    System.out.println("XIV");
                                } else if (res == 13) {
                                    System.out.println("XIII");
                                } else if (res == 12) {
                                    System.out.println("XII");
                                } else if (res == 11) {
                                    System.out.println("XI");
                                } else if (res == 10) {
                                    System.out.println("X");
                                } else if (res == 9) {
                                    System.out.println("IX");
                                } else if (res == 8) {
                                    System.out.println("VIII");
                                } else if (res == 7) {
                                    System.out.println("VII");
                                } else if (res == 6) {
                                    System.out.println("VI");
                                } else if (res == 5) {
                                    System.out.println("V");
                                } else if (res == 4) {
                                    System.out.println("IV");
                                } else if (res == 3) {
                                    System.out.println("III");
                                } else if (res == 2) {
                                    System.out.println("II");
                                } else if (res == 1) {
                                    System.out.println("I");
                                } else if (res < 0) {
                                    throw new RuntimeException("В римских числах нет отрицательных значений");
                                } else {
                                    throw new RuntimeException("Введена римская цифра не входящая в промежуток от I до X.");
                                }
                            }
                        }
                    }
                }

            }
        }
               public static boolean cifra(String userInput){
            for (int i=0; i<userInput.length(); i++) {
            userInput = userInput.replaceAll("\\D+","");
            int cifra3 = userInput.length();
            if (cifra3 == 1) {
                return true;
            }
        } return false;
    }
               public static boolean znak(String userInput){
            for (int i=0; i<userInput.length(); i++) {
                userInput = userInput.replaceAll("\\w+","");
                int znak2 = userInput.length();
                if (znak2 >= 2) {
                    return true;
                }
            } return false;
               }
               public static boolean conct(String userInput) {
            for (int i=0; i<userInput.length(); i++) {
                if (Character.isDigit(userInput.charAt(i))) {
                    return true;
                }
            } return false;
                }

                   public static int calc(int x, int y, char operation){
                        int res;
                        switch (operation) {
                            case '+':
                                res = x+y;
                                break;
                            case '-':
                                res = x-y;
                                break;
                            case '*':
                                res = x*y;
                                break;
                            case '/':
                                res = x/y;
                                break;
                            default:
                                throw new IllegalArgumentException("Введен не верный знак выражения.");
                        }
                        return res;
                   }

               }








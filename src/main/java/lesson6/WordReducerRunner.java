package lesson6;

import java.util.Arrays;

public class WordReducerRunner {
    public static void main(String[] args) {
        String[] words = {"Большой", "Привет", "от", "слушателей", "ИТ парка", "от"};
        System.out.println(Arrays.toString(instersect(words, "от"))); //{"Большой", "Привет", "слушателей", "ИТ парка"}
        System.out.println(Arrays.toString(instersect(words, "привет"))); //{"Большой", "Привет", "от", "слушателей", "ИТ парка", "от"}
    }

    public static String[] instersect(String[] initialArray, String word){
        String[] result = new String[initialArray.length];
        System.arraycopy(initialArray, 0, result, 0, initialArray.length);
        for (int i = 0; i < result.length; i++){
            if(result[i].equals(word)){
                result[i] = null;
            }
        }
        int maxNotNullIndexes = 0;
        for (String str : result){
            if (str != null) {
                maxNotNullIndexes++;
            }
        }
        String[] newResult = new String[maxNotNullIndexes];
        int counter = 0;
        for (String str : result){
            if(str != null){
                newResult[counter++] = str;
            }
        }
        return newResult;
    }
}

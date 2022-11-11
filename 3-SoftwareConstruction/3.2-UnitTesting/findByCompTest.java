package com.Tests;

public class findByCompTest {
    public static String firstNChars(String str, int n) { // допоміжна функція для знаходження першого знака назви змагання
        if (str == null) {
            return null;
        }
        return str.length() < n ? str : str.substring(0, n);
    }
    public static boolean isCompetitionNameCorrect(String competitionName) { // перевірка на корректність назви змагання
        String truncated = firstNChars(competitionName, 1);
        boolean onlyLatinAlphabet = truncated.matches("^[a-zA-Z]+$");
        return onlyLatinAlphabet & competitionName.length() < 50;
    }
    public static boolean isCountOfFiltersCorrect(Integer filtersCount) { // перевірка на корректність кулькості фільтрів
        return filtersCount > 0 & filtersCount < 15;
    }
    public static int doTestCase(int valueId, String competitionName, int filtersCount) {

        int testCaseNumber = 1;
        int returnValue;

        System.out.print("Test Case №1." + (testCaseNumber + valueId) + ". Return result - ");
        if (isCountOfFiltersCorrect(filtersCount) & isCompetitionNameCorrect(competitionName)) {
            returnValue = 1;
            System.out.println("" + returnValue);
            return returnValue;
        }
        if(isCountOfFiltersCorrect(filtersCount) & !isCompetitionNameCorrect(competitionName)){
            returnValue = -1;
            System.out.println("" + returnValue);
            return returnValue;
        }
        if(!isCountOfFiltersCorrect(filtersCount) & isCompetitionNameCorrect(competitionName)){
            returnValue = -2;
            System.out.println("" + returnValue);
            return returnValue;
        }
        if(!isCountOfFiltersCorrect(filtersCount) & !isCompetitionNameCorrect(competitionName)){
            returnValue = -3;
            System.out.println("" + returnValue);
            return returnValue;
        }
        return 0;
    }

    public static void main(String[] args) {
        // перевірка на тестових значеннях
        String[] testCompetitionName = {"NewCompetition",
                "1NewCompetition",
                "thMHyMZGlE1l29PITikxyWd3M4MAGuXoNcz1s86Wi3sv4PI4gxPKVb5", // довжина 55 знаків
                "NewCompetition",
                "2NewCompetition"};
        int[] testFiltersCount = new int[] {8, 8, 8, 16, -2};

        for(int i = 0; i < testCompetitionName.length; i++)
        {
            doTestCase(i, testCompetitionName[i], testFiltersCount[i]);
        }
    }

}
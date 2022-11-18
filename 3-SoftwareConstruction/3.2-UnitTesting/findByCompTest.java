package com.Tests;

public class findByCompTest {
    public static String firstNChars(String str, int n) {
        if (str == null) {
            return null;
        }
        return str.length() < n ? str : str.substring(0, n);
    }
    public static boolean isCompetitionNameCorrect(String competitionName) {
        String truncated = firstNChars(competitionName, 1);
        boolean onlyLatinAlphabet = truncated.matches("^[a-zA-Z]+$");
        return onlyLatinAlphabet & competitionName.length() < 50;
    }
    public static boolean isCountOfFiltersCorrect(Integer filtersCount) {
        return filtersCount > 0 & filtersCount < 15;
    }

    public static int findByComp(String competitionName, String[] filters) {

        int filtersCount = filters.length;

        if(isCountOfFiltersCorrect(filtersCount) & !isCompetitionNameCorrect(competitionName)){
            return -1;
        }
        if(!isCountOfFiltersCorrect(filtersCount) & isCompetitionNameCorrect(competitionName)){
            return -2;
        }
        if(!isCountOfFiltersCorrect(filtersCount) & !isCompetitionNameCorrect(competitionName)){
            return -3;
        }
        return 1;
    }

    public static void main(String[] args) {
        // перевірка на тестових значеннях
        String[] testCompetitionName = {"NewCompetition",
                "1NewCompetition",
                "thMHyMZGlE1l29PITikxyWd3M4MAGuXoNcz1s86Wi3sv4PI4gxPKVb5", // довжина 55 знаків
                "NewCompetition",
                "2NewCompetition"};
        int[] testFiltersCount = new int[] {8, 8, 8, 16, 82};

        for(int i = 0, testCaseNumber = 1; i < testCompetitionName.length; i++)
        {
            System.out.print("Test Case №1." + (testCaseNumber + i) + ". Return result - ");
            String[] filters = new String[testFiltersCount[i]];
            int returnValue = findByComp(testCompetitionName[i], filters);
            System.out.println("" + returnValue);
        }
    }
}
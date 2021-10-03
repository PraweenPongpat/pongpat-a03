/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution39 {
    private static final int TYPES_OF_DATA = 4;
    public static void main(String[] args) {
        Solution39 sol = new Solution39();

        //hard code the input from each string[] from the given example
        //format of string[] is firstName, lastName, Position, Date-of-Separation
        String[][] rawInfo = {{"John", "Johnson", "Manager", "2016-12-31"},
                             {"Tou","Xiong","Software Engineer","2016-10-05"},
                             {"Michaela","Michaelson","District Manager","2015-12-19"},
                             {"Jake","Jacobson","Programmer",""},
                             {"Jacquelyn","Jackson","DBA",""},
                             {"Sally","Webber","Web Developer","2015-12-18"}};

        //make a list of maps to store all the raw data
        ArrayList<Map<String, String>> peopleList = new ArrayList<>();
        //make a loop to add to list through all existed number of people, each iteration...
        for(int i=0;i<rawInfo.length;i++) {
            //  create a allInfoMap, using makeMap method passing in string[][] rawData
            //      (((i.e. first iteration, map "0":John, John,:Johnson, Johnson:Manager, Manager:"2016-12-31")))
            Map<String,String> tempMap = sol.makeMap(rawInfo,i);
            //  add the map to the list
            peopleList.add(tempMap);
        }
        //create a TreeMap, storing only lastNames to their person number
        //using a method makeTreeMap, passing in String[][] rawData
        //      (((Johnson:"0", Xiong:"1"...)))
        Map<String,String> lastNameMap = sol.makeTreeMap(rawInfo);

        //display outputs
        sol.displayTable(peopleList,lastNameMap);

    }

    private void displayTable(ArrayList<Map<String, String>> peopleList, Map<String, String> lastNameMap) {
        //get the result of lastNameMap, use that result chain the peopleList
        String[] tempArr = new String[lastNameMap.size()];
        int counter=0;

        //retrieve all keys to determine which to display first
        for(Map.Entry<String,String> entry : lastNameMap.entrySet()) {
            tempArr[counter] = entry.getKey();
            counter++;
        }
        String tempIndex;
        String temp;
        System.out.println("Name                  |Position             |Separation Date      |");
        System.out.println("----------------------|---------------------|---------------------|");
        for (String s : tempArr) {
            tempIndex = lastNameMap.get(s);
            temp = peopleList.get(Integer.parseInt(tempIndex)).get(tempIndex);
            System.out.printf(" %-9s", temp);//print first name
            for (int j = 1; j < TYPES_OF_DATA; j++) {
                if (j == 1)//print last name
                    System.out.printf(" %-11s|", peopleList.get(Integer.parseInt(tempIndex)).get(temp));
                else //print position or date
                    System.out.printf(" %-20s|", peopleList.get(Integer.parseInt(tempIndex)).get(temp));

                temp = peopleList.get(Integer.parseInt(tempIndex)).get(temp);
            }
            System.out.println("");
        }

    }

    public Map<String,String> makeMap (String[][] rawData, int i){
        //create a Map<String,String>
        Map<String,String> result = new HashMap<>();
        //create temp variable
        String temp=""+i;
        //make a loop running to the size of rawData[i] times
        for(int j=0; j< rawData[i].length;j++) {
            //  put temp in the map
            result.put(temp,rawData[i][j]);
            //  assign temp = string[i][counter]
            temp = rawData[i][j];
        }
        //return that map
        return result;
    }

    public Map<String, String> makeTreeMap (String[][] rawData){
        //create a Map<String,String> as a TreeMap
        Map<String,String> result = new TreeMap<>();
        //make a loop with size of rawData time
        for(int i=0;i< rawData.length;i++) {
            // put rawData[counter][2] to the map
            result.put(rawData[i][1],""+i);
        }
        //return the TreeMap
        return result;
    }


}

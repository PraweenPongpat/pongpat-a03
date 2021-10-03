/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Praween Pongpat
 */


package baseline;

import java.util.*;

public class Solution40 {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //allocate Solution40
        Solution40 sol = new Solution40();

        //get input from user
        String searchingSubString = sol.getString();

        //these are rawInfo from the table
        String[][] rawInfo = {{"John", "Johnson", "Manager", "2016-12-31"},
                {"Tou","Xiong","Software Engineer","2016-10-05"},
                {"Michaela","Michaelson","District Manager","2015-12-19"},
                {"Jake","Jacobson","Programmer",""},
                {"Jacquelyn","Jackson","DBA",""},
                {"Sally","Webber","Web Developer","2015-12-18"}};

        //i use the same code as exercise39*********************************
        //create a list of maps that store all people
        ArrayList<Map<String, String>> peopleList = new ArrayList<>();
        //make a loop to add to list through all existed number of people, each iteration...
        for(int i=0;i<rawInfo.length;i++) {
            //  create a allInfoMap, using makeMap method passing in string[][] rawData
            //      (((i.e. first iteration, map "0":John, John,:Johnson, Johnson:Manager, Manager:"2016-12-31")))
            Map<String,String> tempMap = sol.makeMap(rawInfo,i);
            //  add the map to the list
            peopleList.add(tempMap);
        }
        //same idea as exercise39**************************************
        //make 2 maps to chain to the position
        // firstname:position   ((("0":John, "1":Tou...)))
        Map<String,String> firstNameMap = sol.makeSearchMap(rawInfo,0);
        // lastname:position    ((("0":Johnson, "1":Xiong...)))
        Map<String,String> lastNameMap = sol.makeSearchMap(rawInfo,1);

        //new idea for ex40 starts here, about how to process the data stored inside maps*************************************
        ArrayList<Integer> indexPplWithSubStr = sol.findPosition(searchingSubString,firstNameMap,lastNameMap);

        //call method to display output passing the int[] index, peopleList
        sol.displayOutput(indexPplWithSubStr,peopleList);
    }

    private void displayOutput(ArrayList<Integer> indexPplWithSubStr, ArrayList<Map<String, String>> peopleList) {
        //start the go through the pplList base on the index that we have in int[]
        //display result in proper format
    }

    public ArrayList<Integer> findPosition(String searchingSubString, Map<String, String> firstNameMap, Map<String, String> lastNameMap) {
        ArrayList<Integer> result = new ArrayList<>();

        //use the substring input search through all the keys in both maps
        //start searching the name in the firstNameMap
        //if the key contain substring, store the position into arrayList
        //next, search the name in the lastNameMap
        //if the key contain substring, store the position into arrayList
        //note that firstNameMap and lastNameMap has the same size
        for(int i=0; i<firstNameMap.size();i++){
            if(firstNameMap.get(""+i).contains(searchingSubString)){
                result.add(i);
            }
            if(lastNameMap.get(""+i).contains(searchingSubString)){
                result.add(i);
            }
        }
        //sort the arrayList using API
        Collections.sort(result);

        //if the list is empty, return null
        if(result.isEmpty())
            return null;
        //if the list is not empty
        //make a loop, go through the rest of arrayList
        int size = result.size();
        ArrayList<Integer> resultResized = new ArrayList<>();
        resultResized.add(result.get(0));
        for(int i=1;i<size;i++) {
            //  if number in the array is the same as current index of int[], do nothing
            //      this means that we already found that person
            //  if number in the array is not the same as current index of int[]
            //      store the number from array to int[], increment index of int[]
            if(result.get(i)!=result.get(i-1))
                resultResized.add(result.get(i));
        }
        //return the list
        return resultResized;
    }



    //i used the same code from exercise39....******************************
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

    public Map<String, String> makeSearchMap(String[][] rawData,int index){
        //create a Map<String,String> as a map
        Map<String,String> result = new HashMap<>();
        //make a loop with size of rawData time
        for(int i=0;i< rawData.length;i++) {
            // put rawData[counter][2] to the map
            result.put(""+i,rawData[i][index]);
        }
        //return the TreeMap
        return result;
    }
    private String getString() {
        //prompt user for the substring
        //read the input
        //return that string
        return "";
    }


}

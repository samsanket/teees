package java8;

import java.util.*;

public class GroupAnagram {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
        String  [] s={"a"};
        List<List<String>> results= groupAnagrams(s);
        System.out.println(results);

    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        if (strs.length==1){
           ArrayList<String> strings= new ArrayList<>(List.of(strs));
           return Collections.singletonList(strings);
        }
        if (strs.length==0){
            return new ArrayList<>();
        }
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            // If the sorted string is already in the map, add the original string to its group

            if (anagramGroups.containsKey(sortedString)) {
                anagramGroups.get(sortedString).add(s);
            } else {


                // If not, create a new group with the sorted string as the key


                List<String> group = new ArrayList<>();
                group.add(s);
                anagramGroups.put(sortedString, group);
            }
        }

        // Convert the values of the map to a list and return
        return new ArrayList<>(anagramGroups.values());
    }
}

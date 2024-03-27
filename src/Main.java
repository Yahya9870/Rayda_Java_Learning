import java.io.*;
import java.util.*;


public class Main {

    // TODO-1 = Data type and return type? = 1 point
    // TODO-2 = Data type and return type? = 1 point
    // TODO-3, TODO-4, TODO-5, TODO-6 = functionality? = 1 point each, total = 4 points

    public static void mergeSort(List<String> list) {
        if (list.size() > 1) {
            int mid = list.size() / 2;

            List<String> left = new ArrayList<>(list.subList(0, mid));
            List<String> right = new ArrayList<>(list.subList(mid, list.size()));

            mergeSort(left);
            mergeSort(right);

            merge(list, left, right);
        }
    }

    public static void merge(List<String> result, List<String> left, List<String> right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex).compareTo(right.get(rightIndex)) < 0) {
                result.set(resultIndex++, left.get(leftIndex++));
            } else {
                result.set(resultIndex++, right.get(rightIndex++));
            }
        }

        while (leftIndex < left.size()) {
            result.set(resultIndex++, left.get(leftIndex++));
        }

        while (rightIndex < right.size()) {
            result.set(resultIndex++, right.get(rightIndex++));
        }
    }


    public static void main(String[] args){
        // Replace the input parameter of 'readWordsFromFile()' with 5 of the required INPUT DATA files
        /* TODO-1 (data type) */List<String> words = readWordsFromFile("INPUT-DATA-4--with-267_words.txt");
        mergeSort(words);
        /* TODO-2 (data type) */ List<LinkedList<String>> anagramGroups = findAnagramGroups(words);

//
//        // Replace the input parameter of 'writeAnagramGroupsToFile()' with 5 of the required OUTPUT DATA files

        writeAnagramGroupsToFile(anagramGroups, "OUTPUT-DATA-4.txt");
    }

    static /* TODO-1 (return type) */List<String> readWordsFromFile(String fileName){
        /* TODO-1 (data type) */ List<String> words = new ArrayList<>();

        try {
            String currentDirectory = System.getProperty("user.dir");
            File myObj = new File("//Users//yahiya//Downloads//"+fileName);

            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                words.add(data);
            }
            myReader.close();
        }  catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // TODO-3

        return words;
    }

    static String sortWord(String input){
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        // TODO-5
        return new String(charArray);
    }

    static void linkAnagrams(List<LinkedList<String>> anagramGroups,List<String> anagrams){
        LinkedList<String> ll = new LinkedList<>();
        for(int i=0;i<anagrams.size();i++){
            ll.add(anagrams.get(i));
        }
        anagramGroups.add(ll);
    }
    static /* TODO-2 (return type) */List<LinkedList<String>> findAnagramGroups(/* TODO-1 (data type) */ List<String> words){
        /* TODO-2 (data type) */ List<LinkedList<String>> anagramGroups = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<words.size();i++){
            if(!set.contains(i)){
                set.add(i);
                List<String> anagrams = new ArrayList<>();
                anagrams.add(words.get(i));
                String curr = words.get(i);
                curr = sortWord(curr);
                for(int j=i+1;j<words.size();j++){
                    if (!set.contains(j)){
                        String temp = words.get(j);
                        temp = sortWord(temp);
                        if(curr.equals(temp)){

                            set.add(j);
                            anagrams.add(words.get(j));
                        }
                    }

                }
                linkAnagrams(anagramGroups,anagrams);
            }
        }
        // TODO-4
        return anagramGroups;
    }



    static void writeAnagramGroupsToFile(/* TODO-2 (data type) */ List<LinkedList<String>> anagramGroups, String fileName){

        // TODO-6
        try {
            String currentDirectory = System.getProperty("user.dir");
            File myObj = new File("//Users//yahiya//Downloads//"+fileName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            String currentDirectory = System.getProperty("user.dir");
            FileWriter myWriter = new FileWriter("//Users//yahiya//Downloads//"+fileName);
            for(int i=0;i<anagramGroups.size();i++){
                for(int j = 0 ;j<anagramGroups.get(i).size();j++) {
                    myWriter.write(anagramGroups.get(i).get(j) + " ");
                }
                myWriter.write('\n');
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
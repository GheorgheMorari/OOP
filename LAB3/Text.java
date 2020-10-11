import java.util.*; 



class Text{
    String data;
    
    
    Text(String data){
        this.data = data;
    }
    
    static boolean isVowel(char chr){
        return (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u' || chr == 'y') ||
               (chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U' || chr == 'Y');
    }
    static boolean isConsonant(char chr){
        return (chr >= 'a' && chr <= 'z' || chr >= 'A' && chr <= 'Z') && !isVowel(chr);
    }
    
    String getData(){
        return this.data;
    }
    
    int getSentenceCount(){
        int counter = 0;
        int length = this.data.length();
        for(int i = 0; i <length; i++){
            counter = counter + ((this.data.charAt(i) == '.') ? (1) : (0));
        }
        return counter;
    }
    int getWordCount(){
        int counter = 0;
        int length = this.data.length();
        for(int i = 0; i <length; i++){
            counter = counter + ((this.data.charAt(i) == ' ') ? (1) : (0));
        }
        return counter;
    }
    int getLetterCount(){
        int counter = 0;
        int length = this.data.length();
        for(int i = 0; i <length; i++){
            char chr = this.data.charAt(i);
            counter = counter + ((chr >= 'a' && chr <= 'z' || chr >= 'A' && chr <= 'Z') ? (1) : (0));
        }
        return counter;
    }
    int getWowelCount(){
        int counter = 0;
        int length = this.data.length();
        for(int i = 0; i <length; i++){
            char chr = this.data.charAt(i);
            counter = counter + ( isVowel(chr)? (1) : (0));
        }
        return counter;
    }
    int getConsonantCount(){
        int counter = 0;
        int length = this.data.length();
        for(int i = 0; i <length; i++){
            char chr = this.data.charAt(i);
            counter = counter + (isConsonant(chr) ? (1) : (0));
        }
        return counter;
    }
    String getMostCommonWords(){

        java.util.HashMap<String, Integer> map = new java.util.HashMap<String, Integer>();
        
        int stringStart = 0;
        int stringEnd = 0;
        int length = this.data.length();
        for(int i = 0; i <length; i++){
            char chr = this.data.charAt(i);
            stringEnd = i;
            if(chr == ' ' || i + 1 == length){
                while (!(chr >= 'a' && chr <= 'z' || chr >= 'A' && chr <= 'Z')){
                    stringEnd--;
                    chr = this.data.charAt(stringEnd);
                }
                if(stringEnd < stringStart){
                    continue;
                }
                stringEnd++;
                String substring = data.substring(stringStart,stringEnd);
                map.putIfAbsent(substring, 0);
                int counter = map.get(substring);
                counter++;
                map.put(substring,counter);
                stringStart = stringEnd + 1;
            }
        }
        List<String> strList = new LinkedList<>();
        List<Integer> valList = new LinkedList<>();
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer counter = 0;
            boolean added = false;
            Integer entryValue = entry.getValue();

            for(Integer value : valList){
                if(value < entryValue){
                    strList.add(counter,entry.getKey());
                    valList.add(counter,entryValue);
                    added = true;
                    break;
                }
                counter++;
            }
            if(!added){
                strList.add(counter,entry.getKey());
                valList.add(counter,entryValue);
            }
        }
        
        String[] strArr = new String[5];
        strArr = strList.toArray(strArr);
        return strArr[0] + " " + strArr[1] + " " + strArr[2] + " " + strArr[3] + " " + strArr[4];
    }
    String getLongestWord(){
    String longest = "NO STRING FOUND";
        int stringStart = 0;
        int stringEnd = 0;
        int longestLength = 0;
        int length = this.data.length();
        for(int i = 0; i <length; i++){
            char chr = this.data.charAt(i);
            stringEnd = i;
            if(chr == ' '){
                while (!(chr >= 'a' && chr <= 'z' || chr >= 'A' && chr <= 'Z')){
                    stringEnd--;
                    chr = this.data.charAt(stringEnd);
                }
                if(stringEnd < stringStart){
                    continue;
                }
                stringEnd++;
                if(stringEnd - stringStart > longestLength) {
                    longest = data.substring(stringStart,stringEnd);
                    longestLength =stringEnd - stringStart;
                }
                stringStart = stringEnd + 1;
            }
        }
        return longest;
    }
    
    List<String> sortHashMapByValues(java.util.HashMap<String, Integer> passedMap) {
    List<String> mapKeys = new ArrayList<>(passedMap.keySet());
    List<Integer> mapValues = new ArrayList<>(passedMap.values());
    Collections.sort(mapValues);
    Collections.sort(mapKeys);

    List<String> sortedMap = new ArrayList<>();

    Iterator<Integer> valueIt = mapValues.iterator();
    while (valueIt.hasNext()) {
        Integer val = valueIt.next();
        Iterator<String> keyIt = mapKeys.iterator();

        while (keyIt.hasNext()) {
            String key = keyIt.next();
            Integer comp1 = passedMap.get(key);
            Integer comp2 = val;

            if (comp1.equals(comp2)) {
                keyIt.remove();
                sortedMap.add(key);
                break;
            }
        }
    }
    return sortedMap;
}
}
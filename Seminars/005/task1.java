// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
//  Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом

// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. 
// (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)

// Пример 1:

// Input: s = "foo", t = "baar"
// f: b
// o: a


// Output: false

// Пример 2:

// Input: s = "paper", t = "title"
// p: t
// a: i
// e: l
// r: e

// Output: true

public class task1 {
    public static void main(String[] args) {
        public static boolean isomorphicWords(String word1, String word2){
            if(word2.length() != word1.length()) return false;
            Map<Character, Character> cod = new HashMap<>();
            for (int i = 0; i < word1.length(); i++) {
                cod.putIfAbsent(word1.charAt(i), word2.charAt(i));
                if(cod.get(word1.charAt(i)) != word2.charAt(i)) return false;
            }
            return true;
        }
    }
    
}

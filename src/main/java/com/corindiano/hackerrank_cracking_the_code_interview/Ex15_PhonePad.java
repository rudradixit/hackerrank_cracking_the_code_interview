package com.corindiano.hackerrank_cracking_the_code_interview;

import java.util.*;

import static java.lang.String.format;

public class Ex15_PhonePad {
    private static Map<Character, List<Character>> PHONE_PAD = new HashMap<>();
    
    static {
        PHONE_PAD.put('2', new ArrayList<Character>() {{ add('a'); add('b'); add('c'); }});
        PHONE_PAD.put('3', new ArrayList<Character>() {{ add('d'); add('e'); add('f'); }});
        PHONE_PAD.put('4', new ArrayList<Character>() {{ add('g'); add('h'); add('i'); }});
        PHONE_PAD.put('5', new ArrayList<Character>() {{ add('j'); add('k'); add('l'); }});
        PHONE_PAD.put('6', new ArrayList<Character>() {{ add('m'); add('n'); add('o'); }});
        PHONE_PAD.put('7', new ArrayList<Character>() {{ add('p'); add('q'); add('r'); add('s'); }});
        PHONE_PAD.put('8', new ArrayList<Character>() {{ add('t'); add('u'); add('v'); }});
        PHONE_PAD.put('9', new ArrayList<Character>() {{ add('w'); add('x'); add('y'); add('z'); }});
    }
    
    public static List<String> solve(int number, Set<String> dictionary) {
        if (number < 2) {
            throw new IllegalArgumentException("Invalid number!");
        }

        String numberAsString = "" + number;

        if (numberAsString.contains("1") || numberAsString.contains("0")) {
            throw new IllegalArgumentException("Number cannot have 0s nor 1s.");
        }

        char[] digits = numberAsString.toCharArray();
        List<String> results = new ArrayList<>();
        Node root = new Node();
        buildTrieDictionary(root, dictionary);
        searchTrie(digits, 0, root, results, "");
        return results;
    }

    private static void buildTrieDictionary(Node root, Set<String> dictionary) {
        Node node, tmp;
        char[] array;

        for (String word : dictionary) {
            array = word.toCharArray();
            node = root;

            for (int i=0; i<array.length; i++) {
                if ((tmp = node.getChildWith(array[i])) != null) {
                    node = tmp;
                } else {
                    Node newNode = new Node();
                    newNode.letter = array[i];
                    newNode.isComplete = (i == array.length - 1);
                    node.children.add(newNode);
                    node = newNode;
                }
            }
        }
    }
    
    private static void searchTrie(char[] digits, int index, Node node, List<String> results, String word) {
        if (index == digits.length && node.isComplete) {
            results.add(word);
            return;
        }
        
        List<Character> charactersForDigit = PHONE_PAD.get(digits[index]);
        Node n;
        
        for (Character charForDigit : charactersForDigit) {
            n = node.getChildWith(charForDigit);
            
            if (n != null) {
                word += charForDigit;
                searchTrie(digits, index + 1, n, results, word);
                word = word.substring(0, word.length()-1);
            }
        }
    }

    private static class Node {
        char letter;
        boolean isComplete;
        List<Node> children = new ArrayList<>();
        
        Node getChildWith(char c) {
            for (Node n : children) {
                if (n.letter == c) {
                    return n;
                }
            }
            
            return null;
        }

        @Override
        public String toString() {
            return format("letter=%s, isComplete=%s", letter, isComplete);
        }
    }
}
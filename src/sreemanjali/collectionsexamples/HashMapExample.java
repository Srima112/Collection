package sreemanjali.collectionsexamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a hashmap
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the hashmap
        hashMap.put("apple", 5);
        hashMap.put("banana", 2);
        hashMap.put("orange", 8);
        hashMap.put("grapes", 12);

        // Accessing values in the hashmap
        System.out.println("Number of apples: " + hashMap.get("apple"));
        System.out.println("Number of grapes: " + hashMap.get("grapes"));

        // Updating a value in the hashmap
        hashMap.put("banana", 3);

        // Removing a key-value pair from the hashmap
        hashMap.remove("orange");

        // Checking if a key is present in the hashmap
        if (hashMap.containsKey("orange")) {
            System.out.println("Orange is present in the hashmap.");
        } else {
            System.out.println("Orange is not present in the hashmap.");
        }

        // Iterating through the keys and values in the hashmap
        System.out.println("Items in the hashmap:");
        
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
           // System.out.println(entry.getKey() + ": " + entry.getValue());
        	String fruitName = entry.getKey();
        	int fCount = entry.getValue();
        	System.out.println(" FruitName : "+ fruitName + ", Count ="+fCount);
        }

        // Clearing all key-value pairs from the hashmap
        hashMap.clear();

        // Checking if the hashmap is empty
        if (hashMap.isEmpty()) {
            System.out.println("The hashmap is empty.");
        } else {
            System.out.println("The hashmap is not empty.");
        }
    }
}


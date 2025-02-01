package patterns.factory;

import patterns.factory.algorithm.*;

import java.util.HashMap;
import java.util.Map;

public class FactoryAlgorithm {
    private static final Map<String, SortAlgorithm> algorithmRegistry = new HashMap<>();
    static {
        algorithmRegistry.putAll(Map.ofEntries(
               Map.entry("basic", new Basic()),
               Map.entry("insertion", new Insertion()),
               Map.entry("newsort", new NewSort()),
               Map.entry("selection", new SelectionSort())
        ));
    }
    public static SortAlgorithm getSortingAlgorithm(String type) {
        if(type == null || type.isBlank())
            throw new IllegalArgumentException("Type : " + type + " should be valid");
        var sortAlgorithm = algorithmRegistry.get(type);
        if(sortAlgorithm == null)
            throw new RuntimeException("implementation not exists");
        return sortAlgorithm;
    }
}

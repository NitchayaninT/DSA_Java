
package Ex8_6580081;

import java.util.*;
public class ActorMap {
    // Key = actor, Value = set of movies
    // Java's String already has consistent equals & compareTo for equality check
    private TreeMap<String, LinkedHashSet<String>> workingMap;
    private LinkedHashSet<String> resultSet; //set of movies based on given actor
    
    public ActorMap(String actor, String movie) //add new data to treemap?
    {
        LinkedHashSet<String> movies = workingMap.get(actor);
        movies.add(movie);
        workingMap.put(actor,movies);
    }
    public void initialActors() 
    { 
    /* Initialize resultSet to contain movies of all given actors */ 
        for(LinkedHashSet<String> movie : workingMap.values())
        {
            resultSet.addAll(movie);
        }
    }
    public void containActors()
    { 
    /* Find movies in resultSet containing given actors */ 
    }
 
    public void withoutActors()
    {
    /* Find movies in resultSet without given actors */ 
    }
    
    public void print()
    {
        
    }
}

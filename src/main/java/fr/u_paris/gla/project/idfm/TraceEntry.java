/**
 * 
 */
package fr.u_paris.gla.project.idfm;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

/** Representation of a transport line
 * 
 * @author Emmanuel Bigeon */
public final class TraceEntry {
    public final String           lname;
    private List<List<StopEntry>> paths = new ArrayList<>();

    /** Create a transport line.
     * 
     * @param lname the name of the line */
    public TraceEntry(String lname) {
        super();
        this.lname = lname;
    }

    /** @return the list of paths */
    public List<List<StopEntry>> getPaths() {
        return paths;
    }

    public void addPath(List<StopEntry> path) {
        paths.add(new ArrayList<>(path));
    }
}

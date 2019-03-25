package rocks.zipcode.io.quiz3.collections;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    // make a instance variable for maps
    private Map<Lab, LabStatus> Map;


    public Student() {
       this(new TreeMap<>());
    }

    public Student(Map<Lab, LabStatus> labs) {
        this.Map = labs;

    }

    public Lab getLab(String labName) {
        for (Lab lab : Map.keySet()){
            if (labName.equals(lab.getName())){
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
       if (getLab(labName)== null){
            throw new UnsupportedOperationException("This lab has not been forked!");
        }
        Map.put(getLab(labName), labStatus);
    }


    public void forkLab(Lab lab) {
        Map.put(lab, LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
       return Map.get(getLab(labName));
    }

    @Override
    public String toString() {
        return "Student{" +
                "statusMap=" + Map +
                '}';
    }
}

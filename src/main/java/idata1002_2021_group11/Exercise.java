package idata1002_2021_group11;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The class Exercise.
 */
public class Exercise {

    private String name;

    private ArrayList<Set> sets;

    private int order;

    /**
     * Instantiates a new Exercise.
     * When the user first creates an excercise he sets the name. Then he adds sets according to how many sets he chooses to have
     *
     * @param name the name
     */
    public Exercise(String name) {
        if(name.isBlank()) {
            this.name = "No name";
        } else {
            this.name = name;
        }

    }


    public String getName() {
        return name;
    }

    /**
     * Edit exercise.
     *
     * @param name the name
     */
    public void editExercise(String name) {
        if(this.name.isBlank()) {
            this.name = "No name";
        } else {
            this.name = name;
        }
    }


    /**
     * Add set.
     *
     * @param set the set
     */
    public void addSet(Set set) {
        if(set != null) {
            this.sets.add(set);
        }
    }

    /**
     * Remove set.
     *
     * @param set the set
     */
    public void removeSet(Set set) {
        if(this.sets.contains(set)) {
            this.sets.remove(set);
        }
    }

    /**
     * Edit set.
     *
     * @param set         the set
     * @param weight      the weight
     * @param repetitions the repetitions
     */
    public void editSet(Set set, float weight, int repetitions) {
        Iterator<Set> it = sets.iterator();
        boolean isRunning = true;

        while(isRunning && it.hasNext() ) {
            Set element = it.next();
            if(element.equals(set)) {
                element.setRepetitions(repetitions);
                element.setWeight(weight);
                isRunning = false;

            }
        }
    }

    /**
     * Sets order.
     *
     * @param order the order
     */
    public void setOrder(int order) {
        if(order >= 0) {
            this.order = order;
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * this is a class to demo a stack using arraylist
 * @param <E> is the data type we're passing into the structure
 */
public class ZSeafoodTower<E> implements ZStackInt<E> {

    // This thing is gonna store our data!
    List<E> theData;

    /**
     * empty constructor initializes a stack
     */
    public ZSeafoodTower(){

        // taking our list and making it into a new arraylist
        theData = new ArrayList<>();
    }

    /**
     * push an object onto the stack
     *
     * @param obj shrimp, lettuce, whatever we're adding onto the stack
     * @return the item that was pushed
     */
    @Override
    public E push(E obj) {

        // add the object to the arraylist
        theData.add(obj);

        // return the object that was added
        return obj;

    }

    /**
     * peek lets us see / returns the object at the top of the stack but DOESN'T remove it
     *
     * @return obj E which is what we're peekin @
     */
    @Override
    public E peek() {

        // First, it's checking to see if there's nothing in there. throw an exception if so
        if (isEmpty()) throw new NoSuchElementException();

        // otherwise just return the very last value in the arraylist
        return theData.get(theData.size()-1);
    }

    /**
     * removes the item at the top of the stack and returns it
     *
     * @return the object at the top
     */
    @Override
    public E pop() {
        // same as peek but this time remove it
        // First, it's checking to see if there's nothing in there. throw an exception if so
        if (isEmpty()) throw new NoSuchElementException();

        // otherwise just return and remove the very last value in the arraylist
        return theData.remove(theData.size()-1);
    }

    /**
     * sees whether the stack is empty t/f
     *
     * @return t/f
     */
    @Override
    public boolean isEmpty() {

        // be cheesy and use isEmpty    OR just check the size
        return theData.isEmpty();

    }
}

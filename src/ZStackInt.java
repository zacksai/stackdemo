/**
 * this is an interface that will give us methods to implement when we make a stack class
 */
public interface ZStackInt<E> {
    // the little E is a generic that lets us use any data type when we make this class


    /**
     * push an object onto the stack
     * @param obj shrimp, lettuce, whatever we're adding onto the stack
     * @return the item that was pushed
     */
    E push(E obj);

    /**
     * peek lets us see / returns the object at the top of the stack but DOESN'T remove it
     * @return obj E which is what we're peekin @
     */
    E peek();

    /**
     * removes the item at the top of the stack and returns it
     * @return the object at the top
     */
    E pop();

    /**
     * sees whether the stack is empty t/f
     * @return t/f
     */
    boolean isEmpty();

}

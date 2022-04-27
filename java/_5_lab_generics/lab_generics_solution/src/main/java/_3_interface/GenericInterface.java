package _3_interface;

public interface GenericInterface<T, U>
{
    U doSomeOperations(T t);
    T doReverseOperations(U u);
}
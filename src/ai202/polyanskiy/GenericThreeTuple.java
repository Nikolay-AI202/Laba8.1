package ai202.polyanskiy;

public class GenericThreeTuple<T, V, S> extends GenericTwoTuple<T, V>{

    public final S three;

    public GenericThreeTuple(T first, V second, S three) {
        super(first, second);
        this.three = three;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + "," + three + ")";
    }
}

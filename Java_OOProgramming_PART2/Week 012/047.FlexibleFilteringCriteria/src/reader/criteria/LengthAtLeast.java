package reader.criteria;

public class LengthAtLeast implements Criterion {

    private int howMany;

    public LengthAtLeast(int howMany) {
        this.howMany = howMany;
    }

    @Override
    public boolean complies(String line) {
        return (line.length() >= howMany);
    }
}

package reader.criteria;

public class AtLeastOne implements Criterion {

    private Criterion[] criteria;

    public AtLeastOne(Criterion... criterion) {
        this.criteria = criterion;
    }

    @Override
    public boolean complies(String line) {
        for (Criterion c : criteria) {
            if (c.complies(line)) {
                return true;
            }
        }
        return false;
    }
}

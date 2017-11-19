package reader.criteria;

public class Both implements Criterion {

    private Criterion endsWithPunctuationMark;
    private Criterion contains;

    public Both(Criterion endsWithPunctuationMark, Criterion contains) {
        this.endsWithPunctuationMark = endsWithPunctuationMark;
        this.contains = contains;
    }

    @Override
    public boolean complies(String line) {
        return (endsWithPunctuationMark.complies(line) && contains.complies(line));
    }
}

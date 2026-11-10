package festival;
public interface RankingStrategy {
    // Предусловие: movie.hasRatings(). Стратегия не меняет movie.
    double score(Movie movie);
    String name();
}

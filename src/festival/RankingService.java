package festival;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public final class RankingService {
    private final RankingStrategy strategy;
    public RankingService(RankingStrategy strategy) {
        this.strategy = java.util.Objects.requireNonNull(strategy);
    }
    public String ruleName() { return strategy.name(); }
    public List<RankedMovie> rank(List<Movie> movies) {
        List<RankedMovie> rows = new ArrayList<>();
        for (Movie movie : movies) {
            if (!movie.hasRatings()) {
                continue;
            }
            rows.add(new RankedMovie(movie, strategy.score(movie)));
        }
        Comparator<RankedMovie> order = Comparator.comparingDouble(RankedMovie::score)
                .reversed()
                .thenComparing(row -> row.movie().getId());
        rows.sort(order);
        return rows;
    }
}

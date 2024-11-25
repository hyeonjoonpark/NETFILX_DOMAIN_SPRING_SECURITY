package fastcampus.netflix.tmdb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.util.List;

@Builder
public record TmdbMovieNowPlaying(
    Boolean adult,
    @JsonProperty("backdrop_path") String backdropPath,
    @JsonProperty("genre_ids") List<String> genreIds,
    Integer id,
    @JsonProperty("original_language") String originalLanguage,
    @JsonProperty("original_title") String originalTitle,
    String overview,
    String popularity,
    @JsonProperty("poster_path") String posterPath,
    @JsonProperty("release_date") String releaseDate,
    String title,
    String video,
    @JsonProperty("vote_average") String voteAverage,
    @JsonProperty("vote_count") String voteCount
) {

}

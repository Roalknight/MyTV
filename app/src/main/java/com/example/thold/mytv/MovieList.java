package com.example.thold.mytv;

import java.util.ArrayList;
import java.util.List;

/**
 * Show list movie
 */
public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "Category Zero",
            "Category One",
            "Category Two",
            "Category Three",
            "Category Four",
            "Category Five",
    };

    public static List<Movie> list;

    public static List<Movie> setupMovies() {
        String urlBgImage = "android.resource://com.example.thold.mytv/drawable/bg_choice_video_1";

        list = new ArrayList<Movie>();


        String description = "Fusce id nisi turpis. Praesent viverra bibendum semper. "
                + "Donec tristique, orci sed semper lacinia, quam erat rhoncus massa, non congue tellus est "
                + "quis tellus. Sed mollis orci venenatis quam scelerisque accumsan. Curabitur a massa sit "
                + "amet mi accumsan mollis sed et magna. Vivamus sed aliquam risus. Nulla eget dolor in elit "
                + "facilisis mattis. Ut aliquet luctus lacus. Phasellus nec commodo erat. Praesent tempus id "
                + "lectus ac scelerisque. Maecenas pretium cursus lectus id volutpat.";

        // Add movie list (category, title, description, author, videoURL, Card Image, Background Image)
        list.add(buildMovieInfo(
                // category
                "category",
                // Title
                "ThoLD Review",
                // Description
                description,
                // Author (studio)
                "Studio Zero",
                // Video URL
                "http://youtu.be/Qs-XcmaxaLw?list=PLzYC8Z5DctskCLLZaYfYqIfOvjQ8WMG9L",
                // Card Image
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review/card.jpg",
                // Background image
                urlBgImage
        ));

        // Add movie list (category, title, description, author, videoURL, Card Image, Background Image)
        list.add(buildMovieInfo(
                // category
                "category",
                // Title
                "Google Demo Slam_ ThoLD",
                // Description
                description,
                // Author (studio)
                "Studio Zero",
                // Video URL
                "http://hplus.com.vn/themes/front/player/jwplayer.flash.swf",
                // Card Image
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search/card.jpg",
                // Background image
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search/bg.jpg"
        ));

        // Add movie list (category, title, description, author, videoURL, Card Image, Background Image)
        list.add(buildMovieInfo(
                // category
                "category",
                // Title
                "Introducing Gmail Blue",
                // Description
                description,
                // Author (studio)
                "Studio Zero",
                // Video URL
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue.mp4",
                // Card Image
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue/card.jpg",
                // Background image
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue/bg.jpg"
        ));

        // Add movie list (category, title, description, author, videoURL, Card Image, Background Image)
        list.add(buildMovieInfo(
                // category
                "category",
                // Title
                "Introducing Google Fiber to the Pole",
                // Description
                description,
                // Author (studio)
                "Studio Zero",
                // Video URL
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole.mp4",
                // Card Image
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/card.jpg",
                // Background image
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/bg.jpg"
        ));

        // Add movie list (category, title, description, author, videoURL, Card Image, Background Image)
        list.add(buildMovieInfo(
                // category
                "category",
                // Title
                "Introducing Google Nose",
                // Description
                description,
                // Author (studio)
                "Studio Zero",
                // Video URL
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose.mp4",
                // Card Image
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/card.jpg",
                // Background image
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/bg.jpg"
        ));

        return list;
    }

    private static Movie buildMovieInfo(String category, String title,
                                        String description, String studio, String videoUrl, String cardImageUrl,
                                        String bgImageUrl) {
        Movie movie = new Movie();
        movie.setId(Movie.getCount());
        Movie.incCount();
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCategory(category);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(bgImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}

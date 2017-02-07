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

        String title[] = {
                "ThoLD Review",
                "Google Demo Slam_ ThoLD",
                "Introducing Gmail Blue",
                "Introducing Google Fiber to the Pole",
                "Introducing Google Nose"
        };

        String description = "Fusce id nisi turpis. Praesent viverra bibendum semper. "
                + "Donec tristique, orci sed semper lacinia, quam erat rhoncus massa, non congue tellus est "
                + "quis tellus. Sed mollis orci venenatis quam scelerisque accumsan. Curabitur a massa sit "
                + "amet mi accumsan mollis sed et magna. Vivamus sed aliquam risus. Nulla eget dolor in elit "
                + "facilisis mattis. Ut aliquet luctus lacus. Phasellus nec commodo erat. Praesent tempus id "
                + "lectus ac scelerisque. Maecenas pretium cursus lectus id volutpat.";

        String videoUrl[] = {
                "http://youtu.be/Qs-XcmaxaLw?list=PLzYC8Z5DctskCLLZaYfYqIfOvjQ8WMG9L",
                "http://hplus.com.vn/themes/front/player/jwplayer.flash.swf",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue.mp4",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole.mp4",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose.mp4"
        };

        // Background image change when select video
        String bgImageUrl[] = {
                urlBgImage,
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/bg.jpg",
        };

        // Link image card
        String cardImageUrl[] = {
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/card.jpg"
        };

        // Add movie list (category, title, description, author, videoURL, Card Image, Background Image)
        list.add(buildMovieInfo("category", title[0],
                description, "Studio Zero", videoUrl[0], cardImageUrl[0], bgImageUrl[0]));
        list.add(buildMovieInfo("category", title[1],
                description, "Studio One", videoUrl[1], cardImageUrl[1], bgImageUrl[1]));
        list.add(buildMovieInfo("category", title[2],
                description, "Studio Two", videoUrl[2], cardImageUrl[2], bgImageUrl[2]));
        list.add(buildMovieInfo("category", title[3],
                description, "Studio Three", videoUrl[3], cardImageUrl[3], bgImageUrl[3]));
        list.add(buildMovieInfo("category", title[4],
                description, "Studio Four", videoUrl[4], cardImageUrl[4], bgImageUrl[4]));

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

class Movie {
    private String title;
    private String director;
    private int duration; // 上映時間（分）

    public Movie(String title, String director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return String.format("タイトル: %s, 監督: %s, 上映時間: %d分", title, director, duration);
    }
}
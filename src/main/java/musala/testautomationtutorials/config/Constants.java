package musala.testautomationtutorials.config;

public final class Constants {
    private Constants() {}

    /** Base URL for API, defaulting to localhost if not set */
    public static final String BASE_URL = System.getProperty("api.baseUrl", "http://localhost:8080/api/v1");
}

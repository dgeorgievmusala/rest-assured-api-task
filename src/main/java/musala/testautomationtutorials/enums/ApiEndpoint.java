package musala.testautomationtutorials.enums;

public enum ApiEndpoint {
    BOOKS("/Books"),
    AUTHORS("/Authors");

    private final String path;

    ApiEndpoint(String path) { this.path = path; }
    public String path() { return path; }
}

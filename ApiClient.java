package week3day2;

public class ApiClient {

    public void API(String endpoint) {
        System.out.println("The endpoint is: " + endpoint);
    }

    public void API(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("The endpoint is: " + endpoint +
                           "\nRequest Body: " + requestBody +
                           "\nStatus: " + requestStatus);
        if (requestStatus) {
            System.out.println("The user was found in the database");
        } else {
            System.out.println("The user was not found in the database");
        }
    }

    public static void main(String[] args) {
        ApiClient apiClient = new ApiClient();
        apiClient.API("https://api.example.com/users/check");
        apiClient.API("https://api.example.com/users/check", "{\"email\": \"john@example.com\"}", false);
    }
}
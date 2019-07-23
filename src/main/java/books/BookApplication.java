package books;

import static org.springframework.boot.SpringApplication.run;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication makes all work on configuration and component scan. Don't forget that it
 * scans components only in its sub-packages - if it was moved, add in annotation another packages
 * and classes for scanning.
 */
@SpringBootApplication
public class BookApplication {

  public static void main(String[] args) {
    run(BookApplication.class, args);
  }
}

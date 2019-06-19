package isaac.jmeter;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String date = java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        
        System.out.println(date);
    }
}

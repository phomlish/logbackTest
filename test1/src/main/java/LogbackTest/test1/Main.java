package LogbackTest.test1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Hello world!
 *
 */
public class Main 
{
	private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main( String[] args )
    {
        log.info("test");
    }
}

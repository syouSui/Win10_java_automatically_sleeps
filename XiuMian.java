import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class XiuMian {

        public static void main ( String[] args ) throws AWTException {

            while ( true ) {

                if ( new SimpleDateFormat( "HH:mm" ).format( new Date() ).equals( args[0] ) ) {

                    Robot r = new Robot( );

                    r.keyPress( KeyEvent.VK_WINDOWS);
                    r.keyPress( KeyEvent.VK_D );
                    r.keyRelease( KeyEvent.VK_D );
                    r.keyRelease( KeyEvent.VK_WINDOWS );

//                    r.mouseMove( 0, 0 );
//                    r.mousePress( InputEvent.BUTTON3_MASK );
//                    r.mouseRelease( InputEvent.BUTTON3_MASK );

                    r.delay( 100 );

                    r.keyPress( KeyEvent.VK_WINDOWS);
                    r.keyPress( KeyEvent.VK_X );
                    r.keyRelease( KeyEvent.VK_X );
                    r.keyRelease( KeyEvent.VK_WINDOWS );
                    r.delay( 100 );
                    r.keyPress( KeyEvent.VK_U );
                    r.keyRelease( KeyEvent.VK_U );
                    r.keyPress( KeyEvent.VK_S );
                    r.keyRelease( KeyEvent.VK_S );

                    System.out.println( "All right!" );
                    return;
                }

        }
    }
}

// Copyright © 2004-2006 University of Helsinki, Department of Computer Science
// Copyright © 2012 various contributors
// This software is released under GNU Lesser General Public License 2.1.
// The license text is at http://www.gnu.org/licenses/lgpl-2.1.html

package fi.helsinki.cs.titokone.Sinitestistubit;

import junit.framework.TestCase;

import java.util.Vector;
import java.util.logging.*;

public class __LoguserTestCase extends TestCase {
    protected LogRecord lastRecord;
    protected Vector allRecords = new Vector();
    protected Logger logger = getDebugLogger();
    private __LokiHandler handler;

    public void logged(LogRecord record) {
        lastRecord = record;
        allRecords.add(record);
    }

    public Logger getDebugLogger() {
        Logger foo = Logger.getLogger("fi.helsinki.cs.titokone");
        Handler[] oldHandlers;
        // If it is likely that we already visited this logger, let's
        // not add the same handler to it again. Hack-hack. :)
        foo.setUseParentHandlers(false);
        // First, we need to remove the old copies of the handler.
        // There seems to be a need to have a new one for each
        // instance of inheriters.
        oldHandlers = foo.getHandlers();
        //	for(int i = 0; i < oldHandlers.length; i++)
        //    foo.removeHandler(oldHandlers[i]);
        handler = new __LokiHandler(this);
        foo.addHandler(handler);
        foo.setLevel(Level.FINEST);
        return foo;
    }

    // This method hush up the logger; it won't do System.out.printlns
    // after that.
    public void hushLogger() {
        handler.hush();
    }
}

// Copyright © 2004-2006 University of Helsinki, Department of Computer Science
// Copyright © 2012 various contributors
// This software is released under GNU Lesser General Public License 2.1.
// The license text is at http://www.gnu.org/licenses/lgpl-2.1.html

package fi.helsinki.cs.titokone.Sinitestistubit;

import java.util.logging.*;

public class __LokiHandler extends Handler {
    private __LoguserTestCase listener;
    private boolean hushed = false;

    public __LokiHandler(__LoguserTestCase listener) {
        this.listener = listener;
    }

    public void flush() {
    }

    public void close() {
    }

    public void publish(LogRecord record) {
        listener.logged(record);
    }

    public void hush() {
        hushed = true;
    }
}

// Copyright © 2004-2006 University of Helsinki, Department of Computer Science
// Copyright © 2012 various contributors
// This software is released under GNU Lesser General Public License 2.1.
// The license text is at http://www.gnu.org/licenses/lgpl-2.1.html

/* This class was used for testing GUIBrain */

package fi.helsinki.cs.titokone.GUIBrainStubs;

public class __stub_Settings {

    public static final String UI_LANGUAGE = "Language";
    public static final String RUN_MODE = "Running mode";
    public static final String COMPILE_MODE = "Compilation mode";
    public static final String DEFAULT_STDIN = "Stdin file";
    public static final String STDIN_PATH = "Stdin path";
    public static final String DEFAULT_STDOUT = "Stdout file";
    public static final String STDOUT_USE = "Stdout use";
    public static final String STDOUT_PATH = "Stdout path";
    public static final String MEMORY_SIZE = "Memory size";


    String str;

    public __stub_Settings(String str) {
        this.str = str;
    }

    public String toString() {
        return str;
    }

    public int getIntValue(String str) {
        return 2;
    }

    public void setValue(String key, int value) {
    }

    public void setValue(String key, String value) {
    }

}
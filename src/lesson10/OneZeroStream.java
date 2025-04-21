package lesson10;

import java.io.InputStream;

public class OneZeroStream extends InputStream {
    private int counter = 0;

    @Override
    public int read() {
        switch (counter % 4) {
            case 0: counter++; return '1';
            case 1: counter++; return ' ';
            case 2: counter++; return '0';
            case 3: counter++; return ' ';
        }
        return -1;
    }

}

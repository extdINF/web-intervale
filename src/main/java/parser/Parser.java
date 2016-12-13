package parser;

import java.io.InputStream;
import java.util.Collection;

public interface Parser<T> {

    Collection<T> parse(InputStream input);

}
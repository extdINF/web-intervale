package parser;

import java.io.InputStream;
import java.util.Collection;
import java.util.List;

public interface Parser<T> {

    Collection<T> parse(InputStream input);

}
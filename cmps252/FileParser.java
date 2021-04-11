package cmps252;

import java.io.IOException;
import java.util.Set;

public interface FileParser {
	Set<Course> ParseFile(String fileName);
}

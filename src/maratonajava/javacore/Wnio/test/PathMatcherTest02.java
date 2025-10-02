package maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class FindAllTestJavaOrClass extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        if (matches(file, "glob:**/*{Test*}.{java,class}")) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }

    private static boolean matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        return matcher.matches(path);
    }
}

public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("C:\\Users\\talle\\Documents\\maratona_java");
        Files.walkFileTree(root, new FindAllTestJavaOrClass());
    }


}

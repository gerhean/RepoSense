import java.nio.file.PathMatcher;
        logger.info("Extracting relevant file infos " + config.getLocation() + "...");

     * Returns true if {@code ignoreGlobMatcher} matchers the file path at {@code name}.
    private static boolean shouldIgnore(String name, PathMatcher ignoreGlobMatcher) {
        return ignoreGlobMatcher.matches(Paths.get(name));
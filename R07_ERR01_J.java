// Rule 07. Exceptional Behavior (ERR)

class SecurityIOException extends IOException {/* ... */};
 
try {
  FileInputStream fis =
      new FileInputStream(System.getenv("APPDATA") + args[0]);
} catch (FileNotFoundException e) {
  // Log the exception
  throw new SecurityIOException();
}
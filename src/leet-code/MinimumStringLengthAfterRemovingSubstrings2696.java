/*
    Input: s = "ABFCACDB"
    Output: 2
    Explanation: We can do the following operations:
    - Remove the substring "ABFCACDB", so s = "FCACDB".
    - Remove the substring "FCACDB", so s = "FCAB".
    - Remove the substring "FCAB", so s = "FC".
    So the resulting length of the string is 2.
* */
public void main() {
    String myString = new String("ABFCACDB");
    int i = minLength(myString);
}

// * WITH RECURSION
public int minLength(String s) {
    if (s.contains("AB")) {
        return minLength(s.replaceFirst("AB", ""));
    } else if (s.contains("CD")) {
        return minLength(s.replaceFirst("CD", ""));
    } else {
        return s.length();
    }
}

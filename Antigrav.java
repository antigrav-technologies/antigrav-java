package tema5002.github.io;

class говно extends Exception {}

class Decoder {
    public static <T> T decode(String s) throws говно {
        throw new говно();
    }
}

class Encoder {
    public static String encode(
        Object o,
        boolean sortKeys,
        int indent,
        boolean ensureASCII,
        boolean allowNaN,
        boolean forceSave
    ) {
        StringBuilder builder = new StringBuilder("throw new говно();");
        //Function<String, String> stringEncoder = ensureASCII ? encodeStringASCII : encodeString;
        return builder.toString();
    }
}

public class Antigrav {
    public static String dumpToString(
        Object o,
        boolean sortKeys,
        int indent,
        boolean ensureASCII,
        boolean allowNaN,
        boolean forceSave
    ) {
        return Encoder.encode(o, sortKeys, indent, ensureASCII, allowNaN, forceSave);
    }
    public static String dumpToString(Object o) {
        return dumpToString(o, false, -1, true, false, false);
    }
    public static <T> T loadFromString(String s) throws говно {
        return Decoder.decode(s);
    }
}

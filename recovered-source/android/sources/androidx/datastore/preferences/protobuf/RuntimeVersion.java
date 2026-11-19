package androidx.datastore.preferences.protobuf;

import java.util.logging.Logger;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public final class RuntimeVersion {
    public static final RuntimeDomain DOMAIN;
    public static final int MAJOR = 4;
    public static final int MINOR = 28;
    public static final RuntimeDomain OSS_DOMAIN;
    public static final int OSS_MAJOR = 4;
    public static final int OSS_MINOR = 28;
    public static final int OSS_PATCH = 2;
    public static final String OSS_SUFFIX = "";
    public static final int PATCH = 2;
    public static final String SUFFIX = "";
    private static final String VERSION_STRING;
    private static final Logger logger;

    public static final class ProtobufRuntimeVersionException extends RuntimeException {
        public ProtobufRuntimeVersionException(String str) {
            super(str);
        }
    }

    public enum RuntimeDomain {
        GOOGLE_INTERNAL,
        PUBLIC
    }

    static {
        RuntimeDomain runtimeDomain = RuntimeDomain.PUBLIC;
        OSS_DOMAIN = runtimeDomain;
        DOMAIN = runtimeDomain;
        VERSION_STRING = versionString(4, 28, 2, "");
        logger = Logger.getLogger(RuntimeVersion.class.getName());
    }

    private RuntimeVersion() {
    }

    private static boolean checkDisabled() {
        String str = System.getenv("TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        return str != null && str.equals("true");
    }

    public static void validateProtobufGencodeVersion(RuntimeDomain runtimeDomain, int i2, int i3, int i4, String str, String str2) {
        if (checkDisabled()) {
            return;
        }
        validateProtobufGencodeVersionImpl(runtimeDomain, i2, i3, i4, str, str2);
    }

    private static void validateProtobufGencodeVersionImpl(RuntimeDomain runtimeDomain, int i2, int i3, int i4, String str, String str2) {
        if (checkDisabled()) {
            return;
        }
        String strVersionString = versionString(i2, i3, i4, str);
        if (i2 < 0 || i3 < 0 || i4 < 0) {
            throw new ProtobufRuntimeVersionException(AbstractC0271e0.m398f("Invalid gencode version: ", strVersionString));
        }
        RuntimeDomain runtimeDomain2 = DOMAIN;
        if (runtimeDomain != runtimeDomain2) {
            throw new ProtobufRuntimeVersionException("Detected mismatched Protobuf Gencode/Runtime domains when loading " + str2 + ": gencode " + runtimeDomain + ", runtime " + runtimeDomain2 + ". Cross-domain usage of Protobuf is not supported.");
        }
        if (i2 != 4) {
            if (i2 != 3) {
                String str3 = VERSION_STRING;
                StringBuilder sb = new StringBuilder("Detected mismatched Protobuf Gencode/Runtime major versions when loading ");
                sb.append(str2);
                sb.append(": gencode ");
                sb.append(strVersionString);
                sb.append(", runtime ");
                throw new ProtobufRuntimeVersionException(AbstractC0271e0.m403k(sb, str3, ". Same major version is required."));
            }
            logger.warning(" Protobuf gencode version " + strVersionString + " is exactly one major version older than the runtime version " + VERSION_STRING + " at " + str2 + ". Please update the gencode to avoid compatibility violations in the next runtime release.");
        }
        if (28 < i3 || (i3 == 28 && 2 < i4)) {
            String str4 = VERSION_STRING;
            StringBuilder sb2 = new StringBuilder("Detected incompatible Protobuf Gencode/Runtime versions when loading ");
            sb2.append(str2);
            sb2.append(": gencode ");
            sb2.append(strVersionString);
            sb2.append(", runtime ");
            throw new ProtobufRuntimeVersionException(AbstractC0271e0.m403k(sb2, str4, ". Runtime version cannot be older than the linked gencode version."));
        }
        if (28 > i3 || 2 > i4) {
            logger.warning(" Protobuf gencode version " + strVersionString + " is older than the runtime version " + VERSION_STRING + " at " + str2 + ". Please avoid checked-in Protobuf gencode that can be obsolete.");
        }
        if (str.equals("")) {
            return;
        }
        String str5 = VERSION_STRING;
        StringBuilder sb3 = new StringBuilder("Detected mismatched Protobuf Gencode/Runtime version suffixes when loading ");
        sb3.append(str2);
        sb3.append(": gencode ");
        sb3.append(strVersionString);
        sb3.append(", runtime ");
        throw new ProtobufRuntimeVersionException(AbstractC0271e0.m403k(sb3, str5, ". Version suffixes must be the same."));
    }

    private static String versionString(int i2, int i3, int i4, String str) {
        return String.format("%d.%d.%d%s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str);
    }
}

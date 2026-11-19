package p034T;

import com.google.gson.stream.JsonToken;

/* JADX INFO: renamed from: T.F0 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0649F0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f1443a;

    static {
        int[] iArr = new int[JsonToken.values().length];
        f1443a = iArr;
        try {
            iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f1443a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f1443a[JsonToken.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f1443a[JsonToken.NUMBER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f1443a[JsonToken.BOOLEAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f1443a[JsonToken.NULL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}

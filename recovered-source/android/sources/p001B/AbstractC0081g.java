package p001B;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: B.g */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0081g {

    /* JADX INFO: renamed from: a */
    public static final Charset f107a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b */
    public static final Charset f108b;

    static {
        Charset.forName("ISO-8859-1");
        f108b = Charset.forName("UTF-8");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-16");
    }
}

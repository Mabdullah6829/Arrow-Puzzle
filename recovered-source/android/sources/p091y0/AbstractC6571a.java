package p091y0;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: renamed from: y0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6571a {

    /* JADX INFO: renamed from: a */
    public static final Charset f24799a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC6452k.m12180d(charsetForName, "forName(...)");
        f24799a = charsetForName;
        AbstractC6452k.m12180d(Charset.forName("UTF-16"), "forName(...)");
        AbstractC6452k.m12180d(Charset.forName("UTF-16BE"), "forName(...)");
        AbstractC6452k.m12180d(Charset.forName("UTF-16LE"), "forName(...)");
        AbstractC6452k.m12180d(Charset.forName("US-ASCII"), "forName(...)");
        AbstractC6452k.m12180d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}

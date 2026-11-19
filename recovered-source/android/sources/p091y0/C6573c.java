package p091y0;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: renamed from: y0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6573c implements Serializable {

    /* JADX INFO: renamed from: s */
    public final Pattern f24805s;

    public C6573c(String str) {
        Pattern patternCompile = Pattern.compile(str);
        AbstractC6452k.m12180d(patternCompile, "compile(...)");
        this.f24805s = patternCompile;
    }

    public final String toString() {
        String string = this.f24805s.toString();
        AbstractC6452k.m12180d(string, "toString(...)");
        return string;
    }
}

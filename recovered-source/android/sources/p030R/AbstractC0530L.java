package p030R;

import java.nio.charset.Charset;
import java.util.BitSet;
import p007E.C0194c;
import p034T.C0785s2;

/* JADX INFO: renamed from: R.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0530L {

    /* JADX INFO: renamed from: a */
    public static final Charset f1127a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b */
    public static final C0194c f1128b = C0559h0.f1188e;

    /* JADX INFO: renamed from: a */
    public static C0555f0 m1255a(String str, C0785s2 c0785s2) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        BitSet bitSet = AbstractC0553e0.f1161d;
        return new C0555f0(str, z, c0785s2);
    }
}

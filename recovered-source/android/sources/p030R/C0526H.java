package p030R;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* JADX INFO: renamed from: R.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0526H {

    /* JADX INFO: renamed from: d */
    public static final Logger f1117d = Logger.getLogger(C0526H.class.getName());

    /* JADX INFO: renamed from: e */
    public static final C0526H f1118e = new C0526H();

    /* JADX INFO: renamed from: a */
    public final ConcurrentSkipListMap f1119a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f1120b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f1121c;

    public C0526H() {
        new ConcurrentSkipListMap();
        this.f1119a = new ConcurrentSkipListMap();
        this.f1120b = new ConcurrentHashMap();
        this.f1121c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }
}

package p034T;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import p001B.AbstractC0076b;
import p030R.AbstractC0558h;
import p030R.C0525G;
import p030R.C0529K;
import p030R.EnumC0524F;

/* JADX INFO: renamed from: T.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0786t {

    /* JADX INFO: renamed from: c */
    public static final Logger f2039c = Logger.getLogger(AbstractC0558h.class.getName());

    /* JADX INFO: renamed from: a */
    public final Object f2040a = new Object();

    /* JADX INFO: renamed from: b */
    public final C0529K f2041b;

    public C0786t(C0529K c0529k, long j2, String str) {
        AbstractC0076b.m133h(str, "description");
        this.f2041b = c0529k;
        String strConcat = str.concat(" created");
        AbstractC0076b.m133h(strConcat, "description");
        m1663b(new C0525G(strConcat, EnumC0524F.f1109s, j2, null));
    }

    /* JADX INFO: renamed from: a */
    public static void m1662a(C0529K c0529k, Level level, String str) {
        Logger logger = f2039c;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + c0529k + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1663b(C0525G c0525g) {
        Level level;
        int iOrdinal = c0525g.f1114b.ordinal();
        if (iOrdinal != 2) {
            level = iOrdinal != 3 ? Level.FINEST : Level.FINE;
        } else {
            level = Level.FINER;
        }
        synchronized (this.f2040a) {
        }
        m1662a(this.f2041b, level, c0525g.f1113a);
    }
}

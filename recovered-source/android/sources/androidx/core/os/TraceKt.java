package androidx.core.os;

import android.os.Trace;
import p078p0.InterfaceC6487a;

/* JADX INFO: loaded from: classes.dex */
public final class TraceKt {
    public static final <T> T trace(String str, InterfaceC6487a interfaceC6487a) {
        Trace.beginSection(str);
        try {
            return (T) interfaceC6487a.invoke();
        } finally {
            Trace.endSection();
        }
    }
}

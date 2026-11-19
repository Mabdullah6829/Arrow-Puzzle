package p033S0;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: renamed from: S0.A */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0601A extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // java.io.Flushable
    void flush();

    /* JADX INFO: renamed from: s */
    void mo1356s(C0613g c0613g, long j2);
}

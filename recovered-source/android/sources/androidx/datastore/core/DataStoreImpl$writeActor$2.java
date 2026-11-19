package androidx.datastore.core;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p000A0.C0051n;
import p000A0.C0055p;
import p000A0.InterfaceC0049m;
import p057d0.C6289k;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreImpl$writeActor$2 extends AbstractC6453l implements InterfaceC6502p {
    public static final DataStoreImpl$writeActor$2 INSTANCE = new DataStoreImpl$writeActor$2();

    public DataStoreImpl$writeActor$2() {
        super(2);
    }

    @Override // p078p0.InterfaceC6502p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Message.Update) obj, (Throwable) obj2);
        return C6289k.f24318a;
    }

    public final void invoke(Message.Update<T> msg, Throwable th) {
        AbstractC6452k.m12181e(msg, "msg");
        InterfaceC0049m ack = msg.getAck();
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        C0051n c0051n = (C0051n) ack;
        c0051n.getClass();
        c0051n.m50E(new C0055p(false, th));
    }
}

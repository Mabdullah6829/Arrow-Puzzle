package androidx.core.os;

import android.p046os.OutcomeReceiver;
import androidx.core.app.AbstractC1158e;
import p062g0.InterfaceC6348c;

/* JADX INFO: loaded from: classes.dex */
public final class OutcomeReceiverKt {
    public static final <R, E extends Throwable> OutcomeReceiver asOutcomeReceiver(InterfaceC6348c interfaceC6348c) {
        return AbstractC1158e.m2056h(new ContinuationOutcomeReceiver(interfaceC6348c));
    }
}

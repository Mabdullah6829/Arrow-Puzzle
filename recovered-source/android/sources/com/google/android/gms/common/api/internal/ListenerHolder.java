package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class ListenerHolder<L> {

    /* JADX INFO: renamed from: a */
    public final HandlerExecutor f4256a;

    /* JADX INFO: renamed from: b */
    public volatile ListenerKey f4257b;

    public static final class ListenerKey<L> {

        /* JADX INFO: renamed from: a */
        public final Object f4258a;

        /* JADX INFO: renamed from: b */
        public final String f4259b;

        public ListenerKey(Object obj, String str) {
            this.f4258a = obj;
            this.f4259b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            return this.f4258a == listenerKey.f4258a && this.f4259b.equals(listenerKey.f4259b);
        }

        public final int hashCode() {
            return this.f4259b.hashCode() + (System.identityHashCode(this.f4258a) * 31);
        }
    }

    public interface Notifier<L> {
        /* JADX INFO: renamed from: a */
        void mo3455a(Object obj);
    }

    public ListenerHolder(Looper looper, Object obj) {
        this.f4256a = new HandlerExecutor(looper);
        Preconditions.m3541e("zzku");
        this.f4257b = new ListenerKey(obj, "zzku");
    }

    /* JADX INFO: renamed from: a */
    public final void m3479a(final Notifier notifier) {
        this.f4256a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.zabw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                ListenerHolder listenerHolder = this.f4317s;
                ListenerHolder.Notifier notifier2 = notifier;
                ListenerHolder.ListenerKey listenerKey = listenerHolder.f4257b;
                if (listenerKey == null) {
                    return;
                }
                notifier2.mo3455a(listenerKey.f4258a);
            }
        });
    }
}

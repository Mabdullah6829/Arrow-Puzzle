package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class zzuy extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzva f21024a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzuy(zzva zzvaVar, Looper looper) {
        super(looper);
        this.f21024a = zzvaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zzva zzvaVar = this.f21024a;
        zzvaVar.getClass();
        int i2 = message.what;
        zzuz zzuzVar = null;
        if (i2 == 1) {
            zzuz zzuzVar2 = (zzuz) message.obj;
            try {
                zzvaVar.f21075a.queueInputBuffer(zzuzVar2.f21025a, 0, zzuzVar2.f21026b, zzuzVar2.f21028d, zzuzVar2.f21029e);
            } catch (RuntimeException e) {
                AtomicReference atomicReference = zzvaVar.f21078d;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
            zzuzVar = zzuzVar2;
        } else if (i2 == 2) {
            zzuz zzuzVar3 = (zzuz) message.obj;
            int i3 = zzuzVar3.f21025a;
            MediaCodec.CryptoInfo cryptoInfo = zzuzVar3.f21027c;
            long j2 = zzuzVar3.f21028d;
            int i4 = zzuzVar3.f21029e;
            try {
                synchronized (zzva.f21074h) {
                    zzvaVar.f21075a.queueSecureInputBuffer(i3, 0, cryptoInfo, j2, i4);
                }
            } catch (RuntimeException e2) {
                AtomicReference atomicReference2 = zzvaVar.f21078d;
                while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                }
            }
            zzuzVar = zzuzVar3;
        } else if (i2 == 3) {
            zzvaVar.f21079e.m6050a();
        } else if (i2 != 4) {
            AtomicReference atomicReference3 = zzvaVar.f21078d;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                zzvaVar.f21075a.setParameters((Bundle) message.obj);
            } catch (RuntimeException e3) {
                AtomicReference atomicReference4 = zzvaVar.f21078d;
                while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                }
            }
        }
        if (zzuzVar != null) {
            ArrayDeque arrayDeque = zzva.f21073g;
            synchronized (arrayDeque) {
                arrayDeque.add(zzuzVar);
            }
        }
    }
}

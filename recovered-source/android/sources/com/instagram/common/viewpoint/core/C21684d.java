package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4d */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C21684d<T> {
    public static byte[] A09;
    public static String[] A0A = {"qNhODmuhOGTzTOdNu4k", "7K2GPWa5EHuyy4", "E4NOCJ5RL4hYeLNooPFdkLqGKDRv", "JwlW7s8WNTa19hdGL1amV", "YNjlntyRTdoFHiJHxz0qVC", "VcHvMaXHchlXNA9aE7EYkOxPZlMykCpc", "sHIyzZJD7qVKB1sd9lWDot", "2KMjU5K0FjJgBGqm2h4w3g2sgyG9pwrH"};
    public boolean A00;
    public boolean A01;
    public final InterfaceC213445 A02;
    public final InterfaceC21624X A03;
    public final InterfaceC21664b<T> A04;
    public final Object A05;
    public final ArrayDeque<Runnable> A06;
    public final ArrayDeque<Runnable> A07;
    public final CopyOnWriteArraySet<C21674c<T>> A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C21684d(CopyOnWriteArraySet<C21674c<T>> copyOnWriteArraySet, Looper looper, InterfaceC213445 interfaceC213445, InterfaceC21664b<T> interfaceC21664b) {
        this.A02 = interfaceC213445;
        this.A08 = copyOnWriteArraySet;
        this.A04 = interfaceC21664b;
        this.A05 = new Object();
        this.A06 = new ArrayDeque<>();
        this.A07 = new ArrayDeque<>();
        this.A03 = interfaceC213445.A5P(looper, new Handler.Callback() { // from class: com.facebook.ads.redexgen.X.4Z
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.A00.A05(message);
            }
        });
        this.A01 = true;
        this.A00 = MetaExoPlayerUpgradeConfig.A03(EnumC4663jX.A0E);
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 38);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A09 = new byte[]{41, 46, 54, 47, 43, 37, 33, 60, 45, 58, 41, 60, 33, 39, 38, 14, 33, 38, 33, 59, 32, 45, 44};
        if (A0A[0].length() == 4) {
            throw new RuntimeException();
        }
        A0A[3] = "KpT";
    }

    static {
        A03();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4b != com.facebook.ads.androidx.media3.common.util.ListenerSet$IterationFinishedEvent<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public C21684d(Looper looper, InterfaceC213445 interfaceC213445, InterfaceC21664b<T> interfaceC21664b) {
        this(new CopyOnWriteArraySet(), looper, interfaceC213445, interfaceC21664b);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4b != com.facebook.ads.androidx.media3.common.util.ListenerSet$IterationFinishedEvent<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    private final C21684d<T> A00(Looper looper, InterfaceC213445 interfaceC213445, InterfaceC21664b<T> interfaceC21664b) {
        return new C21684d<>(this.A08, looper, interfaceC213445, interfaceC21664b);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    private void A02() {
        if (!this.A01) {
            return;
        }
        AbstractC21273y.A08(Thread.currentThread() == this.A03.A8R().getThread());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.androidx.media3.common.util.ListenerSet$ListenerHolder<T> */
    public static /* synthetic */ void A04(CopyOnWriteArraySet copyOnWriteArraySet, int i2, InterfaceC21654a interfaceC21654a) {
        Iterator it = copyOnWriteArraySet.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A01(0, 6, 102));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.androidx.media3.common.util.ListenerSet$ListenerHolder<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public boolean A05(Message message) {
        Iterator<C21674c<T>> it = this.A08.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A01(6, 17, 110));
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4b != com.facebook.ads.androidx.media3.common.util.ListenerSet$IterationFinishedEvent<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public final C21684d<T> A07(Looper looper, InterfaceC21664b<T> interfaceC21664b) {
        return A00(looper, this.A02, interfaceC21664b);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public final void A08() {
        A02();
        if (this.A07.isEmpty()) {
            return;
        }
        if (!this.A03.A9n(0)) {
            this.A03.AJD(this.A03.ACg(0));
        }
        boolean z = !this.A06.isEmpty();
        this.A06.addAll(this.A07);
        this.A07.clear();
        if (z) {
            return;
        }
        while (!recursiveFlushInProgress) {
            Runnable runnablePeekFirst = this.A06.peekFirst();
            String[] strArr = A0A;
            if (strArr[4].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "yEp1Grh3pDykJXHd8ndBtu";
            strArr2[6] = "iM1KUlOTpdsgtS4YknLkQB";
            runnablePeekFirst.run();
            this.A06.removeFirst();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4a != com.facebook.ads.androidx.media3.common.util.ListenerSet$Event<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.androidx.media3.common.util.ListenerSet$ListenerHolder<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public final void A09(final int i2, final InterfaceC21654a<T> interfaceC21654a) {
        A02();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.A08);
        if (this.A00) {
            Iterator it = copyOnWriteArraySet.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException(A01(0, 6, 102));
            }
            return;
        }
        this.A07.add(new Runnable() { // from class: com.facebook.ads.redexgen.X.4Y
            @Override // java.lang.Runnable
            public final void run() {
                C21684d.A04(copyOnWriteArraySet, i2, interfaceC21654a);
            }
        });
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4a != com.facebook.ads.androidx.media3.common.util.ListenerSet$Event<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public final void A0A(int i2, InterfaceC21654a<T> interfaceC21654a) {
        A09(i2, interfaceC21654a);
        A08();
    }
}

package com.google.firebase.sessions;

import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p018K0.InterfaceC0325a;
import p021M0.InterfaceC0339d;
import p022N.AbstractC0355G;
import p023N0.InterfaceC0455a;
import p025O0.AbstractC0486k;
import p025O0.AbstractC0491p;
import p029Q0.C0512l;
import p092z0.C6583a;
import p092z0.EnumC6585c;

/* JADX INFO: loaded from: classes2.dex */
public final class Time {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: ms */
    private final long f24037ms;
    private final long seconds;

    /* JADX INFO: renamed from: us */
    private final long f24038us;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0325a serializer() {
            return Time$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }
    }

    public /* synthetic */ Time(int i2, long j2, long j3, long j4, AbstractC0491p abstractC0491p) {
        if (1 != (i2 & 1)) {
            AbstractC0486k.m1177d(i2, 1, Time$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f24037ms = j2;
        this.f24038us = (i2 & 2) == 0 ? ((long) 1000) * j2 : j3;
        if ((i2 & 4) == 0) {
            this.seconds = j2 / ((long) 1000);
        } else {
            this.seconds = j4;
        }
    }

    public static /* synthetic */ Time copy$default(Time time, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = time.f24037ms;
        }
        return time.copy(j2);
    }

    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(Time time, InterfaceC0455a interfaceC0455a, InterfaceC0339d interfaceC0339d) {
        C0512l c0512l = (C0512l) interfaceC0455a;
        c0512l.m1211m(interfaceC0339d, 0, time.f24037ms);
        if (c0512l.mo947b(interfaceC0339d) || time.f24038us != time.f24037ms * ((long) 1000)) {
            c0512l.m1211m(interfaceC0339d, 1, time.f24038us);
        }
        if (!c0512l.mo947b(interfaceC0339d) && time.seconds == time.f24037ms / ((long) 1000)) {
            return;
        }
        c0512l.m1211m(interfaceC0339d, 2, time.seconds);
    }

    public final long component1() {
        return this.f24037ms;
    }

    public final Time copy(long j2) {
        return new Time(j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Time) && this.f24037ms == ((Time) obj).f24037ms;
    }

    public final long getMs() {
        return this.f24037ms;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public final long getUs() {
        return this.f24038us;
    }

    public int hashCode() {
        return Long.hashCode(this.f24037ms);
    }

    /* JADX INFO: renamed from: minus-5sfh64U, reason: not valid java name */
    public final long m12335minus5sfh64U(Time time) {
        AbstractC6452k.m12181e(time, "time");
        int i2 = C6583a.f24808v;
        return AbstractC0355G.m561o(this.f24037ms - time.f24037ms, EnumC6585c.MILLISECONDS);
    }

    public String toString() {
        return "Time(ms=" + this.f24037ms + ')';
    }

    public Time(long j2) {
        this.f24037ms = j2;
        long j3 = 1000;
        this.f24038us = j2 * j3;
        this.seconds = j2 / j3;
    }
}

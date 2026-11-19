package com.google.android.gms.internal.measurement;

import java.util.UUID;
import p003C.C0129t;

/* JADX INFO: loaded from: classes2.dex */
final class zzvo extends zzwv {

    /* JADX INFO: renamed from: a */
    public C0129t f22996a;

    /* JADX INFO: renamed from: b */
    public C0129t f22997b;

    /* JADX INFO: renamed from: c */
    public UUID f22998c;

    /* JADX INFO: renamed from: d */
    public long f22999d;

    /* JADX INFO: renamed from: e */
    public byte f23000e;

    /* JADX INFO: renamed from: a */
    public final zzww m10676a() {
        C0129t c0129t;
        C0129t c0129t2;
        UUID uuid;
        if (this.f23000e == 1 && (c0129t = this.f22996a) != null && (c0129t2 = this.f22997b) != null && (uuid = this.f22998c) != null) {
            return new zzvp(c0129t, c0129t2, uuid, this.f22999d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f22996a == null) {
            sb.append(" spansNames");
        }
        if (this.f22997b == null) {
            sb.append(" extras");
        }
        if (this.f22998c == null) {
            sb.append(" rootTraceId");
        }
        if (this.f23000e == 0) {
            sb.append(" rootDurationMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

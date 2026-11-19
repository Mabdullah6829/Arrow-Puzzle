package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p001B.AbstractC0076b;
import p001B.InterfaceC0097w;
import p005D.AbstractC0157b;
import p005D.AbstractC0158c;
import p005D.C0156a;
import p005D.C0159d;
import p005D.C0160e;
import p007E.C0194c;
import p007E.C0195d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmz {

    /* JADX INFO: renamed from: a */
    public final C0194c f22667a = C0195d.f388d;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0097w f22668b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0097w f22669c;

    public zzmz(final zzacr zzacrVar, final String str) {
        this.f22668b = AbstractC0076b.m142r(new InterfaceC0097w() { // from class: com.google.android.gms.internal.measurement.zzmy
            @Override // p001B.InterfaceC0097w
            public final /* synthetic */ Object get() {
                return this.f22665s.f22667a.m287c(zzacrVar.m9383q());
            }
        });
        this.f22669c = AbstractC0076b.m142r(new InterfaceC0097w() { // from class: com.google.android.gms.internal.measurement.zzmx
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // p001B.InterfaceC0097w
            public final Object get() {
                long j2;
                long j3;
                long j4;
                long j5;
                long j6;
                long j7;
                long j8;
                int i2 = AbstractC0158c.f273a;
                int i3 = C0160e.f280H;
                C0159d c0159dM256c = new C0159d().m256c(str.getBytes());
                ByteBuffer byteBuffer = c0159dM256c.f274a;
                byteBuffer.put((byte) 0);
                char c = '\b';
                if (byteBuffer.remaining() < 8) {
                    c0159dM256c.m254a();
                }
                C0159d c0159dM256c2 = c0159dM256c.m256c("".getBytes());
                c0159dM256c2.m254a();
                ByteBuffer byteBuffer2 = c0159dM256c2.f274a;
                byteBuffer2.flip();
                if (byteBuffer2.remaining() > 0) {
                    c0159dM256c2.f279f = byteBuffer2.remaining() + c0159dM256c2.f279f;
                    long j9 = 0;
                    switch (byteBuffer2.remaining()) {
                        case 1:
                            j2 = 0;
                            j8 = j2 ^ ((long) (byteBuffer2.get(0) & 255));
                            c0159dM256c2.f277d = (Long.rotateLeft(j8 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c0159dM256c2.f277d;
                            c0159dM256c2.f278e ^= Long.rotateLeft(j9 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 2:
                            c = '\b';
                            j3 = 0;
                            j2 = j3 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                            j8 = j2 ^ ((long) (byteBuffer2.get(0) & 255));
                            c0159dM256c2.f277d = (Long.rotateLeft(j8 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c0159dM256c2.f277d;
                            c0159dM256c2.f278e ^= Long.rotateLeft(j9 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 3:
                            c = '\b';
                            j4 = 0;
                            j3 = j4 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j2 = j3 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                            j8 = j2 ^ ((long) (byteBuffer2.get(0) & 255));
                            c0159dM256c2.f277d = (Long.rotateLeft(j8 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c0159dM256c2.f277d;
                            c0159dM256c2.f278e ^= Long.rotateLeft(j9 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 4:
                            c = '\b';
                            j5 = 0;
                            j4 = j5 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                            j3 = j4 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j2 = j3 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                            j8 = j2 ^ ((long) (byteBuffer2.get(0) & 255));
                            c0159dM256c2.f277d = (Long.rotateLeft(j8 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c0159dM256c2.f277d;
                            c0159dM256c2.f278e ^= Long.rotateLeft(j9 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 5:
                            j6 = 0;
                            j5 = j6 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                            j4 = j5 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                            j3 = j4 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j2 = j3 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                            j8 = j2 ^ ((long) (byteBuffer2.get(0) & 255));
                            c0159dM256c2.f277d = (Long.rotateLeft(j8 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c0159dM256c2.f277d;
                            c0159dM256c2.f278e ^= Long.rotateLeft(j9 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 6:
                            j7 = 0;
                            j6 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j7;
                            j5 = j6 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                            j4 = j5 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                            j3 = j4 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j2 = j3 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                            j8 = j2 ^ ((long) (byteBuffer2.get(0) & 255));
                            c0159dM256c2.f277d = (Long.rotateLeft(j8 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c0159dM256c2.f277d;
                            c0159dM256c2.f278e ^= Long.rotateLeft(j9 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 7:
                            j7 = ((long) (byteBuffer2.get(6) & 255)) << 48;
                            j6 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j7;
                            j5 = j6 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                            j4 = j5 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                            j3 = j4 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j2 = j3 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                            j8 = j2 ^ ((long) (byteBuffer2.get(0) & 255));
                            c0159dM256c2.f277d = (Long.rotateLeft(j8 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c0159dM256c2.f277d;
                            c0159dM256c2.f278e ^= Long.rotateLeft(j9 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 8:
                            j8 = byteBuffer2.getLong();
                            c0159dM256c2.f277d = (Long.rotateLeft(j8 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c0159dM256c2.f277d;
                            c0159dM256c2.f278e ^= Long.rotateLeft(j9 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 9:
                            j9 ^= (long) (byteBuffer2.get(8) & 255);
                            j8 = byteBuffer2.getLong();
                            c0159dM256c2.f277d = (Long.rotateLeft(j8 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c0159dM256c2.f277d;
                            c0159dM256c2.f278e ^= Long.rotateLeft(j9 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 10:
                            j9 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j9 ^= (long) (byteBuffer2.get(8) & 255);
                            j8 = byteBuffer2.getLong();
                            c0159dM256c2.f277d = (Long.rotateLeft(j8 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c0159dM256c2.f277d;
                            c0159dM256c2.f278e ^= Long.rotateLeft(j9 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 11:
                            j9 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j9 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j9 ^= (long) (byteBuffer2.get(8) & 255);
                            j8 = byteBuffer2.getLong();
                            c0159dM256c2.f277d = (Long.rotateLeft(j8 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c0159dM256c2.f277d;
                            c0159dM256c2.f278e ^= Long.rotateLeft(j9 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 12:
                            j9 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                            j9 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j9 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j9 ^= (long) (byteBuffer2.get(8) & 255);
                            j8 = byteBuffer2.getLong();
                            c0159dM256c2.f277d = (Long.rotateLeft(j8 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c0159dM256c2.f277d;
                            c0159dM256c2.f278e ^= Long.rotateLeft(j9 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 13:
                            j9 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                            j9 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                            j9 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j9 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j9 ^= (long) (byteBuffer2.get(8) & 255);
                            j8 = byteBuffer2.getLong();
                            c0159dM256c2.f277d = (Long.rotateLeft(j8 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c0159dM256c2.f277d;
                            c0159dM256c2.f278e ^= Long.rotateLeft(j9 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 14:
                            j9 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                            j9 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                            j9 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                            j9 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j9 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j9 ^= (long) (byteBuffer2.get(8) & 255);
                            j8 = byteBuffer2.getLong();
                            c0159dM256c2.f277d = (Long.rotateLeft(j8 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c0159dM256c2.f277d;
                            c0159dM256c2.f278e ^= Long.rotateLeft(j9 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 15:
                            j9 = ((long) (byteBuffer2.get(14) & 255)) << 48;
                            j9 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                            j9 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                            j9 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                            j9 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j9 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j9 ^= (long) (byteBuffer2.get(8) & 255);
                            j8 = byteBuffer2.getLong();
                            c0159dM256c2.f277d = (Long.rotateLeft(j8 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c0159dM256c2.f277d;
                            c0159dM256c2.f278e ^= Long.rotateLeft(j9 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        default:
                            throw new AssertionError("Should never get here.");
                    }
                }
                long j10 = c0159dM256c2.f277d;
                long j11 = c0159dM256c2.f279f;
                long j12 = j10 ^ j11;
                long j13 = j11 ^ c0159dM256c2.f278e;
                long j14 = j12 + j13;
                long j15 = j13 + j14;
                long j16 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
                long j17 = (j16 ^ (j16 >>> 33)) * (-4265267296055464877L);
                long j18 = (j15 ^ (j15 >>> 33)) * (-49064778989728563L);
                long j19 = (j18 ^ (j18 >>> 33)) * (-4265267296055464877L);
                long j20 = j19 ^ (j19 >>> 33);
                long j21 = (j17 ^ (j17 >>> 33)) + j20;
                c0159dM256c2.f277d = j21;
                c0159dM256c2.f278e = j20 + j21;
                byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(c0159dM256c2.f277d).putLong(c0159dM256c2.f278e).array();
                char[] cArr = AbstractC0157b.f272s;
                new C0156a(bArrArray);
                return this.f22663s.f22667a.m287c((byte[]) bArrArray.clone());
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final File m10530a() {
        String str = (String) this.f22668b.get();
        String str2 = (String) this.f22669c.get();
        return new File(AbstractC1456a.m2451r(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3), str, "/", str2, ".pb"));
    }
}

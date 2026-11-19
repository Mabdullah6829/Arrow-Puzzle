package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgv {

    /* JADX INFO: renamed from: a */
    public final boolean f18228a;

    /* JADX INFO: renamed from: b */
    public final boolean f18229b;

    /* JADX INFO: renamed from: c */
    public final boolean f18230c;

    /* JADX INFO: renamed from: d */
    public final boolean f18231d;

    /* JADX INFO: renamed from: e */
    public final boolean f18232e;

    /* JADX INFO: renamed from: f */
    public final int f18233f;

    /* JADX INFO: renamed from: g */
    public final int f18234g;

    /* JADX INFO: renamed from: h */
    public final boolean f18235h;

    /* JADX INFO: renamed from: i */
    public final boolean f18236i;

    /* JADX INFO: renamed from: j */
    public final boolean f18237j;

    /* JADX INFO: renamed from: k */
    public final boolean f18238k;

    /* JADX INFO: renamed from: l */
    public final byte f18239l;

    /* JADX INFO: renamed from: m */
    public final byte f18240m;

    /* JADX WARN: Code duplicated, block: B:68:0x011d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0125  */
    public zzgv(zzgu zzguVar) {
        byte bM6345h;
        int i2 = zzguVar.f18186a;
        ByteBuffer byteBuffer = zzguVar.f18187b;
        boolean zM6344g = false;
        zzgtr.m7128a(i2 == 1);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        zzet zzetVar = new zzet(bArr, iRemaining);
        this.f18234g = zzetVar.m6345h(3);
        zzetVar.m6342e();
        boolean zM6344g2 = zzetVar.m6344g();
        this.f18228a = zM6344g2;
        if (zM6344g2) {
            zzetVar.m6345h(5);
            this.f18229b = false;
            this.f18235h = false;
        } else {
            if (zzetVar.m6344g()) {
                zzetVar.m6343f(64);
                if (zzetVar.m6344g()) {
                    int i3 = 0;
                    while (!zzetVar.m6344g()) {
                        i3++;
                    }
                    if (i3 < 32) {
                        zzetVar.m6343f(i3);
                    }
                }
                boolean zM6344g3 = zzetVar.m6344g();
                this.f18229b = zM6344g3;
                if (zM6344g3) {
                    zzetVar.m6343f(47);
                }
            } else {
                this.f18229b = false;
            }
            this.f18235h = zzetVar.m6344g();
            int iM6345h = zzetVar.m6345h(5);
            for (int i4 = 0; i4 <= iM6345h; i4++) {
                zzetVar.m6343f(12);
                if (i4 == 0) {
                    if (zzetVar.m6345h(5) > 7) {
                        zzetVar.m6344g();
                    }
                } else if (zzetVar.m6345h(5) > 7) {
                    zzetVar.m6342e();
                }
                if (this.f18229b) {
                    zzetVar.m6342e();
                }
                if (this.f18235h && zzetVar.m6344g()) {
                    if (i4 == 0) {
                        zzetVar.m6345h(4);
                    } else {
                        zzetVar.m6343f(4);
                    }
                }
            }
        }
        int iM6345h2 = zzetVar.m6345h(4);
        int iM6345h3 = zzetVar.m6345h(4);
        zzetVar.m6343f(iM6345h2 + 1);
        zzetVar.m6343f(iM6345h3 + 1);
        if (this.f18228a) {
            this.f18230c = false;
        } else {
            boolean zM6344g4 = zzetVar.m6344g();
            this.f18230c = zM6344g4;
            if (zM6344g4) {
                zzetVar.m6343f(4);
                zzetVar.m6343f(3);
            }
        }
        zzetVar.m6343f(3);
        if (this.f18228a) {
            this.f18232e = true;
            this.f18231d = true;
            this.f18233f = 0;
        } else {
            zzetVar.m6343f(4);
            boolean zM6344g5 = zzetVar.m6344g();
            if (zM6344g5) {
                zzetVar.m6343f(2);
            }
            if (zzetVar.m6344g()) {
                this.f18231d = true;
            } else {
                boolean zM6344g6 = zzetVar.m6344g();
                this.f18231d = zM6344g6;
                if (!zM6344g6) {
                    this.f18232e = true;
                }
                if (zM6344g5) {
                    this.f18233f = zzetVar.m6345h(3) + 1;
                } else {
                    this.f18233f = 0;
                }
            }
            if (zzetVar.m6344g()) {
                this.f18232e = true;
            } else {
                this.f18232e = zzetVar.m6344g();
            }
            if (zM6344g5) {
                this.f18233f = zzetVar.m6345h(3) + 1;
            } else {
                this.f18233f = 0;
            }
        }
        zzetVar.m6343f(3);
        boolean zM6344g7 = zzetVar.m6344g();
        if (this.f18234g == 2 && zM6344g7) {
            this.f18236i = zzetVar.m6344g();
        } else {
            this.f18236i = false;
        }
        if (this.f18234g != 1) {
            this.f18237j = zzetVar.m6344g();
        } else {
            this.f18237j = false;
        }
        if (zzetVar.m6344g()) {
            this.f18239l = (byte) zzetVar.m6345h(8);
            this.f18240m = (byte) zzetVar.m6345h(8);
            bM6345h = (byte) zzetVar.m6345h(8);
        } else {
            this.f18239l = (byte) 0;
            this.f18240m = (byte) 0;
            bM6345h = 0;
        }
        if (this.f18237j) {
            zzetVar.m6342e();
            this.f18238k = false;
        } else if (this.f18239l == 1 && this.f18240m == 13 && bM6345h == 0) {
            this.f18238k = false;
        } else {
            zzetVar.m6342e();
            int i5 = this.f18234g;
            if (i5 == 0) {
                this.f18238k = true;
                zM6344g = true;
            } else if (i5 == 1) {
                this.f18238k = false;
            } else if (this.f18236i) {
                boolean zM6344g8 = zzetVar.m6344g();
                this.f18238k = zM6344g8;
                if (zM6344g8) {
                    zM6344g = zzetVar.m6344g();
                }
            } else {
                this.f18238k = true;
            }
            if (this.f18238k && zM6344g) {
                zzetVar.m6345h(2);
            }
        }
        zzetVar.m6342e();
    }
}

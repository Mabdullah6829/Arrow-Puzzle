package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzvw extends zziz {

    /* JADX INFO: renamed from: W0 */
    public static final byte[] f21137W0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: A0 */
    public boolean f21138A0;

    /* JADX INFO: renamed from: B0 */
    public int f21139B0;

    /* JADX INFO: renamed from: C0 */
    public int f21140C0;

    /* JADX INFO: renamed from: D0 */
    public int f21141D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f21142E0;

    /* JADX INFO: renamed from: F0 */
    public boolean f21143F0;

    /* JADX INFO: renamed from: G0 */
    public boolean f21144G0;

    /* JADX INFO: renamed from: H0 */
    public long f21145H0;

    /* JADX INFO: renamed from: I0 */
    public long f21146I0;

    /* JADX INFO: renamed from: J0 */
    public boolean f21147J0;

    /* JADX INFO: renamed from: K0 */
    public boolean f21148K0;

    /* JADX INFO: renamed from: L */
    public final Context f21149L;

    /* JADX INFO: renamed from: L0 */
    public boolean f21150L0;

    /* JADX INFO: renamed from: M */
    public final zzvk f21151M;

    /* JADX INFO: renamed from: M0 */
    public zzjd f21152M0;

    /* JADX INFO: renamed from: N */
    public final zzvy f21153N;

    /* JADX INFO: renamed from: N0 */
    public zzvv f21154N0;

    /* JADX INFO: renamed from: O */
    public final float f21155O;

    /* JADX INFO: renamed from: O0 */
    public long f21156O0;

    /* JADX INFO: renamed from: P */
    public final zzix f21157P;

    /* JADX INFO: renamed from: P0 */
    public boolean f21158P0;

    /* JADX INFO: renamed from: Q */
    public final zzix f21159Q;

    /* JADX INFO: renamed from: Q0 */
    public boolean f21160Q0;

    /* JADX INFO: renamed from: R */
    public final zzix f21161R;

    /* JADX INFO: renamed from: R0 */
    public boolean f21162R0;

    /* JADX INFO: renamed from: S */
    public final zzvd f21163S;

    /* JADX INFO: renamed from: S0 */
    public long f21164S0;

    /* JADX INFO: renamed from: T */
    public final MediaCodec.BufferInfo f21165T;

    /* JADX INFO: renamed from: T0 */
    public final zzjb f21166T0;

    /* JADX INFO: renamed from: U */
    public final ArrayDeque f21167U;

    /* JADX INFO: renamed from: U0 */
    public zzjb f21168U0;

    /* JADX INFO: renamed from: V */
    public final zzub f21169V;

    /* JADX INFO: renamed from: V0 */
    public final zzgxd f21170V0;

    /* JADX INFO: renamed from: W */
    public final AtomicInteger f21171W;

    /* JADX INFO: renamed from: X */
    public zzv f21172X;

    /* JADX INFO: renamed from: Y */
    public zzv f21173Y;

    /* JADX INFO: renamed from: Z */
    public zzuj f21174Z;

    /* JADX INFO: renamed from: a0 */
    public zzuj f21175a0;

    /* JADX INFO: renamed from: b0 */
    public zznb f21176b0;

    /* JADX INFO: renamed from: c0 */
    public final long f21177c0;

    /* JADX INFO: renamed from: d0 */
    public float f21178d0;

    /* JADX INFO: renamed from: e0 */
    public float f21179e0;

    /* JADX INFO: renamed from: f0 */
    public zzvm f21180f0;

    /* JADX INFO: renamed from: g0 */
    public zzv f21181g0;

    /* JADX INFO: renamed from: h0 */
    public MediaFormat f21182h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f21183i0;

    /* JADX INFO: renamed from: j0 */
    public float f21184j0;

    /* JADX INFO: renamed from: k0 */
    public ArrayDeque f21185k0;

    /* JADX INFO: renamed from: l0 */
    public zzvs f21186l0;

    /* JADX INFO: renamed from: m0 */
    public zzvp f21187m0;

    /* JADX INFO: renamed from: n0 */
    public int f21188n0;

    /* JADX INFO: renamed from: o0 */
    public boolean f21189o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f21190p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f21191q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f21192r0;

    /* JADX INFO: renamed from: s0 */
    public long f21193s0;

    /* JADX INFO: renamed from: t0 */
    public long f21194t0;

    /* JADX INFO: renamed from: u0 */
    public int f21195u0;

    /* JADX INFO: renamed from: v0 */
    public int f21196v0;

    /* JADX INFO: renamed from: w0 */
    public ByteBuffer f21197w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f21198x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f21199y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f21200z0;

    public zzvw(Context context, int i2, zzve zzveVar, zzvy zzvyVar, float f2) {
        super(i2);
        this.f21149L = context.getApplicationContext();
        this.f21151M = zzveVar;
        zzvyVar.getClass();
        this.f21153N = zzvyVar;
        this.f21155O = f2;
        this.f21171W = new AtomicInteger();
        this.f21157P = new zzix(0);
        this.f21159Q = new zzix(0);
        this.f21161R = new zzix(2);
        zzvd zzvdVar = new zzvd();
        this.f21163S = zzvdVar;
        this.f21165T = new MediaCodec.BufferInfo();
        this.f21178d0 = 1.0f;
        this.f21179e0 = 1.0f;
        this.f21177c0 = -9223372036854775807L;
        this.f21167U = new ArrayDeque();
        this.f21154N0 = zzvv.f21130g;
        zzvdVar.m8567d(0);
        zzvdVar.f20048d.order(ByteOrder.nativeOrder());
        this.f21169V = new zzub();
        this.f21184j0 = -1.0f;
        this.f21188n0 = 0;
        this.f21139B0 = 0;
        this.f21195u0 = -1;
        this.f21196v0 = -1;
        this.f21194t0 = -9223372036854775807L;
        this.f21145H0 = -9223372036854775807L;
        this.f21146I0 = -9223372036854775807L;
        this.f21156O0 = -9223372036854775807L;
        this.f21193s0 = -9223372036854775807L;
        this.f21140C0 = 0;
        this.f21141D0 = 0;
        this.f21152M0 = new zzjd();
        this.f21162R0 = false;
        this.f21164S0 = 0L;
        int i3 = zzgxd.f18323u;
        this.f21170V0 = zzgyu.f18372B;
        zzjb zzjbVar = zzjb.f20074b;
        this.f21166T0 = zzjbVar;
        this.f21168U0 = zzjbVar;
    }

    /* JADX INFO: renamed from: A0 */
    public void mo3979A0(long j2) {
        this.f21156O0 = Math.max(j2, this.f21156O0);
        while (true) {
            ArrayDeque arrayDeque = this.f21167U;
            if (arrayDeque.isEmpty() || j2 < ((zzvv) arrayDeque.peek()).f21131a) {
                return;
            }
            zzvv zzvvVar = (zzvv) arrayDeque.poll();
            zzvvVar.getClass();
            m8963G0(zzvvVar);
            mo4021t0();
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m8957B0(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.f21166T0.f20075a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m8958C0(zzv zzvVar) {
        if (this.f21180f0 != null && this.f21141D0 != 3 && this.f20072z != 0) {
            float f2 = this.f21179e0;
            zzvVar.getClass();
            zzv[] zzvVarArr = this.f20055B;
            zzvVarArr.getClass();
            float fMo4010n0 = mo4010n0(f2, zzvVar, zzvVarArr);
            float f3 = this.f21184j0;
            if (f3 != fMo4010n0) {
                if (fMo4010n0 == -1.0f) {
                    m8960E0();
                    return false;
                }
                if (f3 != -1.0f || fMo4010n0 > this.f21155O) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fMo4010n0);
                    zzvm zzvmVar = this.f21180f0;
                    zzvmVar.getClass();
                    zzvmVar.mo8914d(bundle);
                    this.f21184j0 = fMo4010n0;
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zziz
    /* JADX INFO: renamed from: D */
    public void mo3980D(boolean z, boolean z2) {
        this.f21152M0 = new zzjd();
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m8959D0() {
        if (this.f21142E0) {
            this.f21140C0 = 1;
            if (mo3986L()) {
                this.f21141D0 = 3;
                return false;
            }
            this.f21141D0 = 2;
            return true;
        }
        zzuj zzujVar = this.f21175a0;
        zzujVar.getClass();
        this.f21174Z = zzujVar;
        this.f21140C0 = 0;
        this.f21141D0 = 0;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zziz
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo3981E(com.google.android.gms.internal.ads.zzv[] r12, long r13, long r15, com.google.android.gms.internal.ads.zzxl r17) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zzvv r12 = r11.f21154N0
            long r0 = r12.f21133c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            com.google.android.gms.internal.ads.zzvv r4 = new com.google.android.gms.internal.ads.zzvv
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.m8963G0(r4)
            boolean r12 = r11.f21160Q0
            if (r12 == 0) goto L56
            r11.mo4021t0()
            return
        L24:
            java.util.ArrayDeque r12 = r11.f21167U
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.f21145H0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.f21156O0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            com.google.android.gms.internal.ads.zzvv r4 = new com.google.android.gms.internal.ads.zzvv
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.m8963G0(r4)
            com.google.android.gms.internal.ads.zzvv r12 = r11.f21154N0
            long r12 = r12.f21133c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.mo4021t0()
        L56:
            return
        L57:
            com.google.android.gms.internal.ads.zzvv r0 = new com.google.android.gms.internal.ads.zzvv
            long r1 = r11.f21145H0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvw.mo3981E(com.google.android.gms.internal.ads.zzv[], long, long, com.google.android.gms.internal.ads.zzxl):void");
    }

    /* JADX INFO: renamed from: E0 */
    public final void m8960E0() {
        if (this.f21142E0) {
            this.f21140C0 = 1;
            this.f21141D0 = 3;
        } else {
            m8968K();
            m8966I();
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m8961F() {
        try {
            zzvm zzvmVar = this.f21180f0;
            if (zzvmVar == null) {
                throw null;
            }
            zzvmVar.zzk();
            mo3990N();
        } catch (Throwable th) {
            mo3990N();
            throw th;
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m8962F0() {
        int i2 = this.f21141D0;
        if (i2 == 1) {
            m8961F();
            return;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                this.f21148K0 = true;
                mo4026w0();
                return;
            } else {
                m8968K();
                m8966I();
                return;
            }
        }
        m8961F();
        zzuj zzujVar = this.f21175a0;
        zzujVar.getClass();
        this.f21174Z = zzujVar;
        this.f21140C0 = 0;
        this.f21141D0 = 0;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: G */
    public boolean mo3982G() {
        return this.f21148K0;
    }

    /* JADX INFO: renamed from: G0 */
    public final void m8963G0(zzvv zzvvVar) {
        this.f21154N0 = zzvvVar;
        long j2 = zzvvVar.f21133c;
        if (j2 != -9223372036854775807L) {
            this.f21158P0 = true;
            mo8897x0(j2);
        }
    }

    /* JADX INFO: renamed from: H */
    public final boolean m8964H(int i2) {
        zzly zzlyVar = this.f20067u;
        zzlyVar.f20350a = null;
        zzlyVar.f20351b = null;
        zzix zzixVar = this.f21157P;
        zzixVar.mo8566c();
        int iM8580B = m8580B(zzlyVar, zzixVar, i2 | 4);
        if (iM8580B == -5) {
            mo4017r0(zzlyVar);
            return true;
        }
        if (iM8580B != -4 || !zzixVar.m8564b(4)) {
            return false;
        }
        this.f21147J0 = true;
        m8962F0();
        return false;
    }

    /* JADX INFO: renamed from: H0 */
    public final zzvv m8965H0() {
        ArrayDeque arrayDeque = this.f21167U;
        return !arrayDeque.isEmpty() ? (zzvv) arrayDeque.getLast() : this.f21154N0;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:122:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x01e6 A[Catch: Exception -> 0x010b, TryCatch #1 {Exception -> 0x010b, blocks: (B:74:0x0103, B:94:0x0161, B:98:0x0193, B:100:0x019b, B:102:0x01a5, B:104:0x01ad, B:106:0x01b5, B:113:0x01c6, B:119:0x01d8, B:148:0x023a, B:152:0x0257, B:154:0x025d, B:156:0x0261, B:158:0x026d, B:124:0x01e6, B:126:0x01ee, B:128:0x01f6, B:130:0x01fe, B:132:0x0206, B:134:0x020e, B:138:0x0220, B:140:0x022a, B:87:0x0121), top: B:214:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0216 A[Catch: Exception -> 0x0280, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0280, blocks: (B:90:0x014d, B:92:0x0155, B:95:0x018a, B:110:0x01c0, B:117:0x01d2, B:144:0x0230, B:146:0x0236, B:149:0x0249, B:136:0x0216), top: B:225:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0236 A[Catch: Exception -> 0x0280, TRY_LEAVE, TryCatch #7 {Exception -> 0x0280, blocks: (B:90:0x014d, B:92:0x0155, B:95:0x018a, B:110:0x01c0, B:117:0x01d2, B:144:0x0230, B:146:0x0236, B:149:0x0249, B:136:0x0216), top: B:225:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:148:0x023a A[Catch: Exception -> 0x010b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x010b, blocks: (B:74:0x0103, B:94:0x0161, B:98:0x0193, B:100:0x019b, B:102:0x01a5, B:104:0x01ad, B:106:0x01b5, B:113:0x01c6, B:119:0x01d8, B:148:0x023a, B:152:0x0257, B:154:0x025d, B:156:0x0261, B:158:0x026d, B:124:0x01e6, B:126:0x01ee, B:128:0x01f6, B:130:0x01fe, B:132:0x0206, B:134:0x020e, B:138:0x0220, B:140:0x022a, B:87:0x0121), top: B:214:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0261 A[Catch: Exception -> 0x010b, TryCatch #1 {Exception -> 0x010b, blocks: (B:74:0x0103, B:94:0x0161, B:98:0x0193, B:100:0x019b, B:102:0x01a5, B:104:0x01ad, B:106:0x01b5, B:113:0x01c6, B:119:0x01d8, B:148:0x023a, B:152:0x0257, B:154:0x025d, B:156:0x0261, B:158:0x026d, B:124:0x01e6, B:126:0x01ee, B:128:0x01f6, B:130:0x01fe, B:132:0x0206, B:134:0x020e, B:138:0x0220, B:140:0x022a, B:87:0x0121), top: B:214:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x02e8 A[Catch: zzvs -> 0x0302, TryCatch #12 {zzvs -> 0x0302, blocks: (B:185:0x02b6, B:187:0x02e8, B:190:0x02f5, B:192:0x02ff, B:196:0x0319, B:199:0x0321, B:200:0x0323, B:195:0x0304, B:202:0x0327, B:203:0x0328, B:205:0x032f, B:206:0x0330, B:207:0x033a, B:209:0x033d), top: B:233:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:192:0x02ff A[Catch: zzvs -> 0x0302, TryCatch #12 {zzvs -> 0x0302, blocks: (B:185:0x02b6, B:187:0x02e8, B:190:0x02f5, B:192:0x02ff, B:196:0x0319, B:199:0x0321, B:200:0x0323, B:195:0x0304, B:202:0x0327, B:203:0x0328, B:205:0x032f, B:206:0x0330, B:207:0x033a, B:209:0x033d), top: B:233:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x0304 A[Catch: zzvs -> 0x0302, TryCatch #12 {zzvs -> 0x0302, blocks: (B:185:0x02b6, B:187:0x02e8, B:190:0x02f5, B:192:0x02ff, B:196:0x0319, B:199:0x0321, B:200:0x0323, B:195:0x0304, B:202:0x0327, B:203:0x0328, B:205:0x032f, B:206:0x0330, B:207:0x033a, B:209:0x033d), top: B:233:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x031f  */
    /* JADX WARN: Code duplicated, block: B:242:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x026d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x0321 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0161 A[Catch: Exception -> 0x010b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x010b, blocks: (B:74:0x0103, B:94:0x0161, B:98:0x0193, B:100:0x019b, B:102:0x01a5, B:104:0x01ad, B:106:0x01b5, B:113:0x01c6, B:119:0x01d8, B:148:0x023a, B:152:0x0257, B:154:0x025d, B:156:0x0261, B:158:0x026d, B:124:0x01e6, B:126:0x01ee, B:128:0x01f6, B:130:0x01fe, B:132:0x0206, B:134:0x020e, B:138:0x0220, B:140:0x022a, B:87:0x0121), top: B:214:0x0103 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x0161, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.gms.internal.ads.zzvp] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11, types: [com.google.android.gms.internal.ads.zzvw] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v24, types: [int] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.google.android.gms.internal.ads.zziz] */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v7, types: [com.google.android.gms.internal.ads.zzvw] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.zzvw] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zzvw] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.android.gms.internal.ads.zzvp] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: I */
    public final void m8966I() {
        zzv zzvVar;
        boolean z;
        Throwable th;
        ArrayDeque arrayDeque;
        ?? r10;
        ?? r11;
        ?? r12;
        Exception exc;
        zzvs zzvsVar;
        ?? diagnosticInfo;
        zzvs zzvsVar2;
        ?? r13;
        ?? length;
        long jZzb;
        int i2;
        boolean z2;
        boolean z3;
        zzvm zzvmVar;
        ?? r1 = this;
        zzgxd zzgxdVar = r1.f21170V0;
        zzvd zzvdVar = r1.f21163S;
        if (r1.f21180f0 == null && !r1.f21198x0 && (zzvVar = r1.f21172X) != null) {
            boolean z4 = true;
            ?? r14 = 0;
            if (r1.f21175a0 == null && r1.mo8895j0(zzvVar)) {
                r1.f21198x0 = false;
                r1.m8970z0();
                String str = zzvVar.f21061o;
                if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                    zzvdVar.f21099j = 32;
                } else {
                    zzvdVar.f21099j = 1;
                }
                r1.f21198x0 = true;
                return;
            }
            r1.f21174Z = r1.f21175a0;
            try {
                zzv zzvVar2 = r1.f21172X;
                Throwable th2 = null;
                try {
                    if (zzvVar2 == null) {
                        throw null;
                    }
                    if (r1.f21185k0 == null) {
                        try {
                            ArrayList arrayListMo4006i0 = r1.mo4006i0(r1.f21153N, zzvVar2);
                            arrayListMo4006i0.isEmpty();
                            r1.f21185k0 = new ArrayDeque();
                            if (!arrayListMo4006i0.isEmpty()) {
                                r1.f21185k0.add((zzvp) arrayListMo4006i0.get(0));
                            }
                            r1.f21186l0 = null;
                        } catch (zzwa e) {
                            throw new zzvs(zzvVar2, e, -49998);
                        }
                    }
                    if (r1.f21185k0.isEmpty()) {
                        throw new zzvs(zzvVar2, null, -49999);
                    }
                    ArrayDeque arrayDeque2 = r1.f21185k0;
                    if (arrayDeque2 == null) {
                        r1 = r1;
                        throw null;
                    }
                    while (true) {
                        r1 = r1;
                        if (r1.f21180f0 != null) {
                            r1.f21185k0 = th2;
                            return;
                        }
                        zzvp zzvpVar = (zzvp) arrayDeque2.peekFirst();
                        if (zzvpVar == null) {
                            throw th2;
                        }
                        r1.mo4001d0(zzvVar2);
                        if (r1.mo3983J(zzvpVar)) {
                            try {
                                r1.f21187m0 = zzvpVar;
                                zzv zzvVar3 = r1.f21172X;
                                if (zzvVar3 == null) {
                                    throw th2;
                                }
                                String str2 = zzvpVar.f21111a;
                                float f2 = r1.f21179e0;
                                try {
                                    zzv[] zzvVarArr = r1.f20055B;
                                    zzvVarArr.getClass();
                                    float fMo4010n0 = r1.mo4010n0(f2, zzvVar3, zzvVarArr);
                                    if (fMo4010n0 <= r1.f21155O) {
                                        fMo4010n0 = -1.0f;
                                    }
                                    zzdp zzdpVar = r1.f20071y;
                                    zzdpVar.getClass();
                                    long jZzb2 = zzdpVar.zzb();
                                    zzvj zzvjVarMo4008k0 = r1.mo4008k0(zzvpVar, zzvVar3, fMo4010n0);
                                    z = z4;
                                    try {
                                        int i3 = Build.VERSION.SDK_INT;
                                        ?? r15 = 31;
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (i3 >= 31) {
                                                            th = th2;
                                                            try {
                                                                zzqh zzqhVar = r1.f20070x;
                                                                zzqhVar.getClass();
                                                                try {
                                                                    synchronized (zzqhVar) {
                                                                        try {
                                                                            zzqg zzqgVar = zzqhVar.f20626b;
                                                                            if (zzqgVar == null) {
                                                                                throw th;
                                                                            }
                                                                            LogSessionId logSessionId = zzqgVar.f20623a;
                                                                            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                                                                            boolean zEquals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
                                                                            r15 = logSessionId;
                                                                            if (!zEquals) {
                                                                                String str3 = "log-session-id";
                                                                                arrayDeque = arrayDeque2;
                                                                                try {
                                                                                    zzvjVarMo4008k0.f21106b.setString("log-session-id", logSessionId.getStringId());
                                                                                    length = str3;
                                                                                } catch (Exception e2) {
                                                                                    e = e2;
                                                                                    exc = e;
                                                                                    r11 = r1;
                                                                                    r12 = zzvpVar;
                                                                                    zzeh.m6212d("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r12.f21111a), exc);
                                                                                    arrayDeque.removeFirst();
                                                                                    String str4 = r12.f21111a;
                                                                                    int length2 = str4.length();
                                                                                    String string = zzvVar2.toString();
                                                                                    String strM2451r = AbstractC1456a.m2451r(new StringBuilder(length2 + 23 + string.length()), "Decoder init failed: ", str4, ", ", string);
                                                                                    String str5 = zzvVar2.f21061o;
                                                                                    if (exc instanceof MediaCodec.CodecException) {
                                                                                        diagnosticInfo = ((MediaCodec.CodecException) exc).getDiagnosticInfo();
                                                                                    } else {
                                                                                        diagnosticInfo = th;
                                                                                    }
                                                                                    zzvsVar = new zzvs(strM2451r, exc, str5, r12, diagnosticInfo);
                                                                                    r11.mo4016q0(zzvsVar);
                                                                                    zzvsVar2 = r11.f21186l0;
                                                                                    if (zzvsVar2 == null) {
                                                                                        r11.f21186l0 = zzvsVar;
                                                                                    } else {
                                                                                        r11.f21186l0 = new zzvs(zzvsVar2.getMessage(), zzvsVar2.getCause(), zzvsVar2.f21124s, zzvsVar2.f21125t, zzvsVar2.f21126u);
                                                                                    }
                                                                                    if (arrayDeque.isEmpty()) {
                                                                                        throw r11.f21186l0;
                                                                                    }
                                                                                }
                                                                            }
                                                                            length = str2.length() + 12;
                                                                            StringBuilder sb = new StringBuilder((int) length);
                                                                            sb.append("createCodec:");
                                                                            sb.append(str2);
                                                                            Trace.beginSection(sb.toString());
                                                                            zzvm zzvmVarMo8907a = r1.f21151M.mo8907a(zzvjVarMo4008k0);
                                                                            r1.f21180f0 = zzvmVarMo8907a;
                                                                            zzvmVarMo8907a.mo8921k(new zzvu(r1));
                                                                            Trace.endSection();
                                                                            zzdp zzdpVar2 = r1.f20071y;
                                                                            zzdpVar2.getClass();
                                                                            jZzb = zzdpVar2.zzb();
                                                                            if (!zzvpVar.m8946b(r1.f21149L, zzvVar3)) {
                                                                                String strM8926c = zzv.m8926c(zzvVar3);
                                                                                String str6 = zzfm.f16091a;
                                                                                Locale locale = Locale.US;
                                                                                zzeh.m6211c("MediaCodecRenderer", "Format exceeds selected codec's capabilities [" + strM8926c + ", " + str2 + "]");
                                                                            }
                                                                            r1.f21184j0 = fMo4010n0;
                                                                            r1.f21181g0 = zzvVar3;
                                                                            if (i3 <= 25 || !"OMX.Exynos.avc.dec.secure".equals(str2)) {
                                                                                i2 = 0;
                                                                            } else {
                                                                                String str7 = Build.MODEL;
                                                                                if (str7.startsWith("SM-T585") || str7.startsWith("SM-A510") || str7.startsWith("SM-A520") || str7.startsWith("SM-J700")) {
                                                                                    i2 = 2;
                                                                                } else {
                                                                                    i2 = 0;
                                                                                }
                                                                            }
                                                                            r1.f21188n0 = i2;
                                                                            if (i3 == 29 || !"c2.android.aac.decoder".equals(str2)) {
                                                                                z2 = false;
                                                                            } else {
                                                                                z2 = z;
                                                                            }
                                                                            r1.f21189o0 = z2;
                                                                            String str8 = zzvpVar.f21111a;
                                                                            if (i3 > 25 && "OMX.rk.video_decoder.avc".equals(str8)) {
                                                                                z3 = z;
                                                                            } else if ((i3 > 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str8) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str8) || "OMX.bcm.vdec.avc.tunnel".equals(str8) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str8) || "OMX.bcm.vdec.hevc.tunnel".equals(str8) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str8))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && zzvpVar.f21116f)) {
                                                                                z3 = z;
                                                                            }
                                                                            r1.f21192r0 = z3;
                                                                            if (r1.f21180f0 != null) {
                                                                                throw th;
                                                                            }
                                                                            if (r1.f20072z == 2) {
                                                                                zzdp zzdpVar3 = r1.f20071y;
                                                                                zzdpVar3.getClass();
                                                                                r1.f21194t0 = zzdpVar3.zzb() + 1000;
                                                                            }
                                                                            r1.f21152M0.f20076a++;
                                                                            long j2 = jZzb - jZzb2;
                                                                            if (i3 >= 31 && !zzgxdVar.isEmpty()) {
                                                                                zzvmVar = r1.f21180f0;
                                                                                if (zzvmVar != null) {
                                                                                    throw th;
                                                                                }
                                                                                zzvmVar.mo8912b(new ArrayList(zzgxdVar));
                                                                            }
                                                                            r10 = zzvpVar;
                                                                            try {
                                                                                r1.mo4012o0(str2, jZzb, j2);
                                                                                r11 = r1;
                                                                            } catch (Exception e3) {
                                                                                e = e3;
                                                                                r13 = r1;
                                                                                exc = e;
                                                                                r12 = r10;
                                                                                r11 = r13;
                                                                                zzeh.m6212d("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r12.f21111a), exc);
                                                                                arrayDeque.removeFirst();
                                                                                String str9 = r12.f21111a;
                                                                                int length3 = str9.length();
                                                                                String string2 = zzvVar2.toString();
                                                                                String strM2451r2 = AbstractC1456a.m2451r(new StringBuilder(length3 + 23 + string2.length()), "Decoder init failed: ", str9, ", ", string2);
                                                                                String str10 = zzvVar2.f21061o;
                                                                                if (exc instanceof MediaCodec.CodecException) {
                                                                                    diagnosticInfo = ((MediaCodec.CodecException) exc).getDiagnosticInfo();
                                                                                } else {
                                                                                    diagnosticInfo = th;
                                                                                }
                                                                                zzvsVar = new zzvs(strM2451r2, exc, str10, r12, diagnosticInfo);
                                                                                r11.mo4016q0(zzvsVar);
                                                                                zzvsVar2 = r11.f21186l0;
                                                                                if (zzvsVar2 == null) {
                                                                                    r11.f21186l0 = zzvsVar;
                                                                                } else {
                                                                                    r11.f21186l0 = new zzvs(zzvsVar2.getMessage(), zzvsVar2.getCause(), zzvsVar2.f21124s, zzvsVar2.f21125t, zzvsVar2.f21126u);
                                                                                }
                                                                                if (arrayDeque.isEmpty()) {
                                                                                    throw r11.f21186l0;
                                                                                }
                                                                            }
                                                                            r1 = r11;
                                                                            z4 = z;
                                                                            th2 = th;
                                                                            arrayDeque2 = arrayDeque;
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                }
                                                            } catch (Exception e4) {
                                                                e = e4;
                                                                arrayDeque = arrayDeque2;
                                                            }
                                                        } else {
                                                            th = th2;
                                                        }
                                                        zzdp zzdpVar4 = r1.f20071y;
                                                        zzdpVar4.getClass();
                                                        jZzb = zzdpVar4.zzb();
                                                        if (!zzvpVar.m8946b(r1.f21149L, zzvVar3)) {
                                                            String strM8926c2 = zzv.m8926c(zzvVar3);
                                                            String str11 = zzfm.f16091a;
                                                            Locale locale2 = Locale.US;
                                                            zzeh.m6211c("MediaCodecRenderer", "Format exceeds selected codec's capabilities [" + strM8926c2 + ", " + str2 + "]");
                                                        }
                                                        r1.f21184j0 = fMo4010n0;
                                                        r1.f21181g0 = zzvVar3;
                                                        if (i3 <= 25) {
                                                            i2 = 0;
                                                        } else {
                                                            i2 = 0;
                                                        }
                                                        r1.f21188n0 = i2;
                                                        if (i3 == 29) {
                                                            z2 = false;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        r1.f21189o0 = z2;
                                                        String str12 = zzvpVar.f21111a;
                                                        if (i3 > 25) {
                                                            z3 = i3 > 29 ? false : false;
                                                        } else if (i3 > 29) {
                                                        }
                                                        r1.f21192r0 = z3;
                                                        if (r1.f21180f0 != null) {
                                                            throw th;
                                                        }
                                                        if (r1.f20072z == 2) {
                                                            zzdp zzdpVar5 = r1.f20071y;
                                                            zzdpVar5.getClass();
                                                            r1.f21194t0 = zzdpVar5.zzb() + 1000;
                                                        }
                                                        r1.f21152M0.f20076a++;
                                                        long j3 = jZzb - jZzb2;
                                                        if (i3 >= 31) {
                                                            zzvmVar = r1.f21180f0;
                                                            if (zzvmVar != null) {
                                                                throw th;
                                                            }
                                                            zzvmVar.mo8912b(new ArrayList(zzgxdVar));
                                                        }
                                                        r10 = zzvpVar;
                                                        r1.mo4012o0(str2, jZzb, j3);
                                                        r11 = r1;
                                                        r1 = r11;
                                                        z4 = z;
                                                        th2 = th;
                                                        arrayDeque2 = arrayDeque;
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                        r10 = zzvpVar;
                                                        r13 = r1;
                                                    }
                                                    Trace.endSection();
                                                } catch (Exception e6) {
                                                    e = e6;
                                                }
                                                length = str2.length() + 12;
                                                StringBuilder sb2 = new StringBuilder((int) length);
                                                sb2.append("createCodec:");
                                                sb2.append(str2);
                                                Trace.beginSection(sb2.toString());
                                                zzvm zzvmVarMo8907a2 = r1.f21151M.mo8907a(zzvjVarMo4008k0);
                                                r1.f21180f0 = zzvmVarMo8907a2;
                                                zzvmVarMo8907a2.mo8921k(new zzvu(r1));
                                            } catch (Throwable th5) {
                                                Trace.endSection();
                                                throw th5;
                                            }
                                        } catch (Exception e7) {
                                            e = e7;
                                            r10 = i3;
                                            r13 = length;
                                        }
                                        arrayDeque = arrayDeque2;
                                        length = r15;
                                    } catch (Exception e8) {
                                        e = e8;
                                        r13 = r1;
                                        r10 = zzvpVar;
                                        th = th2;
                                        arrayDeque = arrayDeque2;
                                    }
                                } catch (Exception e9) {
                                    e = e9;
                                    z = z4;
                                    th = th2;
                                    arrayDeque = arrayDeque2;
                                }
                            } catch (Exception e10) {
                                e = e10;
                                z = z4;
                                th = th2;
                                arrayDeque = arrayDeque2;
                            }
                            r10 = zzvpVar;
                            r13 = r1;
                            exc = e;
                            r12 = r10;
                            r11 = r13;
                            zzeh.m6212d("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r12.f21111a), exc);
                            arrayDeque.removeFirst();
                            String str13 = r12.f21111a;
                            int length4 = str13.length();
                            String string3 = zzvVar2.toString();
                            String strM2451r3 = AbstractC1456a.m2451r(new StringBuilder(length4 + 23 + string3.length()), "Decoder init failed: ", str13, ", ", string3);
                            String str14 = zzvVar2.f21061o;
                            if (exc instanceof MediaCodec.CodecException) {
                                diagnosticInfo = ((MediaCodec.CodecException) exc).getDiagnosticInfo();
                            } else {
                                diagnosticInfo = th;
                            }
                            zzvsVar = new zzvs(strM2451r3, exc, str14, r12, diagnosticInfo);
                            r11.mo4016q0(zzvsVar);
                            zzvsVar2 = r11.f21186l0;
                            if (zzvsVar2 == null) {
                                r11.f21186l0 = zzvsVar;
                            } else {
                                r11.f21186l0 = new zzvs(zzvsVar2.getMessage(), zzvsVar2.getCause(), zzvsVar2.f21124s, zzvsVar2.f21125t, zzvsVar2.f21126u);
                            }
                            if (arrayDeque.isEmpty()) {
                                throw r11.f21186l0;
                            }
                            r1 = r11;
                            z4 = z;
                            th2 = th;
                            arrayDeque2 = arrayDeque;
                        }
                    }
                } catch (zzvs e11) {
                    e = e11;
                }
            } catch (zzvs e12) {
                e = e12;
                r14 = r1;
            }
            throw r14.m8602y(e, zzvVar, false, 4001);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m8967I0(long j2, long j3) {
        if (j3 >= j2) {
            return false;
        }
        zzv zzvVar = this.f21173Y;
        return zzvVar == null || !Objects.equals(zzvVar.f21061o, "audio/opus") || j2 - j3 > 80000;
    }

    /* JADX INFO: renamed from: J */
    public boolean mo3983J(zzvp zzvpVar) {
        return true;
    }

    /* JADX INFO: renamed from: K */
    public final void m8968K() {
        try {
            zzvm zzvmVar = this.f21180f0;
            if (zzvmVar != null) {
                zzvmVar.zzl();
                this.f21152M0.f20077b++;
                zzvp zzvpVar = this.f21187m0;
                if (zzvpVar == null) {
                    throw null;
                }
                mo4014p0(zzvpVar.f21111a);
            }
            this.f21180f0 = null;
            this.f21174Z = null;
            m8969O();
        } catch (Throwable th) {
            this.f21180f0 = null;
            this.f21174Z = null;
            m8969O();
            throw th;
        }
    }

    /* JADX INFO: renamed from: L */
    public boolean mo3986L() {
        int i2 = this.f21141D0;
        if (i2 == 3 || (this.f21189o0 && !this.f21144G0)) {
            return true;
        }
        if (i2 == 2) {
            try {
                zzuj zzujVar = this.f21175a0;
                zzujVar.getClass();
                this.f21174Z = zzujVar;
                this.f21140C0 = 0;
                this.f21141D0 = 0;
            } catch (zzjm e) {
                zzeh.m6212d("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public boolean mo3988M() {
        return true;
    }

    /* JADX INFO: renamed from: N */
    public void mo3990N() {
        this.f21195u0 = -1;
        this.f21159Q.f20048d = null;
        this.f21196v0 = -1;
        this.f21197w0 = null;
        this.f21145H0 = -9223372036854775807L;
        this.f21146I0 = -9223372036854775807L;
        m8965H0().f21136f = -9223372036854775807L;
        this.f21156O0 = -9223372036854775807L;
        this.f21194t0 = -9223372036854775807L;
        this.f21143F0 = false;
        this.f21193s0 = -9223372036854775807L;
        this.f21142E0 = false;
        this.f21190p0 = false;
        this.f21191q0 = false;
        this.f21140C0 = 0;
        this.f21141D0 = 0;
        this.f21139B0 = this.f21138A0 ? 1 : 0;
        this.f21162R0 = false;
        this.f21164S0 = 0L;
    }

    /* JADX INFO: renamed from: O */
    public final void m8969O() {
        mo3990N();
        this.f21185k0 = null;
        this.f21187m0 = null;
        this.f21181g0 = null;
        this.f21182h0 = null;
        this.f21183i0 = false;
        this.f21144G0 = false;
        this.f21184j0 = -1.0f;
        this.f21188n0 = 0;
        this.f21189o0 = false;
        this.f21192r0 = false;
        this.f21138A0 = false;
        this.f21139B0 = 0;
    }

    /* JADX INFO: renamed from: P */
    public zzvo mo3992P(IllegalStateException illegalStateException, zzvp zzvpVar) {
        return new zzvo(illegalStateException, zzvpVar);
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: Q */
    public boolean mo3994Q() {
        throw null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19571. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: S */
    public void mo3995S(long r34, long r36) {
        /*
            Method dump skipped, instruction units count: 1957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvw.mo3995S(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: U */
    public final long mo8767U(long j2, long j3) {
        return mo8896m0(j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: X */
    public void mo4000X(float f2, float f3) {
        this.f21178d0 = f2;
        this.f21179e0 = f3;
        m8958C0(this.f21181g0);
    }

    @Override // com.google.android.gms.internal.ads.zzne
    /* JADX INFO: renamed from: b */
    public final int mo8769b(zzv zzvVar) throws zzjm {
        try {
            return mo4005h0(this.f21153N, zzvVar);
        } catch (zzwa e) {
            throw m8602y(e, zzvVar, false, 4002);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void mo4002e0(zzix zzixVar) {
    }

    /* JADX INFO: renamed from: f0 */
    public int mo4003f0(zzix zzixVar) {
        return 0;
    }

    /* JADX INFO: renamed from: g0 */
    public boolean mo4004g0(zzix zzixVar) {
        return false;
    }

    /* JADX INFO: renamed from: h0 */
    public abstract int mo4005h0(zzvy zzvyVar, zzv zzvVar);

    /* JADX INFO: renamed from: i0 */
    public abstract ArrayList mo4006i0(zzvy zzvyVar, zzv zzvVar);

    @Override // com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zzmx
    /* JADX INFO: renamed from: j */
    public void mo4007j(int i2, Object obj) {
        if (i2 != 11) {
            return;
        }
        zznb zznbVar = (zznb) obj;
        zznbVar.getClass();
        this.f21176b0 = zznbVar;
    }

    /* JADX INFO: renamed from: j0 */
    public boolean mo8895j0(zzv zzvVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zzne
    /* JADX INFO: renamed from: k */
    public final int mo8596k() {
        return 8;
    }

    /* JADX INFO: renamed from: k0 */
    public abstract zzvj mo4008k0(zzvp zzvpVar, zzv zzvVar, float f2);

    /* JADX INFO: renamed from: l0 */
    public zzje mo4009l0(zzvp zzvpVar, zzv zzvVar, zzv zzvVar2, boolean z) {
        throw null;
    }

    /* JADX INFO: renamed from: m0 */
    public long mo8896m0(long j2, long j3) {
        return super.mo8767U(j2, j3);
    }

    /* JADX INFO: renamed from: n0 */
    public float mo4010n0(float f2, zzv zzvVar, zzv[] zzvVarArr) {
        throw null;
    }

    /* JADX INFO: renamed from: o0 */
    public void mo4012o0(String str, long j2, long j3) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zziz
    /* JADX INFO: renamed from: p */
    public void mo4013p(boolean z, boolean z2, long j2) {
        ArrayDeque arrayDeque = this.f21167U;
        if (!arrayDeque.isEmpty()) {
            this.f21154N0 = (zzvv) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.f21147J0 = false;
            this.f21148K0 = false;
            if (this.f21198x0) {
                m8970z0();
            } else if (this.f21180f0 != null) {
                if (mo3986L()) {
                    m8968K();
                    m8966I();
                } else if (mo3988M()) {
                    m8961F();
                } else {
                    this.f21162R0 = true;
                }
            }
            if (this.f21154N0.f21134d.m6456b() > 0) {
                this.f21150L0 = true;
            }
            zzfi zzfiVar = this.f21154N0.f21134d;
            synchronized (zzfiVar) {
                zzfiVar.f15735c = 0;
                zzfiVar.f15736d = 0;
                Arrays.fill(zzfiVar.f15734b, (Object) null);
            }
            this.f21154N0.f21135e = false;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void mo4014p0(String str) {
        throw null;
    }

    /* JADX INFO: renamed from: q0 */
    public void mo4016q0(Exception exc) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c4  */
    /* JADX INFO: renamed from: r0 */
    public zzje mo4017r0(zzly zzlyVar) {
        int i2;
        Pair pairM6033b;
        String str;
        boolean z = true;
        this.f21150L0 = true;
        zzv zzvVar = zzlyVar.f20351b;
        zzvVar.getClass();
        String str2 = zzvVar.f21061o;
        if (str2 == null) {
            throw m8602y(new IllegalArgumentException("Sample MIME type is null."), zzvVar, false, 4005);
        }
        if (str2.equals("video/av01") || str2.equals("video/x-vnd.on2.vp9")) {
            if (!zzvVar.f21064r.isEmpty()) {
                zzt zztVar = new zzt(zzvVar);
                zztVar.f20805q = null;
                zzvVar = new zzv(zztVar);
            }
        } else if (str2.equals("video/dolby-vision")) {
            byte[] bArr = zzdr.f12695a;
            if (str2.equals("video/dolby-vision") && (pairM6033b = zzdr.m6033b(zzvVar)) != null) {
                int iIntValue = ((Integer) pairM6033b.first).intValue();
                if (iIntValue == 16 || iIntValue == 32 || iIntValue == 256) {
                    str = "video/hevc";
                } else if (iIntValue == 512) {
                    str = "video/avc";
                } else if (iIntValue != 1024) {
                    str = null;
                } else {
                    str = "video/av01";
                }
            } else {
                str = null;
            }
            if (Objects.equals(str, "video/av01")) {
                if (!zzvVar.f21064r.isEmpty()) {
                    zzt zztVar2 = new zzt(zzvVar);
                    zztVar2.f20805q = null;
                    zzvVar = new zzv(zztVar2);
                }
            }
        }
        zzv zzvVar2 = zzvVar;
        this.f21175a0 = zzlyVar.f20350a;
        this.f21172X = zzvVar2;
        if (this.f21198x0) {
            this.f21200z0 = true;
            return null;
        }
        zzvm zzvmVar = this.f21180f0;
        if (zzvmVar == null) {
            this.f21185k0 = null;
            m8966I();
            return null;
        }
        zzvp zzvpVar = this.f21187m0;
        zzvpVar.getClass();
        zzv zzvVar3 = this.f21181g0;
        zzvVar3.getClass();
        zzuj zzujVar = this.f21174Z;
        zzuj zzujVar2 = this.f21175a0;
        if (zzujVar != zzujVar2) {
            m8960E0();
            return new zzje(zzvpVar.f21111a, zzvVar3, zzvVar2, 0, 128);
        }
        zzje zzjeVarMo4009l0 = mo4009l0(zzvpVar, zzvVar3, zzvVar2, m8965H0().f21135e);
        int i3 = zzjeVarMo4009l0.f20091d;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (m8958C0(zzvVar2)) {
                        this.f21181g0 = zzvVar2;
                        if (zzujVar2 != zzujVar && !m8959D0()) {
                            i2 = 2;
                        }
                    } else {
                        i2 = 16;
                    }
                } else if (m8958C0(zzvVar2)) {
                    this.f21138A0 = true;
                    this.f21139B0 = 1;
                    int i4 = this.f21188n0;
                    if (i4 != 2 && (i4 != 1 || zzvVar2.f21068v != zzvVar3.f21068v || zzvVar2.f21069w != zzvVar3.f21069w)) {
                        z = false;
                    }
                    this.f21190p0 = z;
                    this.f21181g0 = zzvVar2;
                    if (zzujVar2 != zzujVar && !m8959D0()) {
                        i2 = 2;
                    }
                } else {
                    i2 = 16;
                }
            } else if (m8958C0(zzvVar2)) {
                this.f21181g0 = zzvVar2;
                if (zzujVar2 != zzujVar) {
                    if (!m8959D0()) {
                        i2 = 2;
                    }
                } else if (this.f21142E0) {
                    this.f21140C0 = 1;
                    if (mo3986L()) {
                        this.f21141D0 = 3;
                        i2 = 2;
                    } else {
                        this.f21141D0 = 1;
                    }
                }
            } else {
                i2 = 16;
            }
            return (i3 != 0 || (this.f21180f0 == zzvmVar && this.f21141D0 != 3)) ? zzjeVarMo4009l0 : new zzje(zzvpVar.f21111a, zzvVar3, zzvVar2, 0, i2);
        }
        m8960E0();
        i2 = 0;
        if (i3 != 0) {
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void mo4019s0(zzv zzvVar, MediaFormat mediaFormat) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zziz
    /* JADX INFO: renamed from: t */
    public void mo4020t() {
        this.f21172X = null;
        m8963G0(zzvv.f21130g);
        this.f21167U.clear();
        if (this.f21198x0) {
            this.f21198x0 = false;
            m8970z0();
        } else {
            if (this.f21180f0 == null) {
                return;
            }
            if (mo3986L()) {
                m8968K();
            } else if (mo3988M()) {
                m8961F();
            } else {
                this.f21162R0 = true;
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void mo4021t0() {
    }

    @Override // com.google.android.gms.internal.ads.zziz
    /* JADX INFO: renamed from: u */
    public void mo4022u() {
        try {
            this.f21198x0 = false;
            m8970z0();
            m8968K();
        } finally {
            this.f21175a0 = null;
        }
    }

    /* JADX INFO: renamed from: u0 */
    public abstract boolean mo4023u0(long j2, long j3, zzvm zzvmVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, zzv zzvVar);

    /* JADX INFO: renamed from: v0 */
    public abstract void mo4025v0(zzjb zzjbVar);

    @Override // com.google.android.gms.internal.ads.zziz
    /* JADX INFO: renamed from: w */
    public final void mo8600w() {
        m8965H0();
    }

    /* JADX INFO: renamed from: w0 */
    public void mo4026w0() {
        throw null;
    }

    /* JADX INFO: renamed from: x0 */
    public void mo8897x0(long j2) {
    }

    /* JADX INFO: renamed from: y0 */
    public void mo4027y0(zzix zzixVar) {
        throw null;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m8970z0() {
        this.f21145H0 = -9223372036854775807L;
        this.f21146I0 = -9223372036854775807L;
        m8965H0().f21136f = -9223372036854775807L;
        this.f21156O0 = -9223372036854775807L;
        this.f21200z0 = false;
        this.f21163S.mo8566c();
        this.f21161R.mo8566c();
        this.f21199y0 = false;
        zzub zzubVar = this.f21169V;
        zzubVar.getClass();
        zzubVar.f20983a = zzcp.f10655a;
        zzubVar.f20985c = 0;
        zzubVar.f20984b = 2;
    }

    /* JADX INFO: renamed from: d0 */
    public void mo4001d0(zzv zzvVar) {
    }
}

package com.google.android.gms.internal.ads;

import android.util.LongSparseArray;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.work.WorkRequest;
import com.google.firebase.FirebaseError;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class zzakm implements zzaga {

    /* JADX INFO: renamed from: m0 */
    public static final byte[] f5666m0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: n0 */
    public static final byte[] f5667n0;

    /* JADX INFO: renamed from: o0 */
    public static final byte[] f5668o0;

    /* JADX INFO: renamed from: p0 */
    public static final byte[] f5669p0;

    /* JADX INFO: renamed from: q0 */
    public static final UUID f5670q0;

    /* JADX INFO: renamed from: r0 */
    public static final Map f5671r0;

    /* JADX INFO: renamed from: A */
    public boolean f5672A;

    /* JADX INFO: renamed from: B */
    public int f5673B;

    /* JADX INFO: renamed from: C */
    public long f5674C;

    /* JADX INFO: renamed from: D */
    public final SparseArray f5675D;

    /* JADX INFO: renamed from: E */
    public boolean f5676E;

    /* JADX INFO: renamed from: F */
    public long f5677F;

    /* JADX INFO: renamed from: G */
    public int f5678G;

    /* JADX INFO: renamed from: H */
    public long f5679H;

    /* JADX INFO: renamed from: I */
    public long f5680I;

    /* JADX INFO: renamed from: J */
    public int f5681J;

    /* JADX INFO: renamed from: K */
    public boolean f5682K;

    /* JADX INFO: renamed from: L */
    public long f5683L;

    /* JADX INFO: renamed from: M */
    public long f5684M;

    /* JADX INFO: renamed from: N */
    public long f5685N;

    /* JADX INFO: renamed from: O */
    public boolean f5686O;

    /* JADX INFO: renamed from: P */
    public int f5687P;

    /* JADX INFO: renamed from: Q */
    public long f5688Q;

    /* JADX INFO: renamed from: R */
    public long f5689R;

    /* JADX INFO: renamed from: S */
    public int f5690S;

    /* JADX INFO: renamed from: T */
    public int f5691T;

    /* JADX INFO: renamed from: U */
    public int[] f5692U;

    /* JADX INFO: renamed from: V */
    public int f5693V;

    /* JADX INFO: renamed from: W */
    public int f5694W;

    /* JADX INFO: renamed from: X */
    public int f5695X;

    /* JADX INFO: renamed from: Y */
    public int f5696Y;

    /* JADX INFO: renamed from: Z */
    public boolean f5697Z;

    /* JADX INFO: renamed from: a */
    public final zzako f5698a;

    /* JADX INFO: renamed from: a0 */
    public long f5699a0;

    /* JADX INFO: renamed from: b */
    public final SparseArray f5700b;

    /* JADX INFO: renamed from: b0 */
    public int f5701b0;

    /* JADX INFO: renamed from: c */
    public final LongSparseArray f5702c;

    /* JADX INFO: renamed from: c0 */
    public int f5703c0;

    /* JADX INFO: renamed from: d */
    public final boolean f5704d;

    /* JADX INFO: renamed from: d0 */
    public int f5705d0;

    /* JADX INFO: renamed from: e */
    public final boolean f5706e;

    /* JADX INFO: renamed from: e0 */
    public boolean f5707e0;

    /* JADX INFO: renamed from: f */
    public final zzanq f5708f;

    /* JADX INFO: renamed from: f0 */
    public boolean f5709f0;

    /* JADX INFO: renamed from: g */
    public final zzeu f5710g;

    /* JADX INFO: renamed from: g0 */
    public boolean f5711g0;

    /* JADX INFO: renamed from: h */
    public final zzeu f5712h;

    /* JADX INFO: renamed from: h0 */
    public int f5713h0;

    /* JADX INFO: renamed from: i */
    public final zzeu f5714i;

    /* JADX INFO: renamed from: i0 */
    public byte f5715i0;

    /* JADX INFO: renamed from: j */
    public final zzeu f5716j;

    /* JADX INFO: renamed from: j0 */
    public boolean f5717j0;

    /* JADX INFO: renamed from: k */
    public final zzeu f5718k;

    /* JADX INFO: renamed from: k0 */
    public zzagd f5719k0;

    /* JADX INFO: renamed from: l */
    public final zzeu f5720l;

    /* JADX INFO: renamed from: l0 */
    public final zzake f5721l0;

    /* JADX INFO: renamed from: m */
    public final zzeu f5722m;

    /* JADX INFO: renamed from: n */
    public final zzeu f5723n;

    /* JADX INFO: renamed from: o */
    public final zzeu f5724o;

    /* JADX INFO: renamed from: p */
    public final zzeu f5725p;

    /* JADX INFO: renamed from: q */
    public ByteBuffer f5726q;

    /* JADX INFO: renamed from: r */
    public long f5727r;

    /* JADX INFO: renamed from: s */
    public long f5728s;

    /* JADX INFO: renamed from: t */
    public long f5729t;

    /* JADX INFO: renamed from: u */
    public long f5730u;

    /* JADX INFO: renamed from: v */
    public long f5731v;

    /* JADX INFO: renamed from: w */
    public boolean f5732w;

    /* JADX INFO: renamed from: x */
    public boolean f5733x;

    /* JADX INFO: renamed from: y */
    public zzakg f5734y;

    /* JADX INFO: renamed from: z */
    public zzakl f5735z;

    static {
        String str = zzfm.f16091a;
        f5667n0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f5668o0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f5669p0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f5670q0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        AbstractC5152f.m3773e(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        AbstractC5152f.m3773e(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f5671r0 = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public zzakm() {
        this(new zzake(), 2, zzanq.f6138a);
    }

    /* JADX INFO: renamed from: r */
    public static byte[] m4165r(String str, long j2, long j3) {
        zzgtr.m7128a(j2 != -9223372036854775807L);
        Locale locale = Locale.US;
        int i2 = (int) (j2 / 3600000000L);
        Integer numValueOf = Integer.valueOf(i2);
        long j4 = j2 - (((long) i2) * 3600000000L);
        int i3 = (int) (j4 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i3);
        long j5 = j4 - (((long) i3) * 60000000);
        int i4 = (int) (j5 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i4), Integer.valueOf((int) ((j5 - (((long) i4) * 1000000)) / j3)));
        String str3 = zzfm.f16091a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: a */
    public final long m4166a(long j2) throws zzat {
        long j3 = this.f5729t;
        if (j3 != -9223372036854775807L) {
            return zzfm.m6521w(j2, j3, 1000L, RoundingMode.DOWN);
        }
        throw zzat.m4383a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: b */
    public final void mo4103b() {
    }

    /* JADX INFO: renamed from: c */
    public final void m4167c() {
        if (!this.f5733x) {
            return;
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f5700b;
            if (i2 >= sparseArray.size()) {
                zzagd zzagdVar = this.f5719k0;
                zzagdVar.getClass();
                zzagdVar.mo4110v();
                this.f5733x = false;
                return;
            }
            if (((zzakl) sparseArray.valueAt(i2)).f5633X) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4168d(int i2, long j2, long j3) throws zzat {
        zzagd zzagdVar = this.f5719k0;
        zzagdVar.getClass();
        if (i2 == 128) {
            m4170f(i2);
            this.f5734y.f5600h = null;
            m4170f(i2);
            this.f5734y.f5601i = null;
            return;
        }
        if (i2 == 160) {
            this.f5697Z = false;
            this.f5699a0 = 0L;
            return;
        }
        if (i2 == 174) {
            zzakl zzaklVar = new zzakl();
            this.f5735z = zzaklVar;
            zzaklVar.f5636a = this.f5732w;
            return;
        }
        if (i2 == 187) {
            if (this.f5672A) {
                return;
            }
            m4172l(i2);
            this.f5677F = -9223372036854775807L;
            return;
        }
        if (i2 == 19899) {
            this.f5673B = -1;
            this.f5674C = -1L;
            return;
        }
        if (i2 == 20533) {
            m4171k(i2);
            this.f5735z.f5649j = true;
            return;
        }
        if (i2 == 408125543) {
            long j4 = this.f5728s;
            if (j4 != -1 && j4 != j2) {
                throw zzat.m4383a(null, "Multiple Segment elements not supported");
            }
            this.f5728s = j2;
            this.f5727r = j3;
            return;
        }
        if (i2 == 475249515) {
            if (this.f5672A) {
                return;
            }
            this.f5676E = true;
            return;
        }
        if (i2 == 524531317) {
            if (this.f5672A) {
                return;
            }
            if (this.f5704d && this.f5683L != -1) {
                this.f5682K = true;
                return;
            } else {
                zzagdVar.mo4108d(new zzahc(this.f5731v, 0L));
                this.f5672A = true;
                return;
            }
        }
        if (i2 == 182) {
            this.f5734y = new zzakg();
            return;
        }
        if (i2 == 183 && !this.f5672A) {
            m4172l(i2);
            this.f5678G = -1;
            this.f5679H = -1L;
            this.f5680I = -1L;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4169e(int i2, long j2) throws zzat {
        boolean z;
        if (i2 == 136) {
            z = j2 == 1;
            m4171k(i2);
            this.f5735z.f5635Z = z;
            return;
        }
        if (i2 == 137) {
            m4170f(i2);
            this.f5734y.f5597e = j2;
            return;
        }
        if (i2 == 145) {
            m4170f(i2);
            this.f5734y.f5594b = j2;
            return;
        }
        if (i2 == 146) {
            m4170f(i2);
            this.f5734y.f5595c = j2;
            return;
        }
        if (i2 == 240) {
            if (this.f5672A) {
                return;
            }
            m4172l(i2);
            if (this.f5680I == -1) {
                this.f5680I = j2;
                return;
            }
            return;
        }
        if (i2 == 241) {
            if (this.f5672A) {
                return;
            }
            m4172l(i2);
            if (this.f5679H == -1) {
                this.f5679H = j2;
                return;
            }
            return;
        }
        if (i2 == 20529) {
            if (j2 == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 35);
            sb.append("ContentEncodingOrder ");
            sb.append(j2);
            sb.append(" not supported");
            throw zzat.m4383a(null, sb.toString());
        }
        if (i2 == 20530) {
            if (j2 == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 35);
            sb2.append("ContentEncodingScope ");
            sb2.append(j2);
            sb2.append(" not supported");
            throw zzat.m4383a(null, sb2.toString());
        }
        if (i2 == 29636) {
            m4170f(i2);
            this.f5734y.f5593a = j2;
            return;
        }
        if (i2 == 29637) {
            m4171k(i2);
            this.f5735z.f5644e = j2;
            return;
        }
        switch (i2) {
            case 131:
                int i3 = (int) j2;
                if (i3 == 1) {
                    m4171k(i2);
                    this.f5735z.f5645f = 2;
                    return;
                }
                if (i3 == 2) {
                    m4171k(i2);
                    this.f5735z.f5645f = 1;
                    return;
                } else if (i3 == 17) {
                    m4171k(i2);
                    this.f5735z.f5645f = 3;
                    return;
                } else if (i3 != 33) {
                    m4171k(i2);
                    this.f5735z.f5645f = -1;
                    return;
                } else {
                    m4171k(i2);
                    this.f5735z.f5645f = 5;
                    return;
                }
            case 152:
                z = j2 == 1;
                m4170f(i2);
                this.f5734y.f5596d = z;
                return;
            case 155:
                this.f5689R = m4166a(j2);
                return;
            case 159:
                m4171k(i2);
                this.f5735z.f5626Q = (int) j2;
                return;
            case 176:
                m4171k(i2);
                this.f5735z.f5654o = (int) j2;
                return;
            case 179:
                if (this.f5672A) {
                    return;
                }
                m4172l(i2);
                this.f5677F = m4166a(j2);
                return;
            case 186:
                m4171k(i2);
                this.f5735z.f5655p = (int) j2;
                return;
            case 215:
                m4171k(i2);
                this.f5735z.f5642d = (int) j2;
                return;
            case 231:
                this.f5685N = m4166a(j2);
                return;
            case 238:
                this.f5696Y = (int) j2;
                return;
            case 247:
                if (this.f5672A) {
                    return;
                }
                m4172l(i2);
                this.f5678G = (int) j2;
                return;
            case 251:
                this.f5697Z = true;
                return;
            case 16871:
                m4171k(i2);
                this.f5735z.f5648i = (int) j2;
                return;
            case 16980:
                if (j2 == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(j2).length() + 30);
                sb3.append("ContentCompAlgo ");
                sb3.append(j2);
                sb3.append(" not supported");
                throw zzat.m4383a(null, sb3.toString());
            case 17029:
                if (j2 < 1 || j2 > 2) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j2).length() + 33);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j2);
                    sb4.append(" not supported");
                    throw zzat.m4383a(null, sb4.toString());
                }
                return;
            case 17143:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(j2).length() + 30);
                sb5.append("EBMLReadVersion ");
                sb5.append(j2);
                sb5.append(" not supported");
                throw zzat.m4383a(null, sb5.toString());
            case 18401:
                if (j2 == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j2).length() + 29);
                sb6.append("ContentEncAlgo ");
                sb6.append(j2);
                sb6.append(" not supported");
                throw zzat.m4383a(null, sb6.toString());
            case 18408:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j2).length() + 36);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j2);
                sb7.append(" not supported");
                throw zzat.m4383a(null, sb7.toString());
            case 21420:
                this.f5674C = j2 + this.f5728s;
                return;
            case 21432:
                int i4 = (int) j2;
                m4171k(i2);
                if (i4 == 0) {
                    this.f5735z.f5665z = 0;
                    return;
                }
                if (i4 == 1) {
                    this.f5735z.f5665z = 2;
                    return;
                } else if (i4 == 3) {
                    this.f5735z.f5665z = 1;
                    return;
                } else {
                    if (i4 != 15) {
                        return;
                    }
                    this.f5735z.f5665z = 3;
                    return;
                }
            case 21680:
                m4171k(i2);
                this.f5735z.f5657r = (int) j2;
                return;
            case 21682:
                m4171k(i2);
                this.f5735z.f5659t = (int) j2;
                return;
            case 21690:
                m4171k(i2);
                this.f5735z.f5658s = (int) j2;
                return;
            case 21930:
                z = j2 == 1;
                m4171k(i2);
                this.f5735z.f5634Y = z;
                return;
            case 21938:
                m4171k(i2);
                this.f5735z.f5656q = (int) j2;
                return;
            case 21998:
                m4171k(i2);
                this.f5735z.f5647h = (int) j2;
                return;
            case 22186:
                m4171k(i2);
                this.f5735z.f5630U = j2;
                return;
            case 22203:
                m4171k(i2);
                this.f5735z.f5631V = j2;
                return;
            case 25188:
                m4171k(i2);
                this.f5735z.f5627R = (int) j2;
                return;
            case 30114:
                this.f5699a0 = j2;
                return;
            case 30321:
                int i5 = (int) j2;
                m4171k(i2);
                if (i5 == 0) {
                    this.f5735z.f5660u = 0;
                    return;
                }
                if (i5 == 1) {
                    this.f5735z.f5660u = 1;
                    return;
                } else if (i5 == 2) {
                    this.f5735z.f5660u = 2;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.f5735z.f5660u = 3;
                    return;
                }
            case 2352003:
                m4171k(i2);
                this.f5735z.f5646g = (int) j2;
                return;
            case 2807729:
                this.f5729t = j2;
                return;
            default:
                switch (i2) {
                    case 21945:
                        int i6 = (int) j2;
                        m4171k(i2);
                        if (i6 == 1) {
                            this.f5735z.f5612C = 2;
                            return;
                        } else {
                            if (i6 != 2) {
                                return;
                            }
                            this.f5735z.f5612C = 1;
                            return;
                        }
                    case 21946:
                        m4171k(i2);
                        int iM8029c = zzi.m8029c((int) j2);
                        if (iM8029c != -1) {
                            this.f5735z.f5611B = iM8029c;
                            return;
                        }
                        return;
                    case 21947:
                        m4171k(i2);
                        int iM8028b = zzi.m8028b((int) j2);
                        if (iM8028b != -1) {
                            this.f5735z.f5610A = iM8028b;
                            return;
                        }
                        return;
                    case 21948:
                        m4171k(i2);
                        this.f5735z.f5613D = (int) j2;
                        return;
                    case 21949:
                        m4171k(i2);
                        this.f5735z.f5614E = (int) j2;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4170f(int i2) throws zzat {
        if (this.f5734y != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 35);
        sb.append("Element ");
        sb.append(i2);
        sb.append(" must be in an EditionEntry");
        throw zzat.m4383a(null, sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: g */
    public final void mo4104g(long j2, long j3) {
        this.f5685N = -9223372036854775807L;
        this.f5687P = 0;
        zzake zzakeVar = this.f5721l0;
        zzakeVar.f5590e = 0;
        zzakeVar.f5587b.clear();
        zzako zzakoVar = zzakeVar.f5588c;
        zzakoVar.f5740b = 0;
        zzakoVar.f5741c = 0;
        zzako zzakoVar2 = this.f5698a;
        zzakoVar2.f5740b = 0;
        zzakoVar2.f5741c = 0;
        m4176p();
        this.f5676E = false;
        this.f5677F = -9223372036854775807L;
        this.f5678G = -1;
        this.f5679H = -1L;
        this.f5680I = -1L;
        if (!this.f5672A) {
            this.f5675D.clear();
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f5700b;
            if (i2 >= sparseArray.size()) {
                return;
            }
            zzahn zzahnVar = ((zzakl) sparseArray.valueAt(i2)).f5632W;
            if (zzahnVar != null) {
                zzahnVar.f5328b = false;
                zzahnVar.f5329c = 0;
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: h */
    public final boolean mo4105h(zzagb zzagbVar) throws EOFException, InterruptedIOException {
        zzakn zzaknVar = new zzakn();
        zzafr zzafrVar = (zzafr) zzagbVar;
        long j2 = zzafrVar.f5213c;
        long j3 = 1024;
        if (j2 != -1 && j2 <= 1024) {
            j3 = j2;
        }
        zzeu zzeuVar = zzaknVar.f5736a;
        zzafrVar.mo4081K(zzeuVar.f14887a, 0, 4, false);
        zzaknVar.f5737b = 4;
        for (long jM6374P = zzeuVar.m6374P(); jM6374P != 440786851; jM6374P = ((jM6374P << 8) & (-256)) | ((long) (zzeuVar.f14887a[0] & 255))) {
            int i2 = (int) j3;
            int i3 = zzaknVar.f5737b + 1;
            zzaknVar.f5737b = i3;
            if (i3 == i2) {
                return false;
            }
            zzafrVar.mo4081K(zzeuVar.f14887a, 0, 1, false);
        }
        long jM4178a = zzaknVar.m4178a(zzafrVar);
        long j4 = zzaknVar.f5737b;
        if (jM4178a != Long.MIN_VALUE) {
            long j5 = j4 + jM4178a;
            if (j2 == -1 || j5 < j2) {
                while (true) {
                    long j6 = zzaknVar.f5737b;
                    if (j6 < j5) {
                        if (zzaknVar.m4178a(zzafrVar) == Long.MIN_VALUE) {
                            break;
                        }
                        long jM4178a2 = zzaknVar.m4178a(zzafrVar);
                        if (jM4178a2 < 0) {
                            break;
                        }
                        if (jM4178a2 != 0) {
                            int i4 = (int) jM4178a2;
                            zzafrVar.m4085f(i4, false);
                            zzaknVar.f5737b += i4;
                        }
                    } else if (j6 == j5) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: i */
    public final void mo4106i(zzagd zzagdVar) {
        if (this.f5706e) {
            zzagdVar = new zzant(zzagdVar, this.f5708f);
        }
        this.f5719k0 = zzagdVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x021d  */
    /* JADX WARN: Code duplicated, block: B:103:0x022b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0238  */
    /* JADX WARN: Code duplicated, block: B:108:0x025a  */
    /* JADX WARN: Code duplicated, block: B:330:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:411:0x074d A[LOOP:1: B:6:0x0016->B:411:0x074d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:421:0x0790  */
    /* JADX WARN: Code duplicated, block: B:422:0x0797  */
    /* JADX WARN: Code duplicated, block: B:425:0x079f  */
    /* JADX WARN: Code duplicated, block: B:427:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:428:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:429:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:431:0x07af  */
    /* JADX WARN: Code duplicated, block: B:432:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:433:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:434:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:435:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:436:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:437:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:438:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:439:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:440:0x0800  */
    /* JADX WARN: Code duplicated, block: B:441:0x0809  */
    /* JADX WARN: Code duplicated, block: B:442:0x0812  */
    /* JADX WARN: Code duplicated, block: B:443:0x081b  */
    /* JADX WARN: Code duplicated, block: B:444:0x0824  */
    /* JADX WARN: Code duplicated, block: B:445:0x0828  */
    /* JADX WARN: Code duplicated, block: B:491:0x0932  */
    /* JADX WARN: Code duplicated, block: B:493:0x0937  */
    /* JADX WARN: Code duplicated, block: B:494:0x0956  */
    /* JADX WARN: Code duplicated, block: B:497:0x0967  */
    /* JADX WARN: Code duplicated, block: B:498:0x0970  */
    /* JADX WARN: Code duplicated, block: B:500:0x097a  */
    /* JADX WARN: Code duplicated, block: B:502:0x098b  */
    /* JADX WARN: Code duplicated, block: B:504:0x0991  */
    /* JADX WARN: Code duplicated, block: B:505:0x0994  */
    /* JADX WARN: Code duplicated, block: B:508:0x0998  */
    /* JADX WARN: Code duplicated, block: B:510:0x09ac  */
    /* JADX WARN: Code duplicated, block: B:512:0x09c1  */
    /* JADX WARN: Code duplicated, block: B:513:0x09c4  */
    /* JADX WARN: Code duplicated, block: B:516:0x09c8  */
    /* JADX WARN: Code duplicated, block: B:519:0x09d4  */
    /* JADX WARN: Code duplicated, block: B:520:0x09e2  */
    /* JADX WARN: Code duplicated, block: B:522:0x09e6  */
    /* JADX WARN: Code duplicated, block: B:525:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:529:0x0a0f A[LOOP:17: B:526:0x09f4->B:529:0x0a0f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:531:0x0a1c  */
    /* JADX WARN: Code duplicated, block: B:533:0x0a1f  */
    /* JADX WARN: Code duplicated, block: B:536:0x0a2a  */
    /* JADX WARN: Code duplicated, block: B:538:0x0a3b  */
    /* JADX WARN: Code duplicated, block: B:541:0x0a40  */
    /* JADX WARN: Code duplicated, block: B:545:0x0a61 A[LOOP:20: B:544:0x0a5f->B:545:0x0a61, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:548:0x0a81  */
    /* JADX WARN: Code duplicated, block: B:549:0x0a8f  */
    /* JADX WARN: Code duplicated, block: B:550:0x0a95 A[LOOP:19: B:539:0x0a3c->B:550:0x0a95, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:554:0x0ab1  */
    /* JADX WARN: Code duplicated, block: B:567:0x0b0b  */
    /* JADX WARN: Code duplicated, block: B:569:0x0b0f  */
    /* JADX WARN: Code duplicated, block: B:571:0x0b19  */
    /* JADX WARN: Code duplicated, block: B:573:0x0b1d  */
    /* JADX WARN: Code duplicated, block: B:574:0x0b1f  */
    /* JADX WARN: Code duplicated, block: B:575:0x0b22  */
    /* JADX WARN: Code duplicated, block: B:579:0x0b36  */
    /* JADX WARN: Code duplicated, block: B:581:0x0b39 A[LOOP:14: B:581:0x0b39->B:583:0x0b3f, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:583:0x0b3f A[LOOP:14: B:581:0x0b39->B:583:0x0b3f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:585:0x0b6d A[LOOP:15: B:585:0x0b6d->B:587:0x0b74, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:587:0x0b74 A[LOOP:15: B:585:0x0b6d->B:587:0x0b74, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:591:0x0b92  */
    /* JADX WARN: Code duplicated, block: B:593:0x0b95  */
    /* JADX WARN: Code duplicated, block: B:594:0x0b98  */
    /* JADX WARN: Code duplicated, block: B:596:0x0b9f  */
    /* JADX WARN: Code duplicated, block: B:598:0x0ba5 A[LOOP:21: B:595:0x0b9d->B:598:0x0ba5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:602:0x0bb4  */
    /* JADX WARN: Code duplicated, block: B:604:0x0bb8  */
    /* JADX WARN: Code duplicated, block: B:606:0x0bbc  */
    /* JADX WARN: Code duplicated, block: B:608:0x0bc0  */
    /* JADX WARN: Code duplicated, block: B:610:0x0bc4  */
    /* JADX WARN: Code duplicated, block: B:613:0x0bcb  */
    /* JADX WARN: Code duplicated, block: B:614:0x0bd3  */
    /* JADX WARN: Code duplicated, block: B:615:0x0bdb  */
    /* JADX WARN: Code duplicated, block: B:616:0x0be3  */
    /* JADX WARN: Code duplicated, block: B:624:0x0c1d  */
    /* JADX WARN: Code duplicated, block: B:625:0x0c25  */
    /* JADX WARN: Code duplicated, block: B:631:0x0c58  */
    /* JADX WARN: Code duplicated, block: B:636:0x0caa  */
    /* JADX WARN: Code duplicated, block: B:640:0x0cbd  */
    /* JADX WARN: Code duplicated, block: B:642:0x0cc3  */
    /* JADX WARN: Code duplicated, block: B:650:0x0cdb  */
    /* JADX WARN: Code duplicated, block: B:652:0x0cea  */
    /* JADX WARN: Code duplicated, block: B:656:0x0cf7 A[LOOP:0: B:3:0x0009->B:656:0x0cf7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:668:0x0b2e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:0x0ad5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:0x0acd A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:0x0c31 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x0c65 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:0x0cb2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:0x0cc9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:0x0cd2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:0x0758 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:0x0838 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:0x0b88 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:0x0c52 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:0x0c86 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:0x0cf4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:0x0cf1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0157  */
    /* JADX WARN: Code duplicated, block: B:71:0x016a  */
    /* JADX WARN: Code duplicated, block: B:720:0x0b68 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:0x08f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:0x0a11 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:0x0add A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:0x0aa1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:0x0a4d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:0x0ba7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0186  */
    /* JADX WARN: Code duplicated, block: B:80:0x018e  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:92:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x0203  */
    /* JADX WARN: Code duplicated, block: B:98:0x0211  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: j */
    public final int mo4107j(zzagb zzagbVar, zzaha zzahaVar) throws zzat {
        boolean z;
        long j2;
        int i2;
        zzakm zzakmVar;
        boolean z2;
        long j3;
        long j4;
        int i3;
        byte[] bArr;
        String str;
        int i4;
        int i5;
        zzeu zzeuVar;
        SparseArray sparseArray;
        boolean z3;
        long j5;
        zzakl zzaklVar;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        int length;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        long j6;
        int i22;
        int i23;
        int i24;
        long j7;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int[] iArr2;
        int length2;
        boolean z4;
        boolean z5;
        long j8;
        int i33;
        long jM4162a;
        double dLongBitsToDouble;
        long j9;
        int i34;
        char c;
        int i35;
        SparseArray sparseArray2;
        zzakl zzaklVar2;
        zzahn zzahnVar;
        long jMo4086g;
        long j10;
        String str2;
        int i36;
        SparseArray sparseArray3;
        int i37;
        zzakl zzaklVar3;
        long j11;
        long j12;
        long j13;
        int i38;
        List list;
        int i39;
        int iMin;
        double d;
        SparseArray sparseArray4;
        int i40;
        int i41;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        int i42;
        long j20;
        long j21;
        double d2;
        zzap zzapVar;
        zzajd zzajdVar;
        zzap zzapVarM4289d;
        int i43;
        int i44 = 0;
        this.f5686O = false;
        while (!this.f5686O) {
            zzake zzakeVar = this.f5721l0;
            zzakf zzakfVar = zzakeVar.f5589d;
            zzako zzakoVar = zzakeVar.f5588c;
            zzakfVar.getClass();
            while (true) {
                ArrayDeque arrayDeque = zzakeVar.f5587b;
                zzakd zzakdVar = (zzakd) arrayDeque.peek();
                int i45 = -1;
                int i46 = 8;
                int i47 = 374648427;
                if (zzakdVar == null || zzagbVar.mo4086g() < zzakdVar.f5585b) {
                    int i48 = zzakeVar.f5590e;
                    if (i48 == 0) {
                        int i49 = 4;
                        int i50 = 0;
                        long jM4180a = zzakoVar.m4180a(zzagbVar, true, false, 4);
                        if (jM4180a == -2) {
                            zzagbVar.zzl();
                            while (true) {
                                byte[] bArr2 = zzakeVar.f5586a;
                                zzagbVar.mo4078H(bArr2, i50, i49);
                                byte b = bArr2[i50];
                                int i51 = i46;
                                int i52 = 0;
                                while (true) {
                                    if (i52 < i51) {
                                        i34 = i52 + 1;
                                        j2 = 0;
                                        if ((zzako.f5738d[i52] & ((long) b)) == 0) {
                                            i52 = i34;
                                            i51 = 8;
                                        }
                                    } else {
                                        j2 = 0;
                                        i34 = -1;
                                    }
                                }
                                if (i34 == -1 || i34 > 4) {
                                    c = 43366;
                                } else {
                                    int iM4179b = (int) zzako.m4179b(bArr2, i34, false);
                                    zzakm zzakmVar2 = ((zzakh) zzakeVar.f5589d).f5602a;
                                    c = 43366;
                                    if (iM4179b == 357149030 || iM4179b == 272869232 || iM4179b == 524531317 || iM4179b == 475249515) {
                                        i47 = iM4179b;
                                    } else if (iM4179b == 374648427) {
                                    }
                                }
                                zzagbVar.mo4091o(1);
                                i49 = 4;
                                i50 = 0;
                                i46 = 8;
                            }
                            zzagbVar.mo4091o(i34);
                            j9 = i47;
                        } else {
                            j2 = 0;
                            j9 = jM4180a;
                        }
                        z = true;
                        if (j9 == -1) {
                            z5 = false;
                        } else {
                            zzakeVar.f5591f = (int) j9;
                            zzakeVar.f5590e = 1;
                        }
                    } else {
                        z = true;
                        j2 = 0;
                        if (i48 == 1) {
                        }
                        zzakf zzakfVar2 = zzakeVar.f5589d;
                        i2 = zzakeVar.f5591f;
                        zzakmVar = ((zzakh) zzakfVar2).f5602a;
                        switch (i2) {
                            case 128:
                            case 143:
                            case 160:
                            case 166:
                            case 174:
                            case 182:
                            case 183:
                            case 187:
                            case 224:
                            case 225:
                            case 16868:
                            case 17849:
                            case 18407:
                            case 19899:
                            case 20532:
                            case 20533:
                            case 21936:
                            case 21968:
                            case 25152:
                            case 28032:
                            case 30113:
                            case 30320:
                            case 272869232:
                            case 290298740:
                            case 357149030:
                            case 374648427:
                            case 408125543:
                            case 440786851:
                            case 475249515:
                            case 524531317:
                                long jMo4086g2 = zzagbVar.mo4086g();
                                arrayDeque.push(new zzakd(i2, zzakeVar.f5592g + jMo4086g2));
                                ((zzakh) zzakeVar.f5589d).f5602a.m4168d(zzakeVar.f5591f, jMo4086g2, zzakeVar.f5592g);
                                z2 = false;
                                zzakeVar.f5590e = 0;
                                break;
                            case 131:
                            case 136:
                            case 137:
                            case 145:
                            case 146:
                            case 152:
                            case 155:
                            case 159:
                            case 176:
                            case 179:
                            case 186:
                            case 215:
                            case 231:
                            case 238:
                            case 240:
                            case 241:
                            case 247:
                            case 251:
                            case 16871:
                            case 16980:
                            case 17029:
                            case 17143:
                            case 18401:
                            case 18408:
                            case 20529:
                            case 20530:
                            case 21420:
                            case 21432:
                            case 21680:
                            case 21682:
                            case 21690:
                            case 21930:
                            case 21938:
                            case 21945:
                            case 21946:
                            case 21947:
                            case 21948:
                            case 21949:
                            case 21998:
                            case 22186:
                            case 22203:
                            case 25188:
                            case 29636:
                            case 29637:
                            case 30114:
                            case 30321:
                            case 2352003:
                            case 2807729:
                                j3 = zzakeVar.f5592g;
                                if (j3 <= 8) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(j3).length() + 22);
                                    sb.append("Invalid integer size: ");
                                    sb.append(j3);
                                    throw zzat.m4383a(null, sb.toString());
                                }
                                zzakmVar.m4169e(i2, zzakeVar.m4162a(zzagbVar, (int) j3));
                                z2 = false;
                                zzakeVar.f5590e = 0;
                                break;
                                break;
                            case 133:
                            case 134:
                            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                            case 17276:
                            case 21358:
                            case 2274716:
                                j4 = zzakeVar.f5592g;
                                if (j4 <= 2147483647L) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(j4).length() + 21);
                                    sb2.append("String element size: ");
                                    sb2.append(j4);
                                    throw zzat.m4383a(null, sb2.toString());
                                }
                                i3 = (int) j4;
                                if (i3 == 0) {
                                    str = "";
                                } else {
                                    bArr = new byte[i3];
                                    zzagbVar.mo4076F(bArr, 0, i3);
                                    while (i3 > 0) {
                                        i4 = i3 - 1;
                                        if (bArr[i4] == 0) {
                                            i3 = i4;
                                        } else {
                                            str = new String(bArr, 0, i3);
                                        }
                                    }
                                    str = new String(bArr, 0, i3);
                                }
                                zzakmVar.getClass();
                                if (i2 != 133) {
                                    zzakmVar.m4170f(i2);
                                    zzakmVar.f5734y.f5600h = str;
                                } else if (i2 != 134) {
                                    zzakmVar.m4171k(i2);
                                    zzakmVar.f5735z.f5640c = str;
                                } else if (i2 != 17026) {
                                    if ("webm".equals(str) && !"matroska".equals(str)) {
                                        StringBuilder sb3 = new StringBuilder(str.length() + 22);
                                        sb3.append("DocType ");
                                        sb3.append(str);
                                        sb3.append(" not supported");
                                        throw zzat.m4383a(null, sb3.toString());
                                    }
                                    zzakmVar.f5732w = str.equals("webm");
                                } else if (i2 != 17276) {
                                    zzakmVar.m4170f(i2);
                                    zzakmVar.f5734y.f5601i = str;
                                } else if (i2 != 21358) {
                                    zzakmVar.m4171k(i2);
                                    zzakmVar.f5735z.f5638b = str;
                                } else if (i2 == 2274716) {
                                    zzakmVar.m4171k(i2);
                                    zzakmVar.f5735z.f5637a0 = str;
                                }
                                z2 = false;
                                zzakeVar.f5590e = 0;
                                break;
                                break;
                            case 161:
                            case 163:
                            case 165:
                            case 16877:
                            case 16981:
                            case 18402:
                            case 21419:
                            case 25506:
                            case 30322:
                                i5 = (int) zzakeVar.f5592g;
                                zzeuVar = zzakmVar.f5714i;
                                sparseArray = zzakmVar.f5700b;
                                if (i2 != 161 || i2 == 163) {
                                    z3 = false;
                                    if (zzakmVar.f5687P == 0) {
                                        zzako zzakoVar2 = zzakmVar.f5698a;
                                        j5 = 2147483647L;
                                        zzakmVar.f5693V = (int) zzakoVar2.m4180a(zzagbVar, false, true, 8);
                                        zzakmVar.f5694W = zzakoVar2.f5741c;
                                        zzakmVar.f5689R = -9223372036854775807L;
                                        zzakmVar.f5687P = 1;
                                        zzeuVar.m6396y(0);
                                    } else {
                                        j5 = 2147483647L;
                                    }
                                    zzaklVar = (zzakl) sparseArray.get(zzakmVar.f5693V);
                                    if (zzaklVar == null) {
                                        zzagbVar.mo4091o(i5 - zzakmVar.f5694W);
                                        zzakmVar.f5687P = 0;
                                        z2 = z3;
                                    } else {
                                        zzaklVar.f5639b0.getClass();
                                        if (zzakmVar.f5687P == 1) {
                                            zzakmVar.m4174n(zzagbVar, 3);
                                            i9 = (zzeuVar.f14887a[2] & 6) >> 1;
                                            if (i9 == 0) {
                                                zzakmVar.f5691T = 1;
                                                iArr2 = zzakmVar.f5692U;
                                                if (iArr2 == null) {
                                                    iArr2 = new int[1];
                                                } else {
                                                    length2 = iArr2.length;
                                                    if (length2 < 1) {
                                                        iArr2 = new int[Math.max(length2 + length2, 1)];
                                                    }
                                                }
                                                zzakmVar.f5692U = iArr2;
                                                iArr2[0] = (i5 - zzakmVar.f5694W) - 3;
                                            } else {
                                                i10 = 4;
                                                zzakmVar.m4174n(zzagbVar, 4);
                                                i11 = (zzeuVar.f14887a[3] & 255) + 1;
                                                zzakmVar.f5691T = i11;
                                                iArr = zzakmVar.f5692U;
                                                if (iArr == null) {
                                                    iArr = new int[i11];
                                                } else {
                                                    length = iArr.length;
                                                    if (length < i11) {
                                                        iArr = new int[Math.max(length + length, i11)];
                                                    }
                                                }
                                                zzakmVar.f5692U = iArr;
                                                if (i9 == 2) {
                                                    int i53 = (i5 - zzakmVar.f5694W) - 4;
                                                    int i54 = zzakmVar.f5691T;
                                                    Arrays.fill(iArr, 0, i54, i53 / i54);
                                                } else {
                                                    i12 = 0;
                                                    if (i9 == 1) {
                                                        i25 = 0;
                                                        i26 = 0;
                                                        while (true) {
                                                            i27 = zzakmVar.f5691T - 1;
                                                            if (i25 < i27) {
                                                                zzakmVar.f5692U[i25] = i12;
                                                                while (true) {
                                                                    i28 = i10 + 1;
                                                                    zzakmVar.m4174n(zzagbVar, i28);
                                                                    i29 = zzeuVar.f14887a[i10] & 255;
                                                                    int[] iArr3 = zzakmVar.f5692U;
                                                                    i30 = iArr3[i25] + i29;
                                                                    iArr3[i25] = i30;
                                                                    if (i29 != 255) {
                                                                    }
                                                                    i10 = i28;
                                                                    break;
                                                                }
                                                                i26 += i30;
                                                                i25++;
                                                                i10 = i28;
                                                                i12 = 0;
                                                            } else {
                                                                zzakmVar.f5692U[i27] = ((i5 - zzakmVar.f5694W) - i10) - i26;
                                                            }
                                                        }
                                                    } else {
                                                        if (i9 != 3) {
                                                            throw zzat.m4383a(null, "Unexpected lacing value: 2");
                                                        }
                                                        i13 = 4;
                                                        i14 = 0;
                                                        i15 = 0;
                                                        while (true) {
                                                            i16 = zzakmVar.f5691T - 1;
                                                            if (i14 < i16) {
                                                                zzakmVar.f5692U[i14] = 0;
                                                                i17 = i13 + 1;
                                                                zzakmVar.m4174n(zzagbVar, i17);
                                                                if (zzeuVar.f14887a[i13] == 0) {
                                                                    throw zzat.m4383a(null, "No valid varint length mask found");
                                                                }
                                                                i18 = 0;
                                                                while (true) {
                                                                    if (i18 < 8) {
                                                                        i22 = 1 << (7 - i18);
                                                                        if ((zzeuVar.f14887a[i13] & i22) != 0) {
                                                                            i23 = i17 + i18;
                                                                            zzakmVar.m4174n(zzagbVar, i23);
                                                                            i19 = i5;
                                                                            int i55 = zzeuVar.f14887a[i13] & 255 & (~i22);
                                                                            i24 = i18;
                                                                            j7 = i55;
                                                                            while (i17 < i23) {
                                                                                j7 = (j7 << 8) | ((long) (zzeuVar.f14887a[i17] & 255));
                                                                                i17++;
                                                                                i14 = i14;
                                                                                i15 = i15;
                                                                            }
                                                                            i20 = i14;
                                                                            i21 = i15;
                                                                            if (i20 > 0) {
                                                                                long j22 = j7 - ((1 << ((i24 * 7) + 6)) - 1);
                                                                                i13 = i23;
                                                                                j6 = j22;
                                                                            } else {
                                                                                long j23 = j7;
                                                                                i13 = i23;
                                                                                j6 = j23;
                                                                            }
                                                                        } else {
                                                                            i18++;
                                                                        }
                                                                    } else {
                                                                        i19 = i5;
                                                                        i20 = i14;
                                                                        i21 = i15;
                                                                        i13 = i17;
                                                                        j6 = j2;
                                                                    }
                                                                }
                                                                if (j6 >= -2147483648L || j6 > j5) {
                                                                    throw zzat.m4383a(null, "EBML lacing sample size out of range.");
                                                                }
                                                                int[] iArr4 = zzakmVar.f5692U;
                                                                int i56 = (int) j6;
                                                                if (i20 != 0) {
                                                                    i56 += iArr4[i20 - 1];
                                                                }
                                                                iArr4[i20] = i56;
                                                                i15 = i21 + i56;
                                                                i14 = i20 + 1;
                                                                i5 = i19;
                                                            } else {
                                                                zzakmVar.f5692U[i16] = ((i5 - zzakmVar.f5694W) - i13) - i15;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            byte[] bArr3 = zzeuVar.f14887a;
                                            zzakmVar.f5688Q = zzakmVar.m4166a((bArr3[1] & 255) | (bArr3[0] << 8)) + zzakmVar.f5685N;
                                            if (zzaklVar.f5645f == 1) {
                                                i31 = 2;
                                                i32 = 1;
                                            } else if (i2 == 163) {
                                                i31 = 2;
                                                if ((zzeuVar.f14887a[2] & 128) == 128) {
                                                    i32 = 1;
                                                } else {
                                                    i32 = 0;
                                                }
                                                i2 = 163;
                                            } else {
                                                i31 = 2;
                                                i32 = 0;
                                            }
                                            zzakmVar.f5695X = i32;
                                            zzakmVar.f5687P = i31;
                                            zzakmVar.f5690S = 0;
                                            i6 = 163;
                                        } else {
                                            i6 = 163;
                                        }
                                        if (i2 == i6) {
                                            while (true) {
                                                i8 = zzakmVar.f5690S;
                                                if (i8 < zzakmVar.f5691T) {
                                                    zzakmVar.m4173m(zzaklVar, zzakmVar.f5688Q + ((long) ((zzakmVar.f5690S * zzaklVar.f5646g) / 1000)), zzakmVar.f5695X, zzakmVar.m4175o(zzagbVar, zzaklVar, zzakmVar.f5692U[i8], false), 0);
                                                    zzakmVar.f5690S++;
                                                } else {
                                                    z2 = false;
                                                    zzakmVar.f5687P = 0;
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                i7 = zzakmVar.f5690S;
                                                if (i7 < zzakmVar.f5691T) {
                                                    int[] iArr5 = zzakmVar.f5692U;
                                                    iArr5[i7] = zzakmVar.m4175o(zzagbVar, zzaklVar, iArr5[i7], true);
                                                    zzakmVar.f5690S++;
                                                } else {
                                                    z2 = false;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (i2 != 165) {
                                        if (i2 == 16877) {
                                            zzakmVar.m4171k(i2);
                                            zzakl zzaklVar4 = zzakmVar.f5735z;
                                            int i57 = zzaklVar4.f5648i;
                                            if (i57 == 1685485123 || i57 == 1685480259) {
                                                byte[] bArr4 = new byte[i5];
                                                zzaklVar4.f5625P = bArr4;
                                                z4 = false;
                                                zzagbVar.mo4076F(bArr4, 0, i5);
                                            } else {
                                                zzagbVar.mo4091o(i5);
                                            }
                                        } else if (i2 == 16981) {
                                            z2 = false;
                                            zzakmVar.m4171k(i2);
                                            byte[] bArr5 = new byte[i5];
                                            zzakmVar.f5735z.f5650k = bArr5;
                                            zzagbVar.mo4076F(bArr5, 0, i5);
                                        } else if (i2 == 18402) {
                                            z2 = false;
                                            byte[] bArr6 = new byte[i5];
                                            zzagbVar.mo4076F(bArr6, 0, i5);
                                            zzakmVar.m4171k(i2);
                                            zzakmVar.f5735z.f5651l = new zzahl(1, bArr6, 0, 0);
                                        } else if (i2 == 21419) {
                                            z2 = false;
                                            zzeu zzeuVar2 = zzakmVar.f5718k;
                                            Arrays.fill(zzeuVar2.f14887a, (byte) 0);
                                            zzagbVar.mo4076F(zzeuVar2.f14887a, 4 - i5, i5);
                                            zzeuVar2.m6363E(0);
                                            zzakmVar.f5673B = (int) zzeuVar2.m6374P();
                                        } else if (i2 == 25506) {
                                            zzakmVar.m4171k(i2);
                                            byte[] bArr7 = new byte[i5];
                                            zzakmVar.f5735z.f5652m = bArr7;
                                            z2 = false;
                                            zzagbVar.mo4076F(bArr7, 0, i5);
                                        } else {
                                            if (i2 != 30322) {
                                                StringBuilder sb4 = new StringBuilder(String.valueOf(i2).length() + 15);
                                                sb4.append("Unexpected id: ");
                                                sb4.append(i2);
                                                throw zzat.m4383a(null, sb4.toString());
                                            }
                                            zzakmVar.m4171k(i2);
                                            byte[] bArr8 = new byte[i5];
                                            zzakmVar.f5735z.f5664y = bArr8;
                                            z4 = false;
                                            zzagbVar.mo4076F(bArr8, 0, i5);
                                        }
                                        z2 = z4;
                                    } else if (zzakmVar.f5687P == 2) {
                                        zzakl zzaklVar5 = (zzakl) sparseArray.get(zzakmVar.f5693V);
                                        if (zzakmVar.f5696Y == 4 && "V_VP9".equals(zzaklVar5.f5640c)) {
                                            zzeu zzeuVar3 = zzakmVar.f5725p;
                                            zzeuVar3.m6396y(i5);
                                            z3 = false;
                                            zzagbVar.mo4076F(zzeuVar3.f14887a, 0, i5);
                                        } else {
                                            z3 = false;
                                            zzagbVar.mo4091o(i5);
                                        }
                                        z2 = z3;
                                    }
                                    z2 = false;
                                }
                                zzakeVar.f5590e = z2 ? 1 : 0;
                                break;
                            case 181:
                            case 17545:
                            case 21969:
                            case 21970:
                            case 21971:
                            case 21972:
                            case 21973:
                            case 21974:
                            case 21975:
                            case 21976:
                            case 21977:
                            case 21978:
                            case 30323:
                            case 30324:
                            case 30325:
                                j8 = zzakeVar.f5592g;
                                if (j8 == 4 && j8 != 8) {
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(j8).length() + 20);
                                    sb5.append("Invalid float size: ");
                                    sb5.append(j8);
                                    throw zzat.m4383a(null, sb5.toString());
                                }
                                i33 = (int) j8;
                                jM4162a = zzakeVar.m4162a(zzagbVar, i33);
                                if (i33 == 4) {
                                    dLongBitsToDouble = Float.intBitsToFloat((int) jM4162a);
                                } else {
                                    dLongBitsToDouble = Double.longBitsToDouble(jM4162a);
                                }
                                if (i2 != 181) {
                                    zzakmVar.m4171k(i2);
                                    zzakmVar.f5735z.f5629T = (int) dLongBitsToDouble;
                                } else if (i2 != 17545) {
                                    switch (i2) {
                                        case 21969:
                                            zzakmVar.m4171k(i2);
                                            zzakmVar.f5735z.f5615F = (float) dLongBitsToDouble;
                                            break;
                                        case 21970:
                                            zzakmVar.m4171k(i2);
                                            zzakmVar.f5735z.f5616G = (float) dLongBitsToDouble;
                                            break;
                                        case 21971:
                                            zzakmVar.m4171k(i2);
                                            zzakmVar.f5735z.f5617H = (float) dLongBitsToDouble;
                                            break;
                                        case 21972:
                                            zzakmVar.m4171k(i2);
                                            zzakmVar.f5735z.f5618I = (float) dLongBitsToDouble;
                                            break;
                                        case 21973:
                                            zzakmVar.m4171k(i2);
                                            zzakmVar.f5735z.f5619J = (float) dLongBitsToDouble;
                                            break;
                                        case 21974:
                                            zzakmVar.m4171k(i2);
                                            zzakmVar.f5735z.f5620K = (float) dLongBitsToDouble;
                                            break;
                                        case 21975:
                                            zzakmVar.m4171k(i2);
                                            zzakmVar.f5735z.f5621L = (float) dLongBitsToDouble;
                                            break;
                                        case 21976:
                                            zzakmVar.m4171k(i2);
                                            zzakmVar.f5735z.f5622M = (float) dLongBitsToDouble;
                                            break;
                                        case 21977:
                                            zzakmVar.m4171k(i2);
                                            zzakmVar.f5735z.f5623N = (float) dLongBitsToDouble;
                                            break;
                                        case 21978:
                                            zzakmVar.m4171k(i2);
                                            zzakmVar.f5735z.f5624O = (float) dLongBitsToDouble;
                                            break;
                                        default:
                                            switch (i2) {
                                                case 30323:
                                                    zzakmVar.m4171k(i2);
                                                    zzakmVar.f5735z.f5661v = (float) dLongBitsToDouble;
                                                    break;
                                                case 30324:
                                                    zzakmVar.m4171k(i2);
                                                    zzakmVar.f5735z.f5662w = (float) dLongBitsToDouble;
                                                    break;
                                                case 30325:
                                                    zzakmVar.m4171k(i2);
                                                    zzakmVar.f5735z.f5663x = (float) dLongBitsToDouble;
                                                    break;
                                                default:
                                                    zzakmVar.getClass();
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    zzakmVar.f5730u = (long) dLongBitsToDouble;
                                }
                                zzakeVar.f5590e = 0;
                                z2 = false;
                                break;
                                break;
                            default:
                                zzagbVar.mo4091o((int) zzakeVar.f5592g);
                                zzakeVar.f5590e = 0;
                                break;
                        }
                        z5 = true;
                        if (z5) {
                            jMo4086g = zzagbVar.mo4086g();
                            if (this.f5682K) {
                                this.f5684M = jMo4086g;
                                zzahaVar.f5303a = this.f5683L;
                                this.f5682K = z2;
                                return 1;
                            }
                            if (this.f5672A) {
                                j10 = this.f5684M;
                                if (j10 != -1) {
                                    zzahaVar.f5303a = j10;
                                    this.f5684M = -1L;
                                    return 1;
                                }
                            }
                        }
                        if (z5) {
                            i44 = 0;
                        } else {
                            i35 = 0;
                            while (true) {
                                sparseArray2 = this.f5700b;
                                if (i35 >= sparseArray2.size()) {
                                    return -1;
                                }
                                zzaklVar2 = (zzakl) sparseArray2.valueAt(i35);
                                zzaklVar2.f5639b0.getClass();
                                zzahnVar = zzaklVar2.f5632W;
                                if (zzahnVar != null) {
                                    zzahnVar.m4131c(zzaklVar2.f5639b0, zzaklVar2.f5651l);
                                }
                                i35++;
                            }
                        }
                    }
                    zzakeVar.f5592g = zzakoVar.m4180a(zzagbVar, false, z, 8);
                    zzakeVar.f5590e = 2;
                    zzakf zzakfVar3 = zzakeVar.f5589d;
                    i2 = zzakeVar.f5591f;
                    zzakmVar = ((zzakh) zzakfVar3).f5602a;
                    switch (i2) {
                        case 128:
                        case 143:
                        case 160:
                        case 166:
                        case 174:
                        case 182:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
                        case 16868:
                        case 17849:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 272869232:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            long jMo4086g3 = zzagbVar.mo4086g();
                            arrayDeque.push(new zzakd(i2, zzakeVar.f5592g + jMo4086g3));
                            ((zzakh) zzakeVar.f5589d).f5602a.m4168d(zzakeVar.f5591f, jMo4086g3, zzakeVar.f5592g);
                            z2 = false;
                            zzakeVar.f5590e = 0;
                            break;
                        case 131:
                        case 136:
                        case 137:
                        case 145:
                        case 146:
                        case 152:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case 215:
                        case 231:
                        case 238:
                        case 240:
                        case 241:
                        case 247:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21938:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 29636:
                        case 29637:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            j3 = zzakeVar.f5592g;
                            if (j3 <= 8) {
                                StringBuilder sb6 = new StringBuilder(String.valueOf(j3).length() + 22);
                                sb6.append("Invalid integer size: ");
                                sb6.append(j3);
                                throw zzat.m4383a(null, sb6.toString());
                            }
                            zzakmVar.m4169e(i2, zzakeVar.m4162a(zzagbVar, (int) j3));
                            z2 = false;
                            zzakeVar.f5590e = 0;
                            break;
                            break;
                        case 133:
                        case 134:
                        case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                        case 17276:
                        case 21358:
                        case 2274716:
                            j4 = zzakeVar.f5592g;
                            if (j4 <= 2147483647L) {
                                StringBuilder sb7 = new StringBuilder(String.valueOf(j4).length() + 21);
                                sb7.append("String element size: ");
                                sb7.append(j4);
                                throw zzat.m4383a(null, sb7.toString());
                            }
                            i3 = (int) j4;
                            if (i3 == 0) {
                                str = "";
                            } else {
                                bArr = new byte[i3];
                                zzagbVar.mo4076F(bArr, 0, i3);
                                while (i3 > 0) {
                                    i4 = i3 - 1;
                                    if (bArr[i4] == 0) {
                                        i3 = i4;
                                    } else {
                                        str = new String(bArr, 0, i3);
                                    }
                                }
                                str = new String(bArr, 0, i3);
                            }
                            zzakmVar.getClass();
                            if (i2 != 133) {
                                zzakmVar.m4170f(i2);
                                zzakmVar.f5734y.f5600h = str;
                            } else if (i2 != 134) {
                                zzakmVar.m4171k(i2);
                                zzakmVar.f5735z.f5640c = str;
                            } else if (i2 != 17026) {
                                if ("webm".equals(str)) {
                                }
                                zzakmVar.f5732w = str.equals("webm");
                                break;
                            } else if (i2 != 17276) {
                                zzakmVar.m4170f(i2);
                                zzakmVar.f5734y.f5601i = str;
                            } else if (i2 != 21358) {
                                zzakmVar.m4171k(i2);
                                zzakmVar.f5735z.f5638b = str;
                            } else if (i2 == 2274716) {
                                zzakmVar.m4171k(i2);
                                zzakmVar.f5735z.f5637a0 = str;
                            }
                            z2 = false;
                            zzakeVar.f5590e = 0;
                            break;
                            break;
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i5 = (int) zzakeVar.f5592g;
                            zzeuVar = zzakmVar.f5714i;
                            sparseArray = zzakmVar.f5700b;
                            if (i2 != 161) {
                                z3 = false;
                                if (zzakmVar.f5687P == 0) {
                                    zzako zzakoVar3 = zzakmVar.f5698a;
                                    j5 = 2147483647L;
                                    zzakmVar.f5693V = (int) zzakoVar3.m4180a(zzagbVar, false, true, 8);
                                    zzakmVar.f5694W = zzakoVar3.f5741c;
                                    zzakmVar.f5689R = -9223372036854775807L;
                                    zzakmVar.f5687P = 1;
                                    zzeuVar.m6396y(0);
                                } else {
                                    j5 = 2147483647L;
                                }
                                zzaklVar = (zzakl) sparseArray.get(zzakmVar.f5693V);
                                if (zzaklVar == null) {
                                    zzagbVar.mo4091o(i5 - zzakmVar.f5694W);
                                    zzakmVar.f5687P = 0;
                                    z2 = z3;
                                } else {
                                    zzaklVar.f5639b0.getClass();
                                    if (zzakmVar.f5687P == 1) {
                                        zzakmVar.m4174n(zzagbVar, 3);
                                        i9 = (zzeuVar.f14887a[2] & 6) >> 1;
                                        if (i9 == 0) {
                                            zzakmVar.f5691T = 1;
                                            iArr2 = zzakmVar.f5692U;
                                            if (iArr2 == null) {
                                                iArr2 = new int[1];
                                            } else {
                                                length2 = iArr2.length;
                                                if (length2 < 1) {
                                                    iArr2 = new int[Math.max(length2 + length2, 1)];
                                                }
                                            }
                                            zzakmVar.f5692U = iArr2;
                                            iArr2[0] = (i5 - zzakmVar.f5694W) - 3;
                                        } else {
                                            i10 = 4;
                                            zzakmVar.m4174n(zzagbVar, 4);
                                            i11 = (zzeuVar.f14887a[3] & 255) + 1;
                                            zzakmVar.f5691T = i11;
                                            iArr = zzakmVar.f5692U;
                                            if (iArr == null) {
                                                iArr = new int[i11];
                                            } else {
                                                length = iArr.length;
                                                if (length < i11) {
                                                    iArr = new int[Math.max(length + length, i11)];
                                                }
                                            }
                                            zzakmVar.f5692U = iArr;
                                            if (i9 == 2) {
                                                int i58 = (i5 - zzakmVar.f5694W) - 4;
                                                int i59 = zzakmVar.f5691T;
                                                Arrays.fill(iArr, 0, i59, i58 / i59);
                                            } else {
                                                i12 = 0;
                                                if (i9 == 1) {
                                                    i25 = 0;
                                                    i26 = 0;
                                                    while (true) {
                                                        i27 = zzakmVar.f5691T - 1;
                                                        if (i25 < i27) {
                                                            zzakmVar.f5692U[i25] = i12;
                                                            while (true) {
                                                                i28 = i10 + 1;
                                                                zzakmVar.m4174n(zzagbVar, i28);
                                                                i29 = zzeuVar.f14887a[i10] & 255;
                                                                int[] iArr6 = zzakmVar.f5692U;
                                                                i30 = iArr6[i25] + i29;
                                                                iArr6[i25] = i30;
                                                                if (i29 != 255) {
                                                                }
                                                                i10 = i28;
                                                                break;
                                                            }
                                                            i26 += i30;
                                                            i25++;
                                                            i10 = i28;
                                                            i12 = 0;
                                                        } else {
                                                            zzakmVar.f5692U[i27] = ((i5 - zzakmVar.f5694W) - i10) - i26;
                                                        }
                                                    }
                                                } else {
                                                    if (i9 != 3) {
                                                        throw zzat.m4383a(null, "Unexpected lacing value: 2");
                                                    }
                                                    i13 = 4;
                                                    i14 = 0;
                                                    i15 = 0;
                                                    while (true) {
                                                        i16 = zzakmVar.f5691T - 1;
                                                        if (i14 < i16) {
                                                            zzakmVar.f5692U[i14] = 0;
                                                            i17 = i13 + 1;
                                                            zzakmVar.m4174n(zzagbVar, i17);
                                                            if (zzeuVar.f14887a[i13] == 0) {
                                                                throw zzat.m4383a(null, "No valid varint length mask found");
                                                            }
                                                            i18 = 0;
                                                            while (true) {
                                                                if (i18 < 8) {
                                                                    i22 = 1 << (7 - i18);
                                                                    if ((zzeuVar.f14887a[i13] & i22) != 0) {
                                                                        i23 = i17 + i18;
                                                                        zzakmVar.m4174n(zzagbVar, i23);
                                                                        i19 = i5;
                                                                        int i510 = zzeuVar.f14887a[i13] & 255 & (~i22);
                                                                        i24 = i18;
                                                                        j7 = i510;
                                                                        while (i17 < i23) {
                                                                            j7 = (j7 << 8) | ((long) (zzeuVar.f14887a[i17] & 255));
                                                                            i17++;
                                                                            i14 = i14;
                                                                            i15 = i15;
                                                                        }
                                                                        i20 = i14;
                                                                        i21 = i15;
                                                                        if (i20 > 0) {
                                                                            long j24 = j7 - ((1 << ((i24 * 7) + 6)) - 1);
                                                                            i13 = i23;
                                                                            j6 = j24;
                                                                        } else {
                                                                            long j25 = j7;
                                                                            i13 = i23;
                                                                            j6 = j25;
                                                                        }
                                                                    } else {
                                                                        i18++;
                                                                    }
                                                                } else {
                                                                    i19 = i5;
                                                                    i20 = i14;
                                                                    i21 = i15;
                                                                    i13 = i17;
                                                                    j6 = j2;
                                                                }
                                                            }
                                                            if (j6 >= -2147483648L) {
                                                            }
                                                            throw zzat.m4383a(null, "EBML lacing sample size out of range.");
                                                        }
                                                        zzakmVar.f5692U[i16] = ((i5 - zzakmVar.f5694W) - i13) - i15;
                                                        iArr4[i20] = i56;
                                                        i15 = i21 + i56;
                                                        i14 = i20 + 1;
                                                        i5 = i19;
                                                    }
                                                }
                                            }
                                        }
                                        byte[] bArr9 = zzeuVar.f14887a;
                                        zzakmVar.f5688Q = zzakmVar.m4166a((bArr9[1] & 255) | (bArr9[0] << 8)) + zzakmVar.f5685N;
                                        if (zzaklVar.f5645f == 1) {
                                            i31 = 2;
                                            i32 = 1;
                                        } else if (i2 == 163) {
                                            i31 = 2;
                                            if ((zzeuVar.f14887a[2] & 128) == 128) {
                                                i32 = 1;
                                            } else {
                                                i32 = 0;
                                            }
                                            i2 = 163;
                                        } else {
                                            i31 = 2;
                                            i32 = 0;
                                        }
                                        zzakmVar.f5695X = i32;
                                        zzakmVar.f5687P = i31;
                                        zzakmVar.f5690S = 0;
                                        i6 = 163;
                                    } else {
                                        i6 = 163;
                                    }
                                    if (i2 == i6) {
                                        while (true) {
                                            i8 = zzakmVar.f5690S;
                                            if (i8 < zzakmVar.f5691T) {
                                                zzakmVar.m4173m(zzaklVar, zzakmVar.f5688Q + ((long) ((zzakmVar.f5690S * zzaklVar.f5646g) / 1000)), zzakmVar.f5695X, zzakmVar.m4175o(zzagbVar, zzaklVar, zzakmVar.f5692U[i8], false), 0);
                                                zzakmVar.f5690S++;
                                            } else {
                                                z2 = false;
                                                zzakmVar.f5687P = 0;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            i7 = zzakmVar.f5690S;
                                            if (i7 < zzakmVar.f5691T) {
                                                int[] iArr7 = zzakmVar.f5692U;
                                                iArr7[i7] = zzakmVar.m4175o(zzagbVar, zzaklVar, iArr7[i7], true);
                                                zzakmVar.f5690S++;
                                            } else {
                                                z2 = false;
                                            }
                                        }
                                    }
                                }
                            } else {
                                z3 = false;
                                if (zzakmVar.f5687P == 0) {
                                    zzako zzakoVar4 = zzakmVar.f5698a;
                                    j5 = 2147483647L;
                                    zzakmVar.f5693V = (int) zzakoVar4.m4180a(zzagbVar, false, true, 8);
                                    zzakmVar.f5694W = zzakoVar4.f5741c;
                                    zzakmVar.f5689R = -9223372036854775807L;
                                    zzakmVar.f5687P = 1;
                                    zzeuVar.m6396y(0);
                                } else {
                                    j5 = 2147483647L;
                                }
                                zzaklVar = (zzakl) sparseArray.get(zzakmVar.f5693V);
                                if (zzaklVar == null) {
                                    zzagbVar.mo4091o(i5 - zzakmVar.f5694W);
                                    zzakmVar.f5687P = 0;
                                    z2 = z3;
                                } else {
                                    zzaklVar.f5639b0.getClass();
                                    if (zzakmVar.f5687P == 1) {
                                        zzakmVar.m4174n(zzagbVar, 3);
                                        i9 = (zzeuVar.f14887a[2] & 6) >> 1;
                                        if (i9 == 0) {
                                            zzakmVar.f5691T = 1;
                                            iArr2 = zzakmVar.f5692U;
                                            if (iArr2 == null) {
                                                iArr2 = new int[1];
                                            } else {
                                                length2 = iArr2.length;
                                                if (length2 < 1) {
                                                    iArr2 = new int[Math.max(length2 + length2, 1)];
                                                }
                                            }
                                            zzakmVar.f5692U = iArr2;
                                            iArr2[0] = (i5 - zzakmVar.f5694W) - 3;
                                        } else {
                                            i10 = 4;
                                            zzakmVar.m4174n(zzagbVar, 4);
                                            i11 = (zzeuVar.f14887a[3] & 255) + 1;
                                            zzakmVar.f5691T = i11;
                                            iArr = zzakmVar.f5692U;
                                            if (iArr == null) {
                                                iArr = new int[i11];
                                            } else {
                                                length = iArr.length;
                                                if (length < i11) {
                                                    iArr = new int[Math.max(length + length, i11)];
                                                }
                                            }
                                            zzakmVar.f5692U = iArr;
                                            if (i9 == 2) {
                                                int i511 = (i5 - zzakmVar.f5694W) - 4;
                                                int i512 = zzakmVar.f5691T;
                                                Arrays.fill(iArr, 0, i512, i511 / i512);
                                            } else {
                                                i12 = 0;
                                                if (i9 == 1) {
                                                    i25 = 0;
                                                    i26 = 0;
                                                    while (true) {
                                                        i27 = zzakmVar.f5691T - 1;
                                                        if (i25 < i27) {
                                                            zzakmVar.f5692U[i25] = i12;
                                                            while (true) {
                                                                i28 = i10 + 1;
                                                                zzakmVar.m4174n(zzagbVar, i28);
                                                                i29 = zzeuVar.f14887a[i10] & 255;
                                                                int[] iArr8 = zzakmVar.f5692U;
                                                                i30 = iArr8[i25] + i29;
                                                                iArr8[i25] = i30;
                                                                if (i29 != 255) {
                                                                }
                                                                i10 = i28;
                                                                break;
                                                            }
                                                            i26 += i30;
                                                            i25++;
                                                            i10 = i28;
                                                            i12 = 0;
                                                        } else {
                                                            zzakmVar.f5692U[i27] = ((i5 - zzakmVar.f5694W) - i10) - i26;
                                                        }
                                                    }
                                                } else {
                                                    if (i9 != 3) {
                                                        throw zzat.m4383a(null, "Unexpected lacing value: 2");
                                                    }
                                                    i13 = 4;
                                                    i14 = 0;
                                                    i15 = 0;
                                                    while (true) {
                                                        i16 = zzakmVar.f5691T - 1;
                                                        if (i14 < i16) {
                                                            zzakmVar.f5692U[i14] = 0;
                                                            i17 = i13 + 1;
                                                            zzakmVar.m4174n(zzagbVar, i17);
                                                            if (zzeuVar.f14887a[i13] == 0) {
                                                                throw zzat.m4383a(null, "No valid varint length mask found");
                                                            }
                                                            i18 = 0;
                                                            while (true) {
                                                                if (i18 < 8) {
                                                                    i22 = 1 << (7 - i18);
                                                                    if ((zzeuVar.f14887a[i13] & i22) != 0) {
                                                                        i23 = i17 + i18;
                                                                        zzakmVar.m4174n(zzagbVar, i23);
                                                                        i19 = i5;
                                                                        int i513 = zzeuVar.f14887a[i13] & 255 & (~i22);
                                                                        i24 = i18;
                                                                        j7 = i513;
                                                                        while (i17 < i23) {
                                                                            j7 = (j7 << 8) | ((long) (zzeuVar.f14887a[i17] & 255));
                                                                            i17++;
                                                                            i14 = i14;
                                                                            i15 = i15;
                                                                        }
                                                                        i20 = i14;
                                                                        i21 = i15;
                                                                        if (i20 > 0) {
                                                                            long j26 = j7 - ((1 << ((i24 * 7) + 6)) - 1);
                                                                            i13 = i23;
                                                                            j6 = j26;
                                                                        } else {
                                                                            long j27 = j7;
                                                                            i13 = i23;
                                                                            j6 = j27;
                                                                        }
                                                                    } else {
                                                                        i18++;
                                                                    }
                                                                } else {
                                                                    i19 = i5;
                                                                    i20 = i14;
                                                                    i21 = i15;
                                                                    i13 = i17;
                                                                    j6 = j2;
                                                                }
                                                            }
                                                            if (j6 >= -2147483648L) {
                                                            }
                                                            throw zzat.m4383a(null, "EBML lacing sample size out of range.");
                                                        }
                                                        zzakmVar.f5692U[i16] = ((i5 - zzakmVar.f5694W) - i13) - i15;
                                                        iArr4[i20] = i56;
                                                        i15 = i21 + i56;
                                                        i14 = i20 + 1;
                                                        i5 = i19;
                                                    }
                                                }
                                            }
                                        }
                                        byte[] bArr10 = zzeuVar.f14887a;
                                        zzakmVar.f5688Q = zzakmVar.m4166a((bArr10[1] & 255) | (bArr10[0] << 8)) + zzakmVar.f5685N;
                                        if (zzaklVar.f5645f == 1) {
                                            i31 = 2;
                                            i32 = 1;
                                        } else if (i2 == 163) {
                                            i31 = 2;
                                            if ((zzeuVar.f14887a[2] & 128) == 128) {
                                                i32 = 1;
                                            } else {
                                                i32 = 0;
                                            }
                                            i2 = 163;
                                        } else {
                                            i31 = 2;
                                            i32 = 0;
                                        }
                                        zzakmVar.f5695X = i32;
                                        zzakmVar.f5687P = i31;
                                        zzakmVar.f5690S = 0;
                                        i6 = 163;
                                    } else {
                                        i6 = 163;
                                    }
                                    if (i2 == i6) {
                                        while (true) {
                                            i8 = zzakmVar.f5690S;
                                            if (i8 < zzakmVar.f5691T) {
                                                zzakmVar.m4173m(zzaklVar, zzakmVar.f5688Q + ((long) ((zzakmVar.f5690S * zzaklVar.f5646g) / 1000)), zzakmVar.f5695X, zzakmVar.m4175o(zzagbVar, zzaklVar, zzakmVar.f5692U[i8], false), 0);
                                                zzakmVar.f5690S++;
                                            } else {
                                                z2 = false;
                                                zzakmVar.f5687P = 0;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            i7 = zzakmVar.f5690S;
                                            if (i7 < zzakmVar.f5691T) {
                                                int[] iArr9 = zzakmVar.f5692U;
                                                iArr9[i7] = zzakmVar.m4175o(zzagbVar, zzaklVar, iArr9[i7], true);
                                                zzakmVar.f5690S++;
                                            } else {
                                                z2 = false;
                                            }
                                        }
                                    }
                                }
                            }
                            zzakeVar.f5590e = z2 ? 1 : 0;
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            j8 = zzakeVar.f5592g;
                            if (j8 == 4) {
                            }
                            i33 = (int) j8;
                            jM4162a = zzakeVar.m4162a(zzagbVar, i33);
                            if (i33 == 4) {
                                dLongBitsToDouble = Float.intBitsToFloat((int) jM4162a);
                            } else {
                                dLongBitsToDouble = Double.longBitsToDouble(jM4162a);
                            }
                            if (i2 != 181) {
                                zzakmVar.m4171k(i2);
                                zzakmVar.f5735z.f5629T = (int) dLongBitsToDouble;
                            } else if (i2 != 17545) {
                                switch (i2) {
                                    case 21969:
                                        zzakmVar.m4171k(i2);
                                        zzakmVar.f5735z.f5615F = (float) dLongBitsToDouble;
                                        break;
                                    case 21970:
                                        zzakmVar.m4171k(i2);
                                        zzakmVar.f5735z.f5616G = (float) dLongBitsToDouble;
                                        break;
                                    case 21971:
                                        zzakmVar.m4171k(i2);
                                        zzakmVar.f5735z.f5617H = (float) dLongBitsToDouble;
                                        break;
                                    case 21972:
                                        zzakmVar.m4171k(i2);
                                        zzakmVar.f5735z.f5618I = (float) dLongBitsToDouble;
                                        break;
                                    case 21973:
                                        zzakmVar.m4171k(i2);
                                        zzakmVar.f5735z.f5619J = (float) dLongBitsToDouble;
                                        break;
                                    case 21974:
                                        zzakmVar.m4171k(i2);
                                        zzakmVar.f5735z.f5620K = (float) dLongBitsToDouble;
                                        break;
                                    case 21975:
                                        zzakmVar.m4171k(i2);
                                        zzakmVar.f5735z.f5621L = (float) dLongBitsToDouble;
                                        break;
                                    case 21976:
                                        zzakmVar.m4171k(i2);
                                        zzakmVar.f5735z.f5622M = (float) dLongBitsToDouble;
                                        break;
                                    case 21977:
                                        zzakmVar.m4171k(i2);
                                        zzakmVar.f5735z.f5623N = (float) dLongBitsToDouble;
                                        break;
                                    case 21978:
                                        zzakmVar.m4171k(i2);
                                        zzakmVar.f5735z.f5624O = (float) dLongBitsToDouble;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 30323:
                                                zzakmVar.m4171k(i2);
                                                zzakmVar.f5735z.f5661v = (float) dLongBitsToDouble;
                                                break;
                                            case 30324:
                                                zzakmVar.m4171k(i2);
                                                zzakmVar.f5735z.f5662w = (float) dLongBitsToDouble;
                                                break;
                                            case 30325:
                                                zzakmVar.m4171k(i2);
                                                zzakmVar.f5735z.f5663x = (float) dLongBitsToDouble;
                                                break;
                                            default:
                                                zzakmVar.getClass();
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                zzakmVar.f5730u = (long) dLongBitsToDouble;
                            }
                            zzakeVar.f5590e = 0;
                            z2 = false;
                            break;
                        default:
                            zzagbVar.mo4091o((int) zzakeVar.f5592g);
                            zzakeVar.f5590e = 0;
                            break;
                    }
                    z5 = true;
                    if (z5) {
                        jMo4086g = zzagbVar.mo4086g();
                        if (this.f5682K) {
                            this.f5684M = jMo4086g;
                            zzahaVar.f5303a = this.f5683L;
                            this.f5682K = z2;
                            return 1;
                        }
                        if (this.f5672A) {
                            j10 = this.f5684M;
                            if (j10 != -1) {
                                zzahaVar.f5303a = j10;
                                this.f5684M = -1L;
                                return 1;
                            }
                        }
                    }
                    if (z5) {
                        i35 = 0;
                        while (true) {
                            sparseArray2 = this.f5700b;
                            if (i35 >= sparseArray2.size()) {
                                return -1;
                            }
                            zzaklVar2 = (zzakl) sparseArray2.valueAt(i35);
                            zzaklVar2.f5639b0.getClass();
                            zzahnVar = zzaklVar2.f5632W;
                            if (zzahnVar != null) {
                                zzahnVar.m4131c(zzaklVar2.f5639b0, zzaklVar2.f5651l);
                            }
                            i35++;
                        }
                    } else {
                        i44 = 0;
                    }
                } else {
                    zzakf zzakfVar4 = zzakeVar.f5589d;
                    int i60 = ((zzakd) arrayDeque.pop()).f5584a;
                    zzakm zzakmVar3 = ((zzakh) zzakfVar4).f5602a;
                    LongSparseArray longSparseArray = zzakmVar3.f5702c;
                    SparseArray sparseArray5 = zzakmVar3.f5675D;
                    SparseArray sparseArray6 = zzakmVar3.f5700b;
                    zzakmVar3.f5719k0.getClass();
                    if (i60 == 128) {
                        zzakg zzakgVar = zzakmVar3.f5734y;
                        zzakgVar.getClass();
                        if (zzakgVar.f5598f == null && (str2 = zzakgVar.f5600h) != null) {
                            zzakgVar.f5598f = str2;
                            String str3 = zzakgVar.f5601i;
                            if (str3 != null) {
                                zzakgVar.f5599g = str3;
                            }
                        }
                    } else if (i60 != 160) {
                        if (i60 != 174) {
                            long j28 = 1000000;
                            if (i60 == 17849) {
                                int i61 = 0;
                                while (i61 < sparseArray6.size()) {
                                    zzakl zzaklVar6 = (zzakl) sparseArray6.valueAt(i61);
                                    ArrayList arrayList = new ArrayList(longSparseArray.size());
                                    int i62 = 0;
                                    while (i62 < longSparseArray.size()) {
                                        zzakg zzakgVar2 = (zzakg) longSparseArray.valueAt(i62);
                                        long j29 = zzakgVar2.f5597e;
                                        if (j29 == 0 || j29 == zzaklVar6.f5644e) {
                                            zzaiy zzaiyVar = new zzaiy();
                                            long j30 = zzakgVar2.f5594b;
                                            String str4 = zzfm.f16091a;
                                            if (j30 != -9223372036854775807L && j30 != Long.MIN_VALUE) {
                                                j30 /= j28;
                                            }
                                            zzaiyVar.f5496a = j30;
                                            long j31 = zzakgVar2.f5595c;
                                            if (j31 != -9223372036854775807L && j31 != Long.MIN_VALUE) {
                                                j31 /= j28;
                                            }
                                            zzaiyVar.f5497b = j31;
                                            zzaiyVar.f5498c = zzakgVar2.f5596d;
                                            if (zzakgVar2.f5598f != null) {
                                                zzaiyVar.f5499d = new zzx(zzakgVar2.f5599g, zzakgVar2.f5598f);
                                            }
                                            arrayList.add(new zzaja(zzaiyVar.f5496a, zzaiyVar.f5497b, zzaiyVar.f5498c, zzaiyVar.f5499d));
                                        }
                                        i62++;
                                        j28 = 1000000;
                                    }
                                    if (!arrayList.isEmpty()) {
                                        zzv zzvVar = zzaklVar6.f5641c0;
                                        zzvVar.getClass();
                                        zzt zztVar = new zzt(zzvVar);
                                        zzap zzapVar2 = zzvVar.f21058l;
                                        zztVar.f20799k = zzapVar2 != null ? zzapVar2.m4289d((zzao[]) arrayList.toArray(new zzaiz[0])) : new zzap(arrayList);
                                        zzaklVar6.f5641c0 = new zzv(zztVar);
                                    }
                                    i61++;
                                    j28 = 1000000;
                                }
                            } else {
                                if (i60 == 19899) {
                                    int i63 = zzakmVar3.f5673B;
                                    if (i63 != -1) {
                                        long j32 = zzakmVar3.f5674C;
                                        if (j32 != -1) {
                                            if (i63 == 475249515) {
                                                zzakmVar3.f5683L = j32;
                                            }
                                        }
                                    }
                                    throw zzat.m4383a(null, "Mandatory element SeekID or SeekPosition not found");
                                }
                                if (i60 == 25152) {
                                    zzakmVar3.m4171k(i60);
                                    zzakl zzaklVar7 = zzakmVar3.f5735z;
                                    if (zzaklVar7.f5649j) {
                                        if (zzaklVar7.f5651l == null) {
                                            throw zzat.m4383a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                        }
                                        zzaklVar7.f5653n = new zzq(null, true, new zzp(zzg.f16874a, "video/webm", zzakmVar3.f5735z.f5651l.f5324b));
                                    }
                                } else if (i60 == 28032) {
                                    zzakmVar3.m4171k(i60);
                                    zzakl zzaklVar8 = zzakmVar3.f5735z;
                                    if (zzaklVar8.f5649j && zzaklVar8.f5650k != null) {
                                        throw zzat.m4383a(null, "Combining encryption and compression is not supported");
                                    }
                                } else if (i60 == 357149030) {
                                    if (zzakmVar3.f5729t == -9223372036854775807L) {
                                        zzakmVar3.f5729t = 1000000L;
                                    }
                                    long j33 = zzakmVar3.f5730u;
                                    if (j33 != -9223372036854775807L) {
                                        zzakmVar3.f5731v = zzakmVar3.m4166a(j33);
                                    }
                                } else if (i60 == 374648427) {
                                    if (sparseArray6.size() == 0) {
                                        throw zzat.m4383a(null, "No valid tracks were found");
                                    }
                                    boolean z6 = !zzakmVar3.f5704d || zzakmVar3.f5683L == -1;
                                    int i64 = -1;
                                    int i65 = -1;
                                    int i66 = -1;
                                    int i67 = -1;
                                    for (int i68 = 0; i68 < sparseArray6.size(); i68++) {
                                        zzakl zzaklVar9 = (zzakl) sparseArray6.valueAt(i68);
                                        int i69 = zzaklVar9.f5645f;
                                        if (i69 == 2) {
                                            if (zzaklVar9.f5635Z) {
                                                i64 = zzaklVar9.f5642d;
                                            }
                                            if (i65 == -1) {
                                                i65 = zzaklVar9.f5642d;
                                            }
                                        } else if (i69 == 1) {
                                            if (zzaklVar9.f5635Z) {
                                                i66 = zzaklVar9.f5642d;
                                            }
                                            if (i67 == -1) {
                                                i67 = zzaklVar9.f5642d;
                                            }
                                        }
                                        if (z6) {
                                            zzaklVar9.f5639b0.getClass();
                                            if (!zzaklVar9.f5633X) {
                                                zzahm zzahmVar = zzaklVar9.f5639b0;
                                                zzv zzvVar2 = zzaklVar9.f5641c0;
                                                zzvVar2.getClass();
                                                zzahmVar.mo4097e(zzvVar2);
                                            }
                                        }
                                    }
                                    if (i64 != -1) {
                                        zzakmVar3.f5681J = i64;
                                    } else if (i65 != -1) {
                                        zzakmVar3.f5681J = i65;
                                    } else if (i66 != -1) {
                                        zzakmVar3.f5681J = i66;
                                    } else if (i67 != -1) {
                                        zzakmVar3.f5681J = i67;
                                    } else {
                                        zzakmVar3.f5681J = sparseArray6.size() > 0 ? ((zzakl) sparseArray6.valueAt(0)).f5642d : -1;
                                    }
                                    if (z6) {
                                        zzakmVar3.m4167c();
                                    }
                                } else if (i60 != 475249515) {
                                    if (i60 == 182) {
                                        zzakg zzakgVar3 = zzakmVar3.f5734y;
                                        zzakgVar3.getClass();
                                        long j34 = zzakgVar3.f5593a;
                                        if (j34 != 0) {
                                            longSparseArray.put(j34, zzakgVar3);
                                        }
                                        zzakmVar3.f5734y = null;
                                    } else if (i60 == 183 && !zzakmVar3.f5672A) {
                                        zzakmVar3.m4172l(i60);
                                        if (zzakmVar3.f5677F != -9223372036854775807L && (i43 = zzakmVar3.f5678G) != -1 && zzakmVar3.f5679H != -1) {
                                            List arrayList2 = (List) sparseArray5.get(i43);
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                                sparseArray5.put(zzakmVar3.f5678G, arrayList2);
                                            }
                                            arrayList2.add(new zzakj(zzakmVar3.f5677F, zzakmVar3.f5728s + zzakmVar3.f5679H, zzakmVar3.f5680I));
                                        }
                                    }
                                } else if (!zzakmVar3.f5672A) {
                                    int i70 = 0;
                                    while (true) {
                                        if (i70 < sparseArray5.size()) {
                                            if (((List) sparseArray5.valueAt(i70)).isEmpty()) {
                                                i70++;
                                            } else {
                                                if (zzakmVar3.f5731v != -9223372036854775807L) {
                                                    for (int i71 = 0; i71 < sparseArray5.size(); i71++) {
                                                        Collections.sort((List) sparseArray5.valueAt(i71));
                                                    }
                                                    sparseArray3 = sparseArray5;
                                                    zzakmVar3.f5719k0.mo4108d(new zzakk(sparseArray5, zzakmVar3.f5731v, zzakmVar3.f5681J, zzakmVar3.f5728s, zzakmVar3.f5727r));
                                                }
                                                zzakmVar3.f5672A = true;
                                                zzakmVar3.f5676E = false;
                                                i37 = 0;
                                                while (i37 < sparseArray6.size()) {
                                                    zzaklVar3 = (zzakl) sparseArray6.valueAt(i37);
                                                    j11 = zzakmVar3.f5731v;
                                                    j12 = zzakmVar3.f5728s;
                                                    j13 = zzakmVar3.f5727r;
                                                    i38 = i45;
                                                    if (zzaklVar3.f5645f == 2 || (list = (List) sparseArray3.get(zzaklVar3.f5642d)) == null || list.isEmpty()) {
                                                        i39 = i37;
                                                        sparseArray4 = sparseArray3;
                                                    } else {
                                                        if (list.isEmpty()) {
                                                            i39 = i37;
                                                            sparseArray4 = sparseArray3;
                                                        } else {
                                                            i39 = i37;
                                                            iMin = Math.min(list.size(), 20);
                                                            d = 0.0d;
                                                            sparseArray4 = sparseArray3;
                                                            i40 = i38;
                                                            i41 = 0;
                                                            while (i41 < iMin) {
                                                                j15 = j11;
                                                                zzakj zzakjVar = (zzakj) list.get(i41);
                                                                j16 = j12;
                                                                j17 = zzakjVar.f5603s;
                                                                j18 = zzakjVar.f5605u;
                                                                j19 = zzakjVar.f5604t;
                                                                if (j17 > 10000000) {
                                                                    if (i40 == i38) {
                                                                        j14 = ((zzakj) list.get(i40)).f5603s;
                                                                    }
                                                                    if (j14 != -9223372036854775807L) {
                                                                        zzv zzvVar3 = zzaklVar3.f5641c0;
                                                                        zzvVar3.getClass();
                                                                        zzapVar = zzvVar3.f21058l;
                                                                        zzajdVar = new zzajd(j14);
                                                                        if (zzapVar == null) {
                                                                            zzapVarM4289d = new zzap(zzajdVar);
                                                                        } else {
                                                                            zzapVarM4289d = zzapVar.m4289d(zzajdVar);
                                                                        }
                                                                        zzv zzvVar4 = zzaklVar3.f5641c0;
                                                                        zzvVar4.getClass();
                                                                        zzt zztVar2 = new zzt(zzvVar4);
                                                                        zztVar2.f20799k = zzapVarM4289d;
                                                                        zzaklVar3.f5641c0 = new zzv(zztVar2);
                                                                    }
                                                                } else {
                                                                    i42 = i41 + 1;
                                                                    if (i41 < list.size() - 1) {
                                                                        zzakj zzakjVar2 = (zzakj) list.get(i42);
                                                                        long j35 = zzakjVar2.f5604t + zzakjVar2.f5605u;
                                                                        long j36 = j19 + j18;
                                                                        j21 = zzakjVar2.f5603s - j17;
                                                                        j20 = j35 - j36;
                                                                    } else {
                                                                        long j37 = j15 - j17;
                                                                        j20 = (j16 + j13) - (j19 + j18);
                                                                        j21 = j37;
                                                                    }
                                                                    if (j21 > 0) {
                                                                        d2 = j20 / j21;
                                                                        if (d2 > d) {
                                                                            i40 = i41;
                                                                            d = d2;
                                                                        }
                                                                    }
                                                                    i41 = i42;
                                                                    j11 = j15;
                                                                    j12 = j16;
                                                                }
                                                            }
                                                            if (i40 == i38) {
                                                                j14 = ((zzakj) list.get(i40)).f5603s;
                                                            }
                                                            if (j14 != -9223372036854775807L) {
                                                                zzv zzvVar5 = zzaklVar3.f5641c0;
                                                                zzvVar5.getClass();
                                                                zzapVar = zzvVar5.f21058l;
                                                                zzajdVar = new zzajd(j14);
                                                                if (zzapVar == null) {
                                                                    zzapVarM4289d = new zzap(zzajdVar);
                                                                } else {
                                                                    zzapVarM4289d = zzapVar.m4289d(zzajdVar);
                                                                }
                                                                zzv zzvVar6 = zzaklVar3.f5641c0;
                                                                zzvVar6.getClass();
                                                                zzt zztVar3 = new zzt(zzvVar6);
                                                                zztVar3.f20799k = zzapVarM4289d;
                                                                zzaklVar3.f5641c0 = new zzv(zztVar3);
                                                            }
                                                        }
                                                        j14 = -9223372036854775807L;
                                                        if (j14 != -9223372036854775807L) {
                                                            zzv zzvVar7 = zzaklVar3.f5641c0;
                                                            zzvVar7.getClass();
                                                            zzapVar = zzvVar7.f21058l;
                                                            zzajdVar = new zzajd(j14);
                                                            if (zzapVar == null) {
                                                                zzapVarM4289d = new zzap(zzajdVar);
                                                            } else {
                                                                zzapVarM4289d = zzapVar.m4289d(zzajdVar);
                                                            }
                                                            zzv zzvVar8 = zzaklVar3.f5641c0;
                                                            zzvVar8.getClass();
                                                            zzt zztVar4 = new zzt(zzvVar8);
                                                            zztVar4.f20799k = zzapVarM4289d;
                                                            zzaklVar3.f5641c0 = new zzv(zztVar4);
                                                        }
                                                    }
                                                    if (!zzaklVar3.f5633X) {
                                                        zzaklVar3.f5639b0.getClass();
                                                        zzahm zzahmVar2 = zzaklVar3.f5639b0;
                                                        zzv zzvVar9 = zzaklVar3.f5641c0;
                                                        zzvVar9.getClass();
                                                        zzahmVar2.mo4097e(zzvVar9);
                                                    }
                                                    i37 = i39 + 1;
                                                    sparseArray3 = sparseArray4;
                                                    i45 = -1;
                                                }
                                                zzakmVar3.m4167c();
                                            }
                                        }
                                        sparseArray3 = sparseArray5;
                                        zzakmVar3.f5719k0.mo4108d(new zzahc(zzakmVar3.f5731v, 0L));
                                        zzakmVar3.f5672A = true;
                                        zzakmVar3.f5676E = false;
                                        i37 = 0;
                                        while (i37 < sparseArray6.size()) {
                                            zzaklVar3 = (zzakl) sparseArray6.valueAt(i37);
                                            j11 = zzakmVar3.f5731v;
                                            j12 = zzakmVar3.f5728s;
                                            j13 = zzakmVar3.f5727r;
                                            i38 = i45;
                                            if (zzaklVar3.f5645f == 2) {
                                                i39 = i37;
                                                sparseArray4 = sparseArray3;
                                            } else {
                                                if (list.isEmpty()) {
                                                    i39 = i37;
                                                    sparseArray4 = sparseArray3;
                                                } else {
                                                    i39 = i37;
                                                    iMin = Math.min(list.size(), 20);
                                                    d = 0.0d;
                                                    sparseArray4 = sparseArray3;
                                                    i40 = i38;
                                                    i41 = 0;
                                                    while (i41 < iMin) {
                                                        j15 = j11;
                                                        zzakj zzakjVar3 = (zzakj) list.get(i41);
                                                        j16 = j12;
                                                        j17 = zzakjVar3.f5603s;
                                                        j18 = zzakjVar3.f5605u;
                                                        j19 = zzakjVar3.f5604t;
                                                        if (j17 > 10000000) {
                                                            if (i40 == i38) {
                                                                j14 = ((zzakj) list.get(i40)).f5603s;
                                                            }
                                                            if (j14 != -9223372036854775807L) {
                                                                zzv zzvVar10 = zzaklVar3.f5641c0;
                                                                zzvVar10.getClass();
                                                                zzapVar = zzvVar10.f21058l;
                                                                zzajdVar = new zzajd(j14);
                                                                if (zzapVar == null) {
                                                                    zzapVarM4289d = new zzap(zzajdVar);
                                                                } else {
                                                                    zzapVarM4289d = zzapVar.m4289d(zzajdVar);
                                                                }
                                                                zzv zzvVar11 = zzaklVar3.f5641c0;
                                                                zzvVar11.getClass();
                                                                zzt zztVar5 = new zzt(zzvVar11);
                                                                zztVar5.f20799k = zzapVarM4289d;
                                                                zzaklVar3.f5641c0 = new zzv(zztVar5);
                                                            }
                                                        } else {
                                                            i42 = i41 + 1;
                                                            if (i41 < list.size() - 1) {
                                                                zzakj zzakjVar4 = (zzakj) list.get(i42);
                                                                long j38 = zzakjVar4.f5604t + zzakjVar4.f5605u;
                                                                long j39 = j19 + j18;
                                                                j21 = zzakjVar4.f5603s - j17;
                                                                j20 = j38 - j39;
                                                            } else {
                                                                long j310 = j15 - j17;
                                                                j20 = (j16 + j13) - (j19 + j18);
                                                                j21 = j310;
                                                            }
                                                            if (j21 > 0) {
                                                                d2 = j20 / j21;
                                                                if (d2 > d) {
                                                                    i40 = i41;
                                                                    d = d2;
                                                                }
                                                            }
                                                            i41 = i42;
                                                            j11 = j15;
                                                            j12 = j16;
                                                        }
                                                    }
                                                    if (i40 == i38) {
                                                        j14 = ((zzakj) list.get(i40)).f5603s;
                                                    }
                                                    if (j14 != -9223372036854775807L) {
                                                        zzv zzvVar12 = zzaklVar3.f5641c0;
                                                        zzvVar12.getClass();
                                                        zzapVar = zzvVar12.f21058l;
                                                        zzajdVar = new zzajd(j14);
                                                        if (zzapVar == null) {
                                                            zzapVarM4289d = new zzap(zzajdVar);
                                                        } else {
                                                            zzapVarM4289d = zzapVar.m4289d(zzajdVar);
                                                        }
                                                        zzv zzvVar13 = zzaklVar3.f5641c0;
                                                        zzvVar13.getClass();
                                                        zzt zztVar6 = new zzt(zzvVar13);
                                                        zztVar6.f20799k = zzapVarM4289d;
                                                        zzaklVar3.f5641c0 = new zzv(zztVar6);
                                                    }
                                                }
                                                j14 = -9223372036854775807L;
                                                if (j14 != -9223372036854775807L) {
                                                    zzv zzvVar14 = zzaklVar3.f5641c0;
                                                    zzvVar14.getClass();
                                                    zzapVar = zzvVar14.f21058l;
                                                    zzajdVar = new zzajd(j14);
                                                    if (zzapVar == null) {
                                                        zzapVarM4289d = new zzap(zzajdVar);
                                                    } else {
                                                        zzapVarM4289d = zzapVar.m4289d(zzajdVar);
                                                    }
                                                    zzv zzvVar15 = zzaklVar3.f5641c0;
                                                    zzvVar15.getClass();
                                                    zzt zztVar7 = new zzt(zzvVar15);
                                                    zztVar7.f20799k = zzapVarM4289d;
                                                    zzaklVar3.f5641c0 = new zzv(zztVar7);
                                                }
                                            }
                                            if (!zzaklVar3.f5633X) {
                                                zzaklVar3.f5639b0.getClass();
                                                zzahm zzahmVar3 = zzaklVar3.f5639b0;
                                                zzv zzvVar16 = zzaklVar3.f5641c0;
                                                zzvVar16.getClass();
                                                zzahmVar3.mo4097e(zzvVar16);
                                            }
                                            i37 = i39 + 1;
                                            sparseArray3 = sparseArray4;
                                            i45 = -1;
                                        }
                                        zzakmVar3.m4167c();
                                    }
                                }
                            }
                        } else {
                            zzakl zzaklVar10 = zzakmVar3.f5735z;
                            zzaklVar10.getClass();
                            String str5 = zzaklVar10.f5640c;
                            if (str5 == null) {
                                throw zzat.m4383a(null, "CodecId is missing in TrackEntry element");
                            }
                            switch (str5) {
                                case "V_VP8":
                                case "V_VP9":
                                case "V_AV1":
                                case "V_MPEG2":
                                case "V_MPEG4/ISO/SP":
                                case "V_MPEG4/ISO/ASP":
                                case "V_MPEG4/ISO/AP":
                                case "V_MPEG4/ISO/AVC":
                                case "V_MPEGH/ISO/HEVC":
                                case "V_MS/VFW/FOURCC":
                                case "V_THEORA":
                                case "A_OPUS":
                                case "A_VORBIS":
                                case "A_AAC":
                                case "A_MPEG/L2":
                                case "A_MPEG/L3":
                                case "A_AC3":
                                case "A_EAC3":
                                case "A_TRUEHD":
                                case "A_DTS":
                                case "A_DTS/EXPRESS":
                                case "A_DTS/LOSSLESS":
                                case "A_FLAC":
                                case "A_MS/ACM":
                                case "A_PCM/INT/LIT":
                                case "A_PCM/INT/BIG":
                                case "A_PCM/FLOAT/IEEE":
                                case "S_TEXT/UTF8":
                                case "S_TEXT/ASS":
                                case "S_TEXT/SSA":
                                case "S_TEXT/WEBVTT":
                                case "S_VOBSUB":
                                case "S_HDMV/PGS":
                                case "S_DVBSUB":
                                    zzaklVar10.m4163a(zzaklVar10.f5642d);
                                    zzaklVar10.f5639b0 = zzakmVar3.f5719k0.mo4109f(zzaklVar10.f5642d, zzaklVar10.f5645f);
                                    sparseArray6.put(zzaklVar10.f5642d, zzaklVar10);
                                    break;
                            }
                            zzakmVar3.f5735z = null;
                        }
                    } else if (zzakmVar3.f5687P == 2) {
                        zzakl zzaklVar11 = (zzakl) sparseArray6.get(zzakmVar3.f5693V);
                        zzaklVar11.f5639b0.getClass();
                        if (zzakmVar3.f5699a0 > 0 && "A_OPUS".equals(zzaklVar11.f5640c)) {
                            zzeu zzeuVar4 = zzakmVar3.f5725p;
                            byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(zzakmVar3.f5699a0).array();
                            zzeuVar4.m6397z(bArrArray.length, bArrArray);
                        }
                        int i72 = 0;
                        for (int i73 = 0; i73 < zzakmVar3.f5691T; i73++) {
                            i72 += zzakmVar3.f5692U[i73];
                        }
                        int i74 = 0;
                        while (i74 < zzakmVar3.f5691T) {
                            long j40 = zzakmVar3.f5688Q + ((long) ((zzaklVar11.f5646g * i74) / 1000));
                            int i75 = zzakmVar3.f5695X;
                            if (i74 == 0) {
                                if (!zzakmVar3.f5697Z) {
                                    i75 |= 1;
                                }
                                i36 = i75;
                                i74 = 0;
                            } else {
                                i36 = i75;
                            }
                            int i76 = zzakmVar3.f5692U[i74];
                            int i77 = i72 - i76;
                            zzakl zzaklVar12 = zzaklVar11;
                            zzakm zzakmVar4 = zzakmVar3;
                            zzakmVar4.m4173m(zzaklVar12, j40, i36, i76, i77);
                            i74++;
                            zzakmVar3 = zzakmVar4;
                            zzaklVar11 = zzaklVar12;
                            i72 = i77;
                        }
                        zzakmVar3.f5687P = 0;
                    }
                    z5 = true;
                }
                z2 = false;
                if (z5) {
                    jMo4086g = zzagbVar.mo4086g();
                    if (this.f5682K) {
                        this.f5684M = jMo4086g;
                        zzahaVar.f5303a = this.f5683L;
                        this.f5682K = z2;
                        return 1;
                    }
                    if (this.f5672A) {
                        j10 = this.f5684M;
                        if (j10 != -1) {
                            zzahaVar.f5303a = j10;
                            this.f5684M = -1L;
                            return 1;
                        }
                    }
                }
                if (z5) {
                    i35 = 0;
                    while (true) {
                        sparseArray2 = this.f5700b;
                        if (i35 >= sparseArray2.size()) {
                            return -1;
                        }
                        zzaklVar2 = (zzakl) sparseArray2.valueAt(i35);
                        zzaklVar2.f5639b0.getClass();
                        zzahnVar = zzaklVar2.f5632W;
                        if (zzahnVar != null) {
                            zzahnVar.m4131c(zzaklVar2.f5639b0, zzaklVar2.f5651l);
                        }
                        i35++;
                    }
                } else {
                    i44 = 0;
                }
            }
        }
        return i44;
    }

    /* JADX INFO: renamed from: k */
    public final void m4171k(int i2) throws zzat {
        if (this.f5735z != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 32);
        sb.append("Element ");
        sb.append(i2);
        sb.append(" must be in a TrackEntry");
        throw zzat.m4383a(null, sb.toString());
    }

    /* JADX INFO: renamed from: l */
    public final void m4172l(int i2) throws zzat {
        if (this.f5676E) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 26);
        sb.append("Element ");
        sb.append(i2);
        sb.append(" must be in a Cues");
        throw zzat.m4383a(null, sb.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX INFO: renamed from: m */
    public final void m4173m(zzakl zzaklVar, long j2, int i2, int i3, int i4) {
        byte b;
        byte[] bArrM4165r;
        int i5;
        int i6;
        zzahn zzahnVar = zzaklVar.f5632W;
        if (zzahnVar != null) {
            zzahnVar.m4130b(zzaklVar.f5639b0, j2, i2, i3, i4, zzaklVar.f5651l);
        } else {
            String str = zzaklVar.f5640c;
            if ("S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str) || "S_TEXT/WEBVTT".equals(str)) {
                if (this.f5691T > 1) {
                    zzeh.m6211c("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j3 = this.f5689R;
                    if (j3 == -9223372036854775807L) {
                        zzeh.m6211c("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        zzeu zzeuVar = this.f5722m;
                        byte[] bArr = zzeuVar.f14887a;
                        switch (str) {
                            case "S_TEXT/ASS":
                                b = 1;
                                break;
                            case "S_TEXT/SSA":
                                b = 2;
                                break;
                            case "S_TEXT/WEBVTT":
                                b = 3;
                                break;
                            case "S_TEXT/UTF8":
                                b = 0;
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        if (b == 0) {
                            bArrM4165r = m4165r("%02d:%02d:%02d,%03d", j3, 1000L);
                            i5 = 19;
                        } else if (b == 1 || b == 2) {
                            bArrM4165r = m4165r("%01d:%02d:%02d:%02d", j3, WorkRequest.MIN_BACKOFF_MILLIS);
                            i5 = 21;
                        } else {
                            if (b != 3) {
                                throw new IllegalArgumentException();
                            }
                            bArrM4165r = m4165r("%02d:%02d:%02d.%03d", j3, 1000L);
                            i5 = 25;
                        }
                        System.arraycopy(bArrM4165r, 0, bArr, i5, bArrM4165r.length);
                        for (int i7 = zzeuVar.f14888b; i7 < zzeuVar.f14889c; i7++) {
                            if (zzeuVar.f14887a[i7] == 0) {
                                zzeuVar.m6361C(i7);
                                zzaklVar.f5639b0.mo4121a(zzeuVar.f14889c, zzeuVar);
                                i6 = i3 + zzeuVar.f14889c;
                            }
                        }
                        zzaklVar.f5639b0.mo4121a(zzeuVar.f14889c, zzeuVar);
                        i6 = i3 + zzeuVar.f14889c;
                    }
                }
                i6 = i3;
            } else {
                i6 = i3;
            }
            if ((i2 & 268435456) != 0) {
                int i8 = this.f5691T;
                zzeu zzeuVar2 = this.f5725p;
                if (i8 > 1) {
                    zzeuVar2.m6396y(0);
                } else {
                    int i9 = zzeuVar2.f14889c;
                    zzaklVar.f5639b0.mo4098f(zzeuVar2, i9, 2);
                    i6 += i9;
                }
            }
            zzaklVar.f5639b0.mo4095b(j2, i2, i6, i4, zzaklVar.f5651l);
        }
        this.f5686O = true;
    }

    /* JADX INFO: renamed from: n */
    public final void m4174n(zzagb zzagbVar, int i2) {
        zzeu zzeuVar = this.f5714i;
        if (zzeuVar.f14889c >= i2) {
            return;
        }
        byte[] bArr = zzeuVar.f14887a;
        if (bArr.length < i2) {
            int length = bArr.length;
            zzeuVar.m6359A(Math.max(length + length, i2));
        }
        byte[] bArr2 = zzeuVar.f14887a;
        int i3 = zzeuVar.f14889c;
        zzagbVar.mo4076F(bArr2, i3, i2 - i3);
        zzeuVar.m6361C(i2);
    }

    /* JADX INFO: renamed from: o */
    public final int m4175o(zzagb zzagbVar, zzakl zzaklVar, int i2, boolean z) throws zzat {
        int iMo4122d;
        int iMo4122d2;
        int i3;
        String str = zzaklVar.f5640c;
        if ("S_TEXT/UTF8".equals(str)) {
            m4177q(zzagbVar, f5666m0, i2);
            int i4 = this.f5703c0;
            m4176p();
            return i4;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            m4177q(zzagbVar, f5668o0, i2);
            int i5 = this.f5703c0;
            m4176p();
            return i5;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            m4177q(zzagbVar, f5669p0, i2);
            int i6 = this.f5703c0;
            m4176p();
            return i6;
        }
        if (zzaklVar.f5633X) {
            zzaklVar.f5641c0.getClass();
            zzeu zzeuVar = new zzeu(i2);
            if (zzagbVar.mo4081K(zzeuVar.f14887a, 0, i2, true)) {
                zzagbVar.zzl();
                if (zzafz.m4099a(zzeuVar.m6368J()) == 1 && zzeuVar.m6360B() >= 10) {
                    byte[] bArr = new byte[10];
                    zzeuVar.m6366H(bArr, 0, 10);
                    zzeuVar.m6363E(0);
                    int iM4100b = zzafz.m4100b(bArr);
                    if (zzeuVar.m6360B() >= iM4100b + 4) {
                        zzeuVar.m6365G(iM4100b);
                        if (zzafz.m4099a(zzeuVar.m6376b()) == 2) {
                            zzv zzvVar = zzaklVar.f5641c0;
                            zzvVar.getClass();
                            zzt zztVar = new zzt(zzvVar);
                            zztVar.m8853e("audio/vnd.dts.hd");
                            zzaklVar.f5641c0 = new zzv(zztVar);
                        }
                    }
                }
            }
            zzaklVar.f5639b0.mo4097e(zzaklVar.f5641c0);
            zzaklVar.f5633X = false;
            m4167c();
        }
        zzahm zzahmVar = zzaklVar.f5639b0;
        boolean z2 = this.f5707e0;
        zzeu zzeuVar2 = this.f5720l;
        if (!z2) {
            boolean z3 = zzaklVar.f5649j;
            zzeu zzeuVar3 = this.f5714i;
            if (z3) {
                this.f5695X &= -1073741825;
                if (!this.f5709f0) {
                    zzagbVar.mo4076F(zzeuVar3.f14887a, 0, 1);
                    this.f5701b0++;
                    byte b = zzeuVar3.f14887a[0];
                    if ((b & 128) == 128) {
                        throw zzat.m4383a(null, "Extension bit is set in signal byte");
                    }
                    this.f5715i0 = b;
                    this.f5709f0 = true;
                }
                byte b2 = this.f5715i0;
                if ((b2 & 1) == 1) {
                    int i7 = b2 & 2;
                    this.f5695X |= BasicMeasure.EXACTLY;
                    if (!this.f5717j0) {
                        zzeu zzeuVar4 = this.f5723n;
                        zzagbVar.mo4076F(zzeuVar4.f14887a, 0, 8);
                        this.f5701b0 += 8;
                        this.f5717j0 = true;
                        zzeuVar3.f14887a[0] = (byte) ((i7 != 2 ? 0 : 128) | 8);
                        zzeuVar3.m6363E(0);
                        zzahmVar.mo4098f(zzeuVar3, 1, 1);
                        this.f5703c0++;
                        zzeuVar4.m6363E(0);
                        zzahmVar.mo4098f(zzeuVar4, 8, 1);
                        this.f5703c0 += 8;
                    }
                    if (i7 == 2) {
                        if (!this.f5711g0) {
                            zzagbVar.mo4076F(zzeuVar3.f14887a, 0, 1);
                            this.f5701b0++;
                            zzeuVar3.m6363E(0);
                            this.f5713h0 = zzeuVar3.m6369K();
                            this.f5711g0 = true;
                        }
                        int i8 = this.f5713h0 * 4;
                        zzeuVar3.m6396y(i8);
                        zzagbVar.mo4076F(zzeuVar3.f14887a, 0, i8);
                        this.f5701b0 += i8;
                        int i9 = (this.f5713h0 >> 1) + 1;
                        int i10 = (i9 * 6) + 2;
                        ByteBuffer byteBuffer = this.f5726q;
                        if (byteBuffer == null || byteBuffer.capacity() < i10) {
                            this.f5726q = ByteBuffer.allocate(i10);
                        }
                        this.f5726q.position(0);
                        this.f5726q.putShort((short) i9);
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            i3 = this.f5713h0;
                            if (i11 >= i3) {
                                break;
                            }
                            int iM6382h = zzeuVar3.m6382h();
                            int i13 = iM6382h - i12;
                            if (i11 % 2 == 0) {
                                this.f5726q.putShort((short) i13);
                            } else {
                                this.f5726q.putInt(i13);
                            }
                            i11++;
                            i12 = iM6382h;
                        }
                        int i14 = (i2 - this.f5701b0) - i12;
                        if ((i3 & 1) == 1) {
                            this.f5726q.putInt(i14);
                        } else {
                            this.f5726q.putShort((short) i14);
                            this.f5726q.putInt(0);
                        }
                        byte[] bArrArray = this.f5726q.array();
                        zzeu zzeuVar5 = this.f5724o;
                        zzeuVar5.m6397z(i10, bArrArray);
                        zzahmVar.mo4098f(zzeuVar5, i10, 1);
                        this.f5703c0 += i10;
                    }
                }
            } else {
                byte[] bArr2 = zzaklVar.f5650k;
                if (bArr2 != null) {
                    zzeuVar2.m6397z(bArr2.length, bArr2);
                }
            }
            if (!"A_OPUS".equals(zzaklVar.f5640c) ? zzaklVar.f5647h > 0 : z) {
                this.f5695X |= 268435456;
                this.f5725p.m6396y(0);
                int i15 = (zzeuVar2.f14889c + i2) - this.f5701b0;
                zzeuVar3.m6396y(4);
                byte[] bArr3 = zzeuVar3.f14887a;
                bArr3[0] = (byte) ((i15 >> 24) & 255);
                bArr3[1] = (byte) ((i15 >> 16) & 255);
                bArr3[2] = (byte) ((i15 >> 8) & 255);
                bArr3[3] = (byte) (i15 & 255);
                zzahmVar.mo4098f(zzeuVar3, 4, 2);
                this.f5703c0 += 4;
            }
            this.f5707e0 = true;
        }
        int i16 = i2 + zzeuVar2.f14889c;
        String str2 = zzaklVar.f5640c;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (zzaklVar.f5632W != null) {
                zzgtr.m7133f(zzeuVar2.f14889c == 0);
                zzaklVar.f5632W.m4129a(zzagbVar);
            }
            while (true) {
                int i17 = this.f5701b0;
                if (i17 >= i16) {
                    break;
                }
                int i18 = i16 - i17;
                int iM6360B = zzeuVar2.m6360B();
                if (iM6360B > 0) {
                    iMo4122d2 = Math.min(i18, iM6360B);
                    zzahmVar.mo4121a(iMo4122d2, zzeuVar2);
                } else {
                    iMo4122d2 = zzahmVar.mo4122d(zzagbVar, i18, false);
                }
                this.f5701b0 += iMo4122d2;
                this.f5703c0 += iMo4122d2;
            }
        } else {
            zzeu zzeuVar6 = this.f5712h;
            byte[] bArr4 = zzeuVar6.f14887a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i19 = zzaklVar.f5643d0;
            int i20 = 4 - i19;
            while (this.f5701b0 < i16) {
                int i21 = this.f5705d0;
                if (i21 == 0) {
                    int iMin = Math.min(i19, zzeuVar2.m6360B());
                    zzagbVar.mo4076F(bArr4, i20 + iMin, i19 - iMin);
                    if (iMin > 0) {
                        zzeuVar2.m6366H(bArr4, i20, iMin);
                    }
                    this.f5701b0 += i19;
                    zzeuVar6.m6363E(0);
                    this.f5705d0 = zzeuVar6.m6382h();
                    zzeu zzeuVar7 = this.f5710g;
                    zzeuVar7.m6363E(0);
                    zzahmVar.mo4121a(4, zzeuVar7);
                    this.f5703c0 += 4;
                } else {
                    int iM6360B2 = zzeuVar2.m6360B();
                    if (iM6360B2 > 0) {
                        iMo4122d = Math.min(i21, iM6360B2);
                        zzahmVar.mo4121a(iMo4122d, zzeuVar2);
                    } else {
                        iMo4122d = zzahmVar.mo4122d(zzagbVar, i21, false);
                    }
                    this.f5701b0 += iMo4122d;
                    this.f5703c0 += iMo4122d;
                    this.f5705d0 -= iMo4122d;
                }
            }
        }
        if ("A_VORBIS".equals(zzaklVar.f5640c)) {
            zzeu zzeuVar8 = this.f5716j;
            zzeuVar8.m6363E(0);
            zzahmVar.mo4121a(4, zzeuVar8);
            this.f5703c0 += 4;
        }
        int i22 = this.f5703c0;
        m4176p();
        return i22;
    }

    /* JADX INFO: renamed from: p */
    public final void m4176p() {
        this.f5701b0 = 0;
        this.f5703c0 = 0;
        this.f5705d0 = 0;
        this.f5707e0 = false;
        this.f5709f0 = false;
        this.f5711g0 = false;
        this.f5713h0 = 0;
        this.f5715i0 = (byte) 0;
        this.f5717j0 = false;
        this.f5720l.m6396y(0);
    }

    /* JADX INFO: renamed from: q */
    public final void m4177q(zzagb zzagbVar, byte[] bArr, int i2) {
        int length = bArr.length;
        int i3 = length + i2;
        zzeu zzeuVar = this.f5722m;
        byte[] bArr2 = zzeuVar.f14887a;
        if (bArr2.length < i3) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i3 + i2);
            zzeuVar.m6397z(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        zzagbVar.mo4076F(zzeuVar.f14887a, length, i2);
        zzeuVar.m6363E(0);
        zzeuVar.m6361C(i3);
    }

    public zzakm(zzake zzakeVar, int i2, zzanq zzanqVar) {
        this.f5728s = -1L;
        this.f5729t = -9223372036854775807L;
        this.f5730u = -9223372036854775807L;
        this.f5731v = -9223372036854775807L;
        this.f5677F = -9223372036854775807L;
        this.f5678G = -1;
        this.f5679H = -1L;
        this.f5680I = -1L;
        this.f5681J = -1;
        this.f5683L = -1L;
        this.f5684M = -1L;
        this.f5685N = -9223372036854775807L;
        this.f5721l0 = zzakeVar;
        zzakeVar.f5589d = new zzakh(this);
        this.f5708f = zzanqVar;
        this.f5675D = new SparseArray();
        this.f5704d = true;
        this.f5706e = (i2 & 2) == 0;
        this.f5698a = new zzako();
        this.f5702c = new LongSparseArray();
        this.f5700b = new SparseArray();
        this.f5714i = new zzeu(4);
        this.f5716j = new zzeu(ByteBuffer.allocate(4).putInt(-1).array());
        this.f5718k = new zzeu(4);
        this.f5710g = new zzeu(zzgr.f18091a);
        this.f5712h = new zzeu(4);
        this.f5720l = new zzeu();
        this.f5722m = new zzeu();
        this.f5723n = new zzeu(8);
        this.f5724o = new zzeu();
        this.f5725p = new zzeu();
        this.f5692U = new int[1];
        this.f5733x = true;
    }
}

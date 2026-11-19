package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseBooleanArray;
import androidx.annotation.RequiresApi;
import androidx.core.view.PointerIconCompat;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(31)
public final class zzqd implements zznr, zzqe {

    /* JADX INFO: renamed from: B */
    public String f20598B;

    /* JADX INFO: renamed from: C */
    public PlaybackMetrics.Builder f20599C;

    /* JADX INFO: renamed from: F */
    public zzau f20602F;

    /* JADX INFO: renamed from: G */
    public zzqc f20603G;

    /* JADX INFO: renamed from: H */
    public zzqc f20604H;

    /* JADX INFO: renamed from: I */
    public zzqc f20605I;

    /* JADX INFO: renamed from: J */
    public zzv f20606J;

    /* JADX INFO: renamed from: K */
    public zzv f20607K;

    /* JADX INFO: renamed from: L */
    public zzv f20608L;

    /* JADX INFO: renamed from: M */
    public boolean f20609M;

    /* JADX INFO: renamed from: N */
    public boolean f20610N;

    /* JADX INFO: renamed from: O */
    public int f20611O;

    /* JADX INFO: renamed from: P */
    public int f20612P;

    /* JADX INFO: renamed from: Q */
    public int f20613Q;

    /* JADX INFO: renamed from: R */
    public boolean f20614R;

    /* JADX INFO: renamed from: s */
    public final Context f20615s;

    /* JADX INFO: renamed from: u */
    public final zzpw f20617u;

    /* JADX INFO: renamed from: v */
    public final PlaybackSession f20618v;

    /* JADX INFO: renamed from: t */
    public final Executor f20616t = zzdi.m5922a();

    /* JADX INFO: renamed from: x */
    public final zzbe f20620x = new zzbe();

    /* JADX INFO: renamed from: y */
    public final zzbd f20621y = new zzbd();

    /* JADX INFO: renamed from: A */
    public final HashMap f20597A = new HashMap();

    /* JADX INFO: renamed from: z */
    public final HashMap f20622z = new HashMap();

    /* JADX INFO: renamed from: w */
    public final long f20619w = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: D */
    public int f20600D = 0;

    /* JADX INFO: renamed from: E */
    public int f20601E = 0;

    public zzqd(Context context, PlaybackSession playbackSession) {
        this.f20615s = context.getApplicationContext();
        this.f20618v = playbackSession;
        zzpw zzpwVar = new zzpw(0);
        this.f20617u = zzpwVar;
        zzpwVar.f20577d = this;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    /* JADX INFO: renamed from: a */
    public final void mo8805a(int i2) {
        if (i2 == 1) {
            this.f20609M = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0212 A[PHI: r6
  0x0212: PHI (r6v50 int) = (r6v32 int), (r6v83 int) binds: [B:214:0x0319, B:137:0x020f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:139:0x0215 A[PHI: r6
  0x0215: PHI (r6v49 int) = (r6v32 int), (r6v83 int) binds: [B:214:0x0319, B:137:0x020f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:140:0x0218 A[PHI: r6
  0x0218: PHI (r6v48 int) = (r6v32 int), (r6v83 int) binds: [B:214:0x0319, B:137:0x020f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:141:0x021b A[PHI: r6
  0x021b: PHI (r6v47 int) = (r6v32 int), (r6v83 int) binds: [B:214:0x0319, B:137:0x020f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:154:0x0240  */
    /* JADX WARN: Code duplicated, block: B:189:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:192:0x02c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:193:0x02cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:197:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:198:0x02df  */
    /* JADX WARN: Code duplicated, block: B:200:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:202:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:204:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:205:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:207:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:208:0x0300  */
    /* JADX WARN: Code duplicated, block: B:210:0x0304  */
    /* JADX WARN: Code duplicated, block: B:211:0x030b  */
    /* JADX WARN: Code duplicated, block: B:213:0x030f  */
    /* JADX WARN: Code duplicated, block: B:216:0x031e  */
    /* JADX WARN: Code duplicated, block: B:225:0x036a  */
    @Override // com.google.android.gms.internal.ads.zznr
    /* JADX INFO: renamed from: d */
    public final void mo8806d(zzbb zzbbVar, zznq zznqVar) {
        int i2;
        int i3;
        zzqd zzqdVar;
        boolean z;
        int i4;
        int i5;
        int errorCode;
        int i6;
        int iM6509k;
        zzq zzqVar;
        int i7;
        int i8;
        if (zznqVar.f20524a.f20733a.size() == 0) {
            return;
        }
        for (int i9 = 0; i9 < zznqVar.f20524a.f20733a.size(); i9++) {
            SparseBooleanArray sparseBooleanArray = zznqVar.f20524a.f20733a;
            zzgtr.m7136i(i9, sparseBooleanArray.size());
            int iKeyAt = sparseBooleanArray.keyAt(i9);
            zznp zznpVar = (zznp) zznqVar.f20525b.get(iKeyAt);
            zznpVar.getClass();
            if (iKeyAt == 0) {
                zzpw zzpwVar = this.f20617u;
                synchronized (zzpwVar) {
                    try {
                        if (zzpwVar.f20577d == null) {
                            throw null;
                        }
                        zzbf zzbfVar = zzpwVar.f20578e;
                        zzpwVar.f20578e = zznpVar.f20515b;
                        Iterator it = zzpwVar.f20576c.values().iterator();
                        while (it.hasNext()) {
                            zzpv zzpvVar = (zzpv) it.next();
                            if (!zzpvVar.m8821a(zzbfVar, zzpwVar.f20578e) || zzpvVar.m8822b(zznpVar)) {
                                it.remove();
                                if (zzpvVar.f20565a.equals(zzpwVar.f20579f)) {
                                    zzpwVar.m8826d(zzpvVar);
                                }
                                if (zzpvVar.f20569e) {
                                    zzpwVar.f20577d.m8832q(zznpVar, zzpvVar.f20565a);
                                }
                            }
                        }
                        zzpwVar.m8825c(zznpVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (iKeyAt == 11) {
                zzpw zzpwVar2 = this.f20617u;
                synchronized (zzpwVar2) {
                    try {
                        if (zzpwVar2.f20577d == null) {
                            throw null;
                        }
                        Iterator it2 = zzpwVar2.f20576c.values().iterator();
                        while (it2.hasNext()) {
                            zzpv zzpvVar2 = (zzpv) it2.next();
                            if (zzpvVar2.m8822b(zznpVar)) {
                                it2.remove();
                                if (zzpvVar2.f20565a.equals(zzpwVar2.f20579f)) {
                                    zzpwVar2.m8826d(zzpvVar2);
                                }
                                if (zzpvVar2.f20569e) {
                                    zzpwVar2.f20577d.m8832q(zznpVar, zzpvVar2.f20565a);
                                }
                            }
                        }
                        zzpwVar2.m8825c(zznpVar);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                this.f20617u.m8824b(zznpVar);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zznqVar.m8804a(0)) {
            zznp zznpVar2 = (zznp) zznqVar.f20525b.get(0);
            zznpVar2.getClass();
            if (this.f20599C != null) {
                m8830g(zznpVar2.f20515b, zznpVar2.f20517d);
            }
        }
        int i10 = 2;
        if (zznqVar.m8804a(2) && this.f20599C != null) {
            zzgwt zzgwtVar = zzbbVar.mo4711i().f9185a;
            int size = zzgwtVar.size();
            int i11 = 0;
            loop3: while (true) {
                if (i11 >= size) {
                    zzqVar = null;
                    break;
                }
                zzbm zzbmVar = (zzbm) zzgwtVar.get(i11);
                int i12 = 0;
                while (true) {
                    i8 = i11 + 1;
                    if (i12 < zzbmVar.f9158a) {
                        if (zzbmVar.f9162e[i12] && (zzqVar = zzbmVar.f9159b.f7810d[i12].f21065s) != null) {
                            break loop3;
                        } else {
                            i12++;
                        }
                    }
                }
                i11 = i8;
            }
            if (zzqVar != null) {
                PlaybackMetrics.Builder builder = this.f20599C;
                String str = zzfm.f16091a;
                PlaybackMetrics.Builder builderM3877i = AbstractC5160n.m3877i(builder);
                int i13 = 0;
                while (true) {
                    if (i13 >= zzqVar.f20590v) {
                        i7 = 1;
                        break;
                    }
                    UUID uuid = zzqVar.f20587s[i13].f20536t;
                    if (uuid.equals(zzg.f16877d)) {
                        i7 = 3;
                        break;
                    } else if (uuid.equals(zzg.f16878e)) {
                        i7 = 2;
                        break;
                    } else {
                        if (uuid.equals(zzg.f16876c)) {
                            i7 = 6;
                            break;
                        }
                        i13++;
                    }
                }
                builderM3877i.setDrmType(i7);
            }
        }
        if (zznqVar.m8804a(PointerIconCompat.TYPE_COPY)) {
            this.f20613Q++;
        }
        zzau zzauVar = this.f20602F;
        if (zzauVar != null) {
            Context context = this.f20615s;
            int i14 = zzauVar.f6926s;
            if (i14 == 1001) {
                i5 = 20;
            } else {
                zzjm zzjmVar = (zzjm) zzauVar;
                boolean z2 = zzjmVar.f20136u == 1;
                int i15 = zzjmVar.f20140y;
                Throwable cause = zzauVar.getCause();
                cause.getClass();
                int i16 = 25;
                if (cause instanceof IOException) {
                    if (cause instanceof zzii) {
                        iM6509k = ((zzii) cause).f19933u;
                        i5 = 5;
                    } else if ((cause instanceof zzih) || (cause instanceof zzat)) {
                        iM6509k = 0;
                        i5 = 11;
                    } else {
                        boolean z3 = cause instanceof zzig;
                        if (z3 || (cause instanceof zziq)) {
                            if (zzes.m6320a(context).m6321b() == 1) {
                                iM6509k = 0;
                                i5 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    iM6509k = 0;
                                    i5 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    iM6509k = 0;
                                    i5 = 7;
                                } else if (z3 && ((zzig) cause).f19839t == 1) {
                                    iM6509k = 0;
                                    i5 = 4;
                                } else {
                                    iM6509k = 0;
                                    i5 = 8;
                                }
                            }
                        } else if (i14 == 1002) {
                            i5 = 21;
                        } else if (cause instanceof zzui) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                errorCode = zzfm.m6509k(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (zzfm.m6505g(errorCode)) {
                                    case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                        i16 = 24;
                                        break;
                                    case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                        i16 = 28;
                                        break;
                                    case 6004:
                                        break;
                                    case 6005:
                                        i16 = 26;
                                        break;
                                    default:
                                        i16 = 27;
                                        break;
                                }
                                iM6509k = errorCode;
                                i5 = i16;
                            } else if (cause3 instanceof MediaDrmResetException) {
                                iM6509k = 0;
                                i5 = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                iM6509k = 0;
                                i5 = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i5 = 29;
                            } else if (cause3 instanceof zzus) {
                                iM6509k = 0;
                                i5 = 23;
                            } else if (cause3 instanceof zzuh) {
                                iM6509k = 0;
                                i5 = 28;
                            } else {
                                i5 = 30;
                            }
                        } else if ((cause instanceof zzid) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                i5 = 32;
                            } else {
                                iM6509k = 0;
                                i5 = 31;
                            }
                        } else {
                            iM6509k = 0;
                            i5 = 9;
                        }
                    }
                } else if (z2) {
                    i5 = 35;
                    if (i15 != 0 && i15 != 1) {
                        if (!z2 && i15 == 3) {
                            i5 = 15;
                        } else if (!z2 && i15 == 2) {
                            iM6509k = 0;
                            i5 = 23;
                        } else if (cause instanceof zzvs) {
                            iM6509k = zzfm.m6509k(((zzvs) cause).f21126u);
                            i5 = 13;
                        } else {
                            i4 = 14;
                            if (cause instanceof zzvo) {
                                i6 = ((zzvo) cause).f21110s;
                            } else if (cause instanceof OutOfMemoryError) {
                                i5 = 14;
                            } else if (cause instanceof zzsc) {
                                i5 = 17;
                            } else if (cause instanceof zzsf) {
                                i6 = ((zzsf) cause).f20735s;
                                i4 = 18;
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (zzfm.m6505g(errorCode)) {
                                    case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                        i16 = 24;
                                        break;
                                    case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                        i16 = 28;
                                        break;
                                    case 6004:
                                        break;
                                    case 6005:
                                        i16 = 26;
                                        break;
                                    default:
                                        i16 = 27;
                                        break;
                                }
                                iM6509k = errorCode;
                                i5 = i16;
                            } else {
                                i5 = 22;
                            }
                            int i17 = i4;
                            iM6509k = i6;
                            i5 = i17;
                        }
                    }
                } else if (!z2) {
                    if (!z2) {
                    }
                    if (cause instanceof zzvs) {
                        iM6509k = zzfm.m6509k(((zzvs) cause).f21126u);
                        i5 = 13;
                    } else {
                        i4 = 14;
                        if (cause instanceof zzvo) {
                            i6 = ((zzvo) cause).f21110s;
                        } else if (cause instanceof OutOfMemoryError) {
                            i5 = 14;
                        } else if (cause instanceof zzsc) {
                            i5 = 17;
                        } else if (cause instanceof zzsf) {
                            i6 = ((zzsf) cause).f20735s;
                            i4 = 18;
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            switch (zzfm.m6505g(errorCode)) {
                                case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                    i16 = 24;
                                    break;
                                case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                    i16 = 28;
                                    break;
                                case 6004:
                                    break;
                                case 6005:
                                    i16 = 26;
                                    break;
                                default:
                                    i16 = 27;
                                    break;
                            }
                            iM6509k = errorCode;
                            i5 = i16;
                        } else {
                            i5 = 22;
                        }
                        int i18 = i4;
                        iM6509k = i6;
                        i5 = i18;
                    }
                } else {
                    if (!z2) {
                    }
                    if (cause instanceof zzvs) {
                        iM6509k = zzfm.m6509k(((zzvs) cause).f21126u);
                        i5 = 13;
                    } else {
                        i4 = 14;
                        if (cause instanceof zzvo) {
                            i6 = ((zzvo) cause).f21110s;
                        } else if (cause instanceof OutOfMemoryError) {
                            i5 = 14;
                        } else if (cause instanceof zzsc) {
                            i5 = 17;
                        } else if (cause instanceof zzsf) {
                            i6 = ((zzsf) cause).f20735s;
                            i4 = 18;
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            switch (zzfm.m6505g(errorCode)) {
                                case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                    i16 = 24;
                                    break;
                                case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                    i16 = 28;
                                    break;
                                case 6004:
                                    break;
                                case 6005:
                                    i16 = 26;
                                    break;
                                default:
                                    i16 = 27;
                                    break;
                            }
                            iM6509k = errorCode;
                            i5 = i16;
                        } else {
                            i5 = 22;
                        }
                        int i19 = i4;
                        iM6509k = i6;
                        i5 = i19;
                    }
                }
                final PlaybackErrorEvent playbackErrorEventBuild = AbstractC5159m.m3846d().setTimeSinceCreatedMillis(jElapsedRealtime - this.f20619w).setErrorCode(i5).setSubErrorCode(iM6509k).setException(zzauVar).build();
                this.f20616t.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f20593s.f20618v.reportPlaybackErrorEvent(playbackErrorEventBuild);
                    }
                });
                this.f20614R = true;
                this.f20602F = null;
            }
            iM6509k = 0;
            final PlaybackErrorEvent playbackErrorEventBuild2 = AbstractC5159m.m3846d().setTimeSinceCreatedMillis(jElapsedRealtime - this.f20619w).setErrorCode(i5).setSubErrorCode(iM6509k).setException(zzauVar).build();
            this.f20616t.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f20593s.f20618v.reportPlaybackErrorEvent(playbackErrorEventBuild2);
                }
            });
            this.f20614R = true;
            this.f20602F = null;
        }
        if (zznqVar.m8804a(2)) {
            zzbn zzbnVarMo4711i = zzbbVar.mo4711i();
            boolean zM5068a = zzbnVarMo4711i.m5068a(2);
            boolean zM5068a2 = zzbnVarMo4711i.m5068a(1);
            boolean zM5068a3 = zzbnVarMo4711i.m5068a(3);
            if (zM5068a || zM5068a2) {
                z = zM5068a3;
            } else if (zM5068a3) {
                z = true;
            } else {
                i2 = 4;
            }
            if (zM5068a || Objects.equals(this.f20606J, null)) {
                i2 = 4;
            } else {
                int i20 = this.f20606J == null ? 1 : 0;
                this.f20606J = null;
                i2 = 4;
                m8829e(1, jElapsedRealtime, null, i20);
            }
            if (!zM5068a2 && !Objects.equals(this.f20607K, null)) {
                int i21 = this.f20607K == null ? 1 : 0;
                this.f20607K = null;
                m8829e(0, jElapsedRealtime, null, i21);
            }
            if (!z && !Objects.equals(this.f20608L, null)) {
                int i22 = this.f20608L == null ? 1 : 0;
                this.f20608L = null;
                m8829e(2, jElapsedRealtime, null, i22);
            }
        } else {
            i2 = 4;
        }
        if (m8833r(this.f20603G)) {
            zzv zzvVar = this.f20603G.f20595a;
            if (zzvVar.f21069w != -1) {
                if (!Objects.equals(this.f20606J, zzvVar)) {
                    int i23 = this.f20606J == null ? 1 : 0;
                    this.f20606J = zzvVar;
                    m8829e(1, jElapsedRealtime, zzvVar, i23);
                }
                this.f20603G = 0;
            }
        }
        if (m8833r(this.f20604H)) {
            zzv zzvVar2 = this.f20604H.f20595a;
            if (!Objects.equals(this.f20607K, zzvVar2)) {
                int i24 = this.f20607K == null ? 1 : 0;
                this.f20607K = zzvVar2;
                m8829e(0, jElapsedRealtime, zzvVar2, i24);
            }
            this.f20604H = r5;
        }
        if (m8833r(this.f20605I)) {
            zzv zzvVar3 = this.f20605I.f20595a;
            if (!Objects.equals(this.f20608L, zzvVar3)) {
                int i25 = this.f20608L == null ? 1 : 0;
                this.f20608L = zzvVar3;
                m8829e(2, jElapsedRealtime, zzvVar3, i25);
            }
            this.f20605I = r5;
        }
        switch (zzes.m6320a(this.f20615s).m6321b()) {
            case 0:
                i3 = 0;
                break;
            case 1:
                i3 = 9;
                break;
            case 2:
                i3 = 2;
                break;
            case 3:
                i3 = i2;
                break;
            case 4:
                i3 = 5;
                break;
            case 5:
                i3 = 6;
                break;
            case 6:
            case 8:
            default:
                i3 = 1;
                break;
            case 7:
                i3 = 3;
                break;
            case 9:
                i3 = 8;
                break;
            case 10:
                i3 = 7;
                break;
        }
        if (i3 != this.f20601E) {
            this.f20601E = i3;
            final NetworkEvent networkEventBuild = AbstractC5159m.m3845c().setNetworkType(i3).setTimeSinceCreatedMillis(jElapsedRealtime - this.f20619w).build();
            this.f20616t.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f20581s.f20618v.reportNetworkEvent(networkEventBuild);
                }
            });
        }
        if (zzbbVar.zzh() != 2) {
            this.f20609M = false;
        }
        zznm zznmVar = (zznm) zzbbVar;
        zznmVar.f20509c.m6051b();
        zzlj zzljVar = zznmVar.f20508b;
        zzljVar.m8639w();
        if (zzljVar.f20244Z.f20461f == null) {
            this.f20610N = false;
        } else if (zznqVar.m8804a(10)) {
            this.f20610N = true;
        }
        int iZzh = zzbbVar.zzh();
        if (this.f20609M) {
            i10 = 5;
        } else if (this.f20610N) {
            i10 = 13;
        } else if (iZzh == i2) {
            i10 = 11;
        } else if (iZzh == 2) {
            int i26 = this.f20600D;
            if (i26 != 0 && i26 != 2 && i26 != 12) {
                i10 = zzbbVar.zzk() ? zzbbVar.zzi() != 0 ? 10 : 6 : 7;
            }
        } else if (iZzh != 3) {
            i10 = (iZzh != 1 || this.f20600D == 0) ? this.f20600D : 12;
        } else if (zzbbVar.zzk()) {
            i10 = zzbbVar.zzi() != 0 ? 9 : 3;
        } else {
            i10 = i2;
        }
        if (this.f20600D != i10) {
            this.f20600D = i10;
            this.f20614R = true;
            final PlaybackStateEvent playbackStateEventBuild = AbstractC5159m.m3849g().setState(this.f20600D).setTimeSinceCreatedMillis(jElapsedRealtime - this.f20619w).build();
            this.f20616t.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f20583s.f20618v.reportPlaybackStateEvent(playbackStateEventBuild);
                }
            });
        }
        if (zznqVar.m8804a(1028)) {
            zzpw zzpwVar3 = this.f20617u;
            zznp zznpVar3 = (zznp) zznqVar.f20525b.get(1028);
            zznpVar3.getClass();
            synchronized (zzpwVar3) {
                try {
                    String str2 = zzpwVar3.f20579f;
                    if (str2 != null) {
                        zzpv zzpvVar3 = (zzpv) zzpwVar3.f20576c.get(str2);
                        if (zzpvVar3 == null) {
                            throw r5;
                        }
                        zzpwVar3.m8826d(zzpvVar3);
                    }
                    Iterator it3 = zzpwVar3.f20576c.values().iterator();
                    while (it3.hasNext()) {
                        zzpv zzpvVar4 = (zzpv) it3.next();
                        it3.remove();
                        if (zzpvVar4.f20569e && (zzqdVar = zzpwVar3.f20577d) != null) {
                            zzqdVar.m8832q(zznpVar3, zzpvVar4.f20565a);
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8829e(int i2, long j2, zzv zzvVar, int i3) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = AbstractC5159m.m3850h(i2).setTimeSinceCreatedMillis(j2 - this.f20619w);
        if (zzvVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i3 != 1 ? 1 : 2);
            String str = zzvVar.f21060n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzvVar.f21061o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzvVar.f21057k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = zzvVar.f21056j;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = zzvVar.f21068v;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = zzvVar.f21069w;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = zzvVar.f21037G;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = zzvVar.f21039I;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = zzvVar.f21050d;
            if (str4 != null) {
                String str5 = zzfm.f16091a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f2 = zzvVar.f21072z;
            if (f2 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f2);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f20614R = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.f20616t.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f20585s.f20618v.reportTrackChangeEvent(trackChangeEventBuild);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zznr
    /* JADX INFO: renamed from: f */
    public final void mo8807f(zznp zznpVar, zzxh zzxhVar) {
        zzxl zzxlVar = zznpVar.f20517d;
        if (zzxlVar == null) {
            return;
        }
        zzv zzvVar = zzxhVar.f21275b;
        zzvVar.getClass();
        zzqc zzqcVar = new zzqc(zzvVar, this.f20617u.m8823a(zznpVar.f20515b, zzxlVar));
        int i2 = zzxhVar.f21274a;
        if (i2 != 0) {
            if (i2 == 1) {
                this.f20604H = zzqcVar;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.f20605I = zzqcVar;
                return;
            }
        }
        this.f20603G = zzqcVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: g */
    public final void m8830g(zzbf zzbfVar, zzxl zzxlVar) {
        Matcher matcher;
        String strGroup;
        int i2;
        PlaybackMetrics.Builder builder = this.f20599C;
        if (zzxlVar == null) {
            return;
        }
        int iMo4739e = zzbfVar.mo4739e(zzxlVar.f21278a);
        byte b = -1;
        if (iMo4739e != -1) {
            zzbd zzbdVar = this.f20621y;
            int i3 = 0;
            zzbfVar.mo4738d(iMo4739e, zzbdVar, false);
            int i4 = zzbdVar.f7634c;
            zzbe zzbeVar = this.f20620x;
            zzbfVar.mo4736b(i4, zzbeVar, 0L);
            zzag zzagVar = zzbeVar.f7676b.f5574b;
            if (zzagVar != null) {
                Uri uri = zzagVar.f5240a;
                String str = zzfm.f16091a;
                String scheme = uri.getScheme();
                if (scheme == null || !(zzgsz.m7122d("rtsp", scheme) || zzgsz.m7122d("rtspt", scheme))) {
                    String lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment != null) {
                        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                        if (iLastIndexOf >= 0) {
                            String strM7119a = zzgsz.m7119a(lastPathSegment.substring(iLastIndexOf + 1));
                            switch (strM7119a.hashCode()) {
                                case 104579:
                                    if (strM7119a.equals("ism")) {
                                        b = 2;
                                    }
                                    break;
                                case 108321:
                                    if (strM7119a.equals("mpd")) {
                                        b = 0;
                                    }
                                    break;
                                case 3242057:
                                    if (strM7119a.equals("isml")) {
                                        b = 3;
                                    }
                                    break;
                                case 3299913:
                                    if (strM7119a.equals("m3u8")) {
                                        b = 1;
                                    }
                                    break;
                            }
                            if (b == 0) {
                                i2 = 0;
                            } else if (b != 1) {
                                i2 = (b == 2 || b == 3) ? 1 : 4;
                            } else {
                                i2 = 2;
                            }
                            if (i2 == 4) {
                                Pattern pattern = zzfm.f16093c;
                                String path = uri.getPath();
                                path.getClass();
                                matcher = pattern.matcher(path);
                                if (matcher.matches()) {
                                    strGroup = matcher.group(2);
                                    if (strGroup == null) {
                                        i3 = 1;
                                    } else if (!strGroup.contains("format=mpd-time-csf")) {
                                        if (strGroup.contains("format=m3u8-aapl")) {
                                            i3 = 2;
                                        } else {
                                            i3 = 1;
                                        }
                                    }
                                } else {
                                    i3 = 4;
                                }
                            } else {
                                i3 = i2;
                            }
                        } else {
                            Pattern pattern2 = zzfm.f16093c;
                            String path2 = uri.getPath();
                            path2.getClass();
                            matcher = pattern2.matcher(path2);
                            if (matcher.matches()) {
                                strGroup = matcher.group(2);
                                if (strGroup == null) {
                                    i3 = 1;
                                } else if (!strGroup.contains("format=mpd-time-csf")) {
                                    if (strGroup.contains("format=m3u8-aapl")) {
                                        i3 = 2;
                                    } else {
                                        i3 = 1;
                                    }
                                }
                            } else {
                                i3 = 4;
                            }
                        }
                    } else {
                        i3 = 4;
                    }
                } else {
                    i3 = 3;
                }
                if (i3 == 0) {
                    i3 = 3;
                } else if (i3 != 1) {
                    i3 = i3 != 2 ? 1 : 4;
                } else {
                    i3 = 5;
                }
            }
            builder.setStreamType(i3);
            long j2 = zzbeVar.f7684j;
            if (j2 != -9223372036854775807L && !zzbeVar.f7683i && !zzbeVar.f7681g && !zzbeVar.m4777b()) {
                builder.setMediaDurationMillis(zzfm.m6518t(j2));
            }
            builder.setPlaybackType(true != zzbeVar.m4777b() ? 1 : 2);
            this.f20614R = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    /* JADX INFO: renamed from: h */
    public final void mo5545h(zzbv zzbvVar) {
        zzqc zzqcVar = this.f20603G;
        if (zzqcVar != null) {
            zzv zzvVar = zzqcVar.f20595a;
            if (zzvVar.f21069w == -1) {
                zzt zztVar = new zzt(zzvVar);
                zztVar.f20809u = zzbvVar.f9426a;
                zztVar.f20810v = zzbvVar.f9427b;
                this.f20603G = new zzqc(new zzv(zztVar), zzqcVar.f20596b);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m8831k() {
        PlaybackMetrics.Builder builder = this.f20599C;
        if (builder != null && this.f20614R) {
            builder.setAudioUnderrunCount(this.f20613Q);
            this.f20599C.setVideoFramesDropped(this.f20611O);
            this.f20599C.setVideoFramesPlayed(this.f20612P);
            Long l2 = (Long) this.f20622z.get(this.f20598B);
            this.f20599C.setNetworkTransferDurationMillis(l2 == null ? 0L : l2.longValue());
            Long l3 = (Long) this.f20597A.get(this.f20598B);
            this.f20599C.setNetworkBytesRead(l3 == null ? 0L : l3.longValue());
            this.f20599C.setStreamSource((l3 == null || l3.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.f20599C.build();
            this.f20616t.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqa
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f20591s.f20618v.reportPlaybackMetrics(playbackMetricsBuild);
                }
            });
        }
        this.f20599C = null;
        this.f20598B = null;
        this.f20613Q = 0;
        this.f20611O = 0;
        this.f20612P = 0;
        this.f20606J = null;
        this.f20607K = null;
        this.f20608L = null;
        this.f20614R = false;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    /* JADX INFO: renamed from: l */
    public final void mo5548l(zzau zzauVar) {
        this.f20602F = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    /* JADX INFO: renamed from: n */
    public final void mo8808n(zznp zznpVar, int i2, long j2) {
        zzxl zzxlVar = zznpVar.f20517d;
        if (zzxlVar != null) {
            String strM8823a = this.f20617u.m8823a(zznpVar.f20515b, zzxlVar);
            HashMap map = this.f20597A;
            Long l2 = (Long) map.get(strM8823a);
            HashMap map2 = this.f20622z;
            Long l3 = (Long) map2.get(strM8823a);
            map.put(strM8823a, Long.valueOf((l2 == null ? 0L : l2.longValue()) + j2));
            map2.put(strM8823a, Long.valueOf((l3 != null ? l3.longValue() : 0L) + ((long) i2)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    /* JADX INFO: renamed from: o */
    public final void mo8809o(zzjd zzjdVar) {
        this.f20611O += zzjdVar.f20082g;
        this.f20612P += zzjdVar.f20080e;
    }

    /* JADX INFO: renamed from: q */
    public final void m8832q(zznp zznpVar, String str) {
        zzxl zzxlVar = zznpVar.f20517d;
        if ((zzxlVar == null || !zzxlVar.m9025b()) && str.equals(this.f20598B)) {
            m8831k();
        }
        this.f20622z.remove(str);
        this.f20597A.remove(str);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m8833r(zzqc zzqcVar) {
        String str;
        if (zzqcVar == null) {
            return false;
        }
        zzpw zzpwVar = this.f20617u;
        String str2 = zzqcVar.f20596b;
        synchronized (zzpwVar) {
            str = zzpwVar.f20579f;
        }
        return str2.equals(str);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    /* JADX INFO: renamed from: p */
    public final void mo5550p(IOException iOException) {
    }
}

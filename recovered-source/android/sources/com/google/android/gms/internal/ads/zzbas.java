package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.PointerIconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbas implements zzbar {

    /* JADX INFO: renamed from: M */
    public static volatile zzbbz f7465M;

    /* JADX INFO: renamed from: B */
    public double f7467B;

    /* JADX INFO: renamed from: C */
    public double f7468C;

    /* JADX INFO: renamed from: D */
    public double f7469D;

    /* JADX INFO: renamed from: E */
    public float f7470E;

    /* JADX INFO: renamed from: F */
    public float f7471F;

    /* JADX INFO: renamed from: G */
    public float f7472G;

    /* JADX INFO: renamed from: H */
    public float f7473H;

    /* JADX INFO: renamed from: K */
    public final DisplayMetrics f7476K;

    /* JADX INFO: renamed from: L */
    public final zzbbr f7477L;

    /* JADX INFO: renamed from: s */
    public MotionEvent f7478s;

    /* JADX INFO: renamed from: t */
    public final LinkedList f7479t = new LinkedList();

    /* JADX INFO: renamed from: u */
    public long f7480u = 0;

    /* JADX INFO: renamed from: v */
    public long f7481v = 0;

    /* JADX INFO: renamed from: w */
    public long f7482w = 0;

    /* JADX INFO: renamed from: x */
    public long f7483x = 0;

    /* JADX INFO: renamed from: y */
    public long f7484y = 0;

    /* JADX INFO: renamed from: z */
    public long f7485z = 0;

    /* JADX INFO: renamed from: A */
    public long f7466A = 0;

    /* JADX INFO: renamed from: I */
    public boolean f7474I = false;

    /* JADX INFO: renamed from: J */
    public boolean f7475J = false;

    public zzbas(Context context) {
        try {
            zzazv.m4678a();
            this.f7476K = context.getResources().getDisplayMetrics();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8040C3)).booleanValue()) {
                this.f7477L = new zzbbr();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: a */
    public final synchronized void mo3254a(int i2, int i3, int i4) {
        try {
            if (this.f7478s != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8694p3)).booleanValue()) {
                    m4697o();
                } else {
                    this.f7478s.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f7476K;
            if (displayMetrics != null) {
                float f2 = displayMetrics.density;
                this.f7478s = MotionEvent.obtain(0L, i4, 1, i2 * f2, i3 * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f7478s = null;
            }
            this.f7475J = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: b */
    public final synchronized void mo3255b(MotionEvent motionEvent) {
        Long l2;
        try {
            if (this.f7474I) {
                m4697o();
                this.f7474I = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f7467B = 0.0d;
                this.f7468C = motionEvent.getRawX();
                this.f7469D = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d = rawX - this.f7468C;
                double d2 = rawY - this.f7469D;
                this.f7467B += Math.sqrt((d2 * d2) + (d * d));
                this.f7468C = rawX;
                this.f7469D = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.f7478s = motionEventObtain;
                        LinkedList linkedList = this.f7479t;
                        linkedList.add(motionEventObtain);
                        if (linkedList.size() > 6) {
                            ((MotionEvent) linkedList.remove()).recycle();
                        }
                        this.f7482w++;
                        this.f7484y = mo4696n(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f7481v += (long) (motionEvent.getHistorySize() + 1);
                        zzbcb zzbcbVarMo4695m = mo4695m(motionEvent);
                        Long l3 = zzbcbVarMo4695m.f7573d;
                        if (l3 != null && zzbcbVarMo4695m.f7576g != null) {
                            this.f7485z = l3.longValue() + zzbcbVarMo4695m.f7576g.longValue() + this.f7485z;
                        }
                        if (this.f7476K != null && (l2 = zzbcbVarMo4695m.f7574e) != null && zzbcbVarMo4695m.f7577h != null) {
                            this.f7466A = l2.longValue() + zzbcbVarMo4695m.f7577h.longValue() + this.f7466A;
                        }
                    } else if (action2 == 3) {
                        this.f7483x++;
                    }
                } catch (zzbbp unused) {
                }
            } else {
                this.f7470E = motionEvent.getX();
                this.f7471F = motionEvent.getY();
                this.f7472G = motionEvent.getRawX();
                this.f7473H = motionEvent.getRawY();
                this.f7480u++;
            }
            this.f7475J = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: c */
    public final String mo3256c(Context context, String str, View view, Activity activity) {
        return m4698p(context, str, 3, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: d */
    public final String mo3257d(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: e */
    public final void mo3258e(StackTraceElement[] stackTraceElementArr) {
        zzbbr zzbbrVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8040C3)).booleanValue() || (zzbbrVar = this.f7477L) == null) {
            return;
        }
        zzbbrVar.f7529a = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: f */
    public final String mo3259f(Context context) {
        char[] cArr = zzbcc.f7581a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return m4698p(context, null, 1, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: g */
    public void mo3260g(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: h */
    public final String mo3261h(Context context, String str, View view) {
        return m4698p(context, str, 3, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: i */
    public final String mo3262i(Context context, View view, Activity activity) {
        return m4698p(context, null, 2, view, activity);
    }

    /* JADX INFO: renamed from: j */
    public abstract zzaxt mo4692j(Context context);

    /* JADX INFO: renamed from: k */
    public abstract zzaxt mo4693k(Context context, View view, Activity activity);

    /* JADX INFO: renamed from: l */
    public abstract zzaxt mo4694l(Context context, View view, Activity activity);

    /* JADX INFO: renamed from: m */
    public abstract zzbcb mo4695m(MotionEvent motionEvent);

    /* JADX INFO: renamed from: n */
    public abstract long mo4696n(StackTraceElement[] stackTraceElementArr);

    /* JADX INFO: renamed from: o */
    public final void m4697o() {
        this.f7484y = 0L;
        this.f7480u = 0L;
        this.f7481v = 0L;
        this.f7482w = 0L;
        this.f7483x = 0L;
        this.f7485z = 0L;
        this.f7466A = 0L;
        LinkedList linkedList = this.f7479t;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.f7478s;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.f7478s = null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa A[Catch: Exception -> 0x0103, TryCatch #4 {Exception -> 0x0103, blocks: (B:47:0x009d, B:50:0x00aa, B:52:0x00bc, B:54:0x00de, B:63:0x00f6, B:53:0x00d4, B:66:0x0107), top: B:87:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc A[Catch: Exception -> 0x0103, TryCatch #4 {Exception -> 0x0103, blocks: (B:47:0x009d, B:50:0x00aa, B:52:0x00bc, B:54:0x00de, B:63:0x00f6, B:53:0x00d4, B:66:0x0107), top: B:87:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4 A[Catch: Exception -> 0x0103, TryCatch #4 {Exception -> 0x0103, blocks: (B:47:0x009d, B:50:0x00aa, B:52:0x00bc, B:54:0x00de, B:63:0x00f6, B:53:0x00d4, B:66:0x0107), top: B:87:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:87:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    public final String m4698p(Context context, String str, int i2, View view, Activity activity) {
        zzbaq zzbaqVar;
        String str2;
        int i3;
        Exception exc;
        zzaxt zzaxtVarMo4692j;
        int i4;
        int i5;
        long jCurrentTimeMillis;
        int i6;
        zzazl zzazlVarM4679b;
        byte[] bArrM8099h;
        String strEncodeToString;
        int i7;
        int i8;
        int i9 = i2;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8728r3)).booleanValue();
        if (zBooleanValue) {
            zzbaqVar = f7465M != null ? f7465M.f7557k : null;
            str2 = "be";
        } else {
            zzbaqVar = null;
            str2 = null;
        }
        try {
            if (i9 == 3) {
                zzaxtVarMo4692j = mo4693k(context, view, activity);
                try {
                    this.f7474I = true;
                    i8 = 1002;
                } catch (Exception e) {
                    exc = e;
                    i3 = 3;
                    if (zBooleanValue) {
                        if (i9 == i3) {
                            i5 = PointerIconCompat.TYPE_HELP;
                        } else {
                            if (i9 == 2) {
                                i5 = PointerIconCompat.TYPE_VERTICAL_TEXT;
                            } else {
                                i4 = 1001;
                                i9 = 1;
                            }
                            zzbaqVar.m4691a(i4, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                        }
                        i4 = i5;
                        zzbaqVar.m4691a(i4, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzaxtVarMo4692j != null) {
                        try {
                            if (((zzayt) zzaxtVarMo4692j.m8328o()).mo8101k(null) == 0) {
                                zzayt zzaytVar = (zzayt) zzaxtVarMo4692j.m8328o();
                                boolean z = zzazv.f7219a;
                                zzazlVarM4679b = zzazv.m4679b(str, zzaytVar.m8099h());
                                if (zzazlVarM4679b == null) {
                                    zzaxt zzaxtVarM4561F0 = zzayt.m4561F0();
                                    zzaxtVarM4561F0.m4531r(4096L);
                                    bArrM8099h = zzazv.m4681d(((zzayt) zzaxtVarM4561F0.m8328o()).m8099h(), str, true);
                                } else {
                                    bArrM8099h = ((zzazm) zzazlVarM4679b.m8328o()).m8099h();
                                }
                                strEncodeToString = Base64.encodeToString(bArrM8099h, 11);
                                return !zBooleanValue ? strEncodeToString : strEncodeToString;
                            }
                        } catch (Exception e2) {
                            String string = Integer.toString(7);
                            if (!zBooleanValue || zzbaqVar == null) {
                                return string;
                            }
                            if (i9 == i3) {
                                i6 = PointerIconCompat.TYPE_CROSSHAIR;
                            } else {
                                i6 = i9 == 2 ? PointerIconCompat.TYPE_COPY : 1005;
                            }
                            zzbaqVar.m4691a(i6, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, e2);
                            return string;
                        }
                    }
                    return Integer.toString(5);
                }
            } else if (i9 == 2) {
                zzaxtVarMo4692j = mo4694l(context, view, activity);
                i8 = PointerIconCompat.TYPE_TEXT;
            } else {
                zzaxtVarMo4692j = mo4692j(context);
                i8 = 1000;
            }
            if (!zBooleanValue || zzbaqVar == null) {
                i3 = 3;
            } else {
                try {
                    i3 = 3;
                    try {
                        zzbaqVar.m4691a(i8, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, null);
                    } catch (Exception e3) {
                        e = e3;
                        exc = e;
                        if (zBooleanValue && zzbaqVar != null) {
                            if (i9 == i3) {
                                i5 = PointerIconCompat.TYPE_HELP;
                            } else {
                                if (i9 == 2) {
                                    i5 = PointerIconCompat.TYPE_VERTICAL_TEXT;
                                } else {
                                    i4 = 1001;
                                    i9 = 1;
                                }
                                zzbaqVar.m4691a(i4, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                            }
                            i4 = i5;
                            zzbaqVar.m4691a(i4, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    i3 = 3;
                }
            }
        } catch (Exception e5) {
            i3 = 3;
            exc = e5;
            zzaxtVarMo4692j = null;
        }
        jCurrentTimeMillis = System.currentTimeMillis();
        if (zzaxtVarMo4692j != null) {
            if (((zzayt) zzaxtVarMo4692j.m8328o()).mo8101k(null) == 0) {
                zzayt zzaytVar2 = (zzayt) zzaxtVarMo4692j.m8328o();
                boolean z2 = zzazv.f7219a;
                zzazlVarM4679b = zzazv.m4679b(str, zzaytVar2.m8099h());
                if (zzazlVarM4679b == null) {
                    zzaxt zzaxtVarM4561F1 = zzayt.m4561F0();
                    zzaxtVarM4561F1.m4531r(4096L);
                    bArrM8099h = zzazv.m4681d(((zzayt) zzaxtVarM4561F1.m8328o()).m8099h(), str, true);
                } else {
                    bArrM8099h = ((zzazm) zzazlVarM4679b.m8328o()).m8099h();
                }
                strEncodeToString = Base64.encodeToString(bArrM8099h, 11);
                if (!zBooleanValue && zzbaqVar != null) {
                    if (i9 == i3) {
                        i7 = PointerIconCompat.TYPE_CELL;
                    } else {
                        i7 = i9 == 2 ? PointerIconCompat.TYPE_ALIAS : PointerIconCompat.TYPE_WAIT;
                    }
                    zzbaqVar.m4691a(i7, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                    return strEncodeToString;
                }
            }
        }
        return Integer.toString(5);
    }
}

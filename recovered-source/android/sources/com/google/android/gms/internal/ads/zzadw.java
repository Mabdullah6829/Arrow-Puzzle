package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;
import android.view.Surface;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadw {

    /* JADX INFO: renamed from: a */
    public final zzadg f5058a;

    /* JADX INFO: renamed from: b */
    public final zzaed f5059b;

    /* JADX INFO: renamed from: c */
    public boolean f5060c;

    /* JADX INFO: renamed from: f */
    public long f5063f;

    /* JADX INFO: renamed from: i */
    public boolean f5066i;

    /* JADX INFO: renamed from: l */
    public boolean f5069l;

    /* JADX INFO: renamed from: m */
    public boolean f5070m;

    /* JADX INFO: renamed from: d */
    public int f5061d = 0;

    /* JADX INFO: renamed from: e */
    public long f5062e = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f5064g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f5065h = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public float f5067j = 1.0f;

    /* JADX INFO: renamed from: k */
    public zzdp f5068k = zzdp.f12520a;

    public zzadw(Context context, zzadg zzadgVar) {
        this.f5058a = zzadgVar;
        this.f5059b = new zzaed(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m4030a(int i2) {
        if (i2 == 0) {
            this.f5061d = 1;
        } else if (i2 != 1) {
            this.f5061d = Math.min(this.f5061d, 2);
        } else {
            this.f5061d = 0;
        }
        this.f5059b.m4042a();
    }

    /* JADX INFO: renamed from: b */
    public final void m4031b() {
        this.f5060c = true;
        this.f5063f = zzfm.m6519u(this.f5068k.zzb());
        zzaed zzaedVar = this.f5059b;
        zzaedVar.f5084d = true;
        zzaedVar.m4042a();
        DisplayManager displayManager = (DisplayManager) zzaedVar.f5082b.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        zzadz zzaecVar = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                zzaecVar = Build.VERSION.SDK_INT >= 33 ? new zzaec(choreographer, displayManager) : new zzaea(choreographer, displayManager);
            } catch (RuntimeException e) {
                zzeh.m6212d("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }
        zzaedVar.f5083c = zzaecVar;
        if (zzaecVar != null) {
            zzaecVar.mo4040a();
        }
        zzaedVar.m4044c(false);
    }

    /* JADX INFO: renamed from: c */
    public final void m4032c(Surface surface) {
        this.f5069l = surface != null;
        this.f5070m = false;
        zzaed zzaedVar = this.f5059b;
        if (zzaedVar.f5085e != surface) {
            zzaedVar.m4045d();
            zzaedVar.f5085e = surface;
            zzaedVar.m4044c(true);
        }
        this.f5061d = Math.min(this.f5061d, 1);
    }

    /* JADX INFO: renamed from: d */
    public final void m4033d(float f2) {
        zzaed zzaedVar = this.f5059b;
        zzaedVar.f5086f = f2;
        zzacz zzaczVar = zzaedVar.f5081a;
        zzaczVar.f4949a.m3969a();
        zzaczVar.f4950b.m3969a();
        zzaczVar.f4951c = false;
        zzaczVar.f4952d = -9223372036854775807L;
        zzaczVar.f4953e = 0;
        zzaedVar.m4043b();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4034e(boolean z) {
        if (z && (this.f5061d == 3 || (this.f5070m && !this.f5069l))) {
            this.f5065h = -9223372036854775807L;
            return true;
        }
        if (this.f5065h == -9223372036854775807L) {
            return false;
        }
        if (this.f5068k.zzb() < this.f5065h) {
            return true;
        }
        this.f5065h = -9223372036854775807L;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0268  */
    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0154, code lost:
    
        if (r3 > 100000) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0163, code lost:
    
        if (r33 >= r37) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016c, code lost:
    
        if (r30.f5060c != false) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m4035f(long r31, long r33, long r35, long r37, boolean r39, boolean r40, com.google.android.gms.internal.ads.zzadu r41) {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadw.m4035f(long, long, long, long, boolean, boolean, com.google.android.gms.internal.ads.zzadu):int");
    }

    /* JADX INFO: renamed from: g */
    public final void m4036g(float f2) {
        zzgtr.m7128a(f2 > 0.0f);
        if (f2 == this.f5067j) {
            return;
        }
        this.f5067j = f2;
        zzaed zzaedVar = this.f5059b;
        zzaedVar.f5089i = f2;
        zzaedVar.m4044c(false);
    }
}

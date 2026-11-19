package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.firebase.messaging.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcuc implements zzdcz, zzden, zzddt, com.google.android.gms.ads.internal.client.zza, zzddp, zzdkx, zzdfu {

    /* JADX INFO: renamed from: A */
    public final zzbaw f11437A;

    /* JADX INFO: renamed from: B */
    public final zzbke f11438B;

    /* JADX INFO: renamed from: C */
    public final WeakReference f11439C;

    /* JADX INFO: renamed from: D */
    public final WeakReference f11440D;

    /* JADX INFO: renamed from: E */
    public final zzdcc f11441E;

    /* JADX INFO: renamed from: F */
    public final zzdfo f11442F;

    /* JADX INFO: renamed from: G */
    public final zzdbv f11443G;

    /* JADX INFO: renamed from: H */
    public final Set f11444H;

    /* JADX INFO: renamed from: I */
    public boolean f11445I;

    /* JADX INFO: renamed from: J */
    public final AtomicBoolean f11446J = new AtomicBoolean();

    /* JADX INFO: renamed from: K */
    public zzcfl f11447K = null;

    /* JADX INFO: renamed from: s */
    public final Context f11448s;

    /* JADX INFO: renamed from: t */
    public final Executor f11449t;

    /* JADX INFO: renamed from: u */
    public final Executor f11450u;

    /* JADX INFO: renamed from: v */
    public final ScheduledExecutorService f11451v;

    /* JADX INFO: renamed from: w */
    public final zzfky f11452w;

    /* JADX INFO: renamed from: x */
    public final zzfkn f11453x;

    /* JADX INFO: renamed from: y */
    public final zzfsi f11454y;

    /* JADX INFO: renamed from: z */
    public final zzflt f11455z;

    public zzcuc(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfky zzfkyVar, zzfkn zzfknVar, zzfsi zzfsiVar, zzflt zzfltVar, View view, zzclb zzclbVar, zzbaw zzbawVar, zzbke zzbkeVar, zzdcc zzdccVar, zzdfo zzdfoVar, zzdbv zzdbvVar, Set set) {
        this.f11448s = context;
        this.f11449t = executor;
        this.f11450u = executor2;
        this.f11451v = scheduledExecutorService;
        this.f11452w = zzfkyVar;
        this.f11453x = zzfknVar;
        this.f11454y = zzfsiVar;
        this.f11455z = zzfltVar;
        this.f11437A = zzbawVar;
        this.f11439C = new WeakReference(view);
        this.f11440D = new WeakReference(zzclbVar);
        this.f11438B = zzbkeVar;
        this.f11441E = zzdccVar;
        this.f11442F = zzdfoVar;
        this.f11443G = zzdbvVar;
        this.f11444H = set;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: G */
    public final void mo5824G() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: a */
    public final void mo5825a() {
        zzfkn zzfknVar = this.f11453x;
        this.f11455z.m6491a(this.f11454y.m6640a(this.f11452w, zzfknVar, zzfknVar.f15928g), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: b */
    public final void mo5826b() {
        zzfkn zzfknVar = this.f11453x;
        this.f11455z.m6491a(this.f11454y.m6640a(this.f11452w, zzfknVar, zzfknVar.f15932i), null);
    }

    @Override // com.google.android.gms.internal.ads.zzden
    /* JADX INFO: renamed from: c */
    public final synchronized void mo5833c() {
        zzdcc zzdccVar;
        long j2;
        try {
            if (this.f11445I) {
                ArrayList arrayList = new ArrayList(m5834d());
                zzfkn zzfknVar = this.f11453x;
                arrayList.addAll(zzfknVar.f15926f);
                this.f11455z.m6491a(this.f11454y.m6641b(this.f11452w, zzfknVar, true, null, null, arrayList, null, null), null);
            } else {
                zzflt zzfltVar = this.f11455z;
                zzfsi zzfsiVar = this.f11454y;
                zzfky zzfkyVar = this.f11452w;
                zzfkn zzfknVar2 = this.f11453x;
                zzfltVar.m6491a(zzfsiVar.m6640a(zzfkyVar, zzfknVar2, zzfknVar2.f15940m), null);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8831x4)).booleanValue() && (zzdccVar = this.f11441E) != null) {
                    List list = zzdccVar.f11993b.f15940m;
                    String strM6310d = zzdccVar.f11994c.m6310d();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(zzfsi.m6639c((String) it.next(), "@gw_adnetstatus@", strM6310d));
                    }
                    zzepl zzeplVar = zzdccVar.f11994c;
                    synchronized (zzeplVar) {
                        j2 = zzeplVar.f14541h;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        arrayList3.add(zzfsi.m6639c((String) obj, "@gw_ttr@", Long.toString(j2, 10)));
                    }
                    zzfltVar.m6491a(zzfsiVar.m6640a(zzdccVar.f11992a, zzdccVar.f11993b, arrayList3), null);
                }
                zzfltVar.m6491a(zzfsiVar.m6640a(zzfkyVar, zzfknVar2, zzfknVar2.f15926f), null);
            }
            this.f11445I = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final List m5834d() {
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8236Nc)).booleanValue();
        zzfkn zzfknVar = this.f11453x;
        if (zBooleanValue) {
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            Context context = this.f11448s;
            if (com.google.android.gms.ads.internal.util.zzs.m3205d(context)) {
                Object systemService = context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
                Integer numValueOf = systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null;
                if (numValueOf != null) {
                    int iMin = Math.min(numValueOf.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = zzfknVar.f15922d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return zzfknVar.f15922d;
    }

    /* JADX INFO: renamed from: e */
    public final void m5835e(final int i2, final int i3) {
        View view;
        if (i2 <= 0 || !((view = (View) this.f11439C.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            m5836g();
        } else {
            this.f11451v.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcty
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    final zzcuc zzcucVar = this.f11412s;
                    final int i4 = i2;
                    final int i5 = i3;
                    zzcucVar.f11449t.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctz
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzcucVar.m5835e(i4 - 1, i5);
                        }
                    });
                }
            }, i3, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5836g() {
        int i2;
        zzcfl zzcflVar;
        zzfkn zzfknVar = this.f11453x;
        List list = zzfknVar.f15922d;
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbio zzbioVar = zzbix.f8621kf;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && this.f11447K == null) {
            zzcfp zzcfpVar = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.f9891c;
            Set set = this.f11444H;
            String str = this.f11452w.f16005a.f15998a.f16043g;
            zzcfm zzcfmVar = zzcfpVar.f9929v;
            synchronized (zzcfmVar.f9915g) {
                try {
                    int i3 = zzcfmVar.f9921m;
                    zzcfmVar.f9921m = i3 + 1;
                    if (set.isEmpty()) {
                        zzcflVar = new zzcfl(i3, -1, -1);
                    } else {
                        TreeSet treeSet = new TreeSet(set);
                        StringBuilder sb = new StringBuilder();
                        Iterator it = treeSet.iterator();
                        if (it.hasNext()) {
                            CharSequence charSequence = (CharSequence) it.next();
                            while (true) {
                                sb.append(charSequence);
                                if (!it.hasNext()) {
                                    break;
                                }
                                sb.append((CharSequence) ",");
                                charSequence = (CharSequence) it.next();
                            }
                        }
                        String string = sb.toString();
                        HashMap map = zzcfmVar.f9922n;
                        Integer num = (Integer) map.get(string);
                        int iIntValue = 0;
                        int iIntValue2 = num == null ? 0 : num.intValue();
                        map.put(string, Integer.valueOf(iIntValue2 + 1));
                        if (str == null) {
                            zzcflVar = new zzcfl(i3, iIntValue2, -1);
                        } else {
                            StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(string).length());
                            sb2.append(str);
                            sb2.append("|");
                            sb2.append(string);
                            String string2 = sb2.toString();
                            HashMap map2 = zzcfmVar.f9923o;
                            Integer num2 = (Integer) map2.get(string2);
                            if (num2 != null) {
                                iIntValue = num2.intValue();
                            }
                            map2.put(string2, Integer.valueOf(iIntValue + 1));
                            zzcflVar = new zzcfl(i3, iIntValue2, iIntValue);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f11447K = zzcflVar;
        }
        String strMo3262i = null;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8746s4)).booleanValue()) {
            strMo3262i = this.f11437A.f7501b.mo3262i(this.f11448s, (View) this.f11439C.get(), null);
        }
        if ((((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8421Z0)).booleanValue() && this.f11452w.f16006b.f16002b.f15979h) || !((Boolean) zzbkw.f9057h.m5057c()).booleanValue()) {
            this.f11455z.m6491a(this.f11454y.m6641b(this.f11452w, zzfknVar, false, strMo3262i, null, m5834d(), this.f11443G, this.f11447K), this.f11442F);
            return;
        }
        if (((Boolean) zzbkw.f9056g.m5057c()).booleanValue() && ((i2 = zzfknVar.f15918b) == 1 || i2 == 2 || i2 == 5)) {
        }
        zzhbx zzhbxVar = (zzhbx) zzhcf.m7373g(zzhbx.m7360q(zzhcj.f18518t), ((Long) zzbaVar.f3098c.m5030a(zzbix.f8055D1)).longValue(), TimeUnit.MILLISECONDS, this.f11451v);
        zzhbxVar.addListener(new zzhcd(zzhbxVar, new zzctw(this, strMo3262i)), this.f11449t);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    /* JADX INFO: renamed from: j */
    public final void mo5837j(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8473c2)).booleanValue()) {
            int i2 = zzeVar.f3106s;
            ArrayList arrayList = new ArrayList();
            zzfkn zzfknVar = this.f11453x;
            for (String str : zzfknVar.f15944o) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 2);
                sb.append("2.");
                sb.append(i2);
                arrayList.add(zzfsi.m6639c(str, "@gw_mpe@", sb.toString()));
            }
            this.f11455z.m6491a(this.f11454y.m6640a(this.f11452w, zzfknVar, arrayList), null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    /* JADX INFO: renamed from: k */
    public final void mo2730k() {
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8421Z0)).booleanValue();
        zzfky zzfkyVar = this.f11452w;
        if ((zBooleanValue && zzfkyVar.f16006b.f16002b.f15979h) || !((Boolean) zzbkw.f9053d.m5057c()).booleanValue()) {
            zzfkn zzfknVar = this.f11453x;
            this.f11455z.m6492b(this.f11454y.m6640a(zzfkyVar, zzfknVar, zzfknVar.f15920c), true == com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5389i(this.f11448s) ? 2 : 1);
        } else {
            zzbke zzbkeVar = this.f11438B;
            zzbkeVar.getClass();
            zzhbx zzhbxVar = (zzhbx) zzhcf.m7371e(zzhbx.m7360q((zzhbx) zzhcf.m7373g(zzhbx.m7360q(zzhcj.f18518t), ((Long) zzbkw.f9052c.m5057c()).longValue(), TimeUnit.MILLISECONDS, zzbkeVar.f8969c)), Throwable.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzcub
                @Override // com.google.android.gms.internal.ads.zzgti
                public final /* synthetic */ Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, zzcfy.f9953h);
            zzhbxVar.addListener(new zzhcd(zzhbxVar, new zzctv(this)), this.f11449t);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: l */
    public final void mo5827l(zzcbt zzcbtVar, String str, String str2) {
        zzgtw zzgtwVar;
        zzgtp zzgtpVar;
        zzfkz zzfkzVar;
        zzfkn zzfknVar = this.f11453x;
        List list = zzfknVar.f15930h;
        zzfsi zzfsiVar = this.f11454y;
        zzfsiVar.getClass();
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = zzfsiVar.f16401h.currentTimeMillis();
        try {
            String str3 = zzcbtVar.f9736s;
            String string = Integer.toString(zzcbtVar.f9737t);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8763t4)).booleanValue()) {
                zzfla zzflaVar = zzfsiVar.f16400g;
                if (zzflaVar == null || (zzfkzVar = zzflaVar.f16010a) == null) {
                    zzgtpVar = zzgsx.f18165s;
                } else {
                    zzgtwVar = new zzgtw(zzfkzVar);
                    zzgtpVar = zzgtwVar;
                }
            } else {
                zzfkz zzfkzVar2 = zzfsiVar.f16399f;
                if (zzfkzVar2 == null) {
                    zzgtpVar = zzgsx.f18165s;
                } else {
                    zzgtwVar = new zzgtw(zzfkzVar2);
                    zzgtpVar = zzgtwVar;
                }
            }
            String str4 = (String) zzgtpVar.mo7117b(new zzgti() { // from class: com.google.android.gms.internal.ads.zzfsh
                @Override // com.google.android.gms.internal.ads.zzgti
                public final Object apply(Object obj) {
                    String str5 = ((zzfkz) obj).f16007a;
                    if (TextUtils.isEmpty(str5)) {
                        return "";
                    }
                    return com.google.android.gms.ads.internal.util.client.zzl.m3052e() ? "fakeForAdDebugLog" : str5;
                }
            }).mo7116a();
            String str5 = (String) zzgtpVar.mo7117b(new zzgti() { // from class: com.google.android.gms.internal.ads.zzfsg
                @Override // com.google.android.gms.internal.ads.zzgti
                public final Object apply(Object obj) {
                    String str6 = ((zzfkz) obj).f16008b;
                    if (TextUtils.isEmpty(str6)) {
                        return "";
                    }
                    return com.google.android.gms.ads.internal.util.client.zzl.m3052e() ? "fakeForAdDebugLog" : str6;
                }
            }).mo7116a();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzcei.m5373a(zzfsi.m6639c(zzfsi.m6639c(zzfsi.m6639c(zzfsi.m6639c(zzfsi.m6639c(zzfsi.m6639c((String) it.next(), "@gw_rwd_userid@", Uri.encode(str4)), "@gw_rwd_custom_data@", Uri.encode(str5)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(str3)), "@gw_rwd_amt@", string), "@gw_sdkver@", zzfsiVar.f16395b), zzfsiVar.f16398e, zzfknVar.f15912W, zzfknVar.f15961w0));
            }
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Unable to determine award type and amount.", e);
        }
        this.f11455z.m6491a(arrayList, null);
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    /* JADX INFO: renamed from: n */
    public final void mo5838n() {
        if (this.f11446J.compareAndSet(false, true)) {
            zzbio zzbioVar = zzbix.f8024B4;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            zzbiv zzbivVar = zzbaVar.f3098c;
            zzbiv zzbivVar2 = zzbaVar.f3098c;
            int iIntValue = ((Integer) zzbivVar.m5030a(zzbioVar)).intValue();
            if (iIntValue > 0) {
                m5835e(iIntValue, ((Integer) zzbivVar2.m5030a(zzbix.f8041C4)).intValue());
            } else if (!((Boolean) zzbivVar2.m5030a(zzbix.f8007A4)).booleanValue()) {
                m5836g();
            } else {
                this.f11450u.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctx
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        final zzcuc zzcucVar = this.f11411s;
                        zzcucVar.f11449t.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcua
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzcucVar.m5836g();
                            }
                        });
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: u */
    public final void mo5828u() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: x */
    public final void mo5829x() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzi() {
        zzfkn zzfknVar = this.f11453x;
        this.f11455z.m6491a(this.f11454y.m6640a(this.f11452w, zzfknVar, zzfknVar.f15957u0), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.AbstractCollection, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzdfu
    public final void zzk() {
        zzfkn zzfknVar = this.f11453x;
        if (zzfknVar.f15924e == 4) {
            this.f11455z.m6491a(this.f11454y.m6640a(this.f11452w, zzfknVar, zzfknVar.f15882A0), null);
        }
    }
}

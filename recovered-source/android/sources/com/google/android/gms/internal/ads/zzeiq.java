package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeiq extends zzcaw {

    /* JADX INFO: renamed from: s */
    public final Context f13973s;

    /* JADX INFO: renamed from: t */
    public final zzhcp f13974t;

    /* JADX INFO: renamed from: u */
    public final zzeiy f13975u;

    /* JADX INFO: renamed from: v */
    public final zzcnq f13976v;

    /* JADX INFO: renamed from: w */
    public final ArrayDeque f13977w;

    /* JADX INFO: renamed from: x */
    public final zzfqt f13978x;

    public zzeiq(Context context, zzhcp zzhcpVar, zzcbs zzcbsVar, zzcnq zzcnqVar, zzeiy zzeiyVar, ArrayDeque arrayDeque, zzfqt zzfqtVar) {
        zzbix.m5032a(context);
        this.f13973s = context;
        this.f13974t = zzhcpVar;
        this.f13975u = zzeiyVar;
        this.f13976v = zzcnqVar;
        this.f13977w = arrayDeque;
        this.f13978x = zzfqtVar;
    }

    /* JADX INFO: renamed from: o4 */
    public static zzfoz m6222o4(zzfoz zzfozVar, zzfps zzfpsVar, zzbup zzbupVar, zzfqq zzfqqVar, zzfqg zzfqgVar) {
        zzbut zzbutVarM5148a = zzbupVar.m5148a("AFMA_getAdDictionary", zzbum.f9398a, new zzbuh() { // from class: com.google.android.gms.internal.ads.zzeik
            @Override // com.google.android.gms.internal.ads.zzbuh
            /* JADX INFO: renamed from: n */
            public final /* synthetic */ Object mo5146n(JSONObject jSONObject) {
                return new zzcbm(jSONObject);
            }
        });
        zzfqp.m6575a(zzfozVar, zzfqgVar);
        zzfoz zzfozVarM6555d = zzfpsVar.m6556a(zzfozVar, zzfpm.BUILD_URL).m6553b(zzbutVarM5148a).m6555d();
        if (!((Boolean) zzbkq.f9009c.m5057c()).booleanValue()) {
            return zzfozVarM6555d;
        }
        zzhbx zzhbxVarM7360q = zzhbx.m7360q(zzfozVarM6555d);
        zzfqn zzfqnVar = new zzfqn(zzfqqVar, zzfqgVar);
        zzhbxVarM7360q.addListener(new zzhcd(zzhbxVarM7360q, zzfqnVar), zzcfy.f9953h);
        return zzfozVarM6555d;
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    /* JADX INFO: renamed from: O0 */
    public final void mo5295O0(zzcbk zzcbkVar, zzcbb zzcbbVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8158J2)).booleanValue() && (bundle = zzcbkVar.f9681E) != null) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            bundle.putLong("service-connected", System.currentTimeMillis());
        }
        zzfoz zzfozVarM6223k4 = m6223k4(zzcbkVar, Binder.getCallingUid());
        m6227p4(zzfozVarM6223k4, zzcbbVar, zzcbkVar);
        if (((Boolean) zzbkx.f9067i.m5057c()).booleanValue()) {
            final zzeiy zzeiyVar = this.f13975u;
            Objects.requireNonNull(zzeiyVar);
            zzfozVarM6223k4.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeip
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeiyVar.m6230a();
                }
            }, this.f13974t);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    /* JADX INFO: renamed from: O1 */
    public final void mo5296O1(zzcbk zzcbkVar, zzcbb zzcbbVar) {
        m6227p4(m6224l4(zzcbkVar, Binder.getCallingUid()), zzcbbVar, zzcbkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    /* JADX INFO: renamed from: f2 */
    public final void mo5297f2(zzcbk zzcbkVar, zzcbb zzcbbVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8158J2)).booleanValue() && (bundle = zzcbkVar.f9681E) != null) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            bundle.putLong("service-connected", System.currentTimeMillis());
        }
        m6227p4(m6226n4(zzcbkVar, Binder.getCallingUid()), zzcbbVar, zzcbkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    /* JADX INFO: renamed from: h3 */
    public final void mo5298h3(String str, zzcbb zzcbbVar) {
        m6227p4(m6225m4(str), zzcbbVar, null);
    }

    /* JADX INFO: renamed from: k4 */
    public final zzfoz m6223k4(final zzcbk zzcbkVar, int i2) {
        zzeil zzeilVarM6228q4;
        boolean z;
        zzfoz zzfozVarM6555d;
        zzbug zzbugVar = com.google.android.gms.ads.internal.zzt.f3698C.f3718r;
        VersionInfoParcel versionInfoParcelM3031w = VersionInfoParcel.m3031w();
        zzfqt zzfqtVar = this.f13978x;
        Context context = this.f13973s;
        zzbup zzbupVarM5144a = zzbugVar.m5144a(context, versionInfoParcelM3031w, zzfqtVar);
        zzfdu zzfduVarM5681B = this.f13976v.m5681B(zzcbkVar, i2);
        zzbut zzbutVarM5148a = zzbupVarM5144a.m5148a("google.afma.response.normalize", zzein.f13967d, zzbum.f9399b);
        if (((Boolean) zzble.f9120a.m5057c()).booleanValue()) {
            zzeilVarM6228q4 = m6228q4(zzcbkVar.f9689z);
            if (zzeilVarM6228q4 == null) {
                com.google.android.gms.ads.internal.util.zze.m3150k("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzcbkVar.f9678B;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.m3150k("Request contained a PoolKey but split request is disabled.");
            }
            zzeilVarM6228q4 = null;
        }
        zzfqg zzfqgVarM6562l = zzeilVarM6228q4 == null ? zzfqg.m6562l(context, 9) : zzeilVarM6228q4.f13966d;
        zzfqq zzfqqVarMo5731c = zzfduVarM5681B.mo5731c();
        zzfqqVarMo5731c.m6579b(zzcbkVar.f9682s.getStringArrayList("ad_types"));
        zzeix zzeixVar = new zzeix(zzcbkVar.f9688y, zzfqqVarMo5731c, zzfqgVarM6562l);
        zzeiu zzeiuVar = new zzeiu(context, zzcbkVar.f9683t.f3396s, null);
        zzfps zzfpsVarMo5730b = zzfduVarM5681B.mo5730b();
        zzfqg zzfqgVarM6562l2 = zzfqg.m6562l(context, 11);
        zzfpm zzfpmVar = zzfpm.PRE_PROCESS;
        zzfpm zzfpmVar2 = zzfpm.HTTP;
        if (zzeilVarM6228q4 == null) {
            final zzfoz zzfozVarM6555d2 = zzfpsVarMo5730b.m6556a(zzhcf.m7367a(zzcbkVar.f9682s), zzfpm.GMS_SIGNALS).m6553b(new zzeie(zzfduVarM5681B, zzcbkVar)).m6552a(zzeif.f13951a).m6555d();
            final zzfoz zzfozVarM6222o4 = m6222o4(zzfozVarM6555d2, zzfpsVarMo5730b, zzbupVarM5144a, zzfqqVarMo5731c, zzfqgVarM6562l);
            zzfqg zzfqgVarM6562l3 = zzfqg.m6562l(context, 10);
            final zzfoz zzfozVarM6555d3 = new zzfpb(zzfpsVarMo5730b, zzfpmVar2, Arrays.asList(zzfozVarM6222o4, zzfozVarM6555d2)).m6551a(new Callable() { // from class: com.google.android.gms.internal.ads.zzeij
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    zzcbm zzcbmVar = (zzcbm) zzfozVarM6222o4.f16221u.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8158J2)).booleanValue() && (bundle = zzcbkVar.f9681E) != null) {
                        bundle.putLong("get-ad-dictionary-sdkcore-start", zzcbmVar.f9699j);
                        bundle.putLong("get-ad-dictionary-sdkcore-end", zzcbmVar.f9700k);
                    }
                    return new zzeiw((JSONObject) zzfozVarM6555d2.f16221u.get(), zzcbmVar);
                }
            }).m6552a(zzeixVar).m6552a(new zzfqo(zzfqgVarM6562l3)).m6552a(zzeiuVar).m6555d();
            zzfqp.m6577c(zzfozVarM6555d3, zzfqqVarMo5731c, zzfqgVarM6562l3, false);
            zzfqp.m6575a(zzfozVarM6555d3, zzfqgVarM6562l2);
            zzfozVarM6555d = new zzfpb(zzfpsVarMo5730b, zzfpmVar, Arrays.asList(zzfozVarM6555d2, zzfozVarM6222o4, zzfozVarM6555d3)).m6551a(new Callable() { // from class: com.google.android.gms.internal.ads.zzeic
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8158J2)).booleanValue() && (bundle = zzcbkVar.f9681E) != null) {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                        bundle.putLong("http-response-ready", System.currentTimeMillis());
                    }
                    return new zzein((zzeit) zzfozVarM6555d3.f16221u.get(), (JSONObject) zzfozVarM6555d2.f16221u.get(), (zzcbm) zzfozVarM6222o4.f16221u.get());
                }
            }).m6553b(zzbutVarM5148a).m6555d();
            z = false;
        } else {
            zzeiw zzeiwVar = new zzeiw(zzeilVarM6228q4.f13964b, zzeilVarM6228q4.f13963a);
            zzfqg zzfqgVarM6562l4 = zzfqg.m6562l(context, 10);
            final zzfoz zzfozVarM6555d4 = zzfpsVarMo5730b.m6556a(zzhcf.m7367a(zzeiwVar), zzfpmVar2).m6552a(zzeixVar).m6552a(new zzfqo(zzfqgVarM6562l4)).m6552a(zzeiuVar).m6555d();
            z = false;
            zzfqp.m6577c(zzfozVarM6555d4, zzfqqVarMo5731c, zzfqgVarM6562l4, false);
            final ListenableFuture listenableFutureM7367a = zzhcf.m7367a(zzeilVarM6228q4);
            zzfqp.m6575a(zzfozVarM6555d4, zzfqgVarM6562l2);
            zzfozVarM6555d = new zzfpb(zzfpsVarMo5730b, zzfpmVar, Arrays.asList(zzfozVarM6555d4, listenableFutureM7367a)).m6551a(new Callable() { // from class: com.google.android.gms.internal.ads.zzeid
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzeit zzeitVar = (zzeit) zzfozVarM6555d4.f16221u.get();
                    Object obj = ((zzhcj) listenableFutureM7367a).f18520s;
                    return new zzein(zzeitVar, ((zzeil) obj).f13964b, ((zzeil) obj).f13963a);
                }
            }).m6553b(zzbutVarM5148a).m6555d();
        }
        zzfqp.m6577c(zzfozVarM6555d, zzfqqVarMo5731c, zzfqgVarM6562l2, z);
        return zzfozVarM6555d;
    }

    /* JADX INFO: renamed from: l4 */
    public final ListenableFuture m6224l4(final zzcbk zzcbkVar, int i2) {
        if (!((Boolean) zzble.f9120a.m5057c()).booleanValue()) {
            return zzhcf.m7368b(new Exception("Split request is disabled."));
        }
        zzfnc zzfncVar = zzcbkVar.f9677A;
        if (zzfncVar == null) {
            return zzhcf.m7368b(new Exception("Pool configuration missing from request."));
        }
        if (zzfncVar.f16150v == 0 || zzfncVar.f16151w == 0) {
            return zzhcf.m7368b(new Exception("Caching is disabled."));
        }
        zzbug zzbugVar = com.google.android.gms.ads.internal.zzt.f3698C.f3718r;
        VersionInfoParcel versionInfoParcelM3031w = VersionInfoParcel.m3031w();
        Context context = this.f13973s;
        zzbup zzbupVarM5144a = zzbugVar.m5144a(context, versionInfoParcelM3031w, this.f13978x);
        zzfdu zzfduVarM5681B = this.f13976v.m5681B(zzcbkVar, i2);
        zzfps zzfpsVarMo5730b = zzfduVarM5681B.mo5730b();
        final zzfoz zzfozVarM6555d = zzfpsVarMo5730b.m6556a(zzhcf.m7367a(zzcbkVar.f9682s), zzfpm.GMS_SIGNALS).m6553b(new zzeie(zzfduVarM5681B, zzcbkVar)).m6552a(zzeif.f13951a).m6555d();
        zzfqq zzfqqVarMo5731c = zzfduVarM5681B.mo5731c();
        final zzfqg zzfqgVarM6562l = zzfqg.m6562l(context, 9);
        final zzfoz zzfozVarM6222o4 = m6222o4(zzfozVarM6555d, zzfpsVarMo5730b, zzbupVarM5144a, zzfqqVarMo5731c, zzfqgVarM6562l);
        return new zzfpb(zzfpsVarMo5730b, zzfpm.GET_URL_AND_CACHE_KEY, Arrays.asList(zzfozVarM6555d, zzfozVarM6222o4)).m6551a(new Callable() { // from class: com.google.android.gms.internal.ads.zzeig
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzeiq zzeiqVar = this.f13952a;
                zzfoz zzfozVar = zzfozVarM6222o4;
                zzfoz zzfozVar2 = zzfozVarM6555d;
                zzcbk zzcbkVar2 = zzcbkVar;
                zzfqg zzfqgVar = zzfqgVarM6562l;
                String str = ((zzcbm) zzfozVar.f16221u.get()).f9698i;
                zzeil zzeilVar = new zzeil((zzcbm) zzfozVar.f16221u.get(), (JSONObject) zzfozVar2.f16221u.get(), zzcbkVar2.f9689z, zzfqgVar);
                synchronized (zzeiqVar) {
                    synchronized (zzeiqVar) {
                        int iIntValue = ((Long) zzble.f9121b.m5057c()).intValue();
                        while (true) {
                            ArrayDeque arrayDeque = zzeiqVar.f13977w;
                            if (arrayDeque.size() >= iIntValue) {
                                arrayDeque.removeFirst();
                            }
                        }
                    }
                    return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
                }
                zzeiqVar.f13977w.addLast(zzeilVar);
                return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            }
        }).m6555d();
    }

    /* JADX INFO: renamed from: m4 */
    public final ListenableFuture m6225m4(String str) {
        if (((Boolean) zzble.f9120a.m5057c()).booleanValue()) {
            return m6228q4(str) == null ? zzhcf.m7368b(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzhcf.m7367a(new zzeia());
        }
        return zzhcf.m7368b(new Exception("Split request is disabled."));
    }

    /* JADX INFO: renamed from: n4 */
    public final ListenableFuture m6226n4(final zzcbk zzcbkVar, int i2) {
        zzbug zzbugVar = com.google.android.gms.ads.internal.zzt.f3698C.f3718r;
        VersionInfoParcel versionInfoParcelM3031w = VersionInfoParcel.m3031w();
        zzfqt zzfqtVar = this.f13978x;
        Context context = this.f13973s;
        zzbup zzbupVarM5144a = zzbugVar.m5144a(context, versionInfoParcelM3031w, zzfqtVar);
        if (!((Boolean) zzblk.f9132a.m5057c()).booleanValue()) {
            return zzhcf.m7368b(new Exception("Signal collection disabled."));
        }
        zzfdu zzfduVarM5681B = this.f13976v.m5681B(zzcbkVar, i2);
        zzcpd zzcpdVar = (zzcpd) zzfduVarM5681B;
        zzimy zzimyVar = zzcpdVar.f10728j;
        zzfed zzfedVar = zzcpdVar.f10726h;
        zzffj zzffjVar = zzcpdVar.f10727i;
        zzffn zzffnVar = zzcpdVar.f10724f;
        zzfew zzfewVar = zzcpdVar.f10722d;
        zzfep zzfepVar = zzcpdVar.f10721c;
        zzfeh zzfehVar = zzcpdVar.f10725g;
        zzfdt zzfdtVar = zzcpdVar.f10723e;
        zzcpe zzcpeVar = zzcpdVar.f10720b;
        zzimy zzimyVar2 = zzcpeVar.f10763Q0;
        Context context2 = zzcpeVar.f10774b.f10620b;
        zzinh.m8554a(context2);
        new zzcez();
        new zzcfa();
        Object objZzb = zzimyVar2.zzb();
        zzfdx zzfdxVarM5732d = zzcpdVar.m5732d();
        zzfex zzfexVar = zzcpdVar.f10719a;
        new zzbih();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        List list = zzfexVar.f15561a.f9686w;
        zzinh.m8554a(list);
        zzfer zzferVar = new zzfer(zzhcpVar, list);
        zzimt zzimtVarM8548b = zzimy.m8548b(zzfdtVar);
        zzimt zzimtVarM8548b2 = zzimy.m8548b(zzfehVar);
        zzimy.m8548b(zzfepVar);
        zzimt zzimtVarM8548b3 = zzimy.m8548b(zzfewVar);
        zzimt zzimtVarM8548b4 = zzimy.m8548b(zzffnVar);
        zzimy.m8548b(zzffjVar);
        zzimt zzimtVarM8548b5 = zzimy.m8548b(zzfedVar);
        zzfqq zzfqqVar = (zzfqq) zzimyVar.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add((zzfek) objZzb);
        hashSet.add(zzfdxVarM5732d);
        hashSet.add(zzferVar);
        zzbio zzbioVar = zzbix.f8162J6;
        zzbiv zzbivVar = com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c;
        if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
            hashSet.add((zzfcs) zzimtVarM8548b.zzb());
        }
        if (((Boolean) zzbivVar.m5030a(zzbix.f8179K6)).booleanValue()) {
            hashSet.add((zzfcs) zzimtVarM8548b2.zzb());
        }
        if (((Boolean) zzbivVar.m5030a(zzbix.f8213M6)).booleanValue()) {
            hashSet.add((zzfcs) zzimtVarM8548b3.zzb());
        }
        if (((Boolean) zzbivVar.m5030a(zzbix.f8230N6)).booleanValue()) {
            hashSet.add((zzfcs) zzimtVarM8548b4.zzb());
        }
        if (((Boolean) zzbivVar.m5030a(zzbix.f8328T3)).booleanValue()) {
            hashSet.add((zzfcs) zzimtVarM8548b5.zzb());
        }
        final zzfcv zzfcvVar = new zzfcv(context2, zzhcpVar, hashSet, zzfqqVar);
        zzbut zzbutVarM5148a = zzbupVarM5144a.m5148a("google.afma.request.getSignals", zzbum.f9398a, zzbum.f9399b);
        zzfqg zzfqgVarM6562l = zzfqg.m6562l(context, 22);
        zzfps zzfpsVarMo5730b = zzfduVarM5681B.mo5730b();
        Bundle bundle = zzcbkVar.f9682s;
        zzfpj zzfpjVarM6553b = zzfpsVarMo5730b.m6556a(zzhcf.m7367a(bundle), zzfpm.GET_SIGNALS).m6552a(new zzfqo(zzfqgVarM6562l)).m6553b(new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeih
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) throws JSONException {
                JSONObject jSONObjectM3049n = com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a.m3049n((Bundle) obj);
                return zzfcvVar.m6423a(zzcbkVar.f9681E, jSONObjectM3049n);
            }
        });
        zzfoz zzfozVarM6555d = zzfpjVarM6553b.f16240f.m6556a(zzfpjVarM6553b.m6555d(), zzfpm.JS_SIGNALS).m6553b(zzbutVarM5148a).m6555d();
        zzfqq zzfqqVarMo5731c = zzfduVarM5681B.mo5731c();
        zzfqqVarMo5731c.m6579b(bundle.getStringArrayList("ad_types"));
        zzfqqVarMo5731c.m6581d(bundle.getBundle("extras"));
        zzfqp.m6577c(zzfozVarM6555d, zzfqqVarMo5731c, zzfqgVarM6562l, true);
        if (((Boolean) zzbkx.f9068j.m5057c()).booleanValue()) {
            final zzeiy zzeiyVar = this.f13975u;
            Objects.requireNonNull(zzeiyVar);
            zzfozVarM6555d.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeio
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeiyVar.m6230a();
                }
            }, this.f13974t);
        }
        return zzfozVarM6555d;
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    /* JADX INFO: renamed from: p0 */
    public final void mo5299p0(String str) throws RemoteException {
        Binder.getCallingUid();
        zzbio zzbioVar = zzbix.f8018Af;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            String str2 = (String) zzbaVar.f3098c.m5030a(zzbix.f8035Bf);
            if (str2.isEmpty()) {
                return;
            }
            zzgua<String> zzguaVar = new zzgua(zzgug.m7143a(new zzgtb(',')), str2);
            com.google.android.gms.ads.internal.util.zze.m3150k("AdRequestServiceImpl: Preconnecting");
            for (String str3 : zzguaVar) {
                Context context = this.f13973s;
                zzeiu zzeiuVar = new zzeiu(context, str, "HEAD");
                HashMap map = new HashMap();
                map.put("User-Agent", com.google.android.gms.ads.internal.zzt.f3698C.f3703c.m3231E(context, str));
                try {
                    zzeit zzeitVarMo5874b = zzeiuVar.mo5874b(new zzeis(str3, 30000, map, new byte[0], ""));
                    if (zzeitVarMo5874b.f13989a != 200) {
                        int i2 = zzeitVarMo5874b.f13989a;
                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 32);
                        sb.append("Unexpected preconnect response: ");
                        sb.append(i2);
                        throw new RemoteException(sb.toString());
                    }
                } catch (Exception e) {
                    throw new RemoteException(e.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final void m6227p4(ListenableFuture listenableFuture, zzcbb zzcbbVar, zzcbk zzcbkVar) {
        ListenableFuture listenableFutureM7374h = zzhcf.m7374h(listenableFuture, new zzeii(), zzcfy.f9946a);
        zzeib zzeibVar = new zzeib(this, zzcbkVar, zzcbbVar);
        zzhcp zzhcpVar = zzcfy.f9953h;
        ((zzhay) listenableFutureM7374h).addListener(new zzhcd(listenableFutureM7374h, zzeibVar), zzhcpVar);
    }

    /* JADX INFO: renamed from: q4 */
    public final synchronized zzeil m6228q4(String str) {
        Iterator it = this.f13977w.iterator();
        while (it.hasNext()) {
            zzeil zzeilVar = (zzeil) it.next();
            if (zzeilVar.f13965c.equals(str)) {
                it.remove();
                return zzeilVar;
            }
        }
        return null;
    }
}

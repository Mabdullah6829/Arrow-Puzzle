package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import p001B.C0077c;
import p001B.C0079e;
import p001B.C0092r;
import p001B.C0093s;
import p001B.C0094t;
import p003C.AbstractC0116g;
import p003C.C0112c;
import p003C.C0129t;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzru {

    /* JADX INFO: renamed from: a */
    public final HashMap f22838a;

    /* JADX INFO: renamed from: b */
    public final HashMap f22839b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f22840c;

    public zzru(ArrayList arrayList) {
        List<zztc> list = Collections.EMPTY_LIST;
        this.f22838a = new HashMap();
        this.f22839b = new HashMap();
        this.f22840c = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzsx zzsxVar = (zzsx) it.next();
            if (TextUtils.isEmpty(zzsxVar.zzc())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                zzsx zzsxVar2 = (zzsx) this.f22838a.put(zzsxVar.zzc(), zzsxVar);
                if (zzsxVar2 != null) {
                    String canonicalName = zzsxVar2.getClass().getCanonicalName();
                    String canonicalName2 = zzsxVar.getClass().getCanonicalName();
                    throw new IllegalArgumentException(AbstractC1456a.m2451r(new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length()), "Cannot override Backend ", canonicalName, " with ", canonicalName2));
                }
            }
        }
        for (zztc zztcVar : list) {
            if (TextUtils.isEmpty(zztcVar.zza())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                zztc zztcVar2 = (zztc) this.f22839b.put(zztcVar.zza(), zztcVar);
                if (zztcVar2 != null) {
                    String canonicalName3 = zztcVar2.getClass().getCanonicalName();
                    String canonicalName4 = zztcVar.getClass().getCanonicalName();
                    throw new IllegalArgumentException(AbstractC1456a.m2451r(new StringBuilder(String.valueOf(canonicalName3).length() + 35 + String.valueOf(canonicalName4).length()), "Cannot to override Transform ", canonicalName3, " with ", canonicalName4));
                }
            }
        }
        this.f22840c.addAll(list);
    }

    /* JADX INFO: renamed from: a */
    public final Object m10629a(Uri uri, zzrt zzrtVar) {
        return zzrtVar.mo10531a(m10630b(uri));
    }

    /* JADX INFO: renamed from: b */
    public final zzrs m10630b(Uri uri) throws zzsk {
        List listM193q;
        C0112c c0112cM192n = AbstractC0116g.m192n();
        C0112c c0112cM192n2 = AbstractC0116g.m192n();
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            listM193q = C0129t.f192w;
        } else {
            String strSubstring = encodedFragment.substring(10);
            C0094t c0094t = new C0094t(new C0092r(new C0077c("+".charAt(0)), 0), true, C0079e.f104b, Integer.MAX_VALUE);
            strSubstring.getClass();
            listM193q = AbstractC0116g.m193q(new C0093s(c0094t, strSubstring));
        }
        int size = listM193q.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) listM193q.get(i2);
            Matcher matcher = zzsp.f22868a.matcher(str);
            if (!matcher.matches()) {
                throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
            }
            c0112cM192n2.m185a(matcher.group(1));
        }
        C0129t c0129tM187d = c0112cM192n2.m187d();
        int i3 = c0129tM187d.f194v;
        for (int i4 = 0; i4 < i3; i4++) {
            String str2 = (String) c0129tM187d.get(i4);
            zztc zztcVar = (zztc) this.f22839b.get(str2);
            if (zztcVar == null) {
                String strValueOf = String.valueOf(uri);
                throw new zzsk(AbstractC1456a.m2451r(new StringBuilder(str2.length() + 40 + strValueOf.length()), "Requested transform isn't registered: ", str2, ": ", strValueOf));
            }
            c0112cM192n.m185a(zztcVar);
        }
        AbstractC0116g abstractC0116gMo189t = c0112cM192n.m187d().mo189t();
        zzrr zzrrVar = new zzrr();
        String scheme = uri.getScheme();
        zzsx zzsxVar = (zzsx) this.f22838a.get(scheme);
        if (zzsxVar == null) {
            throw new zzsk(AbstractC0271e0.m398f("Requested backend isn't registered: ", scheme));
        }
        zzrrVar.f22829a = zzsxVar;
        zzrrVar.f22831c = this.f22840c;
        zzrrVar.f22830b = abstractC0116gMo189t;
        zzrrVar.f22832d = uri;
        if (!abstractC0116gMo189t.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str3 = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = abstractC0116gMo189t.listIterator(abstractC0116gMo189t.size());
                while (listIterator.hasPrevious()) {
                }
                arrayList.set(arrayList.size() - 1, str3);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        zzrrVar.f22833e = uri;
        return new zzrs(zzrrVar);
    }
}

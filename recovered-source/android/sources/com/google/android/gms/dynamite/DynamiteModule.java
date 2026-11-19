package com.google.android.gms.dynamite;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import androidx.webkit.internal.AbstractC1804a;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: d */
    public static final VersionPolicy f4719d;

    /* JADX INFO: renamed from: e */
    public static final VersionPolicy f4720e;

    /* JADX INFO: renamed from: f */
    public static Boolean f4721f = null;

    /* JADX INFO: renamed from: g */
    public static String f4722g = null;

    /* JADX INFO: renamed from: h */
    public static boolean f4723h = false;

    /* JADX INFO: renamed from: i */
    public static int f4724i = -1;

    /* JADX INFO: renamed from: j */
    public static Boolean f4725j;

    /* JADX INFO: renamed from: n */
    public static zzp f4729n;

    /* JADX INFO: renamed from: o */
    public static zzq f4730o;

    /* JADX INFO: renamed from: a */
    public final Context f4731a;

    /* JADX INFO: renamed from: k */
    public static final ThreadLocal f4726k = new ThreadLocal();

    /* JADX INFO: renamed from: l */
    public static final ThreadLocal f4727l = new zze();

    /* JADX INFO: renamed from: m */
    public static final VersionPolicy.IVersions f4728m = new zzf();

    /* JADX INFO: renamed from: b */
    public static final VersionPolicy f4717b = new zzg();

    /* JADX INFO: renamed from: c */
    public static final VersionPolicy f4718c = new zzh();

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class LoadingException extends Exception {
    }

    public interface VersionPolicy {

        public interface IVersions {
            /* JADX INFO: renamed from: a */
            int mo3708a(Context context, String str, boolean z);

            /* JADX INFO: renamed from: b */
            int mo3709b(Context context, String str);
        }

        public static class SelectionResult {

            /* JADX INFO: renamed from: a */
            public int f4732a = 0;

            /* JADX INFO: renamed from: b */
            public int f4733b = 0;

            /* JADX INFO: renamed from: c */
            public int f4734c = 0;
        }

        /* JADX INFO: renamed from: a */
        SelectionResult mo3707a(Context context, String str, IVersions iVersions);
    }

    static {
        new zzi();
        f4719d = new zzj();
        f4720e = new zzk();
        new zzl();
        new zzm();
        new zzc();
    }

    public DynamiteModule(Context context) {
        this.f4731a = context;
    }

    /* JADX INFO: renamed from: a */
    public static int m3699a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.m3535a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + str.length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x023c A[Catch: all -> 0x0225, LoadingException -> 0x0228, RemoteException -> 0x022b, TryCatch #10 {RemoteException -> 0x022b, LoadingException -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:101:0x024d A[Catch: all -> 0x0225, LoadingException -> 0x0228, RemoteException -> 0x022b, TryCatch #10 {RemoteException -> 0x022b, LoadingException -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0263 A[Catch: all -> 0x0225, LoadingException -> 0x0228, RemoteException -> 0x022b, TryCatch #10 {RemoteException -> 0x022b, LoadingException -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x026c A[Catch: all -> 0x0225, LoadingException -> 0x0228, RemoteException -> 0x022b, TryCatch #10 {RemoteException -> 0x022b, LoadingException -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0274 A[Catch: all -> 0x0225, LoadingException -> 0x0228, RemoteException -> 0x022b, TryCatch #10 {RemoteException -> 0x022b, LoadingException -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x027e A[Catch: all -> 0x0225, LoadingException -> 0x0228, RemoteException -> 0x022b, TryCatch #10 {RemoteException -> 0x022b, LoadingException -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x028c  */
    /* JADX WARN: Code duplicated, block: B:135:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:136:0x0303  */
    /* JADX WARN: Code duplicated, block: B:139:0x030c  */
    /* JADX WARN: Code duplicated, block: B:144:0x031d A[Catch: all -> 0x00b8, TryCatch #10 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ec, B:119:0x0299, B:120:0x02a3, B:128:0x02b2, B:130:0x02da, B:132:0x02e9, B:142:0x0315, B:143:0x031c, B:123:0x02a6, B:124:0x02a7, B:125:0x02ae, B:144:0x031d, B:145:0x033d, B:146:0x033e, B:147:0x038b), top: B:168:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00c3 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #10 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ec, B:119:0x0299, B:120:0x02a3, B:128:0x02b2, B:130:0x02da, B:132:0x02e9, B:142:0x0315, B:143:0x031c, B:123:0x02a6, B:124:0x02a7, B:125:0x02ae, B:144:0x031d, B:145:0x033d, B:146:0x033e, B:147:0x038b), top: B:168:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:23:0x00db  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f7 A[Catch: all -> 0x0288, TryCatch #3 {all -> 0x0288, blocks: (B:34:0x00f1, B:36:0x00f7, B:37:0x00f9), top: B:161:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00fc A[Catch: all -> 0x0173, LoadingException -> 0x0178, RemoteException -> 0x017d, TRY_ENTER, TryCatch #11 {RemoteException -> 0x017d, LoadingException -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0103 A[Catch: all -> 0x0173, LoadingException -> 0x0178, RemoteException -> 0x017d, TryCatch #11 {RemoteException -> 0x017d, LoadingException -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0138 A[Catch: all -> 0x0173, LoadingException -> 0x0178, RemoteException -> 0x017d, TRY_ENTER, TryCatch #11 {RemoteException -> 0x017d, LoadingException -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01b9 A[Catch: all -> 0x0173, LoadingException -> 0x0178, RemoteException -> 0x017d, TryCatch #11 {RemoteException -> 0x017d, LoadingException -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c4 A[Catch: all -> 0x0173, LoadingException -> 0x0178, RemoteException -> 0x017d, TryCatch #11 {RemoteException -> 0x017d, LoadingException -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01f7 A[Catch: all -> 0x0173, LoadingException -> 0x0178, RemoteException -> 0x017d, TryCatch #11 {RemoteException -> 0x017d, LoadingException -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x020a A[Catch: all -> 0x0173, LoadingException -> 0x0178, RemoteException -> 0x017d, TryCatch #11 {RemoteException -> 0x017d, LoadingException -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0212 A[Catch: all -> 0x0173, LoadingException -> 0x0178, RemoteException -> 0x017d, TRY_LEAVE, TryCatch #11 {RemoteException -> 0x017d, LoadingException -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x022e A[Catch: all -> 0x0225, LoadingException -> 0x0228, RemoteException -> 0x022b, TryCatch #10 {RemoteException -> 0x022b, LoadingException -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0238  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.google.android.gms.dynamite.DynamiteModule$VersionPolicy] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX INFO: renamed from: c */
    public static DynamiteModule m3700c(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        ?? r7;
        int i2;
        DynamiteModule dynamiteModule;
        Cursor cursor;
        int i3;
        ?? r8;
        Boolean bool;
        zzp zzpVarM3705h;
        int i4;
        IObjectWrapper iObjectWrapperM3712u0;
        Object objM3697u0;
        zzn zznVar;
        zzq zzqVar;
        zzn zznVar2;
        boolean z;
        IObjectWrapper iObjectWrapperM3714u0;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new LoadingException("null application Context");
        }
        ThreadLocal threadLocal = f4726k;
        zzn zznVar3 = (zzn) threadLocal.get();
        zzn zznVar4 = new zzn();
        threadLocal.set(zznVar4);
        ThreadLocal threadLocal2 = f4727l;
        Long l2 = (Long) threadLocal2.get();
        long jLongValue = l2.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            VersionPolicy.SelectionResult selectionResultMo3707a = versionPolicy.mo3707a(context, str, f4728m);
            int i5 = selectionResultMo3707a.f4732a;
            int i6 = selectionResultMo3707a.f4733b;
            StringBuilder sb = new StringBuilder(str.length() + 26 + String.valueOf(i5).length() + 19 + str.length() + 1 + String.valueOf(i6).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i5);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i6);
            Log.i("DynamiteModule", sb.toString());
            int i7 = selectionResultMo3707a.f4734c;
            if (i7 != 0) {
                if (i7 != -1) {
                    if (i7 == 1 || selectionResultMo3707a.f4733b != 0) {
                        if (i7 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            DynamiteModule dynamiteModule2 = new DynamiteModule(applicationContext);
                            if (jLongValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(l2);
                            }
                            cursor2 = zznVar4.f4737a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(zznVar3);
                            return dynamiteModule2;
                        }
                        if (i7 == 1) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 36);
                            sb2.append("VersionPolicy returned invalid code:");
                            sb2.append(i7);
                            throw new LoadingException(sb2.toString());
                        }
                        try {
                            try {
                                i3 = selectionResultMo3707a.f4733b;
                                try {
                                    try {
                                        try {
                                            synchronized (DynamiteModule.class) {
                                                try {
                                                    if (m3702e(context)) {
                                                        throw new LoadingException("Remote loading disabled");
                                                    }
                                                    bool = f4721f;
                                                    if (bool != null) {
                                                        throw new LoadingException("Failed to determine which loading route to use.");
                                                    }
                                                    if (bool.booleanValue()) {
                                                        StringBuilder sb3 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                                                        sb3.append("Selected remote version of ");
                                                        sb3.append(str);
                                                        sb3.append(", version >= ");
                                                        sb3.append(i3);
                                                        Log.i("DynamiteModule", sb3.toString());
                                                        synchronized (DynamiteModule.class) {
                                                            zzqVar = f4730o;
                                                        }
                                                        if (zzqVar != null) {
                                                            throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                                        }
                                                        zznVar2 = (zzn) threadLocal.get();
                                                        if (zznVar2 != null || zznVar2.f4737a == null) {
                                                            throw new LoadingException("No result cursor");
                                                        }
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor3 = zznVar2.f4737a;
                                                        new ObjectWrapper(null);
                                                        synchronized (DynamiteModule.class) {
                                                            z = f4724i >= 2;
                                                        }
                                                        if (z) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            iObjectWrapperM3714u0 = zzqVar.m3715x0(new ObjectWrapper(applicationContext2), str, i3, new ObjectWrapper(cursor3));
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            iObjectWrapperM3714u0 = zzqVar.m3714u0(new ObjectWrapper(applicationContext2), str, i3, new ObjectWrapper(cursor3));
                                                        }
                                                        Context context2 = (Context) ObjectWrapper.m3697u0(iObjectWrapperM3714u0);
                                                        if (context2 == null) {
                                                            throw new LoadingException("Failed to get module context");
                                                        }
                                                        dynamiteModule = new DynamiteModule(context2);
                                                    } else {
                                                        StringBuilder sb4 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                                                        sb4.append("Selected remote version of ");
                                                        sb4.append(str);
                                                        sb4.append(", version >= ");
                                                        sb4.append(i3);
                                                        Log.i("DynamiteModule", sb4.toString());
                                                        zzpVarM3705h = m3705h(context);
                                                        if (zzpVarM3705h != null) {
                                                            throw new LoadingException("Failed to create IDynamiteLoader.");
                                                        }
                                                        Parcel parcelM9085u = zzpVarM3705h.m9085u(6, zzpVarM3705h.m9084k0());
                                                        i4 = parcelM9085u.readInt();
                                                        parcelM9085u.recycle();
                                                        if (i4 >= 3) {
                                                            zznVar = (zzn) threadLocal.get();
                                                            if (zznVar != null) {
                                                                throw new LoadingException("No cached result cursor holder");
                                                            }
                                                            iObjectWrapperM3712u0 = zzpVarM3705h.m3711D0(new ObjectWrapper(context), str, i3, new ObjectWrapper(zznVar.f4737a));
                                                        } else if (i4 == 2) {
                                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                            iObjectWrapperM3712u0 = zzpVarM3705h.m3713x0(new ObjectWrapper(context), str, i3);
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                            iObjectWrapperM3712u0 = zzpVarM3705h.m3712u0(new ObjectWrapper(context), str, i3);
                                                        }
                                                        objM3697u0 = ObjectWrapper.m3697u0(iObjectWrapperM3712u0);
                                                        if (objM3697u0 != null) {
                                                            throw new LoadingException("Failed to load remote module.");
                                                        }
                                                        dynamiteModule = new DynamiteModule((Context) objM3697u0);
                                                    }
                                                    if (jLongValue == 0) {
                                                        f4727l.remove();
                                                    } else {
                                                        f4727l.set(l2);
                                                    }
                                                    cursor = zznVar4.f4737a;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    f4726k.set(zznVar3);
                                                    return dynamiteModule;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (RemoteException e) {
                                        e = e;
                                        throw new LoadingException("Failed to load remote module.", e);
                                    } catch (LoadingException e2) {
                                        throw e2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r8 = context;
                                        CrashUtils.m3642a(r8, th);
                                        throw new LoadingException("Failed to load remote module.", th);
                                    }
                                } catch (RemoteException e3) {
                                    e = e3;
                                    throw new LoadingException("Failed to load remote module.", e);
                                } catch (LoadingException e4) {
                                    throw e4;
                                } catch (Throwable th4) {
                                    th = th4;
                                    r8 = threadLocal2;
                                    CrashUtils.m3642a(r8, th);
                                    throw new LoadingException("Failed to load remote module.", th);
                                }
                            } catch (LoadingException e5) {
                                e = e5;
                                r7 = context;
                                String message = e.getMessage();
                                StringBuilder sb5 = new StringBuilder(String.valueOf(message).length() + 30);
                                sb5.append("Failed to load remote module: ");
                                sb5.append(message);
                                Log.w("DynamiteModule", sb5.toString());
                                i2 = selectionResultMo3707a.f4732a;
                                if (i2 != 0 || versionPolicy.mo3707a(r7, str, new zzo(i2)).f4734c != -1) {
                                    throw new LoadingException("Remote load failed. No local fallback found.", e);
                                }
                                Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                dynamiteModule = new DynamiteModule(applicationContext);
                            }
                        } catch (LoadingException e6) {
                            e = e6;
                            r7 = threadLocal2;
                            String message2 = e.getMessage();
                            StringBuilder sb6 = new StringBuilder(String.valueOf(message2).length() + 30);
                            sb6.append("Failed to load remote module: ");
                            sb6.append(message2);
                            Log.w("DynamiteModule", sb6.toString());
                            i2 = selectionResultMo3707a.f4732a;
                            if (i2 != 0) {
                            }
                            throw new LoadingException("Remote load failed. No local fallback found.", e);
                        }
                    }
                } else if (selectionResultMo3707a.f4732a != 0) {
                    i7 = -1;
                    if (i7 == 1) {
                    }
                    if (i7 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        DynamiteModule dynamiteModule3 = new DynamiteModule(applicationContext);
                        if (jLongValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(l2);
                        }
                        cursor2 = zznVar4.f4737a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(zznVar3);
                        return dynamiteModule3;
                    }
                    if (i7 == 1) {
                        StringBuilder sb7 = new StringBuilder(String.valueOf(i7).length() + 36);
                        sb7.append("VersionPolicy returned invalid code:");
                        sb7.append(i7);
                        throw new LoadingException(sb7.toString());
                    }
                    i3 = selectionResultMo3707a.f4733b;
                    synchronized (DynamiteModule.class) {
                        if (m3702e(context)) {
                            throw new LoadingException("Remote loading disabled");
                        }
                        bool = f4721f;
                        if (bool != null) {
                            throw new LoadingException("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb8 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                            sb8.append("Selected remote version of ");
                            sb8.append(str);
                            sb8.append(", version >= ");
                            sb8.append(i3);
                            Log.i("DynamiteModule", sb8.toString());
                            synchronized (DynamiteModule.class) {
                                zzqVar = f4730o;
                                if (zzqVar != null) {
                                    throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                }
                                zznVar2 = (zzn) threadLocal.get();
                                if (zznVar2 != null) {
                                }
                                throw new LoadingException("No result cursor");
                            }
                        }
                        StringBuilder sb9 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                        sb9.append("Selected remote version of ");
                        sb9.append(str);
                        sb9.append(", version >= ");
                        sb9.append(i3);
                        Log.i("DynamiteModule", sb9.toString());
                        zzpVarM3705h = m3705h(context);
                        if (zzpVarM3705h != null) {
                            throw new LoadingException("Failed to create IDynamiteLoader.");
                        }
                        Parcel parcelM9085u2 = zzpVarM3705h.m9085u(6, zzpVarM3705h.m9084k0());
                        i4 = parcelM9085u2.readInt();
                        parcelM9085u2.recycle();
                        if (i4 >= 3) {
                            zznVar = (zzn) threadLocal.get();
                            if (zznVar != null) {
                                throw new LoadingException("No cached result cursor holder");
                            }
                            iObjectWrapperM3712u0 = zzpVarM3705h.m3711D0(new ObjectWrapper(context), str, i3, new ObjectWrapper(zznVar.f4737a));
                        } else if (i4 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            iObjectWrapperM3712u0 = zzpVarM3705h.m3713x0(new ObjectWrapper(context), str, i3);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            iObjectWrapperM3712u0 = zzpVarM3705h.m3712u0(new ObjectWrapper(context), str, i3);
                        }
                        objM3697u0 = ObjectWrapper.m3697u0(iObjectWrapperM3712u0);
                        if (objM3697u0 != null) {
                            throw new LoadingException("Failed to load remote module.");
                        }
                        dynamiteModule = new DynamiteModule((Context) objM3697u0);
                        if (jLongValue == 0) {
                            f4727l.remove();
                        } else {
                            f4727l.set(l2);
                        }
                        cursor = zznVar4.f4737a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f4726k.set(zznVar3);
                        return dynamiteModule;
                    }
                }
            }
            int i8 = selectionResultMo3707a.f4732a;
            int i9 = selectionResultMo3707a.f4733b;
            StringBuilder sb10 = new StringBuilder(str.length() + 46 + String.valueOf(i8).length() + 23 + String.valueOf(i9).length() + 1);
            sb10.append("No acceptable module ");
            sb10.append(str);
            sb10.append(" found. Local version is ");
            sb10.append(i8);
            sb10.append(" and remote version is ");
            sb10.append(i9);
            sb10.append(".");
            throw new LoadingException(sb10.toString());
        } catch (Throwable th5) {
            if (jLongValue == 0) {
                f4727l.remove();
            } else {
                f4727l.set(l2);
            }
            Cursor cursor4 = zznVar4.f4737a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f4726k.set(zznVar3);
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3 A[Catch: all -> 0x003b, TryCatch #11 {all -> 0x003b, blocks: (B:10:0x002b, B:12:0x0037, B:52:0x00bc, B:17:0x0040, B:19:0x0047, B:21:0x004d, B:26:0x0053, B:28:0x0057, B:31:0x0060, B:33:0x0068, B:36:0x006f, B:43:0x009b, B:44:0x00a3, B:39:0x0076, B:41:0x007c, B:42:0x008d, B:47:0x00a6, B:50:0x00a9, B:51:0x00b3, B:18:0x0043), top: B:144:0x002b, inners: #12 }] */
    /* JADX INFO: renamed from: d */
    public static int m3701d(Context context, String str, boolean z) {
        Throwable th;
        RemoteException e;
        int i2;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f4721f;
                boolean z2 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        m3704g(classLoader);
                                    } catch (LoadingException unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!m3702e(context)) {
                                        return 0;
                                    }
                                    if (f4723h) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iM3703f = m3703f(context, str, z, true);
                                                String str2 = f4722g;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderM3710a = zzb.m3710a();
                                                    if (classLoaderM3710a == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            AbstractC1804a.m2705e();
                                                            String str3 = f4722g;
                                                            Preconditions.m3544h(str3);
                                                            classLoaderM3710a = AbstractC1804a.m2703c(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = f4722g;
                                                            Preconditions.m3544h(str4);
                                                            classLoaderM3710a = new zzd(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    m3704g(classLoaderM3710a);
                                                    declaredField.set(null, classLoaderM3710a);
                                                    f4721f = bool2;
                                                    return iM3703f;
                                                }
                                                return iM3703f;
                                            } catch (LoadingException unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f4721f = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String string = e2.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(string);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return m3703f(context, str, z, false);
                    } catch (LoadingException e3) {
                        String message = e3.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        Log.w("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                zzp zzpVarM3705h = m3705h(context);
                try {
                    if (zzpVarM3705h == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelM9085u = zzpVarM3705h.m9085u(6, zzpVarM3705h.m9084k0());
                        int i3 = parcelM9085u.readInt();
                        parcelM9085u.recycle();
                        if (i3 >= 3) {
                            ThreadLocal threadLocal = f4726k;
                            zzn zznVar = (zzn) threadLocal.get();
                            if (zznVar != null && (cursor = zznVar.f4737a) != null) {
                                return cursor.getInt(0);
                            }
                            ObjectWrapper objectWrapper = new ObjectWrapper(context);
                            long jLongValue = ((Long) f4727l.get()).longValue();
                            Parcel parcelM9084k0 = zzpVarM3705h.m9084k0();
                            com.google.android.gms.internal.common.zzc.m9104b(parcelM9084k0, objectWrapper);
                            parcelM9084k0.writeString(str);
                            parcelM9084k0.writeInt(z ? 1 : 0);
                            parcelM9084k0.writeLong(jLongValue);
                            Cursor cursor3 = (Cursor) ObjectWrapper.m3697u0(AbstractC1456a.m2439f(zzpVarM3705h.m9085u(7, parcelM9084k0)));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i2 = cursor3.getInt(0);
                                        if (i2 > 0) {
                                            zzn zznVar2 = (zzn) threadLocal.get();
                                            if (zznVar2 == null || zznVar2.f4737a != null) {
                                                z2 = false;
                                            } else {
                                                zznVar2.f4737a = cursor3;
                                            }
                                            cursor2 = z2 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e4) {
                                    e = e4;
                                    cursor2 = cursor3;
                                    String message2 = e.getMessage();
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
                                    sb3.append("Failed to retrieve remote module version: ");
                                    sb3.append(message2);
                                    Log.w("DynamiteModule", sb3.toString());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i3 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            ObjectWrapper objectWrapper2 = new ObjectWrapper(context);
                            Parcel parcelM9084k1 = zzpVarM3705h.m9084k0();
                            com.google.android.gms.internal.common.zzc.m9104b(parcelM9084k1, objectWrapper2);
                            parcelM9084k1.writeString(str);
                            parcelM9084k1.writeInt(z ? 1 : 0);
                            Parcel parcelM9085u2 = zzpVarM3705h.m9085u(5, parcelM9084k1);
                            i2 = parcelM9085u2.readInt();
                            parcelM9085u2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            ObjectWrapper objectWrapper3 = new ObjectWrapper(context);
                            Parcel parcelM9084k2 = zzpVarM3705h.m9084k0();
                            com.google.android.gms.internal.common.zzc.m9104b(parcelM9084k2, objectWrapper3);
                            parcelM9084k2.writeString(str);
                            parcelM9084k2.writeInt(z ? 1 : 0);
                            Parcel parcelM9085u3 = zzpVarM3705h.m9085u(3, parcelM9084k2);
                            i2 = parcelM9085u3.readInt();
                            parcelM9085u3.recycle();
                        }
                        return i2;
                    } catch (RemoteException e5) {
                        e = e5;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            CrashUtils.m3642a(context, th5);
            throw th5;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3702e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f4725j)) {
            return true;
        }
        boolean z = false;
        if (f4725j == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (GoogleApiAvailabilityLight.f4157b.m3403c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            f4725j = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f4723h = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x013a A[PHI: r3
  0x013a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: f */
    public static int m3703f(Context context, String str, boolean z, boolean z2) throws Throwable {
        Exception exc;
        Throwable th;
        MatrixCursor matrixCursor;
        boolean z3;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri uriBuild = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f4727l.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z5 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i2 = 0; i2 < count; i2++) {
                                    if (!cursorQuery.moveToPosition(i2)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i3 = 0; i3 < columnCount; i3++) {
                                        int type = cursorQuery.getType(i3);
                                        if (type == 0) {
                                            objArr[i3] = null;
                                        } else if (type == 1) {
                                            objArr[i3] = Long.valueOf(cursorQuery.getLong(i3));
                                        } else if (type == 2) {
                                            objArr[i3] = Double.valueOf(cursorQuery.getDouble(i3));
                                        } else if (type == 3) {
                                            objArr[i3] = cursorQuery.getString(i3);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i3] = cursorQuery.getBlob(i3);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i4 = matrixCursor.getInt(0);
                            if (i4 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        f4722g = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f4724i = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = matrixCursor.getInt(columnIndex2) != 0;
                                            f4723h = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                zzn zznVar = (zzn) f4726k.get();
                                if (zznVar == null || zznVar.f4737a != null) {
                                    z4 = false;
                                } else {
                                    zznVar.f4737a = matrixCursor;
                                }
                                z5 = z3;
                                matrixCursor2 = z4 ? null : matrixCursor;
                            }
                            if (z2 && z5) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i4;
                        }
                    } catch (Exception e) {
                        exc = e;
                        if (exc instanceof LoadingException) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                        sb.append("V2 version check failed: ");
                        sb.append(message);
                        throw new LoadingException(sb.toString(), exc);
                    } catch (Throwable th6) {
                        th = th6;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e2) {
            exc = e2;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m3704g(ClassLoader classLoader) throws LoadingException {
        try {
            zzq zzqVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            f4730o = zzqVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static zzp m3705h(Context context) {
        zzp zzpVar;
        synchronized (DynamiteModule.class) {
            zzp zzpVar2 = f4729n;
            if (zzpVar2 != null) {
                return zzpVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzpVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzpVar = iInterfaceQueryLocalInterface instanceof zzp ? (zzp) iInterfaceQueryLocalInterface : new zzp(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (zzpVar != null) {
                    f4729n = zzpVar;
                    return zzpVar;
                }
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final IBinder m3706b(String str) throws LoadingException {
        try {
            return (IBinder) this.f4731a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(str), e);
        }
    }
}

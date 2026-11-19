package androidx.datastore.preferences.protobuf;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Parcel;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.consent_sdk.zzpv;
import com.google.android.gms.internal.measurement.zzada;
import com.google.android.gms.internal.measurement.zzaef;
import com.google.android.gms.measurement.internal.zzic;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.proto.AtProtobuf;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1456a {
    /* JADX INFO: renamed from: a */
    public static int m2434a(int i2, int i3) {
        return String.valueOf(i2).length() + i3;
    }

    /* JADX INFO: renamed from: b */
    public static int m2435b(int i2, int i3, int i4) {
        return zzpv.m9184c(i2) + i3 + i4;
    }

    /* JADX INFO: renamed from: c */
    public static int m2436c(int i2, int i3, int i4, int i5) {
        return ((i2 * i3) / i4) + i5;
    }

    /* JADX INFO: renamed from: d */
    public static int m2437d(int i2, int i3, int i4, int i5, int i6) {
        return i2 + i3 + i4 + i5 + i6;
    }

    /* JADX INFO: renamed from: e */
    public static int m2438e(int i2, int i3, String str) {
        return str.length() + i2 + i3;
    }

    /* JADX INFO: renamed from: f */
    public static IObjectWrapper m2439f(Parcel parcel) {
        IObjectWrapper iObjectWrapperM3696k0 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
        parcel.recycle();
        return iObjectWrapperM3696k0;
    }

    /* JADX INFO: renamed from: g */
    public static IObjectWrapper m2440g(Parcel parcel, Parcel parcel2) {
        IObjectWrapper iObjectWrapperM3696k0 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
        zzben.m4818f(parcel2);
        return iObjectWrapperM3696k0;
    }

    /* JADX INFO: renamed from: h */
    public static zzaef m2441h(zzaef zzaefVar) {
        int size = zzaefVar.size();
        return zzaefVar.mo9370p(size + size);
    }

    /* JADX INFO: renamed from: i */
    public static FieldDescriptor m2442i(int i2, FieldDescriptor.Builder builder) {
        return builder.withProperty(AtProtobuf.builder().tag(i2).build()).build();
    }

    /* JADX INFO: renamed from: j */
    public static String m2443j(int i2, int i3, String str, String str2) {
        return str + i2 + str2 + i3;
    }

    /* JADX INFO: renamed from: k */
    public static String m2444k(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    /* JADX INFO: renamed from: l */
    public static String m2445l(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    /* JADX INFO: renamed from: m */
    public static String m2446m(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    /* JADX INFO: renamed from: n */
    public static String m2447n(StringBuilder sb, String str, int i2) {
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: o */
    public static String m2448o(StringBuilder sb, String str, int i2, String str2) {
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public static String m2449p(StringBuilder sb, String str, int i2, String str2, int i3) {
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: q */
    public static String m2450q(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: r */
    public static String m2451r(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    /* JADX INFO: renamed from: s */
    public static void m2452s(zzic zzicVar, String str) {
        zzicVar.zzaW().zzb().zza(str);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m2453t(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m2454u(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m2455v(StringBuilder sb, String str, int i2, String str2, int i3) {
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i3);
    }

    /* JADX INFO: renamed from: w */
    public static void m2456w(StringBuilder sb, String str, long j2, String str2) {
        sb.append(str);
        sb.append(j2);
        sb.append(str2);
    }

    /* JADX INFO: renamed from: x */
    public static int m2457x(int i2, int i3, int i4) {
        return zzada.m9510b(i2) + i3 + i4;
    }

    /* JADX INFO: renamed from: y */
    public static int m2458y(int i2, int i3, int i4, int i5) {
        return zzada.m9510b(i2) + i3 + i4 + i5;
    }

    /* JADX INFO: renamed from: z */
    public static void m2459z(zzic zzicVar, String str) {
        zzicVar.zzaW().zze().zza(str);
    }
}

package p065i;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import p011H.AbstractC0242F;
import p011H.AbstractC0271e0;
import p049b0.C1887c;
import p067j.C6403l;
import p067j.EnumC6388I;
import p067j.EnumC6389J;
import p069k.C6428i;
import p069k.C6429j;
import p072l.InterfaceC6472g;

/* JADX INFO: renamed from: i.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6370c implements InterfaceC6472g {

    /* JADX INFO: renamed from: b */
    public final ConnectivityManager f24437b;

    /* JADX INFO: renamed from: c */
    public final Context f24438c;

    /* JADX INFO: renamed from: e */
    public final C1887c f24440e;

    /* JADX INFO: renamed from: f */
    public final C1887c f24441f;

    /* JADX INFO: renamed from: a */
    public final DataEncoder f24436a = new JsonDataEncoderBuilder().configureWith(C6403l.f24507s).ignoreNullValues(true).build();

    /* JADX INFO: renamed from: d */
    public final URL f24439d = m12156b(C6368a.f24427c);

    /* JADX INFO: renamed from: g */
    public final int f24442g = 130000;

    public C6370c(Context context, C1887c c1887c, C1887c c1887c2) {
        this.f24438c = context;
        this.f24437b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f24440e = c1887c2;
        this.f24441f = c1887c;
    }

    /* JADX INFO: renamed from: b */
    public static URL m12156b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(AbstractC0271e0.m398f("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:26:0x00db  */
    /* JADX WARN: Code duplicated, block: B:34:0x0107  */
    /* JADX INFO: renamed from: a */
    public final C6429j m12157a(C6429j c6429j) {
        int type;
        int subtype;
        HashMap map;
        String simOperator;
        NetworkInfo activeNetworkInfo = this.f24437b.getActiveNetworkInfo();
        C6428i c6428iM12168c = c6429j.m12168c();
        int i2 = Build.VERSION.SDK_INT;
        HashMap map2 = c6428iM12168c.f24583f;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i2));
        c6428iM12168c.m12164a("model", Build.MODEL);
        c6428iM12168c.m12164a("hardware", Build.HARDWARE);
        c6428iM12168c.m12164a("device", Build.DEVICE);
        c6428iM12168c.m12164a("product", Build.PRODUCT);
        c6428iM12168c.m12164a("os-uild", Build.ID);
        c6428iM12168c.m12164a("manufacturer", Build.MANUFACTURER);
        c6428iM12168c.m12164a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = c6428iM12168c.f24583f;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i3 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = EnumC6389J.f24454s;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = c6428iM12168c.f24583f;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = EnumC6388I.f24452s;
                subtype = 100;
            } else if (((EnumC6388I) EnumC6388I.f24452s.get(subtype)) == null) {
            }
            map = c6428iM12168c.f24583f;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            c6428iM12168c.m12164a("country", Locale.getDefault().getCountry());
            c6428iM12168c.m12164a("locale", Locale.getDefault().getLanguage());
            Context context = this.f24438c;
            simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            c6428iM12168c.m12164a("mcc_mnc", simOperator);
            try {
                i3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                AbstractC0242F.m351h("CctTransportBackend", "Unable to find version code for package", e);
            }
            c6428iM12168c.m12164a("application_build", Integer.toString(i3));
            return c6428iM12168c.m12165b();
        }
        SparseArray sparseArray3 = EnumC6388I.f24452s;
        subtype = 0;
        map = c6428iM12168c.f24583f;
        if (map != null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        c6428iM12168c.m12164a("country", Locale.getDefault().getCountry());
        c6428iM12168c.m12164a("locale", Locale.getDefault().getLanguage());
        Context context2 = this.f24438c;
        simOperator = ((TelephonyManager) context2.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        c6428iM12168c.m12164a("mcc_mnc", simOperator);
        i3 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        c6428iM12168c.m12164a("application_build", Integer.toString(i3));
        return c6428iM12168c.m12165b();
    }
}

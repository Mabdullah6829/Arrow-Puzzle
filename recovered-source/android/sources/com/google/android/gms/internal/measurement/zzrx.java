package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import p001B.C0084j;
import p003C.C0129t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrx extends zzsy {

    /* JADX INFO: renamed from: a */
    public final Context f22843a;

    /* JADX INFO: renamed from: d */
    public String f22846d;

    /* JADX INFO: renamed from: c */
    public final Object f22845c = new Object();

    /* JADX INFO: renamed from: b */
    public final zzsd f22844b = new zzsd();

    public zzrx(zzrw zzrwVar) {
        this.f22843a = zzrwVar.f22842a;
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    /* JADX INFO: renamed from: a */
    public final InputStream mo10631a(Uri uri) throws zzsg, zzsi {
        if (m10636i(uri)) {
            throw new zzsg("Android backend cannot perform remote operations without a remote backend");
        }
        File fileM10641a = zzsc.m10641a(mo10635h(uri));
        return new zzsl(new FileInputStream(fileM10641a), fileM10641a);
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    /* JADX INFO: renamed from: b */
    public final boolean mo10632b(Uri uri) throws zzsg {
        if (m10636i(uri)) {
            throw new zzsg("Android backend cannot perform remote operations without a remote backend");
        }
        return zzsc.m10641a(mo10635h(uri)).exists();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    @Override // com.google.android.gms.internal.measurement.zzsx
    /* JADX INFO: renamed from: c */
    public final File mo10633c(Uri uri) throws IOException {
        byte b;
        File filesDir;
        String str;
        Account account;
        if (m10636i(uri)) {
            throw new IOException("operation is not permitted in other authorities.");
        }
        Context context = this.f22843a;
        if (!uri.getScheme().equals("android")) {
            throw new zzsi("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new zzsi("Did not expect uri to have query");
        }
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        switch ((String) arrayList.get(0)) {
            case "external":
                b = 5;
                break;
            case "cache":
                b = 3;
                break;
            case "files":
                b = 2;
                break;
            case "managed":
                b = 4;
                break;
            case "directboot-cache":
                b = 1;
                break;
            case "directboot-files":
                b = 0;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            filesDir = context.createDeviceProtectedStorageContext().getFilesDir();
        } else if (b == 1) {
            filesDir = context.createDeviceProtectedStorageContext().getCacheDir();
        } else if (b == 2) {
            filesDir = zzry.m10637a(context);
        } else if (b == 3) {
            filesDir = context.getCacheDir();
        } else if (b == 4) {
            File file = new File(zzry.m10637a(context), "managed");
            if (arrayList.size() >= 3) {
                try {
                    String str2 = (String) arrayList.get(2);
                    Account account2 = zzrv.f22841a;
                    if ("shared".equals(str2)) {
                        account = zzrv.f22841a;
                    } else {
                        int iIndexOf = str2.indexOf(58);
                        zzsq.m10645a(iIndexOf >= 0, "Malformed account", new Object[0]);
                        account = new Account(str2.substring(iIndexOf + 1), str2.substring(0, iIndexOf));
                    }
                    if (!zzrv.f22841a.equals(account)) {
                        throw new zzsi("AccountManager cannot be null");
                    }
                } catch (IllegalArgumentException e) {
                    throw new zzsi(e);
                }
            }
            filesDir = file;
        } else {
            if (b != 5) {
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
            }
            filesDir = context.getExternalFilesDir(null);
        }
        File file2 = new File(filesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
        if (!zzky.m10464b(context)) {
            synchronized (this.f22845c) {
                try {
                    if (this.f22846d == null) {
                        this.f22846d = zzry.m10637a(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                    }
                    str = this.f22846d;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!file2.getAbsolutePath().startsWith(str)) {
                throw new zzsg("Cannot access credential-protected data from direct boot");
            }
        }
        return file2;
    }

    @Override // com.google.android.gms.internal.measurement.zzsy
    /* JADX INFO: renamed from: g */
    public final zzsd mo10634g() {
        return this.f22844b;
    }

    @Override // com.google.android.gms.internal.measurement.zzsy
    /* JADX INFO: renamed from: h */
    public final Uri mo10635h(Uri uri) throws IOException {
        String strConcat;
        if (m10636i(uri)) {
            throw new zzsi("Operation across authorities is not allowed.");
        }
        File fileMo10633c = mo10633c(uri);
        zzsb zzsbVar = new zzsb(0);
        String absolutePath = fileMo10633c.getAbsolutePath();
        Uri.Builder builder = zzsbVar.f22860a;
        builder.path(absolutePath);
        C0129t c0129tM187d = zzsbVar.f22861b.m187d();
        Pattern pattern = zzsp.f22868a;
        if (c0129tM187d.isEmpty()) {
            strConcat = null;
        } else {
            C0084j c0084j = new C0084j("+");
            Iterator it = c0129tM187d.iterator();
            StringBuilder sb = new StringBuilder();
            c0084j.m146a(sb, it);
            strConcat = "transform=".concat(String.valueOf(sb.toString()));
        }
        return builder.encodedFragment(strConcat).build();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m10636i(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.f22843a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final String zzc() {
        return "android";
    }
}

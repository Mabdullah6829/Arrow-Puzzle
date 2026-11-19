package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class BuildCompat {
    public static final int AD_SERVICES_EXTENSION_INT;
    public static final BuildCompat INSTANCE = new BuildCompat();
    public static final int R_EXTENSION_INT;
    public static final int S_EXTENSION_INT;
    public static final int T_EXTENSION_INT;

    public static final class Api30Impl {
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        public final int getExtensionVersion(int i2) {
            return SdkExtensions.getExtensionVersion(i2);
        }
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface PrereleaseSdkCheck {
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        R_EXTENSION_INT = i2 >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(30) : 0;
        S_EXTENSION_INT = i2 >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(31) : 0;
        T_EXTENSION_INT = i2 >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(33) : 0;
        AD_SERVICES_EXTENSION_INT = i2 >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(1000000) : 0;
    }

    private BuildCompat() {
    }

    public static final boolean isAtLeastB() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 36) {
            return true;
        }
        if (i2 < 35) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        AbstractC6452k.m12180d(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("Baklava", CODENAME);
    }

    public static final boolean isAtLeastN() {
        return true;
    }

    public static final boolean isAtLeastNMR1() {
        return Build.VERSION.SDK_INT >= 25;
    }

    public static final boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static final boolean isAtLeastOMR1() {
        return Build.VERSION.SDK_INT >= 27;
    }

    public static final boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static final boolean isAtLeastPreReleaseCodename(String codename, String buildCodename) {
        AbstractC6452k.m12181e(codename, "codename");
        AbstractC6452k.m12181e(buildCodename, "buildCodename");
        if ("REL".equals(buildCodename)) {
            return false;
        }
        Integer numIsAtLeastPreReleaseCodename$codenameToInt = isAtLeastPreReleaseCodename$codenameToInt(buildCodename);
        Integer numIsAtLeastPreReleaseCodename$codenameToInt2 = isAtLeastPreReleaseCodename$codenameToInt(codename);
        if (numIsAtLeastPreReleaseCodename$codenameToInt != null && numIsAtLeastPreReleaseCodename$codenameToInt2 != null) {
            return numIsAtLeastPreReleaseCodename$codenameToInt.intValue() >= numIsAtLeastPreReleaseCodename$codenameToInt2.intValue();
        }
        if (numIsAtLeastPreReleaseCodename$codenameToInt != null || numIsAtLeastPreReleaseCodename$codenameToInt2 != null) {
            return numIsAtLeastPreReleaseCodename$codenameToInt != null;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        AbstractC6452k.m12180d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        AbstractC6452k.m12180d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    private static final Integer isAtLeastPreReleaseCodename$codenameToInt(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        AbstractC6452k.m12180d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.equals("BAKLAVA") ? 0 : null;
    }

    public static final boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static final boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static final boolean isAtLeastS() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            return true;
        }
        if (i2 < 30) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        AbstractC6452k.m12180d(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("S", CODENAME);
    }

    public static final boolean isAtLeastSv2() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 32) {
            return true;
        }
        if (i2 < 31) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        AbstractC6452k.m12180d(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("Sv2", CODENAME);
    }

    public static final boolean isAtLeastT() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            return true;
        }
        if (i2 < 32) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        AbstractC6452k.m12180d(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("Tiramisu", CODENAME);
    }

    public static final boolean isAtLeastU() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            return true;
        }
        if (i2 < 33) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        AbstractC6452k.m12180d(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("UpsideDownCake", CODENAME);
    }

    public static final boolean isAtLeastV() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            return true;
        }
        if (i2 < 34) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        AbstractC6452k.m12180d(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("VanillaIceCream", CODENAME);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfmi {
    /* JADX INFO: renamed from: a */
    public static com.google.android.gms.ads.internal.client.zze m6532a(Throwable th) {
        if (th instanceof zzeme) {
            zzeme zzemeVar = (zzeme) th;
            return m6534c(zzemeVar.f13751s, zzemeVar.f14194t);
        }
        if (th instanceof zzeel) {
            return th.getMessage() == null ? m6535d(((zzeel) th).f13751s, null, null) : m6535d(((zzeel) th).f13751s, th.getMessage(), null);
        }
        if (!(th instanceof com.google.android.gms.ads.internal.util.zzaz)) {
            return m6535d(1, null, null);
        }
        com.google.android.gms.ads.internal.util.zzaz zzazVar = (com.google.android.gms.ads.internal.util.zzaz) th;
        int i2 = zzazVar.f3508s;
        String message = zzazVar.getMessage();
        if (message == null) {
            message = "";
        }
        return new com.google.android.gms.ads.internal.client.zze(i2, message, "com.google.android.gms.ads", null, null);
    }

    /* JADX INFO: renamed from: b */
    public static com.google.android.gms.ads.internal.client.zze m6533b(Throwable th, zzemf zzemfVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        com.google.android.gms.ads.internal.client.zze zzeVarM6532a = m6532a(th);
        int i2 = zzeVarM6532a.f3106s;
        if ((i2 == 3 || i2 == 0) && (zzeVar = zzeVarM6532a.f3109v) != null && !zzeVar.f3108u.equals("com.google.android.gms.ads")) {
            zzeVarM6532a.f3109v = null;
        }
        if (zzemfVar != null) {
            zzeVarM6532a.f3110w = new zzdcs(zzemfVar.f14199e, "", zzemfVar, zzemfVar.f14198d, zzemfVar.f14197c);
        }
        return zzeVarM6532a;
    }

    /* JADX INFO: renamed from: c */
    public static com.google.android.gms.ads.internal.client.zze m6534c(int i2, com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (i2 == 0) {
            throw null;
        }
        if (i2 == 8) {
            if (((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8802v9)).intValue() > 0) {
                return zzeVar;
            }
            i2 = 8;
        }
        return m6535d(i2, null, zzeVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    /* JADX INFO: renamed from: d */
    public static com.google.android.gms.ads.internal.client.zze m6535d(int i2, String str, com.google.android.gms.ads.internal.client.zze zzeVar) {
        String str2;
        int i3 = i2 - 1;
        if (str == null) {
            if (i2 == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i3) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8853y9)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i2 == 0) {
            throw null;
        }
        int i4 = 0;
        int i5 = 2;
        switch (i3) {
            case 0:
            case 11:
            case 15:
                i5 = i4;
                return new com.google.android.gms.ads.internal.client.zze(i5, str3, "com.google.android.gms.ads", zzeVar, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i5 = 1;
                return new com.google.android.gms.ads.internal.client.zze(i5, str3, "com.google.android.gms.ads", zzeVar, null);
            case 2:
            case 10:
            case 18:
                i5 = 3;
                return new com.google.android.gms.ads.internal.client.zze(i5, str3, "com.google.android.gms.ads", zzeVar, null);
            case 3:
                i4 = 8;
                i5 = i4;
                return new com.google.android.gms.ads.internal.client.zze(i5, str3, "com.google.android.gms.ads", zzeVar, null);
            case 4:
            case 8:
            case 17:
                return new com.google.android.gms.ads.internal.client.zze(i5, str3, "com.google.android.gms.ads", zzeVar, null);
            case 7:
                i4 = 4;
                i5 = i4;
                return new com.google.android.gms.ads.internal.client.zze(i5, str3, "com.google.android.gms.ads", zzeVar, null);
            case 12:
                if (((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8853y9)).intValue() <= 0) {
                    i4 = 9;
                    i5 = i4;
                } else {
                    i5 = 3;
                }
                return new com.google.android.gms.ads.internal.client.zze(i5, str3, "com.google.android.gms.ads", zzeVar, null);
            case 13:
                i4 = 10;
                i5 = i4;
                return new com.google.android.gms.ads.internal.client.zze(i5, str3, "com.google.android.gms.ads", zzeVar, null);
            case 14:
                i4 = 11;
                i5 = i4;
                return new com.google.android.gms.ads.internal.client.zze(i5, str3, "com.google.android.gms.ads", zzeVar, null);
            default:
                switch (i2) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }
}

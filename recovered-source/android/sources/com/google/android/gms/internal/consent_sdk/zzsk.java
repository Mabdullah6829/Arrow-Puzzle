package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
final class zzsk {
    /* JADX INFO: renamed from: a */
    public static String m9277a(zzpm zzpmVar) {
        StringBuilder sb = new StringBuilder(zzpmVar.mo9150d());
        for (int i2 = 0; i2 < zzpmVar.mo9150d(); i2++) {
            byte bMo9148a = zzpmVar.mo9148a(i2);
            if (bMo9148a == 34) {
                sb.append("\\\"");
            } else if (bMo9148a == 39) {
                sb.append("\\'");
            } else if (bMo9148a != 92) {
                switch (bMo9148a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo9148a < 32 || bMo9148a > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo9148a >>> 6) & 3) + 48));
                            sb.append((char) (((bMo9148a >>> 3) & 7) + 48));
                            sb.append((char) ((bMo9148a & 7) + 48));
                        } else {
                            sb.append((char) bMo9148a);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}

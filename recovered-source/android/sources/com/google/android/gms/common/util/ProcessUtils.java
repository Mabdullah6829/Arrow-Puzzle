package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.internal.Preconditions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ProcessUtils {

    /* JADX INFO: renamed from: a */
    public static String f4646a;

    /* JADX INFO: renamed from: b */
    public static int f4647b;

    /* JADX INFO: renamed from: c */
    public static Boolean f4648c;

    private ProcessUtils() {
    }

    /* JADX INFO: renamed from: a */
    public static String m3655a() throws Throwable {
        BufferedReader bufferedReader;
        if (f4646a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f4646a = Application.getProcessName();
            } else {
                int iMyPid = f4647b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f4647b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                        sb.append("/proc/");
                        sb.append(iMyPid);
                        sb.append("/cmdline");
                        String string = sb.toString();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(string));
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            try {
                                String line = bufferedReader.readLine();
                                Preconditions.m3544h(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                IOUtils.m3649a(bufferedReader2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    IOUtils.m3649a(bufferedReader);
                }
                f4646a = strTrim;
            }
        }
        return f4646a;
    }
}

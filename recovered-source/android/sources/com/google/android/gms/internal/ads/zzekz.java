package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.webkit.ProxyConfig;
import com.arrow.puzzle.escape.maze.free.game.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzekz extends zzbza {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ int f14120A = 0;

    /* JADX INFO: renamed from: t */
    public final HashMap f14121t = new HashMap();

    /* JADX INFO: renamed from: u */
    public final Context f14122u;

    /* JADX INFO: renamed from: v */
    public final zzdzt f14123v;

    /* JADX INFO: renamed from: w */
    public final com.google.android.gms.ads.internal.util.client.zzu f14124w;

    /* JADX INFO: renamed from: x */
    public final zzeko f14125x;

    /* JADX INFO: renamed from: y */
    public String f14126y;

    /* JADX INFO: renamed from: z */
    public String f14127z;

    public zzekz(Context context, zzeko zzekoVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzdzt zzdztVar) {
        this.f14122u = context;
        this.f14123v = zzdztVar;
        this.f14124w = zzuVar;
        this.f14125x = zzekoVar;
    }

    /* JADX INFO: renamed from: l4 */
    public static void m6260l4(Context context, zzdzt zzdztVar, zzeko zzekoVar, String str, String str2, Map map) {
        String strM3355a;
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        String str3 = true != zztVar.f3708h.m5389i(context) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY;
        if (zzdztVar != null) {
            zzdzs zzdzsVarM6111a = zzdztVar.m6111a();
            zzdzsVarM6111a.m6107b("gqi", str);
            zzdzsVarM6111a.m6107b("action", str2);
            zzdzsVarM6111a.m6107b("device_connectivity", str3);
            zztVar.f3711k.getClass();
            zzdzsVarM6111a.m6107b("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzdzsVarM6111a.m6107b((String) entry.getKey(), (String) entry.getValue());
            }
            strM3355a = zzdzsVarM6111a.f13423b.f13424a.f13448f.m3355a(zzdzsVarM6111a.f13422a);
        } else {
            strM3355a = "";
        }
        String str4 = strM3355a;
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        zzekq zzekqVar = new zzekq(System.currentTimeMillis(), str, str4, 2);
        zzekoVar.getClass();
        zzekoVar.m6258c(new zzekl(zzekoVar, zzekqVar));
    }

    /* JADX INFO: renamed from: m4 */
    public static final PendingIntent m6261m4(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return PendingIntent.getService(context, 0, zzgqq.m7066a(intent, 1140850688), 1140850688);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return PendingIntent.getActivity(context, 0, zzgqq.m7066a(intent, 201326592), 201326592);
    }

    /* JADX INFO: renamed from: r4 */
    public static String m6262r4(int i2, String str) {
        Resources resourcesM5383c = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5383c();
        if (resourcesM5383c == null) {
            return str;
        }
        try {
            return resourcesM5383c.getString(i2);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* JADX INFO: renamed from: P3 */
    public final void mo5273P3(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2].equals("android.permission.POST_NOTIFICATIONS")) {
                zzelb zzelbVar = (zzelb) ObjectWrapper.m3697u0(iObjectWrapper);
                Activity activityMo6253a = zzelbVar.mo6253a();
                com.google.android.gms.ads.internal.overlay.zzm zzmVarMo6254b = zzelbVar.mo6254b();
                HashMap map = new HashMap();
                if (iArr[i2] == 0) {
                    map.put("dialog_action", "confirm");
                    m6265o4();
                    m6266p4(activityMo6253a, zzmVarMo6254b);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (zzmVarMo6254b != null) {
                        zzmVarMo6254b.zzb();
                    }
                }
                m6267q4(this.f14126y, "asnpdc", map);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* JADX INFO: renamed from: X3 */
    public final void mo5274X3(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) ObjectWrapper.m3697u0(iObjectWrapper);
        String str2 = zzaVar.f3282s;
        String str3 = zzaVar.f3283t;
        String str4 = zzaVar.f3284u;
        zzekg zzekgVar = (zzekg) this.f14121t.get(this.f14126y);
        String strMo6245a = zzekgVar == null ? "" : zzekgVar.mo6245a();
        com.google.android.gms.ads.internal.zzt.f3698C.f3706f.mo3240b(context);
        PendingIntent pendingIntentM6261m4 = m6261m4(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentM6261m5 = m6261m4(context, "offline_notification_dismissed", str3, str2);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "offline_notification_channel");
        if (TextUtils.isEmpty(strMo6245a)) {
            builder.setContentTitle(m6262r4(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            builder.setContentTitle(String.format(m6262r4(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), strMo6245a));
        }
        NotificationCompat.Builder smallIcon = builder.setAutoCancel(true).setDeleteIntent(pendingIntentM6261m5).setContentIntent(pendingIntentM6261m4).setSmallIcon(context.getApplicationInfo().icon);
        zzbio zzbioVar = zzbix.f8114G9;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        smallIcon.setPriority(((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue());
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8148I9)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
                bitmapDecodeStream = null;
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                builder.setLargeIcon(bitmapDecodeStream).setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmapDecodeStream).bigLargeIcon((Bitmap) null));
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, builder.build());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e) {
            map.put("notification_not_shown_reason", e.getMessage());
            str = "offline_notification_failed";
        }
        m6267q4(str3, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* JADX INFO: renamed from: b0 */
    public final void mo5275b0(IObjectWrapper iObjectWrapper) {
        zzelb zzelbVar = (zzelb) ObjectWrapper.m3697u0(iObjectWrapper);
        final Activity activityMo6253a = zzelbVar.mo6253a();
        final com.google.android.gms.ads.internal.overlay.zzm zzmVarMo6254b = zzelbVar.mo6254b();
        this.f14126y = zzelbVar.mo6255c();
        this.f14127z = zzelbVar.mo6256d();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8097F9)).booleanValue()) {
            m6264n4(activityMo6253a, zzmVarMo6254b);
            return;
        }
        m6267q4(this.f14126y, "dialog_impression", zzgyt.f18367y);
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        AlertDialog.Builder builderM3212k = com.google.android.gms.ads.internal.util.zzs.m3212k(activityMo6253a);
        builderM3212k.setTitle(m6262r4(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(m6262r4(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(m6262r4(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeky
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i2) {
                zzekz zzekzVar = this.f14117s;
                zzekzVar.getClass();
                HashMap map = new HashMap();
                map.put("dialog_action", "confirm");
                zzekzVar.m6267q4(zzekzVar.f14126y, "dialog_click", map);
                zzekzVar.m6264n4(activityMo6253a, zzmVarMo6254b);
            }
        }).setNegativeButton(m6262r4(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeks
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i2) {
                zzekz zzekzVar = this.f14105s;
                zzekzVar.f14125x.m6259e(zzekzVar.f14126y);
                HashMap map = new HashMap();
                map.put("dialog_action", "dismiss");
                zzekzVar.m6267q4(zzekzVar.f14126y, "dialog_click", map);
                com.google.android.gms.ads.internal.overlay.zzm zzmVar = zzmVarMo6254b;
                if (zzmVar != null) {
                    zzmVar.zzb();
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzekt
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                zzekz zzekzVar = this.f14107s;
                zzekzVar.f14125x.m6259e(zzekzVar.f14126y);
                HashMap map = new HashMap();
                map.put("dialog_action", "dismiss");
                zzekzVar.m6267q4(zzekzVar.f14126y, "dialog_click", map);
                com.google.android.gms.ads.internal.overlay.zzm zzmVar = zzmVarMo6254b;
                if (zzmVar != null) {
                    zzmVar.zzb();
                }
            }
        });
        builderM3212k.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* JADX INFO: renamed from: c */
    public final void mo5276c() {
        final com.google.android.gms.ads.internal.util.client.zzu zzuVar = this.f14124w;
        this.f14125x.m6258c(new zzfos() { // from class: com.google.android.gms.internal.ads.zzekm
            @Override // com.google.android.gms.internal.ads.zzfos
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Object mo5874b(Object obj) throws Throwable {
                zzeko.m6257h((SQLiteDatabase) obj, zzuVar);
                return null;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6263k4(String str, zzdqb zzdqbVar) {
        zzbml zzbmlVar;
        String string = "";
        String strM6003f = zzdqbVar.m6003f();
        String strM5998a = zzdqbVar.m5998a();
        if (TextUtils.isEmpty(strM6003f)) {
            strM6003f = strM5998a != null ? strM5998a : "";
        }
        zzbml zzbmlVarM5999b = zzdqbVar.m5999b();
        if (zzbmlVarM5999b != null) {
            try {
                string = zzbmlVarM5999b.zzc().toString();
            } catch (RemoteException unused) {
            }
        }
        synchronized (zzdqbVar) {
            zzbmlVar = zzdqbVar.f12628s;
        }
        Drawable drawable = null;
        if (zzbmlVar != null) {
            try {
                IObjectWrapper iObjectWrapperZzb = zzbmlVar.zzb();
                if (iObjectWrapperZzb != null) {
                    drawable = (Drawable) ObjectWrapper.m3697u0(iObjectWrapperZzb);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f14121t.put(str, new zzekd(strM6003f, string, drawable));
    }

    /* JADX INFO: renamed from: n4 */
    public final void m6264n4(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        if (NotificationManagerCompat.from(activity).areNotificationsEnabled()) {
            m6265o4();
            m6266p4(activity, zzmVar);
        } else if (Build.VERSION.SDK_INT >= 33) {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            m6267q4(this.f14126y, "asnpdi", zzgyt.f18367y);
        } else {
            AlertDialog.Builder builderM3212k = com.google.android.gms.ads.internal.util.zzs.m3212k(activity);
            builderM3212k.setTitle(m6262r4(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(m6262r4(R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeku
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    HashMap map = new HashMap();
                    map.put("dialog_action", "confirm");
                    zzekz zzekzVar = this.f14109s;
                    zzekzVar.m6267q4(zzekzVar.f14126y, "rtsdc", map);
                    com.google.android.gms.ads.internal.util.zzu zzuVar = com.google.android.gms.ads.internal.zzt.f3698C.f3706f;
                    Activity activity2 = activity;
                    activity2.startActivity(zzuVar.mo3242d(activity2));
                    zzekzVar.m6265o4();
                    com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = zzmVar;
                    if (zzmVar2 != null) {
                        zzmVar2.zzb();
                    }
                }
            }).setNegativeButton(m6262r4(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzekv
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i2) {
                    zzekz zzekzVar = this.f14112s;
                    zzekzVar.f14125x.m6259e(zzekzVar.f14126y);
                    HashMap map = new HashMap();
                    map.put("dialog_action", "dismiss");
                    zzekzVar.m6267q4(zzekzVar.f14126y, "rtsdc", map);
                    com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = zzmVar;
                    if (zzmVar2 != null) {
                        zzmVar2.zzb();
                    }
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzekw
                @Override // android.content.DialogInterface.OnCancelListener
                public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                    zzekz zzekzVar = this.f14114s;
                    zzekzVar.f14125x.m6259e(zzekzVar.f14126y);
                    HashMap map = new HashMap();
                    map.put("dialog_action", "dismiss");
                    zzekzVar.m6267q4(zzekzVar.f14126y, "rtsdc", map);
                    com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = zzmVar;
                    if (zzmVar2 != null) {
                        zzmVar2.zzb();
                    }
                }
            });
            builderM3212k.create().show();
            m6267q4(this.f14126y, "rtsdi", zzgyt.f18367y);
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final void m6265o4() {
        boolean zZzg;
        boolean zZze;
        try {
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            Context context = this.f14122u;
            com.google.android.gms.ads.internal.util.zzbo zzboVarM3203b = com.google.android.gms.ads.internal.util.zzs.m3203b(context);
            ObjectWrapper objectWrapper = new ObjectWrapper(context);
            String str = this.f14127z;
            String str2 = this.f14126y;
            zzekg zzekgVar = (zzekg) this.f14121t.get(str2);
            zZzg = zzboVarM3203b.zzg(objectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, zzekgVar == null ? "" : zzekgVar.mo6246b()));
            if (zZzg) {
                zZze = true;
            } else {
                try {
                    zZze = zzboVarM3203b.zze(new ObjectWrapper(context), this.f14127z, this.f14126y);
                } catch (RemoteException e) {
                    e = e;
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3071d("Failed to schedule offline notification poster.", e);
                    zZze = zZzg;
                }
            }
        } catch (RemoteException e2) {
            e = e2;
            zZzg = false;
        }
        if (zZze) {
            return;
        }
        this.f14125x.m6259e(this.f14126y);
        m6267q4(this.f14126y, "offline_notification_worker_not_scheduled", zzgyt.f18367y);
    }

    /* JADX INFO: renamed from: p4 */
    public final void m6266p4(Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        XmlResourceParser layout;
        AlertDialog alertDialogCreate;
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        com.google.android.gms.ads.internal.util.zzs zzsVar = zztVar.f3703c;
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzs.m3212k(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzekx
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = zzmVar;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        Resources resourcesM5383c = zztVar.f3708h.m5383c();
        if (resourcesM5383c == null) {
            layout = null;
        } else {
            try {
                layout = resourcesM5383c.getLayout(R.layout.offline_ads_dialog);
            } catch (Resources.NotFoundException unused) {
                layout = null;
            }
        }
        if (layout == null) {
            onCancelListener.setMessage(m6262r4(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            alertDialogCreate = onCancelListener.create();
        } else {
            try {
                View viewInflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
                onCancelListener.setView(viewInflate);
                String str = this.f14126y;
                HashMap map = this.f14121t;
                zzekg zzekgVar = (zzekg) map.get(str);
                String strMo6245a = zzekgVar == null ? "" : zzekgVar.mo6245a();
                if (!TextUtils.isEmpty(strMo6245a)) {
                    TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                    textView.setVisibility(0);
                    textView.setText(strMo6245a);
                }
                zzekg zzekgVar2 = (zzekg) map.get(this.f14126y);
                Drawable drawableMo6247c = zzekgVar2 != null ? zzekgVar2.mo6247c() : null;
                if (drawableMo6247c != null) {
                    ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawableMo6247c);
                }
                alertDialogCreate = onCancelListener.create();
                alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            } catch (Resources.NotFoundException unused2) {
                onCancelListener.setMessage(m6262r4(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
                alertDialogCreate = onCancelListener.create();
            }
        }
        alertDialogCreate.show();
        Timer timer = new Timer();
        timer.schedule(new zzekr(this, alertDialogCreate, timer, zzmVar), 3000L);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* JADX INFO: renamed from: q0 */
    public final void mo5277q0(Intent intent) {
        zzeko zzekoVar = this.f14125x;
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                zzcfk zzcfkVar = com.google.android.gms.ads.internal.zzt.f3698C.f3708h;
                Context context = this.f14122u;
                boolean zM5389i = zzcfkVar.m5389i(context);
                HashMap map = new HashMap();
                char c = 2;
                if (stringExtra.equals("offline_notification_clicked")) {
                    map.put("offline_notification_action", "offline_notification_clicked");
                    c = true == zM5389i ? (char) 1 : (char) 2;
                    map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    map.put("olaih", String.valueOf(stringExtra3.startsWith(ProxyConfig.MATCH_HTTP)));
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                        map.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        map.put("olaa", "olaf");
                    }
                } else {
                    map.put("offline_notification_action", "offline_notification_dismissed");
                }
                m6267q4(stringExtra2, "offline_notification_action", map);
                try {
                    SQLiteDatabase writableDatabase = zzekoVar.getWritableDatabase();
                    if (c == 1) {
                        zzekoVar.f14096t.execute(new zzeki(writableDatabase, stringExtra2, this.f14124w));
                    } else {
                        writableDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{stringExtra2, Integer.toString(0)});
                    }
                } catch (SQLiteException e) {
                    String strConcat = "Failed to get writable offline buffering database: ".concat(e.toString());
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3070c(strConcat);
                }
            }
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final void m6267q4(String str, String str2, Map map) {
        m6260l4(this.f14122u, this.f14123v, this.f14125x, str, str2, map);
    }
}

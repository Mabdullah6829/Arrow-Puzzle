package p061g;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.media.RingtoneManager;
import android.os.AsyncTask;
import android.os.Build;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.arrow.puzzle.escape.maze.free.game.R;
import com.arrow.puzzle.escape.maze.free.game.activity.SplashActivity;
import com.arrow.puzzle.escape.maze.free.game.personal.MyFirebaseMessagingService;
import com.google.gson.internal.bind.AbstractC6153b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

/* JADX INFO: renamed from: g.j */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncTaskC6345j extends AsyncTask {

    /* JADX INFO: renamed from: a */
    public final String f24402a;

    /* JADX INFO: renamed from: b */
    public final String f24403b;

    /* JADX INFO: renamed from: c */
    public final String f24404c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ MyFirebaseMessagingService f24405d;

    public AsyncTaskC6345j(MyFirebaseMessagingService myFirebaseMessagingService, String str, String str2, String str3) {
        this.f24405d = myFirebaseMessagingService;
        this.f24402a = str;
        this.f24403b = str2;
        this.f24404c = str3;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f24404c).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        super.onPostExecute(bitmap);
        MyFirebaseMessagingService myFirebaseMessagingService = this.f24405d;
        Intent intent = new Intent(myFirebaseMessagingService, (Class<?>) SplashActivity.class);
        intent.putExtra(TypedValues.TransitionType.S_TO, "notify");
        intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        PendingIntent activity = PendingIntent.getActivity(myFirebaseMessagingService, 0, intent, 1140850688);
        NotificationManager notificationManager = (NotificationManager) myFirebaseMessagingService.getSystemService("notification");
        int i2 = Build.VERSION.SDK_INT;
        String str = this.f24403b;
        if (i2 >= 26) {
            try {
                RingtoneManager.getRingtone(myFirebaseMessagingService, RingtoneManager.getDefaultUri(2)).play();
            } catch (Exception e) {
                e.printStackTrace();
            }
            NotificationChannel notificationChannelM11684c = AbstractC6153b.m11684c();
            notificationChannelM11684c.setDescription(str);
            notificationChannelM11684c.enableLights(true);
            notificationChannelM11684c.setLightColor(-16776961);
            notificationChannelM11684c.enableLights(true);
            notificationManager.createNotificationChannel(notificationChannelM11684c);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(myFirebaseMessagingService, "com.arrow.puzzle.escape.maze.free.game");
        builder.setAutoCancel(true).setDefaults(-1).setWhen(System.currentTimeMillis()).setSmallIcon(R.drawable.ic_notification).setLargeIcon(bitmap).setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((Icon) null)).setContentTitle(this.f24402a).setContentText(str).setContentInfo("Info").setVibrate(new long[]{1000, 1000, 1000, 1000, 1000}).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2)).setContentIntent(activity);
        notificationManager.notify(new Random().nextInt(), builder.build());
    }
}

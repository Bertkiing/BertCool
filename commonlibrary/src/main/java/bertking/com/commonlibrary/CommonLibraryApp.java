package bertking.com.commonlibrary;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by king on 2018/4/26.
 * 项目名称:BertCool
 * 描述:
 */
public class CommonLibraryApp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        } else {
//            Timber.plant(new CrashReportingTree());

        }


    }
}

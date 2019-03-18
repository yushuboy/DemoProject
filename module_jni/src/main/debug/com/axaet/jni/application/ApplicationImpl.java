package com.axaet.jni.application;


import android.app.Application;

import com.axaet.module.base.application.ApplicationService;

/**
 * date: 2019/3/7
 *
 * @author yuShu
 */
public class ApplicationImpl implements ApplicationService {

    private ApplicationImpl() {
    }

    private static class LoginApplicationHolder {
        private static final ApplicationImpl INSTANCE = new ApplicationImpl();
    }

    public static ApplicationImpl getInstance() {
        return LoginApplicationHolder.INSTANCE;
    }


    @Override
    public void loadModuleApplicationService() {
        DebugApplicationImpl.getInstance().loadModuleApplicationService();
    }

    @Override
    public Application getApplication() {
        return DebugApplicationImpl.getInstance().getApplication();
    }
}

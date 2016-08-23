package com.example.dagger2test.scopetest;

import dagger.Component;

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2016/8/23
 */

@Component(modules = {UserModuleC.class})
public interface UserScopeComponentC {

    void inject(CActivity cActivity);
}

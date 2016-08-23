package com.example.dagger2test.scopetest;

import dagger.Component;

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2016/8/23
 */

//@Singleton
@UserScope
@Component(modules = {UserModule.class})
public interface UserScopeComponent {
    // 注意 这里没有 inject（CActivity cActivity）方法
    void inject(AActivity aActivity);
    void inject(BActivity bActivity);
}
